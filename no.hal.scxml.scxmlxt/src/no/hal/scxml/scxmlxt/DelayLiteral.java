/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.DelayLiteral#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getDelayLiteral()
 * @model
 * @generated
 */
public interface DelayLiteral extends IntLiteral {
	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.scxml.scxmlxt.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see no.hal.scxml.scxmlxt.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getDelayLiteral_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.DelayLiteral#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see no.hal.scxml.scxmlxt.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnit value);

} // DelayLiteral
