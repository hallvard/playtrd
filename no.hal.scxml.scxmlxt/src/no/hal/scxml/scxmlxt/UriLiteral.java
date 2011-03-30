/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.common.util.URI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uri Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.UriLiteral#getUriValue <em>Uri Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getUriLiteral()
 * @model
 * @generated
 */
public interface UriLiteral extends AbstractUriLiteral {
	/**
	 * Returns the value of the '<em><b>Uri Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Value</em>' attribute.
	 * @see #setUriValue(URI)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getUriLiteral_UriValue()
	 * @model dataType="no.hal.scxml.scxmlxt.EURI"
	 * @generated
	 */
	URI getUriValue();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.UriLiteral#getUriValue <em>Uri Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Value</em>' attribute.
	 * @see #getUriValue()
	 * @generated
	 */
	void setUriValue(URI value);

} // UriLiteral
