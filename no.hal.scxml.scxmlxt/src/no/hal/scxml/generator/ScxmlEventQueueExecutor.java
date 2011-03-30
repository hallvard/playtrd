package no.hal.scxml.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.SCXMLSemantics;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.model.ModelException;

public class ScxmlEventQueueExecutor extends SCXMLExecutor {

	private Log log = LogFactory.getLog(ScxmlEventQueueExecutor.class);

	public ScxmlEventQueueExecutor() {
		super();
	}

	public ScxmlEventQueueExecutor(Evaluator expEvaluator, EventDispatcher evtDisp, ErrorReporter errRep, SCXMLSemantics semantics) {
		super(expEvaluator, evtDisp, errRep, semantics);
	}

	public ScxmlEventQueueExecutor(Evaluator expEvaluator, EventDispatcher evtDisp, ErrorReporter errRep) {
		super(expEvaluator, evtDisp, errRep);
	}

	public ScxmlEventQueueExecutor(Evaluator expEvaluator, ErrorReporter errRep) {
		this(expEvaluator, null, errRep);
	}

	//

	private List<TriggerEvent> pendingEvents = new ArrayList<TriggerEvent>(); 

	public void addEvent(TriggerEvent event) {
		pendingEvents.add(event);
	}

	public boolean pendingEvents() {
		return pendingEvents.size() > 0;
	}

	private boolean pausing = false;

	public boolean isPausing() {
		return pausing;
	}

	public void pause() {
		this.pausing = false;
	}

	public void resume() throws ModelException {
		if (! pausing) {
			return;
		}
		this.pausing = true;
		triggerPendingEvents();
	}
	
	@Override
	public synchronized void triggerEvents(TriggerEvent[] events) throws ModelException {
		if (isPausing()) {
			pendingEvents.addAll(Arrays.asList(events));
		} else {
			superTriggerEvents(events);
		}
		triggerPendingEvents();
	}

	private boolean triggeringEvents = false;
	
	public boolean isTriggeringEvents() {
		return triggeringEvents;
	}

	protected void superTriggerEvents(TriggerEvent[] events) throws ModelException {
		triggeringEvents = true;
		try {
			super.triggerEvents(events);
		} finally  {
			triggeringEvents = false;
		}
	}

	protected void triggerPendingEvents() throws ModelException {
		if (isPausing()) {
			return;
		}
		while (pendingEvents()) {
			TriggerEvent[] events = pendingEvents.toArray(new TriggerEvent[pendingEvents.size()]);
			pendingEvents.clear();
			superTriggerEvents(events);
		}
	}
}
