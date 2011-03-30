package no.playtrd.properties;
import org.jscience.economics.money.Currency;


public class GameCurrency extends Currency {

    public GameCurrency(String code) {
		super(code);
	}

	public static final Currency GAME_CURRENCY = new Currency("GC");

}
