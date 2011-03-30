/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.util;

import java.util.List;

import java.util.Map;
import no.playtrd.v10.playtrd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.playtrd.v10.playtrd.PlaytrdPackage
 * @generated
 */
public class PlaytrdSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlaytrdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdSwitch() {
		if (modelPackage == null) {
			modelPackage = PlaytrdPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlaytrdPackage.OBJECT_POSITION: {
				ObjectPosition objectPosition = (ObjectPosition)theEObject;
				T1 result = caseObjectPosition(objectPosition);
				if (result == null) result = caseScripted(objectPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.PLAYER: {
				Player player = (Player)theEObject;
				T1 result = casePlayer(player);
				if (result == null) result = casePositioned(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.PLAYTRD: {
				Playtrd playtrd = (Playtrd)theEObject;
				T1 result = casePlaytrd(playtrd);
				if (result == null) result = caseScripted(playtrd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.POI: {
				POI poi = (POI)theEObject;
				T1 result = casePOI(poi);
				if (result == null) result = casePositioned(poi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.REGION: {
				Region region = (Region)theEObject;
				T1 result = caseRegion(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.GAME: {
				Game<?> game = (Game<?>)theEObject;
				T1 result = caseGame(game);
				if (result == null) result = caseScripted(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.PLAYER_STATE: {
				PlayerState playerState = (PlayerState)theEObject;
				T1 result = casePlayerState(playerState);
				if (result == null) result = caseScripted(playerState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.COMMUNITY: {
				Community community = (Community)theEObject;
				T1 result = caseCommunity(community);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.POSITION_SERVICE: {
				PositionService positionService = (PositionService)theEObject;
				T1 result = casePositionService(positionService);
				if (result == null) result = caseService(positionService);
				if (result == null) result = caseScripted(positionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.POSITIONED: {
				Positioned positioned = (Positioned)theEObject;
				T1 result = casePositioned(positioned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.MESSAGE_SERVICE: {
				MessageService messageService = (MessageService)theEObject;
				T1 result = caseMessageService(messageService);
				if (result == null) result = caseService(messageService);
				if (result == null) result = caseScripted(messageService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.PLAYER_MESSAGE: {
				PlayerMessage playerMessage = (PlayerMessage)theEObject;
				T1 result = casePlayerMessage(playerMessage);
				if (result == null) result = caseScripted(playerMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.SERVICE: {
				Service service = (Service)theEObject;
				T1 result = caseService(service);
				if (result == null) result = caseScripted(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.SCRIPTED: {
				Scripted scripted = (Scripted)theEObject;
				T1 result = caseScripted(scripted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.LOCATION_SERVICE: {
				LocationService locationService = (LocationService)theEObject;
				T1 result = caseLocationService(locationService);
				if (result == null) result = caseService(locationService);
				if (result == null) result = caseScripted(locationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.OBJECT_LOCATION: {
				ObjectLocation objectLocation = (ObjectLocation)theEObject;
				T1 result = caseObjectLocation(objectLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.ITEM: {
				Item item = (Item)theEObject;
				T1 result = caseItem(item);
				if (result == null) result = casePositioned(item);
				if (result == null) result = caseMoneyValued(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.WALLET: {
				Wallet wallet = (Wallet)theEObject;
				T1 result = caseWallet(wallet);
				if (result == null) result = caseItem(wallet);
				if (result == null) result = casePositioned(wallet);
				if (result == null) result = caseMoneyValued(wallet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.STORE: {
				Store store = (Store)theEObject;
				T1 result = caseStore(store);
				if (result == null) result = caseOwner(store);
				if (result == null) result = caseInventory(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.OWNER: {
				Owner owner = (Owner)theEObject;
				T1 result = caseOwner(owner);
				if (result == null) result = caseInventory(owner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.TRADE: {
				Trade trade = (Trade)theEObject;
				T1 result = caseTrade(trade);
				if (result == null) result = caseMoneyValued(trade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.MONEY_VALUED: {
				MoneyValued moneyValued = (MoneyValued)theEObject;
				T1 result = caseMoneyValued(moneyValued);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.INVENTORY: {
				Inventory inventory = (Inventory)theEObject;
				T1 result = caseInventory(inventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.PROPERTIES: {
				Properties properties = (Properties)theEObject;
				T1 result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.TAG_SERVICE: {
				TagService tagService = (TagService)theEObject;
				T1 result = caseTagService(tagService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.TAG_DATA: {
				TagData tagData = (TagData)theEObject;
				T1 result = caseTagData(tagData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.TAG_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> tagEntry = (Map.Entry<String, String>)theEObject;
				T1 result = caseTagEntry(tagEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.COLOCATION_SERVICE: {
				ColocationService colocationService = (ColocationService)theEObject;
				T1 result = caseColocationService(colocationService);
				if (result == null) result = caseService(colocationService);
				if (result == null) result = caseScripted(colocationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlaytrdPackage.OBJECT_COLOCATION: {
				ObjectColocation objectColocation = (ObjectColocation)theEObject;
				T1 result = caseObjectColocation(objectColocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectPosition(ObjectPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playtrd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playtrd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlaytrd(Playtrd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePOI(POI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends PlayerState> T1 caseGame(Game<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerState(PlayerState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Community</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Community</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommunity(Community object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePositionService(PositionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePositioned(Positioned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMessageService(MessageService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerMessage(PlayerMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScripted(Scripted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocationService(LocationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectLocation(ObjectLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wallet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWallet(Wallet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOwner(Owner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTrade(Trade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money Valued</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money Valued</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMoneyValued(MoneyValued object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInventory(Inventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperties(Properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTagService(TagService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTagData(TagData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTagEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colocation Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colocation Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColocationService(ColocationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Colocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Colocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectColocation(ObjectColocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T1 defaultCase(EObject object) {
		return null;
	}

} //PlaytrdSwitch
