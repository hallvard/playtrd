package no.hal.scxml.emf.javascript;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.js4emf.ecore.JavascriptSupport;
import org.eclipse.emf.js4emf.ecore.JavascriptSupportFactory;

import no.hal.scxml.javascript.JavascriptContext;

public class EmfJavascriptContext extends JavascriptContext {

	private JavascriptSupport javascriptSupport;
	
	public EmfJavascriptContext(JavascriptContext parentScope, JavascriptSupport javascriptSupport) {
		super(parentScope);
	}

	protected Object wrap(Object value) {
		JavascriptSupport javascriptSupport = this.javascriptSupport;
		if (javascriptSupport == null) {
			if (value instanceof EObject) {
				javascriptSupport = JavascriptSupportFactory.getInstance().getJavascriptSupport((EObject) value);
			} else if (value instanceof Resource) {
				javascriptSupport = JavascriptSupportFactory.getInstance().getJavascriptSupport((Resource) value);
			} else if (value instanceof ResourceSet) {
				javascriptSupport = JavascriptSupportFactory.getInstance().getJavascriptSupport((ResourceSet) value);
			}
		}
		return (javascriptSupport != null ? javascriptSupport.getJsObject(value) : super.wrap(value));
	}
}
