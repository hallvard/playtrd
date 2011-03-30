/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.playtrd.v10.playtrd.util;

import java.util.List;
import java.util.Map;

import javax.measure.Measurable;

import no.playtrd.properties.GameCurrency;
import no.playtrd.v10.playtrd.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.jscience.economics.money.Money;

import org.jscience.geography.coordinates.LatLong;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.playtrd.v10.playtrd.PlaytrdPackage
 * @generated
 */
public class PlaytrdValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PlaytrdValidator INSTANCE = new PlaytrdValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.playtrd.v10.playtrd";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaytrdValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PlaytrdPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PlaytrdPackage.OBJECT_POSITION:
				return validateObjectPosition((ObjectPosition)value, diagnostics, context);
			case PlaytrdPackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case PlaytrdPackage.PLAYTRD:
				return validatePlaytrd((Playtrd)value, diagnostics, context);
			case PlaytrdPackage.POI:
				return validatePOI((POI)value, diagnostics, context);
			case PlaytrdPackage.REGION:
				return validateRegion((Region)value, diagnostics, context);
			case PlaytrdPackage.GAME:
				return validateGame((Game<?>)value, diagnostics, context);
			case PlaytrdPackage.PLAYER_STATE:
				return validatePlayerState((PlayerState)value, diagnostics, context);
			case PlaytrdPackage.COMMUNITY:
				return validateCommunity((Community)value, diagnostics, context);
			case PlaytrdPackage.POSITION_SERVICE:
				return validatePositionService((PositionService)value, diagnostics, context);
			case PlaytrdPackage.POSITIONED:
				return validatePositioned((Positioned)value, diagnostics, context);
			case PlaytrdPackage.MESSAGE_SERVICE:
				return validateMessageService((MessageService)value, diagnostics, context);
			case PlaytrdPackage.PLAYER_MESSAGE:
				return validatePlayerMessage((PlayerMessage)value, diagnostics, context);
			case PlaytrdPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case PlaytrdPackage.SCRIPTED:
				return validateScripted((Scripted)value, diagnostics, context);
			case PlaytrdPackage.LOCATION_SERVICE:
				return validateLocationService((LocationService)value, diagnostics, context);
			case PlaytrdPackage.OBJECT_LOCATION:
				return validateObjectLocation((ObjectLocation)value, diagnostics, context);
			case PlaytrdPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case PlaytrdPackage.WALLET:
				return validateWallet((Wallet)value, diagnostics, context);
			case PlaytrdPackage.STORE:
				return validateStore((Store)value, diagnostics, context);
			case PlaytrdPackage.OWNER:
				return validateOwner((Owner)value, diagnostics, context);
			case PlaytrdPackage.TRADE:
				return validateTrade((Trade)value, diagnostics, context);
			case PlaytrdPackage.MONEY_VALUED:
				return validateMoneyValued((MoneyValued)value, diagnostics, context);
			case PlaytrdPackage.INVENTORY:
				return validateInventory((Inventory)value, diagnostics, context);
			case PlaytrdPackage.PROPERTIES:
				return validateProperties((Properties)value, diagnostics, context);
			case PlaytrdPackage.TAG_SERVICE:
				return validateTagService((TagService)value, diagnostics, context);
			case PlaytrdPackage.TAG_DATA:
				return validateTagData((TagData)value, diagnostics, context);
			case PlaytrdPackage.TAG_ENTRY:
				return validateTagEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case PlaytrdPackage.COLOCATION_SERVICE:
				return validateColocationService((ColocationService)value, diagnostics, context);
			case PlaytrdPackage.OBJECT_COLOCATION:
				return validateObjectColocation((ObjectColocation)value, diagnostics, context);
			case PlaytrdPackage.GLOBE_POSITION:
				return validateGlobePosition((LatLong)value, diagnostics, context);
			case PlaytrdPackage.MONEY:
				return validateMoney((Measurable<Money>)value, diagnostics, context);
			case PlaytrdPackage.IEDITING_DOMAIN_PROVIDER:
				return validateIEditingDomainProvider((IEditingDomainProvider)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectPosition(ObjectPosition objectPosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectPosition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaytrd(Playtrd playtrd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playtrd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePOI(POI poi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegion(Region region, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(region, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game<?> game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerState(PlayerState playerState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playerState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunity(Community community, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(community, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositionService(PositionService positionService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positionService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioned(Positioned positioned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positioned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageService(MessageService messageService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerMessage(PlayerMessage playerMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playerMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScripted(Scripted scripted, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scripted, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationService(LocationService locationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectLocation(ObjectLocation objectLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectLocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWallet(Wallet wallet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wallet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStore(Store store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(store, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwner(Owner owner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(owner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrade(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_buyerIsNonNull(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_sellerIsNonNull(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_buyerWalletIsNonNull(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_sellerOwnsSellerItems(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_buyerOwnsBuyerItems(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_moneyValueDefined(trade, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrade_walletHasMoneyValue(trade, diagnostics, context);
		return result;
	}

	/**
	 * Validates the buyerIsNonNull constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_buyerIsNonNull(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (trade.getBuyer() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "buyerIsNonNull", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the sellerIsNonNull constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_sellerIsNonNull(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (trade.getSeller() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "sellerIsNonNull", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the buyerWalletIsNonNull constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_buyerWalletIsNonNull(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (trade.getBuyerWallet() == null || (! isOwnedBy(trade.getBuyer(), trade.getBuyerWallet()))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "buyerWalletIsNonNull", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the sellerOwnsSellerItems constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_sellerOwnsSellerItems(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! isOwnedBy(trade.getSeller(), trade.getSellerItems())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "sellerOwnsSellerItems", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the buyerOwnsBuyerItems constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_buyerOwnsBuyerItems(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! isOwnedBy(trade.getBuyer(), trade.getBuyerItems())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "buyerOwnsBuyerItems", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the moneyValueDefined constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_moneyValueDefined(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		double tradeMoneyValue = getTradeMoneyValue(trade);
		if (tradeMoneyValue == Double.NaN || tradeMoneyValue < 0.0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "moneyValueDefined", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the walletHasMoneyValue constraint of '<em>Trade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTrade_walletHasMoneyValue(Trade trade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		double walletMoneyValue = trade.getBuyerWallet().getMoneyValue().doubleValue(GameCurrency.GAME_CURRENCY);
		double tradeMoneyValue = getTradeMoneyValue(trade);
		if (walletMoneyValue < tradeMoneyValue) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "walletHasMoneyValue", getObjectLabel(trade, context) },
						 new Object[] { trade },
						 context));
			}
			return false;
		}
		return true;
	}

	public static double getTradeMoneyValue(Trade trade) {
		Measurable<Money> money = trade.getMoneyValue();
		if (money != null) {
			return money.doubleValue(GameCurrency.GAME_CURRENCY);
		}
		double total = 0.0;
		for (Item item : trade.getSellerItems()) {
			Measurable<Money> amount = item.getMoneyValue();
			if (amount == null) {
				return Double.NaN;
			}
			total += amount.doubleValue(GameCurrency.GAME_CURRENCY);
		}
		for (Item item : trade.getBuyerItems()) {
			Measurable<Money> amount = item.getMoneyValue();
			if (amount == null) {
				return Double.NaN;
			}
			total -= amount.doubleValue(GameCurrency.GAME_CURRENCY);
		}
		return total;
	}
	
	public static boolean isOwnedBy(Owner owner, List<Item> items) {
		for (Item item : items) {
			if (! isOwnedBy(owner, item)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isOwnedBy(Owner owner, Item item) {
		for (EObject container = item.eContainer(); container != null; container = container.eContainer()) {
			if (container == owner) {
				return true;
			} else if (! (container instanceof Inventory)) {
				return false;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoneyValued(MoneyValued moneyValued, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moneyValued, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInventory(Inventory inventory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inventory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperties(Properties properties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(properties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagService(TagService tagService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagData(TagData tagData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagEntry(Map.Entry<?, ?> tagEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)tagEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColocationService(ColocationService colocationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colocationService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectColocation(ObjectColocation objectColocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectColocation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobePosition(LatLong globePosition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMoney(Measurable<Money> money, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEditingDomainProvider(IEditingDomainProvider iEditingDomainProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PlaytrdValidator
