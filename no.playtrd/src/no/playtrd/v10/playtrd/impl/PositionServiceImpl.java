/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.PositionService;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PositionServiceImpl#getObjectPositions <em>Object Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionServiceImpl extends ServiceImpl implements PositionService {
	/**
	 * The cached value of the '{@link #getObjectPositions() <em>Object Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPosition> objectPositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.POSITION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPosition> getObjectPositions() {
		if (objectPositions == null) {
			objectPositions = new EObjectContainmentEList<ObjectPosition>(ObjectPosition.class, this, PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS);
		}
		return objectPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS:
				return ((InternalEList<?>)getObjectPositions()).basicRemove(otherEnd, msgs);
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
			case PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS:
				return getObjectPositions();
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
			case PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS:
				getObjectPositions().clear();
				getObjectPositions().addAll((Collection<? extends ObjectPosition>)newValue);
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
			case PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS:
				getObjectPositions().clear();
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
			case PlaytrdPackage.POSITION_SERVICE__OBJECT_POSITIONS:
				return objectPositions != null && !objectPositions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PositionServiceImpl
