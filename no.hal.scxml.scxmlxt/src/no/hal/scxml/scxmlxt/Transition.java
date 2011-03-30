/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends AbstractTransition {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getTransition_Target()
	 * @model
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

} // Transition
