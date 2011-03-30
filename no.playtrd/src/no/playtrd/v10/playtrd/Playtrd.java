/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd;

import org.eclipse.e4.tm.widgets.AbstractComposite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playtrd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.Playtrd#getRegions <em>Regions</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Playtrd#getCommunities <em>Communities</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Playtrd#getServices <em>Services</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Playtrd#getGames <em>Games</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.Playtrd#getUis <em>Uis</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd()
 * @model
 * @generated
 */
public interface Playtrd extends Scripted {
	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

	/**
	 * Returns the value of the '<em><b>Communities</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Community}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communities</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd_Communities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Community> getCommunities();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link no.playtrd.v10.playtrd.Game}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd_Games()
	 * @model containment="true"
	 * @generated
	 */
	EList<Game> getGames();

	/**
	 * Returns the value of the '<em><b>Uis</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.e4.tm.widgets.AbstractComposite}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uis</em>' containment reference list.
	 * @see no.playtrd.v10.playtrd.PlaytrdPackage#getPlaytrd_Uis()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractComposite<?>> getUis();

} // Playtrd
