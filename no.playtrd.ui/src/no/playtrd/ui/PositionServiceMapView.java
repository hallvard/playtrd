package no.playtrd.ui;

import java.util.Dictionary;
import java.util.EventObject;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import no.playtrd.services.IPositionService;
import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.Playtrd;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.PositionService;
import no.playtrd.v10.playtrd.Positioned;
import no.playtrd.v10.playtrd.Service;
import no.playtrd.v10.playtrd.impl.PlaytrdFactoryImpl;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.e4.emf.ecore.javascript.Activator;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.jscience.geography.coordinates.LatLong;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import swingxmap.IPositionProvider;
import swingxmap.MapViewContent;

public class PositionServiceMapView extends ViewPart implements IAdaptable, IPositionService, ISelectionProvider, CommandStackListener, ISelectionChangedListener {

	private Logger log = Logger.getLogger(Activator.getDefault().getBundle().getSymbolicName());

	private MapViewContent mapViewContent;

	public final static String playtrdSourceUri = "http://playtrd.no/v10/playtrd.ecore";

	private MultiAdapter positionsAdapter = new MultiAdapter() {
		public void notifyChanged(Notification msg) {
			mapViewContent.updatePositions();
		}
	};

	private int addPositions(EObject eObject, int level) {
		ObjectPosition position = null;
		if (eObject instanceof ObjectPosition) {
			position = (ObjectPosition)eObject;
		} else if (eObject instanceof Positioned) {
			position = findObjectPosition((Positioned)eObject);
		}
		int count = 0;
		if (position != null) {
			count++;
			mapViewContent.addPosition(new ObjectPositionProvider((ObjectPosition)position) {
				public void setPosition(double latitude, double longitude) {
					PositionServiceMapView.this.setPosition(getObjectPosition(), latitude, longitude);
				}
			});
			positionsAdapter.addTarget(position);
		} else if (level != 0) {
			for (EObject child: eObject.eContents()) {
				count += addPositions(child, level - 1);
			}
		}
		return count;
	}

	private ObjectPosition findObjectPosition(Positioned positioned) {
		EObject eObject = positioned;
		while (eObject != null) {
			if (eObject instanceof Playtrd) {
				for (Service service: ((Playtrd)eObject).getServices()) {
					if (service instanceof PositionService) {
						return findObjectPosition((PositionService)service, positioned);
					}
				}
			}
			eObject = eObject.eContainer();
		}
		return null;
	}

	private ObjectPosition findObjectPosition(PositionService positionService, Positioned positioned) {
		for (ObjectPosition objectPosition: positionService.getObjectPositions()) {
			if (objectPosition.getPositioned() == positioned) {
				return objectPosition;
			}
		}
		return null;
	}

	private IEditingDomainProvider editingDomainProvider = null;

	public void setEditingDomainProvider(IEditingDomainProvider editingDomainProvider) {
		if (this.editingDomainProvider != null) {
			this.editingDomainProvider.getEditingDomain().getCommandStack().removeCommandStackListener(this);
		}
		this.editingDomainProvider = editingDomainProvider;
		if (this.editingDomainProvider != null) {
			this.editingDomainProvider.getEditingDomain().getCommandStack().addCommandStackListener(this);
		}
	}

	public void commandStackChanged(EventObject event) {
		viewComposite.getDisplay().asyncExec(new Runnable() {
			public void run() {
				if (propertySheetPage != null && (! propertySheetPage.getControl().isDisposed())) {
					propertySheetPage.refresh();
				}
			}
		});
	}

	private void setPosition(EObject eObject, double lat, double lng) {
		EAttribute positionAttr = PlaytrdPackage.eINSTANCE.getObjectPosition_GlobePosition();
		LatLong position = PlaytrdFactoryImpl.createLatLong(lat, lng);
		if (editingDomainProvider != null) {
			EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
			Command command = new SetCommand(editingDomain, eObject, positionAttr, position);
			if (command.canExecute()) {
				editingDomain.getCommandStack().execute(command);
			}
		} else {
			eObject.eSet(positionAttr, position);
		}
	}

	private ServiceRegistration serviceRegistration = null;
	private Dictionary<String, Object> serviceProperties = new Hashtable<String, Object>();	{
		serviceProperties.put("viewId", "no.playtrd.ui.PositionServiceMapView");
	}

	private TreeViewer viewer;
	private PropertySheetPage propertySheetPage;
	private ComposedAdapterFactory adapterFactory;

	private Composite viewComposite;

	protected void handleActivated(IWorkbenchPart part) {
		if (part instanceof IEditingDomainProvider) {
			setEditingDomainProvider((IEditingDomainProvider)part);
		}
	}
	
	public void createPartControl(final Composite parent) {
		viewComposite = parent;
		getSite().setSelectionProvider(this);

		BundleContext context = Activator.getDefault().getBundle().getBundleContext();
		serviceRegistration = context.registerService(IPositionService.class.getName(), this, serviceProperties);
		mapViewContent = new MapViewContent() {
			protected void updateStatus(final String status) {
				super.updateStatus(status);
				parent.getDisplay().asyncExec(new Runnable() {
					public void run() {
						getViewSite().getActionBars().getStatusLineManager().setMessage(status);
					}
				});
			}
		};
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
		mapViewContent.createControls(sashForm);

		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		Composite treeParent = new Composite(sashForm, SWT.BORDER);
		treeParent.setLayout(new FillLayout());
		Tree tree = new Tree(treeParent, SWT.SINGLE);
		viewer = new TreeViewer(tree);
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		//		viewer.setInput();
		//		viewer.setSelection(new StructuredSelection(), true);
		//		new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);
		sashForm.setWeights(new int[]{70, 30});

		viewer.addSelectionChangedListener(this);
	}

	public void dispose() {
		if (serviceRegistration != null) {
			serviceRegistration.unregister();
		}
		super.dispose();
	}

	public void setFocus() {
		mapViewContent.setFocus();
	}

	public void handleService(PositionService positionService, IEditingDomainProvider editingDomainProvider) {
		setEditingDomainProvider(editingDomainProvider);
		positionsAdapter.clearTargets();
		mapViewContent.clearPositions();
		viewer.setInput(positionService);
		int count = addPositions(positionService, -1);
		log.log(Level.INFO, "Service activated with " + count + " positions");
		mapViewContent.updatePositions();
	}

	//

	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(key);
	}

	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null){
			propertySheetPage = new PropertySheetPage();
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}
		return propertySheetPage;
	}

	// delegate selection to viewer

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		viewer.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return viewer.getSelection();
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		viewer.removeSelectionChangedListener(listener);
	}

	public void setSelection(ISelection selection) {
		viewer.setSelection(selection);
	}

	public void selectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).getFirstElement() instanceof ObjectPosition) {
			ObjectPosition objectPosition = (ObjectPosition)((IStructuredSelection)selection).getFirstElement();
			for (IPositionProvider positionProvider: mapViewContent) {
				if (positionProvider instanceof ObjectPositionProvider && (((ObjectPositionProvider)positionProvider).getObjectPosition() == objectPosition)) {
					mapViewContent.setSelectedPosition(positionProvider);
				}
			}
		}
	}
}
