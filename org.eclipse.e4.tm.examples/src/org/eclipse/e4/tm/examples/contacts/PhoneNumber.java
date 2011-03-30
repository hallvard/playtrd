/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhoneNumber.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getPhoneNumber()
 * @model
 * @generated
 */
public interface PhoneNumber extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getPhoneNumber_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getPhoneNumber_Country()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.Country"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // PhoneNumber
