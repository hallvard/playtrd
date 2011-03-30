package no.hal.scxml.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.hal.scxml.scxmlxt.AbstractState;
import no.hal.scxml.scxmlxt.AbstractTransition;
import no.hal.scxml.scxmlxt.AbstractTransitionEvent;
import no.hal.scxml.scxmlxt.AbstractUriLiteral;
import no.hal.scxml.scxmlxt.Action;
import no.hal.scxml.scxmlxt.AssignmentAction;
import no.hal.scxml.scxmlxt.BooleanLiteral;
import no.hal.scxml.scxmlxt.Condition;
import no.hal.scxml.scxmlxt.DelayLiteral;
import no.hal.scxml.scxmlxt.EObjectReference;
import no.hal.scxml.scxmlxt.EObjectUriLiteral;
import no.hal.scxml.scxmlxt.EnterEvent;
import no.hal.scxml.scxmlxt.Event;
import no.hal.scxml.scxmlxt.ExitEvent;
import no.hal.scxml.scxmlxt.Expression;
import no.hal.scxml.scxmlxt.FloatLiteral;
import no.hal.scxml.scxmlxt.InitialTransition;
import no.hal.scxml.scxmlxt.IntLiteral;
import no.hal.scxml.scxmlxt.InternalTransition;
import no.hal.scxml.scxmlxt.ResourceUriLiteral;
import no.hal.scxml.scxmlxt.ScriptAction;
import no.hal.scxml.scxmlxt.ScriptEvent;
import no.hal.scxml.scxmlxt.ScriptExpression;
import no.hal.scxml.scxmlxt.ScxmlxtFactory;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;
import no.hal.scxml.scxmlxt.StringLiteral;
import no.hal.scxml.scxmlxt.SymbolicAction;
import no.hal.scxml.scxmlxt.SymbolicEvent;
import no.hal.scxml.scxmlxt.TimerEvent;
import no.hal.scxml.scxmlxt.Transition;
import no.hal.scxml.scxmlxt.VarDef;

import org.apache.commons.scxml.io.SCXMLSerializer;
import org.apache.commons.scxml.model.Assign;
import org.apache.commons.scxml.model.Executable;
import org.apache.commons.scxml.model.Initial;
import org.apache.commons.scxml.model.OnEntry;
import org.apache.commons.scxml.model.OnExit;
import org.apache.commons.scxml.model.Parallel;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.Send;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.commons.scxml.model.Var;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

public class ScxmlGenerator {

	private ScxmlFactory scxmlFactory = new ScxmlFactory();
	
	private Map<Object, Object> objectMap = new HashMap<Object, Object>();
	
	private <T> T getScxmlObject(Object object, Class<T> c) {
		return getScxmlObject(object, c, false);
	}
	private <T> T getScxmlObject(Object object, Class<T> c, boolean create) {
		T scxmlObject = (object != null ? (T)objectMap.get(object) : null);
		if (scxmlObject == null && create) {
			scxmlObject = scxmlFactory.create(c);
			objectMap.put(object, scxmlObject);
			if (object != null) {
				objectMap.put(scxmlObject, object);
			}
		}
		return scxmlObject;
	}

	public Object getScxmlxtObject(Object scxmlObject) {
		return objectMap.get(scxmlObject);
	}
	
	private Map<String, TransitionTarget> stateIdMap = new HashMap<String, TransitionTarget>();
	
	private void setStateId(TransitionTarget state, String stateId) {
		stateIdMap.put(stateId, state);
		state.setId(stateId);
	}
	
	public TransitionTarget getState(String stateId) {
		return stateIdMap.get(stateId);
	}
	
	private SCXML scxml;
	private List<Transition> unresolvedTransitions = new ArrayList<Transition>();

	private Map<String, Object> rootVariables = new HashMap<String, Object>();

	public Map<String, Object> getRootVariables() {
		return rootVariables;
	}

	public SCXML generateScxml(StateMachine stateMachine) {
		scxml = new SCXML();
		unresolvedTransitions.clear();
		TransitionTarget rootState = expandState(stateMachine);
		scxml.addChild(rootState);
		for (Transition transition: unresolvedTransitions) {
			org.apache.commons.scxml.model.Transition scxmlTransition = getScxmlObject(transition, org.apache.commons.scxml.model.Transition.class);
			TransitionTarget target = getScxmlObject(transition.getTarget(), TransitionTarget.class);
			scxmlTransition.setNext(target.getId());
			scxml.addTarget(target);
		}
		scxml.addTarget(rootState);
		scxml.setInitial(rootState.getId());
		return scxml;
	}
	
	private TransitionTarget expandState(AbstractState state) {

		List<State> states = state.getStates();
		List<State> initialStates = new ArrayList<State>();
		for (State substate: states) {
			if (substate.getInitialTransition() != null) {
				initialStates.add(substate);
			}
		}
		TransitionTarget transitionTarget = null;
		String id = computeStateId(state);

		if (initialStates.size() == 1) {
			transitionTarget = expandRegionStates(initialStates.get(0), new org.apache.commons.scxml.model.State());
		} else if (states.size() == 1) {
			transitionTarget = expandRegionStates(states.get(0), new org.apache.commons.scxml.model.State());
		} else if (states.size() > 0) {
			Parallel parallel = getScxmlObject(state, Parallel.class, true);
			int count = 0;
			for (State initialState: (initialStates.size() > 1 ? initialStates : states)) {
				TransitionTarget region = expandRegionStates(initialState, null);
				if (region.getId() == null) {
					setStateId(region, id + "." + count++);
				}
				parallel.addChild(region);
			}
			transitionTarget = parallel;
		} else {
			transitionTarget = getScxmlObject(state, org.apache.commons.scxml.model.State.class, true);
		}

		setStateId(transitionTarget, id);
		for (VarDef varDef : state.getVariables()) {
			expandVariable(varDef, transitionTarget);
		}
		for (AbstractTransition transition: state.getTransitions()) {
			expandTransition(transition, transition.getEvent(), state, transitionTarget);
		}
		return transitionTarget;
	}
	
	private String computeStateId(AbstractState state) {
		StringBuilder buffer = new StringBuilder();
		EObject eObject = state;
		while (eObject != null) {
			if (eObject instanceof State) {
				if (buffer.length() > 0) {
					buffer.insert(0, '.');
				}
				buffer.insert(0, ((State)eObject).getName());
			}
			eObject = eObject.eContainer();
		}
		return (buffer.length() > 0 ? buffer.toString() : "scxml:root");
	}

	private void setTransitionTarget(org.apache.commons.scxml.model.Transition transition, TransitionTarget transitionTarget) {
		transition.setNext(transitionTarget.getId());
		scxml.addTarget(transitionTarget);
	}
	
	private Initial createInitialScxmlTransition(TransitionTarget initialState) {
		Initial initial = new Initial();
		org.apache.commons.scxml.model.Transition scxmlTransition = new org.apache.commons.scxml.model.Transition();
		initial.setTransition(scxmlTransition);
		setTransitionTarget(scxmlTransition, initialState);
		return initial;
	}

	private TransitionTarget expandRegionStates(State initialState, org.apache.commons.scxml.model.State region) {
		List<AbstractState> regionStates = computeStateClosure(initialState);
		for (AbstractState regionState : regionStates) {
			TransitionTarget substate = expandState(regionState);
			if (region == null) {
				region = new org.apache.commons.scxml.model.State();
			}
			if (regionState == initialState) {
				region.setInitial(expandInitialTransition(initialState, substate));
			}
			region.addChild(substate);
		}
		return region;
	}
	private Initial expandInitialTransition(State initialState,
			TransitionTarget substate) {
		Initial initial = createInitialScxmlTransition(substate);
		org.apache.commons.scxml.model.Transition scxmlTransition = initial.getTransition();
		scxmlTransition.setEvent(expandEvent(null));
		scxmlTransition.setCond(expandCondition(null));
		InitialTransition initialTransition = initialState.getInitialTransition();
		if (initialTransition.getAction() != null) {
			expandAction(initialTransition.getAction(), scxmlTransition);
		}
		setTransitionTarget(scxmlTransition, substate);
		return initial;
	}

	private void expandTransition(AbstractTransition transition, Event event, AbstractState parent, TransitionTarget scxmlState) {
		if (event instanceof TimerEvent) {
			expandTimerEventTransition(transition, (TimerEvent)event, parent, scxmlState);
		} else if (transition instanceof InternalTransition &&
			event instanceof AbstractTransitionEvent &&
			transition.getCondition() == null) {
			AbstractTransitionEvent transitionEvent = (AbstractTransitionEvent)event;
			if (transitionEvent instanceof EnterEvent || (transitionEvent.getSource() == null && transitionEvent.getTarget() == parent)) {
				OnEntry onEntry = new OnEntry();
				expandAction(transition.getAction(), onEntry);
				scxmlState.setOnEntry(onEntry);
			} else if (transitionEvent instanceof ExitEvent || (transitionEvent.getSource() == parent && transitionEvent.getTarget() == null)) {
				OnExit onExit = new OnExit();
				expandAction(transition.getAction(), onExit);
				scxmlState.setOnExit(onExit);
			} else {
				expandTransition(transition, event, scxmlState);
			}
		} else {
			expandTransition(transition, event, scxmlState);
		}
	}

	private void expandTimerEventTransition(AbstractTransition transition, TimerEvent timerEvent, AbstractState parent, TransitionTarget scxmlState) {
		InternalTransition timerTransition = ScxmlxtFactory.eINSTANCE.createInternalTransition();
		SymbolicAction timerAction = ScxmlxtFactory.eINSTANCE.createSymbolicAction();
		String timerEventName = ScxmlxtGenerator.getFullName(parent, null) + "#" + parent.getTransitions().size();
		timerAction.setName(timerEventName);
		timerAction.setDelay(timerEvent.getDelay());
		timerTransition.setAction(timerAction);
		// note that timerTransition is not actually contained in parent
		expandTransition(timerTransition, timerEvent.getEvent(), parent, scxmlState);
		
		SymbolicEvent timerEventReplacement = ScxmlxtFactory.eINSTANCE.createSymbolicEvent();
		timerEventReplacement.setName(timerEventName);
		expandTransition(transition, timerEventReplacement, parent, scxmlState);
	}

	private void expandTransition(AbstractTransition transition, Event event, TransitionTarget scxmlState) {
		org.apache.commons.scxml.model.Transition scxmlTransition = getScxmlObject(transition, org.apache.commons.scxml.model.Transition.class, true);

		scxmlState.addTransition(scxmlTransition);
		scxmlTransition.setEvent(expandEvent(event));
		scxmlTransition.setCond(expandCondition(transition.getCondition()));
		if (transition instanceof Transition) {
			unresolvedTransitions.add((Transition)transition);
		}
		if (transition.getAction() != null) {
			expandAction(transition.getAction(), scxmlTransition);
		}
	}

	private List<ScriptEventHandler> scriptEventHandlers = new ArrayList<ScriptEventHandler>();
	
	public ScriptEventHandler[] getScriptEventHandlers() {
		return scriptEventHandlers.toArray(new ScriptEventHandler[scriptEventHandlers.size()]);
	}
	
	private final static String ENTER_EVENT_QUALIFIER = ".entry", EXIT_EVENT_QUALIFIER = ".exit";
	
	private String expandEvent(Event event) {
		if (event instanceof SymbolicEvent) {
			return ((SymbolicEvent)event).getName();
		} else if (event instanceof AbstractTransitionEvent) {
			AbstractTransitionEvent transitionEvent = (AbstractTransitionEvent)event;
			if (transitionEvent.getSource() != null && transitionEvent.getTarget() == null) {
				return computeStateId(transitionEvent.getSource()) + EXIT_EVENT_QUALIFIER;
			} else if (transitionEvent.getSource() == null && transitionEvent.getTarget() != null) {
				return computeStateId(transitionEvent.getTarget()) + ENTER_EVENT_QUALIFIER;
			} else {
				// TODO: currently unsupported
			}
		} else if (event instanceof ScriptEvent) {
			State state = (State)((AbstractTransition)event.eContainer()).eContainer();
			org.apache.commons.scxml.model.State scxmlState = getScxmlObject(state, org.apache.commons.scxml.model.State.class);
			ScriptEventHandler scriptEventHandler = new ScriptEventHandler(scxmlState, ((ScriptEvent)event).getScript());
			scriptEventHandlers.add(scriptEventHandler);
			return scriptEventHandler.getScriptEventId();
		}
		return null;
	}

	private void expandAction(Action action, Executable exec) {
		org.apache.commons.scxml.model.Action scxmlAction = null;
		if (action instanceof SymbolicAction) {
			SymbolicAction symbolicAction = (SymbolicAction)action;
			Send sendAction = getScxmlObject(action, Send.class, true);
			sendAction.setEvent("'" + symbolicAction.getName() + "'");
			if (symbolicAction.getDelay() != null) {
				Object delay = expandExpression(symbolicAction.getDelay(), true);
				sendAction.setDelay(delay != null ? String.valueOf(delay) : null);
			}
			sendAction.setTargettype("'scxml'");
			scxmlAction = sendAction;
		} else if (action instanceof AssignmentAction) {
			Assign assignAction = getScxmlObject(action, Assign.class, true);
			AssignmentAction assignmentAction = (AssignmentAction)action;
			assignAction.setName(assignmentAction.getVar().getName());
			Object value = expandExpression(assignmentAction.getValue(), false);
			assignAction.setExpr(value != null ? String.valueOf(value) : null);
			scxmlAction = assignAction;
		} else if (action instanceof ScriptAction) {
			no.hal.scxml.javascript.ScriptAction scriptAction = getScxmlObject(action, no.hal.scxml.javascript.ScriptAction.class, true);
			scriptAction.setScript(((ScriptAction)action).getScript());
			scxmlAction = scriptAction;
			// TODO
		}
		if (scxmlAction != null) {
			exec.addAction(scxmlAction);
			scxmlAction.setParent(exec);
		}
	}

	private String expandCondition(Condition condition) {
		if (condition instanceof Condition) {
			return condition.getScript();
		}
		return null;
	}

	private void expandVariable(VarDef var, TransitionTarget scxmlState) {
		Var scxmlVar = getScxmlObject(var, Var.class, true);
		scxmlVar.setName(var.getName());
		Object init = expandExpression(var.getInit(), false);
		scxmlVar.setExpr(init != null ? String.valueOf(init) : null);
		OnEntry onEntry = getOnEntry(scxmlState);
		onEntry.addAction(scxmlVar);
		scxmlVar.setParent(onEntry);
	}

	public OnEntry getOnEntry(TransitionTarget scxmlState) {
		OnEntry onEntry = scxmlState.getOnEntry();
		if (onEntry == null) {
			onEntry = new OnEntry();
			scxmlState.setOnEntry(onEntry);
		}
		return onEntry;
	}

	private Object expandExpression(Expression expr, boolean quoteConstant) {
		if (expr instanceof BooleanLiteral) {
			return ((BooleanLiteral)expr).isBooleanValue();
		} else if (expr instanceof DelayLiteral) {
			DelayLiteral delayLiteral = (DelayLiteral)expr;
			return "'" + delayLiteral.getIntValue() + delayLiteral.getTimeUnit() + "'";
		} else if (expr instanceof IntLiteral) {
			int intValue = ((IntLiteral)expr).getIntValue();
			return (quoteConstant ? "'" + intValue + "'" : intValue);
		} else if (expr instanceof FloatLiteral) {
			double floatValue = ((FloatLiteral)expr).getFloatValue();
			return (quoteConstant ? "'" + floatValue + "'" : floatValue);
		} else if (expr instanceof StringLiteral) {
			String stringValue = ((StringLiteral)expr).getStringValue();
			return "'" + stringValue + "'";
		} else if (expr instanceof EObjectUriLiteral) {
			EObjectUriLiteral eObjectUriLiteral = (EObjectUriLiteral)expr;
			return expandUriReference(eObjectUriLiteral.getResourceUri(), eObjectUriLiteral.getUriFragment());
		} else if (expr instanceof EObjectReference) {
			URI uri = EcoreUtil.getURI(((EObjectReference)expr).getEObject());
			return expandUriReference(uri.trimFragment(), uri.fragment());
		} else if (expr instanceof ResourceUriLiteral) {
			ResourceUriLiteral resourceUriLiteral = (ResourceUriLiteral)expr;
			return expandUriReference(resourceUriLiteral.getResourceUri(), null);
		} else if (expr instanceof AbstractUriLiteral) {
			return "org.eclipse.emf.common.util.URI.createURI(\"" + ((AbstractUriLiteral)expr).getUri() + "\")";
		} else if (expr instanceof ScriptExpression) {
			return ((ScriptExpression)expr).getScript();
		} 
		return null;
	}

	private String expandUriReference(URI resourceUri, String uriFragment) {
		for (Map.Entry<String, Object> entry: rootVariables.entrySet()) {
			if (entry.getValue() instanceof EObject && uriFragment != null) {
				URI uri = EcoreUtil.getURI((EObject)entry.getValue());
				if (uri.equals(resourceUri)) {
					return (uriFragment != null ? entry.getKey() + ".getEObject(\"" + uriFragment + "\")" : entry.getKey());
				}
			}
			if (entry.getValue() instanceof Resource) {
				URI uri = ((Resource)entry.getValue()).getURI();
				if (uri.equals(resourceUri)) {
					return (uriFragment != null ? entry.getKey() + ".getEObject(\"" + uriFragment + "\")" : entry.getKey());
				}
			}
		}
		return (uriFragment != null ? "getEObject(\"" + resourceUri.appendFragment(uriFragment) + "\")" : "getResource(\"" + resourceUri + "\")");
	}
	
	private List<AbstractState> computeStateClosure(State state) {
		List<AbstractState> closure = new ArrayList<AbstractState>();
		computeStateClosure(state, (AbstractState)state.eContainer(), closure, new ArrayList<AbstractState>());
		return closure;
	}

	private void computeStateClosure(AbstractState state, AbstractState parent, List<AbstractState> closure, List<AbstractState> visited) {
		if (! visited.contains(state)) {
			visited.add(state);
			if (state.eContainer() == parent) {
				closure.add(state);
			}
			for (AbstractTransition t : state.getTransitions()) {
				if (t instanceof Transition) {
					AbstractState targetParent = ((Transition)t).getTarget();
					while (targetParent != null && targetParent.eContainer() != parent) {
						targetParent = (AbstractState)targetParent.eContainer();
					}
					if (targetParent != null) {
						computeStateClosure(targetParent, parent, closure, visited);
					}
				}
			}
			for (State substate: state.getStates()) {
				computeStateClosure(substate, parent, closure, visited);
			}
		}
	}

	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(ScxmlxtPackage.eNS_URI, ScxmlxtPackage.eINSTANCE);

		URI baseUri = URI.createURI(String.valueOf(ScxmlxtGenerator.class.getResource("TestGame.ecore")));
		URI model = URI.createURI("Game1.xmi").resolve(baseUri);

		ScxmlxtGenerator scxmlxtGenerator = new ScxmlxtGenerator(new ResourceSetImpl().getResource(model, true).getContents().get(0), baseUri);
		StateMachine stateMachine = scxmlxtGenerator.generateScxmlxt();
		
		ScxmlGenerator scxmlGenerator = new ScxmlGenerator();
		scxmlGenerator.getRootVariables().putAll(scxmlxtGenerator.getRootVariables());

		SCXML scxml = scxmlGenerator.generateScxml(stateMachine);
		System.out.println(SCXMLSerializer.serialize(scxml));
	}
}
