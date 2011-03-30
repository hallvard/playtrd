/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Transition Event</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAbstractTransitionEvent()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTransitionEvent extends Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	State getSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	State getTarget();

} // AbstractTransitionEvent
