package no.playtrd.ui;

import java.util.logging.Level;
import java.util.logging.Logger;

import no.playtrd.services.IPositionService;
import no.playtrd.v10.playtrd.PositionService;
import no.playtrd.v10.playtrd.UoD;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.tm.builder.IBuilder;
import org.eclipse.e4.tm.ui.editor.IPostProcessor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

public class PositionServicePostProcessor implements IPostProcessor {

	private Logger log = Logger.getLogger(Activator.getDefault().getBundle().getSymbolicName());

	private <T> T getEObject(TreeIterator<Object> allContents, Class<T> clazz, Level severity) {
		while (allContents.hasNext()) {
			Object o = allContents.next();
			if (clazz.isInstance(o)) {
				return (T)o;
			}
		}
		if (severity != null) {
			log.log(severity, "Didn't find object of " + clazz);
		}
		return null;
	}

	public void postBuildModel(EObject model, IBuilder builder, final IAdaptable adaptable) {
		final BundleContext context = Activator.getDefault().getBundle().getBundleContext();
		UoD uod = getEObject(EcoreUtil.getAllContents(model.eResource().getResourceSet(), false), UoD.class, Level.FINE);
		if (uod == null) {
			return;
		}
		final PositionService positionServiceData = getEObject(EcoreUtil.getAllContents(uod, false), PositionService.class, Level.WARNING);
		if (positionServiceData == null) {
			return;
		}
		ServiceListener serviceListener = new ServiceListener() {
			public void serviceChanged(ServiceEvent event) {
				switch (event.getType()) {
				case ServiceEvent.REGISTERED: {
					handlePositionService(context, positionServiceData, (IEditingDomainProvider)adaptable.getAdapter(IEditingDomainProvider.class));
					break;
				}
				}
			}
		};
		String filter = "(objectclass=" + IPositionService.class.getName() + ")";
		try {
			context.addServiceListener(serviceListener, filter);
			ServiceReference[] serviceReferences = context.getServiceReferences(null, filter);
		      for(int i = 0; serviceReferences != null && i < serviceReferences.length; i++) {
		    	  serviceListener.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, serviceReferences[i]));
		      }
		} catch (InvalidSyntaxException e) {
		}
	}

	private boolean handlePositionService(final BundleContext context, PositionService positionServiceData,IEditingDomainProvider editingDomainProvider) {
		ServiceReference serviceReference = context.getServiceReference(IPositionService.class.getName());
		if (serviceReference != null) {
			IPositionService positionServiceImpl = (IPositionService)context.getService(serviceReference);
			if (positionServiceImpl != null) {
				positionServiceImpl.handlePositionService(positionServiceData, editingDomainProvider);
//				log.log(Level.INFO, "Using IPositionService of " + positionServiceImpl.getClass());
				return true;
			}
		}
		return false;
	}

	public void postLoadModel(IAdaptable adaptable) {
	}

	public Object getAdapter(Class adapter) {
		return null;
	}
}
