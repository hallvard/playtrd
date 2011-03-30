/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Uri Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.EObjectUriLiteral#getUriFragment <em>Uri Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEObjectUriLiteral()
 * @model
 * @generated
 */
public interface EObjectUriLiteral extends ResourceUriLiteral {

	/**
	 * Returns the value of the '<em><b>Uri Fragment</b></em>' attribute.
	 * The default value is <code>"/"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Fragment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Fragment</em>' attribute.
	 * @see #setUriFragment(String)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEObjectUriLiteral_UriFragment()
	 * @model default="/"
	 * @generated
	 */
	String getUriFragment();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.EObjectUriLiteral#getUriFragment <em>Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Fragment</em>' attribute.
	 * @see #getUriFragment()
	 * @generated
	 */
	void setUriFragment(String value);
} // EObjectUriLiteral
