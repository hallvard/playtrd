/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContactImpl.java,v 1.1 2009/05/27 11:45:48 htraetteb Exp $
 */
package org.eclipse.e4.tm.examples.contacts.impl;

import org.eclipse.e4.tm.examples.contacts.Address;
import org.eclipse.e4.tm.examples.contacts.Contact;
import org.eclipse.e4.tm.examples.contacts.ContactsPackage;

import org.eclipse.e4.tm.examples.contacts.PhoneNumber;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getJobTitle <em>Job Title</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getWebPage <em>Web Page</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getWorkAddress <em>Work Address</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.examples.contacts.impl.ContactImpl#getHomeAddress <em>Home Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactImpl extends EObjectImpl implements Contact {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobTitle() <em>Job Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobTitle() <em>Job Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobTitle()
	 * @generated
	 * @ordered
	 */
	protected String jobTitle = JOB_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPage() <em>Web Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPage()
	 * @generated
	 * @ordered
	 */
	protected String webPage = WEB_PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkAddress() <em>Work Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkAddress()
	 * @generated
	 * @ordered
	 */
	protected Address workAddress;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected PhoneNumber phone;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected PhoneNumber mobile;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHomeAddress() <em>Home Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeAddress()
	 * @generated
	 * @ordered
	 */
	protected Address homeAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactsPackage.Literals.CONTACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiddleName(String newMiddleName) {
		String oldMiddleName = middleName;
		middleName = newMiddleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__MIDDLE_NAME, oldMiddleName, middleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobTitle(String newJobTitle) {
		String oldJobTitle = jobTitle;
		jobTitle = newJobTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__JOB_TITLE, oldJobTitle, jobTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebPage() {
		return webPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebPage(String newWebPage) {
		String oldWebPage = webPage;
		webPage = newWebPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__WEB_PAGE, oldWebPage, webPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getWorkAddress() {
		return workAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkAddress(Address newWorkAddress, NotificationChain msgs) {
		Address oldWorkAddress = workAddress;
		workAddress = newWorkAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__WORK_ADDRESS, oldWorkAddress, newWorkAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkAddress(Address newWorkAddress) {
		if (newWorkAddress != workAddress) {
			NotificationChain msgs = null;
			if (workAddress != null)
				msgs = ((InternalEObject)workAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__WORK_ADDRESS, null, msgs);
			if (newWorkAddress != null)
				msgs = ((InternalEObject)newWorkAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__WORK_ADDRESS, null, msgs);
			msgs = basicSetWorkAddress(newWorkAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__WORK_ADDRESS, newWorkAddress, newWorkAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneNumber getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(PhoneNumber newPhone, NotificationChain msgs) {
		PhoneNumber oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__PHONE, oldPhone, newPhone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(PhoneNumber newPhone) {
		if (newPhone != phone) {
			NotificationChain msgs = null;
			if (phone != null)
				msgs = ((InternalEObject)phone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__PHONE, null, msgs);
			if (newPhone != null)
				msgs = ((InternalEObject)newPhone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__PHONE, null, msgs);
			msgs = basicSetPhone(newPhone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__PHONE, newPhone, newPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhoneNumber getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMobile(PhoneNumber newMobile, NotificationChain msgs) {
		PhoneNumber oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__MOBILE, oldMobile, newMobile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(PhoneNumber newMobile) {
		if (newMobile != mobile) {
			NotificationChain msgs = null;
			if (mobile != null)
				msgs = ((InternalEObject)mobile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__MOBILE, null, msgs);
			if (newMobile != null)
				msgs = ((InternalEObject)newMobile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__MOBILE, null, msgs);
			msgs = basicSetMobile(newMobile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__MOBILE, newMobile, newMobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeAddress(Address newHomeAddress, NotificationChain msgs) {
		Address oldHomeAddress = homeAddress;
		homeAddress = newHomeAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__HOME_ADDRESS, oldHomeAddress, newHomeAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeAddress(Address newHomeAddress) {
		if (newHomeAddress != homeAddress) {
			NotificationChain msgs = null;
			if (homeAddress != null)
				msgs = ((InternalEObject)homeAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__HOME_ADDRESS, null, msgs);
			if (newHomeAddress != null)
				msgs = ((InternalEObject)newHomeAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContactsPackage.CONTACT__HOME_ADDRESS, null, msgs);
			msgs = basicSetHomeAddress(newHomeAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactsPackage.CONTACT__HOME_ADDRESS, newHomeAddress, newHomeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContactsPackage.CONTACT__WORK_ADDRESS:
				return basicSetWorkAddress(null, msgs);
			case ContactsPackage.CONTACT__PHONE:
				return basicSetPhone(null, msgs);
			case ContactsPackage.CONTACT__MOBILE:
				return basicSetMobile(null, msgs);
			case ContactsPackage.CONTACT__HOME_ADDRESS:
				return basicSetHomeAddress(null, msgs);
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
			case ContactsPackage.CONTACT__FIRST_NAME:
				return getFirstName();
			case ContactsPackage.CONTACT__MIDDLE_NAME:
				return getMiddleName();
			case ContactsPackage.CONTACT__LAST_NAME:
				return getLastName();
			case ContactsPackage.CONTACT__TITLE:
				return getTitle();
			case ContactsPackage.CONTACT__COMPANY:
				return getCompany();
			case ContactsPackage.CONTACT__JOB_TITLE:
				return getJobTitle();
			case ContactsPackage.CONTACT__EMAIL:
				return getEmail();
			case ContactsPackage.CONTACT__WEB_PAGE:
				return getWebPage();
			case ContactsPackage.CONTACT__WORK_ADDRESS:
				return getWorkAddress();
			case ContactsPackage.CONTACT__PHONE:
				return getPhone();
			case ContactsPackage.CONTACT__MOBILE:
				return getMobile();
			case ContactsPackage.CONTACT__NOTE:
				return getNote();
			case ContactsPackage.CONTACT__IMAGE:
				return getImage();
			case ContactsPackage.CONTACT__HOME_ADDRESS:
				return getHomeAddress();
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
			case ContactsPackage.CONTACT__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ContactsPackage.CONTACT__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case ContactsPackage.CONTACT__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ContactsPackage.CONTACT__TITLE:
				setTitle((String)newValue);
				return;
			case ContactsPackage.CONTACT__COMPANY:
				setCompany((String)newValue);
				return;
			case ContactsPackage.CONTACT__JOB_TITLE:
				setJobTitle((String)newValue);
				return;
			case ContactsPackage.CONTACT__EMAIL:
				setEmail((String)newValue);
				return;
			case ContactsPackage.CONTACT__WEB_PAGE:
				setWebPage((String)newValue);
				return;
			case ContactsPackage.CONTACT__WORK_ADDRESS:
				setWorkAddress((Address)newValue);
				return;
			case ContactsPackage.CONTACT__PHONE:
				setPhone((PhoneNumber)newValue);
				return;
			case ContactsPackage.CONTACT__MOBILE:
				setMobile((PhoneNumber)newValue);
				return;
			case ContactsPackage.CONTACT__NOTE:
				setNote((String)newValue);
				return;
			case ContactsPackage.CONTACT__IMAGE:
				setImage((String)newValue);
				return;
			case ContactsPackage.CONTACT__HOME_ADDRESS:
				setHomeAddress((Address)newValue);
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
			case ContactsPackage.CONTACT__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__JOB_TITLE:
				setJobTitle(JOB_TITLE_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__WEB_PAGE:
				setWebPage(WEB_PAGE_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__WORK_ADDRESS:
				setWorkAddress((Address)null);
				return;
			case ContactsPackage.CONTACT__PHONE:
				setPhone((PhoneNumber)null);
				return;
			case ContactsPackage.CONTACT__MOBILE:
				setMobile((PhoneNumber)null);
				return;
			case ContactsPackage.CONTACT__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case ContactsPackage.CONTACT__HOME_ADDRESS:
				setHomeAddress((Address)null);
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
			case ContactsPackage.CONTACT__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ContactsPackage.CONTACT__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case ContactsPackage.CONTACT__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ContactsPackage.CONTACT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContactsPackage.CONTACT__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case ContactsPackage.CONTACT__JOB_TITLE:
				return JOB_TITLE_EDEFAULT == null ? jobTitle != null : !JOB_TITLE_EDEFAULT.equals(jobTitle);
			case ContactsPackage.CONTACT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ContactsPackage.CONTACT__WEB_PAGE:
				return WEB_PAGE_EDEFAULT == null ? webPage != null : !WEB_PAGE_EDEFAULT.equals(webPage);
			case ContactsPackage.CONTACT__WORK_ADDRESS:
				return workAddress != null;
			case ContactsPackage.CONTACT__PHONE:
				return phone != null;
			case ContactsPackage.CONTACT__MOBILE:
				return mobile != null;
			case ContactsPackage.CONTACT__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case ContactsPackage.CONTACT__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case ContactsPackage.CONTACT__HOME_ADDRESS:
				return homeAddress != null;
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", middleName: ");
		result.append(middleName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", title: ");
		result.append(title);
		result.append(", company: ");
		result.append(company);
		result.append(", jobTitle: ");
		result.append(jobTitle);
		result.append(", email: ");
		result.append(email);
		result.append(", webPage: ");
		result.append(webPage);
		result.append(", note: ");
		result.append(note);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //ContactImpl
