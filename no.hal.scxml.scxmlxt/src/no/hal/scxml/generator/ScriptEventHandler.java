package no.hal.scxml.generator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.model.TransitionTarget;
import org.eclipse.e4.emf.ecore.javascript.EmfContext;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.provider.IDisposable;

public class ScriptEventHandler extends AdapterImpl {

    private Log log = LogFactory.getLog(ScriptEventHandler.class);

	private TransitionTarget scxmlState;
	private String script;

	public ScriptEventHandler(TransitionTarget scxmlState, String script) {
		this.scxmlState = scxmlState;
		this.script = script;
	}

	public String getScxmlStateId() {
		return scxmlState.getId();
	}

	public String getScript() {
		return script;
	}

	public String getScriptEventId() {
		return getScxmlStateId() + "#" + script + ";";
	}

	private ScriptEventManager scriptEventManager;

	public void activateScriptHandler(ScriptEventManager scriptEventManager) {
		this.scriptEventManager = scriptEventManager;
		if (log.isDebugEnabled()) {
			debug("Activating event condition for " + getScript() + " (" + this + ")");
		}
		checkEventCondition();
	}

	private Notifier dependencies = null;

	private void disposeDependencies() {
		if (isActive()) {
			Notifier notifier = dependencies;
			dependencies = null;
			if (notifier instanceof IDisposable) {
				((IDisposable)notifier).dispose();
			}
			notifier.eAdapters().remove(this);
		}
	}

	public void deactivateScriptHandler() {
		disposeDependencies();
		if (log.isDebugEnabled()) {
			debug("Deactivating event condition for " + getScript() + " (" + this + ")");
		}
		scriptEventManager = null;
	}

	private SCInstance getScInstance() {
		return scriptEventManager.getScInstance();
	}
	
	private SCXMLExecutor getExecutor() {
		return getScInstance().getExecutor();
	}

	private void debug(String message) {
		if (log.isDebugEnabled()) {
			log.debug(getScxmlStateId() + ": " + message + " (" + this + ")");
		}
	}
	
	private void checkEventCondition() {
		disposeDependencies();
		if (log.isDebugEnabled()) {
			debug("Checking event condition for " + getScript());
		}
		EmfContext.startAddingDependencies();
		Object result = null;
		try {
			result = getExecutor().getEvaluator().evalCond(getScInstance().getContext(scxmlState), script);
		} catch (SCXMLExpressionException e) {
		}
		dependencies = EmfContext.stopAddingDependencies();
		if (isActive()) {
			dependencies.eAdapters().add(this);
		}
		if (log.isDebugEnabled()) {
			debug("Event condition result for " + getScript() + ": " + result);
		}
		if (Boolean.TRUE.equals(result)) {
			if (log.isDebugEnabled()) {
				debug("Sending event " + getScriptEventId());
			}
			scriptEventManager.sendScriptEvent(this);
		}
	}
	
	private boolean isActive() {
		return (dependencies != null);
	}
	
	private boolean isRelevantNotification(Notification notification) {
		return notification.getEventType() != Notification.REMOVING_ADAPTER;
	}

	public void notifyChanged(Notification notification) {
		if (isActive() && isRelevantNotification(notification)) {
			checkEventCondition();
		}
	}
}
