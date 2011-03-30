package no.hal.scxml.javascript;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.model.Action;
import org.apache.commons.scxml.model.ModelException;

public class ScriptAction extends Action {

	private static final long serialVersionUID = 1L;

	private String script;
	
	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public final static String JAVASCRIPT_NAMESPACE = "http://www.mozilla.org/rhino";
	public final static String SCRIPT_TAG = "script";

	@Override
	public void execute(EventDispatcher evtDispatcher, ErrorReporter errRep,
			SCInstance scInstance, Log appLog, Collection derivedEvents)
			throws ModelException, SCXMLExpressionException {
		Evaluator evaluator = scInstance.getEvaluator();
		evaluator.eval(scInstance.getContext(getParentTransitionTarget()), script);
	}
}
