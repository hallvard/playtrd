package no.hal.scxml.emf.javascript;

import no.hal.scxml.javascript.JavascriptContext;

import org.eclipse.e4.emf.ecore.javascript.JavascriptSupport;

public class EmfJavascriptContext extends JavascriptContext {

	private JavascriptSupport javascriptSupport;
	
	public EmfJavascriptContext(JavascriptContext parentScope, JavascriptSupport javascriptSupport) {
		super(parentScope);
		this.javascriptSupport = javascriptSupport;
	}

	protected Object wrap(Object value) {
		return javascriptSupport.wrap(value);
	}
}
