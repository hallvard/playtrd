/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import no.playtrd.v10.playtrd.POI;
import no.playtrd.v10.playtrd.TagData;
import no.playtrd.v10.playtrd.PlaytrdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>POI Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TagDataImpl#getPoi <em>Poi</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.TagDataImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TagDataImpl extends EObjectImpl implements TagData {
	/**
	 * The cached value of the '{@link #getPoi() <em>Poi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoi()
	 * @generated
	 * @ordered
	 */
	protected POI poi;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.TAG_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POI getPoi() {
		if (poi != null && poi.eIsProxy()) {
			InternalEObject oldPoi = (InternalEObject)poi;
			poi = (POI)eResolveProxy(oldPoi);
			if (poi != oldPoi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.TAG_DATA__POI, oldPoi, poi));
			}
		}
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POI basicGetPoi() {
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoi(POI newPoi) {
		POI oldPoi = poi;
		poi = newPoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.TAG_DATA__POI, oldPoi, poi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getEntries() {
		if (entries == null) {
			entries = new EcoreEMap<String,String>(PlaytrdPackage.Literals.TAG_ENTRY, TagEntryImpl.class, this, PlaytrdPackage.TAG_DATA__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.TAG_DATA__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.TAG_DATA__POI:
				if (resolve) return getPoi();
				return basicGetPoi();
			case PlaytrdPackage.TAG_DATA__ENTRIES:
				if (coreType) return getEntries();
				else return getEntries().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlaytrdPackage.TAG_DATA__POI:
				setPoi((POI)newValue);
				return;
			case PlaytrdPackage.TAG_DATA__ENTRIES:
				((EStructuralFeature.Setting)getEntries()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlaytrdPackage.TAG_DATA__POI:
				setPoi((POI)null);
				return;
			case PlaytrdPackage.TAG_DATA__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlaytrdPackage.TAG_DATA__POI:
				return poi != null;
			case PlaytrdPackage.TAG_DATA__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //POIMetaDataImpl
