package no.playtrd.runtime;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.emf.ecore.javascript.JavascriptSupport;

public class Runtime extends AbstractRuntime {

	private JavascriptSupport javascriptSupport;

	public Runtime(IAdaptable context) {
		super(context);
		addRuntimeComponent(new ScxmlRuntimeComponent(this));
		addRuntimeComponent(new TmRuntimeComponent(this));
		addRuntimeComponent(new GenericServiceRuntimeComponent(this));
	}

	private JavascriptSupport getJavascriptSupport() {
		if (javascriptSupport == null) {
			javascriptSupport = new JavascriptSupport();
		}
		return javascriptSupport;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(JavascriptSupport.class)) {
			return getJavascriptSupport();
		}
		return super.getAdapter(adapter);
	}
}
