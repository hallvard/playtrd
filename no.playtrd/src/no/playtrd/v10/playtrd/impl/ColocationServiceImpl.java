/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.ColocationService;
import no.playtrd.v10.playtrd.ObjectColocation;
import no.playtrd.v10.playtrd.PlaytrdPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colocation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ColocationServiceImpl#getObjectColocations <em>Object Colocations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColocationServiceImpl extends ServiceImpl implements ColocationService {
	/**
	 * The cached value of the '{@link #getObjectColocations() <em>Object Colocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectColocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectColocation> objectColocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColocationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.COLOCATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectColocation> getObjectColocations() {
		if (objectColocations == null) {
			objectColocations = new EObjectContainmentEList<ObjectColocation>(ObjectColocation.class, this, PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS);
		}
		return objectColocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS:
				return ((InternalEList<?>)getObjectColocations()).basicRemove(otherEnd, msgs);
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
			case PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS:
				return getObjectColocations();
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
			case PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS:
				getObjectColocations().clear();
				getObjectColocations().addAll((Collection<? extends ObjectColocation>)newValue);
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
			case PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS:
				getObjectColocations().clear();
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
			case PlaytrdPackage.COLOCATION_SERVICE__OBJECT_COLOCATIONS:
				return objectColocations != null && !objectColocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColocationServiceImpl
