package swingxmap;

import javax.measure.quantity.Angle;
import javax.measure.unit.NonSI;

import org.eclipse.swt.graphics.Color;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jscience.geography.coordinates.LatLong;

public class GeoPositionProvider implements IPositionProvider {

	private GeoPosition position;
	
	public GeoPositionProvider(GeoPosition position) {
		this.position = position;
	}

	public LatLong getPosition() {
		return LatLong.valueOf(position.getLatitude(), position.getLongitude(), NonSI.DEGREE_ANGLE);
	}

	public String getToolTip() {
		return position.getLatitude() + ", " + position.getLongitude();
	}

	public boolean isReadOnly() {
		return true;
	}

	public Color getColor() {
		return null;
	}

	public void setPosition(double latitude, double longitude) {
	}
}
