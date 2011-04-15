/**
 * <copyright>
 * </copyright>
 *
 * $Id: Scripted.java,v 1.1 2009/10/23 12:40:32 htraetteb Exp $
 */
package org.eclipse.e4.tm.util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.util.Scripted#getScriptSource <em>Script Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.util.UtilPackage#getScripted()
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
	 * @see org.eclipse.e4.tm.util.UtilPackage#getScripted_ScriptSource()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/Javascript/sourceFeature Javascript='eval, listen'"
	 *        annotation="http://www.eclipse.org/e4/swt.ecore access='binder'"
	 * @generated
	 */
	String getScriptSource();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.util.Scripted#getScriptSource <em>Script Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Source</em>' attribute.
	 * @see #getScriptSource()
	 * @generated
	 */
	void setScriptSource(String value);

} // Scripted
