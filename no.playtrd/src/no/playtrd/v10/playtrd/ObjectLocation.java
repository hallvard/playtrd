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
 * A representation of the model object '<em><b>Object Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectLocation#getPositioned <em>Positioned</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectLocation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectLocation()
 * @model
 * @generated
 */
public interface ObjectLocation extends EObject {
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
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectLocation_Positioned()
	 * @model
	 * @generated
	 */
	Positioned getPositioned();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.ObjectLocation#getPositioned <em>Positioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioned</em>' reference.
	 * @see #getPositioned()
	 * @generated
	 */
	void setPositioned(Positioned value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Positioned)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectLocation_Target()
	 * @model
	 * @generated
	 */
	Positioned getTarget();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.ObjectLocation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Positioned value);

} // ObjectLocation
