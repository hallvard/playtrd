/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.Inventory;
import no.playtrd.v10.playtrd.Item;
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
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.InventoryImpl#getContainedItems <em>Contained Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InventoryImpl extends EObjectImpl implements Inventory {
	/**
	 * The cached value of the '{@link #getContainedItems() <em>Contained Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> containedItems;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getContainedItems() {
		if (containedItems == null) {
			containedItems = new EObjectContainmentEList<Item>(Item.class, this, PlaytrdPackage.INVENTORY__CONTAINED_ITEMS);
		}
		return containedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.INVENTORY__CONTAINED_ITEMS:
				return ((InternalEList<?>)getContainedItems()).basicRemove(otherEnd, msgs);
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
			case PlaytrdPackage.INVENTORY__CONTAINED_ITEMS:
				return getContainedItems();
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
			case PlaytrdPackage.INVENTORY__CONTAINED_ITEMS:
				getContainedItems().clear();
				getContainedItems().addAll((Collection<? extends Item>)newValue);
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
			case PlaytrdPackage.INVENTORY__CONTAINED_ITEMS:
				getContainedItems().clear();
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
			case PlaytrdPackage.INVENTORY__CONTAINED_ITEMS:
				return containedItems != null && !containedItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InventoryImpl
