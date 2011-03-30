/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Colocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectColocation#getPositioned <em>Positioned</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectColocation#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectColocation()
 * @model
 * @generated
 */
public interface ObjectColocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Positioned</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positioned</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioned</em>' reference.
	 * @see #setPositioned(Positioned)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectColocation_Positioned()
	 * @model
	 * @generated
	 */
	Positioned getPositioned();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.ObjectColocation#getPositioned <em>Positioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioned</em>' reference.
	 * @see #getPositioned()
	 * @generated
	 */
	void setPositioned(Positioned value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Positioned}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectColocation_Targets()
	 * @model
	 * @generated
	 */
	EList<Positioned> getTargets();

} // ObjectColocation
