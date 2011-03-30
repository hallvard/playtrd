/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.impl;

import java.util.Collection;

import no.playtrd.v10.playtrd.Community;
import no.playtrd.v10.playtrd.Game;
import no.playtrd.v10.playtrd.Playtrd;
import no.playtrd.v10.playtrd.PlaytrdPackage;
import no.playtrd.v10.playtrd.Region;
import no.playtrd.v10.playtrd.Service;

import org.eclipse.e4.tm.widgets.AbstractComposite;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playtrd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl#getCommunities <em>Communities</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl#getServices <em>Services</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl#getGames <em>Games</em>}</li>
 *   <li>{@link no.playtrd.v10.playtrd.impl.PlaytrdImpl#getUis <em>Uis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaytrdImpl extends ScriptedImpl implements Playtrd {
	/**
	 * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> regions;

	/**
	 * The cached value of the '{@link #getCommunities() <em>Communities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunities()
	 * @generated
	 * @ordered
	 */
	protected EList<Community> communities;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getGames() <em>Games</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGames()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> games;

	/**
	 * The cached value of the '{@link #getUis() <em>Uis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUis()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComposite<?>> uis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaytrdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaytrdPackage.Literals.PLAYTRD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegions() {
		if (regions == null) {
			regions = new EObjectContainmentEList<Region>(Region.class, this, PlaytrdPackage.PLAYTRD__REGIONS);
		}
		return regions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Community> getCommunities() {
		if (communities == null) {
			communities = new EObjectContainmentEList<Community>(Community.class, this, PlaytrdPackage.PLAYTRD__COMMUNITIES);
		}
		return communities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, PlaytrdPackage.PLAYTRD__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getGames() {
		if (games == null) {
			games = new EObjectContainmentEList<Game>(Game.class, this, PlaytrdPackage.PLAYTRD__GAMES);
		}
		return games;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComposite<?>> getUis() {
		if (uis == null) {
			uis = new EObjectContainmentEList<AbstractComposite<?>>(AbstractComposite.class, this, PlaytrdPackage.PLAYTRD__UIS);
		}
		return uis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlaytrdPackage.PLAYTRD__REGIONS:
				return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
			case PlaytrdPackage.PLAYTRD__COMMUNITIES:
				return ((InternalEList<?>)getCommunities()).basicRemove(otherEnd, msgs);
			case PlaytrdPackage.PLAYTRD__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case PlaytrdPackage.PLAYTRD__GAMES:
				return ((InternalEList<?>)getGames()).basicRemove(otherEnd, msgs);
			case PlaytrdPackage.PLAYTRD__UIS:
				return ((InternalEList<?>)getUis()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaytrdPackage.PLAYTRD__REGIONS:
				return getRegions();
			case PlaytrdPackage.PLAYTRD__COMMUNITIES:
				return getCommunities();
			case PlaytrdPackage.PLAYTRD__SERVICES:
				return getServices();
			case PlaytrdPackage.PLAYTRD__GAMES:
				return getGames();
			case PlaytrdPackage.PLAYTRD__UIS:
				return getUis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlaytrdPackage.PLAYTRD__REGIONS:
				getRegions().clear();
				getRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case PlaytrdPackage.PLAYTRD__COMMUNITIES:
				getCommunities().clear();
				getCommunities().addAll((Collection<? extends Community>)newValue);
				return;
			case PlaytrdPackage.PLAYTRD__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case PlaytrdPackage.PLAYTRD__GAMES:
				getGames().clear();
				getGames().addAll((Collection<? extends Game>)newValue);
				return;
			case PlaytrdPackage.PLAYTRD__UIS:
				getUis().clear();
				getUis().addAll((Collection<? extends AbstractComposite<?>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlaytrdPackage.PLAYTRD__REGIONS:
				getRegions().clear();
				return;
			case PlaytrdPackage.PLAYTRD__COMMUNITIES:
				getCommunities().clear();
				return;
			case PlaytrdPackage.PLAYTRD__SERVICES:
				getServices().clear();
				return;
			case PlaytrdPackage.PLAYTRD__GAMES:
				getGames().clear();
				return;
			case PlaytrdPackage.PLAYTRD__UIS:
				getUis().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlaytrdPackage.PLAYTRD__REGIONS:
				return regions != null && !regions.isEmpty();
			case PlaytrdPackage.PLAYTRD__COMMUNITIES:
				return communities != null && !communities.isEmpty();
			case PlaytrdPackage.PLAYTRD__SERVICES:
				return services != null && !services.isEmpty();
			case PlaytrdPackage.PLAYTRD__GAMES:
				return games != null && !games.isEmpty();
			case PlaytrdPackage.PLAYTRD__UIS:
				return uis != null && !uis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlaytrdImpl
