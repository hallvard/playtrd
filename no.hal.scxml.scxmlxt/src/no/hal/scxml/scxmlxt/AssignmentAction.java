/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.AssignmentAction#getVar <em>Var</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.AssignmentAction#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAssignmentAction()
 * @model
 * @generated
 */
public interface AssignmentAction extends Action {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' reference.
	 * @see #setVar(VarDef)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAssignmentAction_Var()
	 * @model
	 * @generated
	 */
	VarDef getVar();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.AssignmentAction#getVar <em>Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarDef value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getAssignmentAction_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.AssignmentAction#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Assignment
