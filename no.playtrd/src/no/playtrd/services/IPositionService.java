package no.playtrd.services;

import javax.measure.quantity.Angle;
import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;

import no.playtrd.v10.playtrd.PositionService;

public interface IPositionService extends IGenericService<PositionService> {
	public Unit<Angle> LATLONG_UNIT = NonSI.DEGREE_ANGLE;
}
