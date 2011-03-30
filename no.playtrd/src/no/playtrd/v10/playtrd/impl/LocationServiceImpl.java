/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.LocationService;
import no.playtrd.v10.playtrd.ObjectLocation;
import no.playtrd.v10.playtrd.PlaytrdPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.LocationServiceImpl#getObjectLocations <em>Object Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationServiceImpl extends ServiceImpl implements LocationService {
	/**
	 * The cached value of the '{@link #getObjectLocations() <em>Object Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectLocation> objectLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.LOCATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectLocation> getObjectLocations() {
		if (objectLocations == null) {
			objectLocations = new EObjectContainmentEList<ObjectLocation>(ObjectLocation.class, this, PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS);
		}
		return objectLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS:
				return ((InternalEList<?>)getObjectLocations()).basicRemove(otherEnd, msgs);
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
			case PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS:
				return getObjectLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS:
				getObjectLocations().clear();
				getObjectLocations().addAll((Collection<? extends ObjectLocation>)newValue);
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
			case PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS:
				getObjectLocations().clear();
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
			case PlaytrdPackage.LOCATION_SERVICE__OBJECT_LOCATIONS:
				return objectLocations != null && !objectLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationServiceImpl
