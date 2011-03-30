package no.hal.scxml.generator;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import no.hal.scxml.emf.javascript.EmfJavascriptEvaluator;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.env.SimpleErrorReporter;
import org.apache.commons.scxml.env.SimpleScheduler;
import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.io.SCXMLSerializer;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.TransitionTarget;
import org.eclipse.e4.emf.ecore.javascript.JavascriptSupport;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class ScxmlRunner {

	private ScriptEventManager scriptEventManager;

	public ScxmlRunner() {
	}

	private ScxmlxtGenerator scxmlxtGenerator;
	private ScxmlGenerator scxmlGenerator;
	
	private StateMachine stateMachine;
	private SCXML scxml;

	public void init(EObject model, URI scxmlBaseUri) throws ModelException {

		scxmlxtGenerator = new ScxmlxtGenerator(model, scxmlBaseUri);
		stateMachine = scxmlxtGenerator.generateScxmlxt();

		scxmlGenerator = new ScxmlGenerator();
		scxmlGenerator.getRootVariables().putAll(scxmlxtGenerator.getRootVariables());

		scxml = scxmlGenerator.generateScxml(stateMachine);
		TransitionTarget startState = (TransitionTarget)scxml.getTargets().get(scxml.getInitial());
		scriptEventManager = new ScriptEventManager(scxmlGenerator.getScriptEventHandlers());
		scxmlGenerator.getOnEntry(startState).addAction(scriptEventManager.getInitAction());

		System.out.println(SCXMLSerializer.serialize(scxml));

		SCXMLParser.updateSCXML(scxml);
	}
	
	public StateMachine getStateMachine() {
		return stateMachine;
	}
	public SCXML getSCXML() {
		return scxml;
	}

	private JavascriptSupport javascriptSupport;

	public void setJavascriptSupport(JavascriptSupport javascriptSupport) {
		this.javascriptSupport = javascriptSupport;
	}

	private ScxmlEventQueueExecutor executor = null;

	public void start() {
		try {
			if (javascriptSupport == null) {
				javascriptSupport = new JavascriptSupport();
			}
			Evaluator evaluator = new EmfJavascriptEvaluator(javascriptSupport, null);
			executor = new ScxmlEventQueueExecutor(evaluator, new SimpleErrorReporter()) {
				@Override
				public synchronized void triggerEvents(TriggerEvent[] events) throws ModelException {
					EList<State> currentStates = ScxmlRunner.this.getStateMachine().getCurrentStates();
					currentStates.clear();
					try {
						super.triggerEvents(events);
					} finally {
						Iterator states = getCurrentStatus().getStates().iterator();
						while (states.hasNext()) {
							org.apache.commons.scxml.model.State state = (org.apache.commons.scxml.model.State)states.next();
							Object scxmlxtObject = scxmlGenerator.getScxmlxtObject(state);
							if (scxmlxtObject instanceof State) {
								currentStates.add((State)scxmlxtObject);
							}
						}
					}
				}
			};
			executor.setEventdispatcher(new SimpleScheduler(executor));
			
			for (Map.Entry<String, Object> entry: scxmlGenerator.getRootVariables().entrySet()) {
				executor.getRootContext().setLocal(entry.getKey(), entry.getValue());
			}
			executor.setStateMachine(scxml);
			executor.addListener(scxml, scriptEventManager);
			executor.go();
		} catch (Exception e) {
			System.err.println("Exception when starting state machine: " + e);
		}
	}

	public void pause() {
		executor.pause();
	}

	public void resume() {
		try {
			executor.resume();
		} catch (Exception e) {
			System.err.println("Exception when resuming state machine: " + e);
		}
	}
	
	public boolean stateCheck(String stateId, boolean expected, boolean def) {
		for (TransitionTarget state: ((Set<TransitionTarget>)executor.getCurrentStatus().getStates())) {
			while (state!= null) {
				if (stateId.equals(state.getId())) {
					if (expected) {
						return true;
					}
				}
				state = state.getParent();
			}
		}
		return def;
	}

	public TransitionTarget getState(String stateId) {
		return scxmlGenerator.getState(stateId);
	}

	public EObject getEObject(TransitionTarget state) {
		Context scope = scriptEventManager.getScInstance().getContext(state);
		while (scope != null) {
			for (Map.Entry<String, Object> varEntry: ((Map<String, Object>)scope.getVars()).entrySet()) {
				String name = varEntry.getKey();
				if (name.startsWith("this")) {
					Object value = varEntry.getValue();
					if (value instanceof EObject) {
						EObject eObject = (EObject)value;
						if (scxmlxtGenerator.isEObjectVariableName(name, eObject)) {
							return eObject;
						}
					}
				}
			}
			scope = scope.getParent();
		}
		return null;
	}
}
