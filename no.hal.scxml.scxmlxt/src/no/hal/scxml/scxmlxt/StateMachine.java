/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.StateMachine#getImports <em>Imports</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.StateMachine#getCurrentStates <em>Current States</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends AbstractState {

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.scxml.scxmlxt.ResourceImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getStateMachine_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceImport> getImports();

	/**
	 * Returns the value of the '<em><b>Current States</b></em>' reference list.
	 * The list contents are of type {@link no.hal.scxml.scxmlxt.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current States</em>' reference list.
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getStateMachine_CurrentStates()
	 * @model
	 * @generated
	 */
	EList<State> getCurrentStates();
} // StateMachine
