/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.Scripted#getScriptSource <em>Script Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getScripted()
 * @model abstract="true"
 * @generated
 */
public interface Scripted extends EObject {
	/**
	 * Returns the value of the '<em><b>Script Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Source</em>' attribute.
	 * @see #setScriptSource(String)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getScripted_ScriptSource()
	 * @model annotation="http://www.eclipse.org/e4/emf/ecore/javascript/scriptSourceFeature js='eval, listen'"
	 * @generated
	 */
	String getScriptSource();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.Scripted#getScriptSource <em>Script Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Source</em>' attribute.
	 * @see #getScriptSource()
	 * @generated
	 */
	void setScriptSource(String value);

} // Scripted
