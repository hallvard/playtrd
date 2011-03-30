/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.Positioned;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jscience.geography.coordinates.LatLong;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ObjectPositionImpl#getGlobePosition <em>Globe Position</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ObjectPositionImpl#getPositioned <em>Positioned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPositionImpl extends ScriptedImpl implements ObjectPosition {
	/**
	 * The default value of the '{@link #getGlobePosition() <em>Globe Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobePosition()
	 * @generated
	 * @ordered
	 */
	protected static final LatLong GLOBE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobePosition() <em>Globe Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobePosition()
	 * @generated
	 * @ordered
	 */
	protected LatLong globePosition = GLOBE_POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPositioned() <em>Positioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioned()
	 * @generated
	 * @ordered
	 */
	protected Positioned positioned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.OBJECT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLong getGlobePosition() {
		return globePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobePosition(LatLong newGlobePosition) {
		LatLong oldGlobePosition = globePosition;
		globePosition = newGlobePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.OBJECT_POSITION__GLOBE_POSITION, oldGlobePosition, globePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positioned getPositioned() {
		if (positioned != null && positioned.eIsProxy()) {
			InternalEObject oldPositioned = (InternalEObject)positioned;
			positioned = (Positioned)eResolveProxy(oldPositioned);
			if (positioned != oldPositioned) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.OBJECT_POSITION__POSITIONED, oldPositioned, positioned));
			}
		}
		return positioned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positioned basicGetPositioned() {
		return positioned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositioned(Positioned newPositioned) {
		Positioned oldPositioned = positioned;
		positioned = newPositioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.OBJECT_POSITION__POSITIONED, oldPositioned, positioned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.OBJECT_POSITION__GLOBE_POSITION:
				return getGlobePosition();
			case PlaytrdPackage.OBJECT_POSITION__POSITIONED:
				if (resolve) return getPositioned();
				return basicGetPositioned();
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
			case PlaytrdPackage.OBJECT_POSITION__GLOBE_POSITION:
				setGlobePosition((LatLong)newValue);
				return;
			case PlaytrdPackage.OBJECT_POSITION__POSITIONED:
				setPositioned((Positioned)newValue);
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
			case PlaytrdPackage.OBJECT_POSITION__GLOBE_POSITION:
				setGlobePosition(GLOBE_POSITION_EDEFAULT);
				return;
			case PlaytrdPackage.OBJECT_POSITION__POSITIONED:
				setPositioned((Positioned)null);
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
			case PlaytrdPackage.OBJECT_POSITION__GLOBE_POSITION:
				return GLOBE_POSITION_EDEFAULT == null ? globePosition != null : !GLOBE_POSITION_EDEFAULT.equals(globePosition);
			case PlaytrdPackage.OBJECT_POSITION__POSITIONED:
				return positioned != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (globePosition: ");
		result.append(globePosition);
		result.append(')');
		return result.toString();
	}

} //ObjectPositionImpl
