/*******************************************************************************
 * Copyright (c) 2008 Hallvard Trætteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Trætteberg - initial API and implementation
 ******************************************************************************/
package no.hal.scxml.javascript;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.mozilla.javascript.Scriptable;
import org.w3c.dom.Node;

/**
 * JavascriptEvaluator implements support for the javascript scripting language.
 * Each SCXML context is a JavascriptContext, which extends ScriptableObject and implements Context.
 * 
 * @author Hallvard Tr&aelig;tteberg
 * 
 */
public class JavascriptEvaluator implements Evaluator {

	private Scriptable rootScope;
	
	public JavascriptEvaluator(Scriptable rootScope) {
		initRootScope(rootScope);
	}

	public JavascriptEvaluator() {
		this(null);
	}

	public Context newContext(Context parentScope) {
		JavascriptContext newContext = createContext(parentScope);
		if (parentScope == null) {
			newContext.setParentScope(rootScope);
		}
		initRootContext(newContext);
		return newContext;
	}

	protected JavascriptContext createContext(Context parentScope) {
		return new JavascriptContext((JavascriptContext)parentScope);
	}

	protected org.mozilla.javascript.Context enterContext() {
		return org.mozilla.javascript.Context.enter();
	}
	protected void exitContext() {
		org.mozilla.javascript.Context.exit();
	}
	
	protected void initRootScope(Scriptable rootScope) {
		if (rootScope == null) {
			org.mozilla.javascript.Context context = enterContext();
			try {
				rootScope = context.initStandardObjects();
			} finally {
				exitContext();
			}
		}
		this.rootScope = rootScope;
	}

	protected void initRootContext(JavascriptContext newContext) {
	}

	//

	protected SCXMLExpressionException scxmlEvalException(String expr, Exception e) {
		return new SCXMLExpressionException(e + ", when evaluating \"" + expr + "\"", e);
	}

	protected Scriptable getEvaluationScope(JavascriptContext scope) {
		return scope;
	}

	protected Object evalExpression(Context ctx, String expr) throws SCXMLExpressionException {
		Object result = null;
		org.mozilla.javascript.Context context = enterContext();
		try {
			Scriptable evaluationScope = getEvaluationScope((JavascriptContext) ctx);
			result = context.evaluateString(evaluationScope, expr, "SCXMLExcpression", -1, null);
		} catch (Exception e) {
			throw scxmlEvalException(expr, e);
		} finally {
			exitContext();
		}
		return result;
	}

	public Object eval(Context ctx, String expr) throws SCXMLExpressionException {
		return (expr != null ? evalExpression(ctx, expr) : null);
	}

	public Boolean evalCond(Context ctx, String expr) throws SCXMLExpressionException {
		Object result = evalExpression(ctx, expr);
		return (result instanceof Boolean ? (Boolean)result : Boolean.valueOf(result != null));
	}

	public Node evalLocation(Context ctx, String expr) throws SCXMLExpressionException {
		Object result = evalExpression(ctx, expr);
		return (result instanceof Node ? (Node)result : null);
	}
}
