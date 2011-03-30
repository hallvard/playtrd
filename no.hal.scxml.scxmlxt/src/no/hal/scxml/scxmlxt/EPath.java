/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.scxml.scxmlxt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPath</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.EPath#getVar <em>Var</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.EPath#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEPath()
 * @model
 * @generated
 */
public interface EPath extends Expression {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(VarRef)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEPath_Var()
	 * @model containment="true"
	 * @generated
	 */
	VarRef getVar();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.EPath#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarRef value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.scxml.scxmlxt.EStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEPath_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<EStep> getSteps();

} // EPath
