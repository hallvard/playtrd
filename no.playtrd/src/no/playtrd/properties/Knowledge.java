package no.playtrd.properties;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.BaseUnit;

public class Knowledge {
	
	public interface Level extends Quantity {}
	public interface Culture extends Level {}
	public interface Sports extends Level {}
	public interface Trends extends Level {}

    public static final BaseUnit<Level> KNOWLEDGE = new BaseUnit<Level>("K");

    public Measure<Integer, Level> knowledgeLevel = Measure.valueOf(100, KNOWLEDGE);
}
