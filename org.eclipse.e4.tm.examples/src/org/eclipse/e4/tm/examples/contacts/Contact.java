/**
 * <copyright>
 * </copyright>
 *
 * $Id: Contact.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getCompany <em>Company</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getJobTitle <em>Job Title</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getWorkAddress <em>Work Address</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.Contact#getHomeAddress <em>Home Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact()
 * @model
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_FirstName()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.NameString"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute.
	 * @see #setMiddleName(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_MiddleName()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.NameString"
	 * @generated
	 */
	String getMiddleName();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getMiddleName <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name</em>' attribute.
	 * @see #getMiddleName()
	 * @generated
	 */
	void setMiddleName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_LastName()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.NameString"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Company()
	 * @model
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Job Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Title</em>' attribute.
	 * @see #setJobTitle(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_JobTitle()
	 * @model
	 * @generated
	 */
	String getJobTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getJobTitle <em>Job Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Title</em>' attribute.
	 * @see #getJobTitle()
	 * @generated
	 */
	void setJobTitle(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Email()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.EmailAddress"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Page</em>' attribute.
	 * @see #setWebPage(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_WebPage()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.URI"
	 * @generated
	 */
	String getWebPage();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getWebPage <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Page</em>' attribute.
	 * @see #getWebPage()
	 * @generated
	 */
	void setWebPage(String value);

	/**
	 * Returns the value of the '<em><b>Work Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Address</em>' containment reference.
	 * @see #setWorkAddress(Address)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_WorkAddress()
	 * @model containment="true"
	 * @generated
	 */
	Address getWorkAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getWorkAddress <em>Work Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Address</em>' containment reference.
	 * @see #getWorkAddress()
	 * @generated
	 */
	void setWorkAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(PhoneNumber)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Phone()
	 * @model containment="true"
	 * @generated
	 */
	PhoneNumber getPhone();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(PhoneNumber value);

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' containment reference.
	 * @see #setMobile(PhoneNumber)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Mobile()
	 * @model containment="true"
	 * @generated
	 */
	PhoneNumber getMobile();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getMobile <em>Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' containment reference.
	 * @see #getMobile()
	 * @generated
	 */
	void setMobile(PhoneNumber value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_Image()
	 * @model dataType="org.eclipse.e4.tm.examples.contacts.URI"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Home Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Address</em>' containment reference.
	 * @see #setHomeAddress(Address)
	 * @see org.eclipse.e4.tm.examples.contacts.ContactsPackage#getContact_HomeAddress()
	 * @model containment="true"
	 * @generated
	 */
	Address getHomeAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.examples.contacts.Contact#getHomeAddress <em>Home Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Address</em>' containment reference.
	 * @see #getHomeAddress()
	 * @generated
	 */
	void setHomeAddress(Address value);

} // Contact
