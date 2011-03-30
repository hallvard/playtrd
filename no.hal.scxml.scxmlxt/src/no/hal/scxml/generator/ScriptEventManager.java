package no.hal.scxml.generator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.SCXMLListener;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.model.Action;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;

public class ScriptEventManager implements SCXMLListener {

    private Log log = LogFactory.getLog(ScriptEventHandler.class);

	private List<ScriptEventHandler> scriptEventHandlers;
	private SCInstance scInstance;
	
	public ScriptEventManager(ScriptEventHandler[] scriptEventHandlers) {
		this.scriptEventHandlers = Arrays.asList(scriptEventHandlers);
	}

	public SCInstance getScInstance() {
		return scInstance;
	}

	public Action getInitAction() {
		return new Action() {
			public void execute(EventDispatcher evtDispatcher,
					ErrorReporter errRep, SCInstance scInstance, Log appLog,
					Collection derivedEvents) throws ModelException,
					SCXMLExpressionException {
				ScriptEventManager.this.scInstance = scInstance;
			}
		};
	}

	public void onEntry(TransitionTarget target) {
		for (ScriptEventHandler scriptEventHandler: scriptEventHandlers) {
			if (scriptEventHandler.getScxmlStateId().equals(target.getId())) {
				scriptEventHandler.activateScriptHandler(this);
			}
		}
	}
	public void onExit(TransitionTarget source) {
		for (ScriptEventHandler scriptEventHandler: scriptEventHandlers) {
			if (scriptEventHandler.getScxmlStateId().equals(source.getId())) {
				scriptEventHandler.deactivateScriptHandler();
			}
		}
	}
	public void onTransition(TransitionTarget source, TransitionTarget target, Transition transition) {
	}
	
	void sendScriptEvent(ScriptEventHandler scriptEventHandler) {
		try {
			String eventId = scriptEventHandler.getScriptEventId();
			String sendId = eventId  + "@" + System.currentTimeMillis();
			SCXMLExecutor executor = scInstance.getExecutor();
			if (executor instanceof ScxmlEventQueueExecutor) {
				System.out.println("Triggering script event: " + eventId);
				ScxmlEventQueueExecutor scxmlEventQueueExecutor = (ScxmlEventQueueExecutor)executor;
				TriggerEvent event = new TriggerEvent(eventId, TriggerEvent.SIGNAL_EVENT);
				if (scxmlEventQueueExecutor.isTriggeringEvents()) {
					scxmlEventQueueExecutor.addEvent(event);
				} else {
					scxmlEventQueueExecutor.triggerEvents(new TriggerEvent[]{event});
				}
			} else {
//				getScInstance().getExecutor().triggerEvent(new TriggerEvent(eventId, TriggerEvent.SIGNAL_EVENT));
				executor.getEventdispatcher().send(sendId, null, "scxml", eventId, Collections.EMPTY_MAP, null, 1, Collections.EMPTY_LIST);
			}
		} catch (Exception e) {
			System.err.println("Exception when sending ScriptEvent: " + e);
		}
	}
}
