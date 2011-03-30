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
 * A representation of the model object '<em><b>Location Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.LocationService#getObjectLocations <em>Object Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getLocationService()
 * @model
 * @generated
 */
public interface LocationService extends Service {
	/**
	 * Returns the value of the '<em><b>Object Locations</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.ObjectLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Locations</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getLocationService_ObjectLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectLocation> getObjectLocations();

} // LocationService
