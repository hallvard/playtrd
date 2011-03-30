package no.playtrd.properties;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.BaseUnit;

public class Health {
	
	public interface Condition extends Quantity {}
	public interface Physical extends Condition {}
	public interface Mental extends Condition {}

    public static final BaseUnit<Condition> HEALTH = new BaseUnit<Condition>("H");

    public Measure<Integer, Condition> healthCondition = Measure.valueOf(100, HEALTH);
}
