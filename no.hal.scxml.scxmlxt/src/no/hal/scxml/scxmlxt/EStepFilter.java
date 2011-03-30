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
 * A representation of the model object '<em><b>EStep Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.scxml.scxmlxt.EStepFilter#getFreeVarName <em>Free Var Name</em>}</li>
 *   <li>{@link no.hal.scxml.scxmlxt.EStepFilter#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEStepFilter()
 * @model
 * @generated
 */
public interface EStepFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Free Var Name</b></em>' attribute.
	 * The default value is <code>"\"$\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Var Name</em>' attribute.
	 * @see #setFreeVarName(String)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEStepFilter_FreeVarName()
	 * @model default="\"$\""
	 * @generated
	 */
	String getFreeVarName();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.EStepFilter#getFreeVarName <em>Free Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Var Name</em>' attribute.
	 * @see #getFreeVarName()
	 * @generated
	 */
	void setFreeVarName(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(ScriptExpression)
	 * @see no.hal.scxml.scxmlxt.ScxmlxtPackage#getEStepFilter_Script()
	 * @model containment="true"
	 * @generated
	 */
	ScriptExpression getScript();

	/**
	 * Sets the value of the '{@link no.hal.scxml.scxmlxt.EStepFilter#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(ScriptExpression value);

} // EStepFilter
