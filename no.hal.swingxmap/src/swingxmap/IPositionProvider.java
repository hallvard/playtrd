package swingxmap;

import javax.measure.quantity.Angle;
import javax.measure.unit.NonSI;
import javax.measure.unit.Unit;

import org.eclipse.swt.graphics.Color;

import org.jscience.geography.coordinates.LatLong;

public interface IPositionProvider {
	
	public LatLong getPosition();
	public boolean isReadOnly();
	public void setPosition(double latitude, double longitude);
	public Color getColor();
	public String getToolTip();
}
