/**
 * 
 */
package no.hal.scxml.javascript;

import java.util.Collection;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.model.Action;
import org.apache.commons.scxml.model.ModelException;

public class ScriptTestAction extends Action {

	private String expected, expr;
	
	public String getExpected() {
		return expected;
	}
	public void setExpected(String expected) {
		this.expected = expected;
	}

	public String getExpr() {
		return expr;
	}
	public void setExpr(String expr) {
		this.expr = expr;
	}

	public void execute(EventDispatcher evtDispatcher,
			ErrorReporter errRep, SCInstance scInstance, Log appLog,
			Collection derivedEvents) throws ModelException,
			SCXMLExpressionException {
		Object result = scInstance.getEvaluator().eval(scInstance.getContext(getParentTransitionTarget()), expr);
		TestCase.assertEquals(expected, String.valueOf(result));
	}
}