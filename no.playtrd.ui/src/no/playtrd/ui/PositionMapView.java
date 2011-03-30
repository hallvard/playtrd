package no.playtrd.ui;

import java.util.Iterator;

import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.Playtrd;
import no.playtrd.v10.playtrd.PositionService;
import no.playtrd.v10.playtrd.Positioned;
import no.playtrd.v10.playtrd.Service;
import no.playtrd.v10.playtrd.impl.PlaytrdFactoryImpl;

import org.eclipse.e4.emf.javascript.ui.AbstractSelectionView;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.jscience.geography.coordinates.LatLong;

import swingxmap.MapViewContent;

public class PositionMapView extends AbstractSelectionView {

	private MapViewContent mapViewContent;

	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}
	private EObject getSelectedEObject() {
		return (EObject)this.selection;
	}

	public final static String playtrdSourceUri = "http://playtrd.no/v10/playtrd.ecore";

	public static EAttribute getPositionAttribute(EObject eObject) {
		for (Iterator<EAttribute> attributes = eObject.eClass().getEAllAttributes().iterator(); attributes.hasNext();) {
			final EAttribute attrFeature = attributes.next();
			String annotation = EcoreUtil.getAnnotation(attrFeature, playtrdSourceUri, "positionFeature");
			if (annotation != null) {
				return attrFeature;
			}
		}
		return null;
	}

	private MultiAdapter positionsAdapter = new MultiAdapter() {
		public void notifyChanged(Notification msg) {
			mapViewContent.updatePositions();
		}
	};
	
	protected void selectionChanged(ISelection selection) {
		super.selectionChanged(selection);
		positionsAdapter.clearTargets();
		mapViewContent.clearPositions();
		EObject eObject = getSelectedEObject();
		if (eObject != null) {
			addPositions(eObject, -1);
		}
		mapViewContent.updatePositions();
	}

	private void addPositions(EObject eObject, int level) {
		ObjectPosition position = null;
		if (eObject instanceof ObjectPosition) {
			position = (ObjectPosition)eObject;
		} else if (eObject instanceof Positioned) {
			position = findObjectPosition((Positioned)eObject);
		} 
		if (position != null) {
			mapViewContent.addPosition(new ObjectPositionProvider((ObjectPosition)position) {
				public void setPosition(double latitude, double longitude) {
					PositionMapView.this.setPosition(getObjectPosition(), latitude, longitude);
				}
			});
			positionsAdapter.addTarget(position);
		} else if (level != 0) {
			for (EObject child: eObject.eContents()) {
				addPositions(child, level - 1);
			}
		}
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
	private void setPosition(EObject eObject, double lat, double lng) {
		if (editingDomainProvider != null) {
			EAttribute attr = getPositionAttribute(eObject);
			if (attr != null) {
				EditingDomain editingDomain = editingDomainProvider.getEditingDomain();
				LatLong position = PlaytrdFactoryImpl.createLatLong(lat, lng);
				Command command = new SetCommand(editingDomain, eObject, attr, position);
				if (command.canExecute()) {
					editingDomain.getCommandStack().execute(command);
				}
			}
		}
	}

	public void createPartControl(final Composite parent) {
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
		mapViewContent.createControls(parent);
	}

	public void setFocus() {
		mapViewContent.setFocus();
	}
}
