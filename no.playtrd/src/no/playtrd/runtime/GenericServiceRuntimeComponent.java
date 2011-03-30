package no.playtrd.runtime;

import java.util.ArrayList;
import java.util.List;

import no.playtrd.Activator;
import no.playtrd.services.IGenericService;
import no.playtrd.v10.playtrd.Playtrd;
import no.playtrd.v10.playtrd.Service;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;

public class GenericServiceRuntimeComponent extends Runtime.Component {

	public GenericServiceRuntimeComponent(AbstractRuntime runtime) {
		super(runtime);
	}

	private <T> T getEObject(TreeIterator<Object> allContents, Class<T> clazz, int severity) {
		List<T> eObjects = getEObjects(allContents, clazz, 1, 1, severity);
		return (eObjects.size() > 0 ? eObjects.get(0) : null);
	}

	private <T> List<T> getEObjects(TreeIterator<Object> allContents, Class<T> clazz, int minCount, int maxCount, int severity) {
		List<T> eObjects = new ArrayList<T>();
		while (allContents.hasNext()) {
			Object o = allContents.next();
			if (clazz.isInstance(o)) {
				eObjects.add((T)o);
				if (maxCount >= 0 && eObjects.size() >= maxCount) {
					break;
				}
			}
		}
		if (eObjects.size() < minCount && severity >= 0) {
			Activator.getDefault().log(severity, "Didn't find object of " + clazz);
		}
		return eObjects;
	}

	private ServiceListener serviceListener = null; 
	private List<Service> services = null;
	
	public void start() {
		ResourceSet resourceSet = (ResourceSet)runtime.getContextAdapter(ResourceSet.class);
		Playtrd uod = getEObject(EcoreUtil.getAllContents(resourceSet, false), Playtrd.class, Status.INFO);
		if (uod == null) {
			return;
		}
		services = getEObjects(EcoreUtil.getAllContents(uod, false), Service.class, 0, -1, Status.WARNING);
		registerServiceHandler();
	}

	protected void registerServiceHandler() {
		if (serviceListener == null) {
			serviceListener = new ServiceListener() {
				public void serviceChanged(ServiceEvent event) {
					switch (event.getType()) {
					case ServiceEvent.REGISTERED: {
						BundleContext context = Activator.getDefault().getBundle().getBundleContext();
						handleService(context, event.getServiceReference());
						break;
					}
					}
				}
			};
		}
		BundleContext context = Activator.getDefault().getBundle().getBundleContext();
		String filter = "(" + Constants.OBJECTCLASS + "=" + IGenericService.class.getName() + ")";
		try {
			context.addServiceListener(serviceListener, filter);
			ServiceReference[] serviceReferences = context.getServiceReferences(null, filter);
			for(int i = 0; serviceReferences != null && i < serviceReferences.length; i++) {
				serviceListener.serviceChanged(new ServiceEvent(ServiceEvent.REGISTERED, serviceReferences[i]));
			}
		} catch (InvalidSyntaxException e) {
		}
	}

	private boolean handleService(final BundleContext context, ServiceReference serviceReference) {
		IEditingDomainProvider editingDomainProvider = (IEditingDomainProvider)runtime.getAdapter(IEditingDomainProvider.class);
		if (serviceReference != null) {
			IGenericService<Service> serviceImpl = (IGenericService<Service>)context.getService(serviceReference);
			if (serviceImpl != null) {
				for (Service service: services) {
					try {
						serviceImpl.handleService(service, editingDomainProvider);
					} catch (Exception e) {
					}
				}
				//				log.log(Level.INFO, "Using IPositionService of " + positionServiceImpl.getClass());
				return true;
			}
		}
		return false;
	}

	public void stop() {
		if (serviceListener != null) {
			BundleContext context = Activator.getDefault().getBundle().getBundleContext();
			context.removeServiceListener(serviceListener);
		}
	}
}
