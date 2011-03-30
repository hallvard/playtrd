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
 * A representation of the model object '<em><b>Position Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.PositionService#getObjectPositions <em>Object Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPositionService()
 * @model
 * @generated
 */
public interface PositionService extends Service {
	/**
	 * Returns the value of the '<em><b>Object Positions</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.ObjectPosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Positions</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPositionService_ObjectPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectPosition> getObjectPositions();

} // PositionService
