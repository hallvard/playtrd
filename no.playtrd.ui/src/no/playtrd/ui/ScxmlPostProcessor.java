package no.playtrd.ui;

import no.hal.scxml.generator.ScxmlRunner;

import org.apache.commons.scxml.model.ModelException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.emf.ecore.javascript.JavascriptSupport;
import org.eclipse.e4.tm.builder.IBuilder;
import org.eclipse.e4.tm.ui.editor.IPostProcessor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ScxmlPostProcessor implements IPostProcessor {

	private ScxmlRunner scxmlRunner;
	
	public void postBuildModel(EObject model, IBuilder builder, IAdaptable adaptable) {
		URI modelUri = model.eResource().getURI();

		JavascriptSupport javascriptSupport = getJavascriptSupport(adaptable);
		ResourceSet resourceSet = model.eResource().getResourceSet();
		if (javascriptSupport != null && resourceSet != null) {
			scxmlRunner = new ScxmlRunner();
			try {
				URI domainModelUri = modelUri.trimFileExtension().appendFileExtension("ecore");
				URI domainDataUri = modelUri.trimFileExtension().appendFileExtension("xmi");
				scxmlRunner.init(domainModelUri.toString(), domainDataUri.toString());
			} catch (ModelException e) {
				System.err.println("Exception when initializing ScxmlRunner for " + modelUri);
			}
			scxmlRunner.start();
		}
	}

	private JavascriptSupport getJavascriptSupport(IAdaptable adaptable) {
		return (JavascriptSupport)adaptable.getAdapter(JavascriptSupport.class);
	}

	public void postLoadModel(IAdaptable adaptable) {
	}

	public Object getAdapter(Class adapter) {
		if (adapter.equals(ScxmlRunner.class)) {
			return scxmlRunner;
		}
		return null;
	}

	// EContentAdapter method
	
//	public void notifyChanged(Notification notification) {
//		if (notification.getNotifier() instanceof EObject && notification.getFeature() instanceof EStructuralFeature) {
//			EObject source = (EObject)notification.getNotifier();
//			EStructuralFeature feature = (EStructuralFeature)notification.getFeature();
//			String eventString = source.eResource().getURIFragment(source) + "#" + feature.getName();
//			try {
//				exec.triggerEvent(new TriggerEvent(eventString, TriggerEvent.SIGNAL_EVENT, source));
//			} catch (ModelException me) {
//				System.err.println("Exception when triggering event from " + notification + ": " + me);
//			}
//		}
//		super.notifyChanged(notification);
//	}
}
