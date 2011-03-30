/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.ObjectColocation;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.Positioned;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Colocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ObjectColocationImpl#getPositioned <em>Positioned</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.ObjectColocationImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectColocationImpl extends EObjectImpl implements ObjectColocation {
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
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Positioned> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectColocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.OBJECT_COLOCATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaytrdPackage.OBJECT_COLOCATION__POSITIONED, oldPositioned, positioned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlaytrdPackage.OBJECT_COLOCATION__POSITIONED, oldPositioned, positioned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Positioned> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Positioned>(Positioned.class, this, PlaytrdPackage.OBJECT_COLOCATION__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.OBJECT_COLOCATION__POSITIONED:
				if (resolve) return getPositioned();
				return basicGetPositioned();
			case PlaytrdPackage.OBJECT_COLOCATION__TARGETS:
				return getTargets();
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
			case PlaytrdPackage.OBJECT_COLOCATION__POSITIONED:
				setPositioned((Positioned)newValue);
				return;
			case PlaytrdPackage.OBJECT_COLOCATION__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Positioned>)newValue);
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
			case PlaytrdPackage.OBJECT_COLOCATION__POSITIONED:
				setPositioned((Positioned)null);
				return;
			case PlaytrdPackage.OBJECT_COLOCATION__TARGETS:
				getTargets().clear();
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
			case PlaytrdPackage.OBJECT_COLOCATION__POSITIONED:
				return positioned != null;
			case PlaytrdPackage.OBJECT_COLOCATION__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectColocationImpl
