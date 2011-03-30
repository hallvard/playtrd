/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressBook.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.AddressBook#getContacts <em>Contacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getAddressBook()
 * @model
 * @generated
 */
public interface AddressBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.tm.examples.contacts.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getAddressBook_Contacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contact> getContacts();

} // AddressBook
