/**
 * <copyright>
 * </copyright>
 *
 * $Id: UoD.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.UoD#getAllAddressBooks <em>All Address Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getUoD()
 * @model
 * @generated
 */
public interface UoD extends EObject {
	/**
	 * Returns the value of the '<em><b>All Address Books</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.tm.examples.contacts.AddressBook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Address Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Address Books</em>' containment reference list.
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getUoD_AllAddressBooks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddressBook> getAllAddressBooks();

} // UoD
