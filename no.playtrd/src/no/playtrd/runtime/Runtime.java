package no.playtrd.runtime;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.js4emf.ecore.JavascriptSupport;
import org.eclipse.emf.js4emf.ecore.JavascriptSupportFactory;

public class Runtime extends AbstractRuntime {

	public Runtime(IAdaptable context) {
		super(context);
		addRuntimeComponent(new ScxmlRuntimeComponent(this));
		addRuntimeComponent(new TmRuntimeComponent(this));
		addRuntimeComponent(new GenericServiceRuntimeComponent(this));
	}

	JavascriptSupport javascriptSupport;

	private JavascriptSupport getJavascriptSupport() {
		if (javascriptSupport == null) {
			javascriptSupport = JavascriptSupportFactory.getInstance().createJavascriptSupport();
		}
		return javascriptSupport;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.equals(JavascriptSupport.class)) {
			return getJavascriptSupport();
		}
		return super.getAdapter(adapter);
	}
}
