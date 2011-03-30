/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt.impl;

import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.UriLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uri Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.impl.UriLiteralImpl#getUriValue <em>Uri Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UriLiteralImpl extends AbstractUriLiteralImpl implements UriLiteral {
	/**
	 * The default value of the '{@link #getUriValue() <em>Uri Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriValue()
	 * @generated
	 * @ordered
	 */
	protected static final URI URI_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriValue() <em>Uri Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriValue()
	 * @generated
	 * @ordered
	 */
	protected URI uriValue = URI_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UriLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScxmlxtPackage.Literals.URI_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getUriValue() {
		return uriValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriValue(URI newUriValue) {
		URI oldUriValue = uriValue;
		uriValue = newUriValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScxmlxtPackage.URI_LITERAL__URI_VALUE, oldUriValue, uriValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScxmlxtPackage.URI_LITERAL__URI_VALUE:
				return getUriValue();
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
			case ScxmlxtPackage.URI_LITERAL__URI_VALUE:
				setUriValue((URI)newValue);
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
			case ScxmlxtPackage.URI_LITERAL__URI_VALUE:
				setUriValue(URI_VALUE_EDEFAULT);
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
			case ScxmlxtPackage.URI_LITERAL__URI_VALUE:
				return URI_VALUE_EDEFAULT == null ? uriValue != null : !URI_VALUE_EDEFAULT.equals(uriValue);
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
		result.append(" (uriValue: ");
		result.append(uriValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public URI getUri() {
		return getUriValue();
	}

	@Override
	public void setUri(URI uri) {
		setUriValue(uri);
	}
	
} //UriLiteralImpl
