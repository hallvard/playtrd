/**
 * <copyright>
 * </copyright>
 *
 * $Id: UoDImpl.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts.impl;

import java.util.Collection;

import org.eclipse.e4.tm.examples.contacts.AddressBook;
import org.eclipse.e4.tm.examples.contacts.ContactsPackage;
import org.eclipse.e4.tm.examples.contacts.UoD;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.UoDImpl#getAllAddressBooks <em>All Address Books</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UoDImpl extends EObjectImpl implements UoD {
	/**
	 * The cached value of the '{@link #getAllAddressBooks() <em>All Address Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAddressBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressBook> allAddressBooks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactsPackage.Literals.UO_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressBook> getAllAddressBooks() {
		if (allAddressBooks == null) {
			allAddressBooks = new EObjectContainmentEList<AddressBook>(AddressBook.class, this, ContactsPackage.UO_D__ALL_ADDRESS_BOOKS);
		}
		return allAddressBooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContactsPackage.UO_D__ALL_ADDRESS_BOOKS:
				return ((InternalEList<?>)getAllAddressBooks()).basicRemove(otherEnd, msgs);
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
			case ContactsPackage.UO_D__ALL_ADDRESS_BOOKS:
				return getAllAddressBooks();
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
			case ContactsPackage.UO_D__ALL_ADDRESS_BOOKS:
				getAllAddressBooks().clear();
				getAllAddressBooks().addAll((Collection<? extends AddressBook>)newValue);
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
			case ContactsPackage.UO_D__ALL_ADDRESS_BOOKS:
				getAllAddressBooks().clear();
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
			case ContactsPackage.UO_D__ALL_ADDRESS_BOOKS:
				return allAddressBooks != null && !allAddressBooks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UoDImpl
