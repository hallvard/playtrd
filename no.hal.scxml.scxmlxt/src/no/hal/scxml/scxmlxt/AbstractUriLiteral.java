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
 * A representation of the model object '<em><b>Abstract Uri Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.AbstractUriLiteral#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAbstractUriLiteral()
 * @model
 * @generated
 */
public interface AbstractUriLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(URI)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAbstractUriLiteral_Uri()
	 * @model dataType="no.hal.scxml.scxmlxt.EURI" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	URI getUri();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.AbstractUriLiteral#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(URI value);

} // AbstractUriLiteral
