/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.jscience.geography.coordinates.LatLong;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectPosition#getGlobePosition <em>Globe Position</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.ObjectPosition#getPositioned <em>Positioned</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectPosition()
 * @model
 * @generated
 */
public interface ObjectPosition extends Scripted {
	/**
	 * Returns the value of the '<em><b>Globe Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Globe Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globe Position</em>' attribute.
	 * @see #setGlobePosition(LatLong)
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectPosition_GlobePosition()
	 * @model dataType="no.playtrd.v10.playtrd.GlobePosition"
	 *        annotation="http://playtrd.no/v10/playtrd.ecore positionFeature='GlobePosition'"
	 * @generated
	 */
	LatLong getGlobePosition();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.ObjectPosition#getGlobePosition <em>Globe Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globe Position</em>' attribute.
	 * @see #getGlobePosition()
	 * @generated
	 */
	void setGlobePosition(LatLong value);

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
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getObjectPosition_Positioned()
	 * @model
	 * @generated
	 */
	Positioned getPositioned();

	/**
	 * Sets the value of the '{@link no.playtrd.v10.playtrd.ObjectPosition#getPositioned <em>Positioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioned</em>' reference.
	 * @see #getPositioned()
	 * @generated
	 */
	void setPositioned(Positioned value);

} // ObjectPosition
