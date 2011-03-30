package no.hal.scxml.emf.javascript;

import no.hal.scxml.javascript.JavascriptContext;
import no.hal.scxml.javascript.JavascriptEvaluator;

import org.apache.commons.scxml.Context;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.eclipse.e4.emf.ecore.javascript.JavascriptSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mozilla.javascript.Scriptable;

public class EmfJavascriptEvaluator extends JavascriptEvaluator {

	private JavascriptSupport javascriptSupport;
	private ResourceSet resourceSet;
	
	public EmfJavascriptEvaluator(JavascriptSupport javascriptSupport, ResourceSet resourceSet) {
		super(javascriptSupport.getScope(null));
		this.javascriptSupport = javascriptSupport;
		this.resourceSet = resourceSet;
	}

	protected JavascriptContext createContext(Context parentScope) {
		return new EmfJavascriptContext((JavascriptContext)parentScope, javascriptSupport);
	}

	protected Object evalExpression(Context ctx, String expr) throws SCXMLExpressionException {
		Object result = null;
		try {
			Scriptable evaluationScope = getEvaluationScope((JavascriptContext)ctx);
			result = javascriptSupport.evaluate(expr, evaluationScope, true);
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
			Object scopeObject = (uriFragment != null ? resourceSet.getEObject(uri, true) : resourceSet.getResource(uri, true));
			return javascriptSupport.getScope(scopeObject);
		}
		return super.getEvaluationScope(scope);
	}
}
