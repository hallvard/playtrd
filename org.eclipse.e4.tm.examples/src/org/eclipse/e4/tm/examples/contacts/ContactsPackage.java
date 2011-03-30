/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactsPackage.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.tm.examples.contacts.ContactsFactory
 * @model kind="package"
 * @generated
 */
public interface ContactsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contacts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/e4/ui/demo/contacts.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contacts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContactsPackage eINSTANCE = org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactImpl
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__MIDDLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__COMPANY = 4;

	/**
	 * The feature id for the '<em><b>Job Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__JOB_TITLE = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Web Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__WEB_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Work Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__WORK_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PHONE = 9;

	/**
	 * The feature id for the '<em><b>Mobile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__MOBILE = 10;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NOTE = 11;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__IMAGE = 12;

	/**
	 * The feature id for the '<em><b>Home Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__HOME_ADDRESS = 13;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.tm.examples.contacts.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.tm.examples.contacts.impl.AddressImpl
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP_CODE = 4;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.tm.examples.contacts.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.tm.examples.contacts.impl.PhoneNumberImpl
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getPhoneNumber()
	 * @generated
	 */
	int PHONE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER__COUNTRY = 1;

	/**
	 * The number of structural features of the '<em>Phone Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.tm.examples.contacts.impl.AddressBookImpl <em>Address Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.tm.examples.contacts.impl.AddressBookImpl
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getAddressBook()
	 * @generated
	 */
	int ADDRESS_BOOK = 3;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK__CONTACTS = 0;

	/**
	 * The number of structural features of the '<em>Address Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.e4.tm.examples.contacts.impl.UoDImpl <em>Uo D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.e4.tm.examples.contacts.impl.UoDImpl
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getUoD()
	 * @generated
	 */
	int UO_D = 4;

	/**
	 * The feature id for the '<em><b>All Address Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D__ALL_ADDRESS_BOOKS = 0;

	/**
	 * The number of structural features of the '<em>Uo D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UO_D_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Country</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 5;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getURI()
	 * @generated
	 */
	int URI = 6;

	/**
	 * The meta object id for the '<em>Email Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getEmailAddress()
	 * @generated
	 */
	int EMAIL_ADDRESS = 7;

	/**
	 * The meta object id for the '<em>Name String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getNameString()
	 * @generated
	 */
	int NAME_STRING = 8;


	/**
	 * The meta object id for the '<em>Digits String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getDigitsString()
	 * @generated
	 */
	int DIGITS_STRING = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.tm.examples.contacts.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getFirstName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getMiddleName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getLastName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getTitle()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getCompany()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getJobTitle <em>Job Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Title</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getJobTitle()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_JobTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getWebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Page</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getWebPage()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_WebPage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.tm.examples.contacts.Contact#getWorkAddress <em>Work Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Work Address</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getWorkAddress()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_WorkAddress();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.tm.examples.contacts.Contact#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phone</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getPhone()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Phone();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.tm.examples.contacts.Contact#getMobile <em>Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mobile</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getMobile()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_Mobile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getNote()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Contact#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getImage()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Image();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.e4.tm.examples.contacts.Contact#getHomeAddress <em>Home Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Home Address</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Contact#getHomeAddress()
	 * @see #getContact()
	 * @generated
	 */
	EReference getContact_HomeAddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.tm.examples.contacts.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.Address#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.Address#getZipCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_ZipCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone Number</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.PhoneNumber
	 * @generated
	 */
	EClass getPhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.PhoneNumber#getNumber()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.e4.tm.examples.contacts.PhoneNumber#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.PhoneNumber#getCountry()
	 * @see #getPhoneNumber()
	 * @generated
	 */
	EAttribute getPhoneNumber_Country();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.tm.examples.contacts.AddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Book</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.AddressBook
	 * @generated
	 */
	EClass getAddressBook();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.tm.examples.contacts.AddressBook#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.AddressBook#getContacts()
	 * @see #getAddressBook()
	 * @generated
	 */
	EReference getAddressBook_Contacts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.e4.tm.examples.contacts.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uo D</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.UoD
	 * @generated
	 */
	EClass getUoD();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.e4.tm.examples.contacts.UoD#getAllAddressBooks <em>All Address Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Address Books</em>'.
	 * @see org.eclipse.e4.tm.examples.contacts.UoD#getAllAddressBooks()
	 * @see #getUoD()
	 * @generated
	 */
	EReference getUoD_AllAddressBooks();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCountry();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Email Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getEmailAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getNameString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Digits String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Digits String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDigitsString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContactsFactory getContactsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactImpl
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__FIRST_NAME = eINSTANCE.getContact_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__MIDDLE_NAME = eINSTANCE.getContact_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__LAST_NAME = eINSTANCE.getContact_LastName();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TITLE = eINSTANCE.getContact_Title();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__COMPANY = eINSTANCE.getContact_Company();

		/**
		 * The meta object literal for the '<em><b>Job Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__JOB_TITLE = eINSTANCE.getContact_JobTitle();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '<em><b>Web Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__WEB_PAGE = eINSTANCE.getContact_WebPage();

		/**
		 * The meta object literal for the '<em><b>Work Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__WORK_ADDRESS = eINSTANCE.getContact_WorkAddress();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__PHONE = eINSTANCE.getContact_Phone();

		/**
		 * The meta object literal for the '<em><b>Mobile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__MOBILE = eINSTANCE.getContact_Mobile();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NOTE = eINSTANCE.getContact_Note();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__IMAGE = eINSTANCE.getContact_Image();

		/**
		 * The meta object literal for the '<em><b>Home Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT__HOME_ADDRESS = eINSTANCE.getContact_HomeAddress();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.tm.examples.contacts.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.tm.examples.contacts.impl.AddressImpl
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ZIP_CODE = eINSTANCE.getAddress_ZipCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.tm.examples.contacts.impl.PhoneNumberImpl <em>Phone Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.tm.examples.contacts.impl.PhoneNumberImpl
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getPhoneNumber()
		 * @generated
		 */
		EClass PHONE_NUMBER = eINSTANCE.getPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__NUMBER = eINSTANCE.getPhoneNumber_Number();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE_NUMBER__COUNTRY = eINSTANCE.getPhoneNumber_Country();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.tm.examples.contacts.impl.AddressBookImpl <em>Address Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.tm.examples.contacts.impl.AddressBookImpl
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getAddressBook()
		 * @generated
		 */
		EClass ADDRESS_BOOK = eINSTANCE.getAddressBook();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_BOOK__CONTACTS = eINSTANCE.getAddressBook_Contacts();

		/**
		 * The meta object literal for the '{@link org.eclipse.e4.tm.examples.contacts.impl.UoDImpl <em>Uo D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.e4.tm.examples.contacts.impl.UoDImpl
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getUoD()
		 * @generated
		 */
		EClass UO_D = eINSTANCE.getUoD();

		/**
		 * The meta object literal for the '<em><b>All Address Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UO_D__ALL_ADDRESS_BOOKS = eINSTANCE.getUoD_AllAddressBooks();

		/**
		 * The meta object literal for the '<em>Country</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getCountry()
		 * @generated
		 */
		EDataType COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Email Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getEmailAddress()
		 * @generated
		 */
		EDataType EMAIL_ADDRESS = eINSTANCE.getEmailAddress();

		/**
		 * The meta object literal for the '<em>Name String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getNameString()
		 * @generated
		 */
		EDataType NAME_STRING = eINSTANCE.getNameString();

		/**
		 * The meta object literal for the '<em>Digits String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.e4.tm.examples.contacts.impl.ContactsPackageImpl#getDigitsString()
		 * @generated
		 */
		EDataType DIGITS_STRING = eINSTANCE.getDigitsString();

	}

} //ContactsPackage
