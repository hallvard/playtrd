/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colocation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.ColocationService#getObjectColocations <em>Object Colocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getColocationService()
 * @model
 * @generated
 */
public interface ColocationService extends Service {
	/**
	 * Returns the value of the '<em><b>Object Colocations</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.ObjectColocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Colocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Colocations</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getColocationService_ObjectColocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectColocation> getObjectColocations();

} // ColocationService
