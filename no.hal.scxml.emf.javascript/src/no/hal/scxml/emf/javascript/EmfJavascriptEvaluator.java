package no.hal.scxml.emf.javascript;

import no.hal.scxml.javascript.JavascriptContext;
import no.hal.scxml.javascript.JavascriptEvaluator;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.js4emf.ecore.IJsScope;
import org.eclipse.emf.js4emf.ecore.JavascriptSupport;
import org.mozilla.javascript.Scriptable;

public class EmfJavascriptEvaluator extends JavascriptEvaluator {

	private JavascriptSupport javascriptSupport;
	private ResourceSet resourceSet;
	
	public EmfJavascriptEvaluator(ResourceSet resourceSet, JavascriptSupport javascriptSupport) {
		super((Scriptable) javascriptSupport.getJsScope(null));
		this.javascriptSupport = javascriptSupport;
		this.resourceSet = resourceSet;
	}

	protected JavascriptContext createContext(Context parentScope) {
		return new EmfJavascriptContext((JavascriptContext)parentScope, javascriptSupport);
	}

	protected Object evalExpression(Context ctx, String expr) throws SCXMLExpressionException {
		expr = expr.trim();
		Object result = null;
		try {
			Scriptable evaluationScope = getEvaluationScope((JavascriptContext)ctx);
			result = (evaluationScope instanceof IJsScope ? ((IJsScope) evaluationScope).evaluate(expr) : super.evalExpression(ctx, expr));
		} catch (Exception e) {
			throw scxmlEvalException(expr, e);
		}
		return result;
	}

	protected Scriptable getEvaluationScope(JavascriptContext scope) {
		Object resourceUri = scope.get("resourceUri");
		Object uriFragment = scope.get("uriFragment");
		if (resourceUri != null) {
			if (resourceSet == null) {
				resourceSet = new ResourceSetImpl();
			}
			URI uri = URI.createURI(resourceUri.toString());
			if (uriFragment != null) {
				uri = uri.appendFragment(uriFragment.toString());
			}
			Object scopeObject = null;
			if (uriFragment != null) {
				EObject eObject = resourceSet.getEObject(uri, true);
				scopeObject = eObject;
			} else {
				Resource resource = resourceSet.getResource(uri, true);
				scopeObject = resource;
			}
			return (Scriptable) javascriptSupport.getJsObject(scopeObject);
		}
		return super.getEvaluationScope(scope);
	}
}
