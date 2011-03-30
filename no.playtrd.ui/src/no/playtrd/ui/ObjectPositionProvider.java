package no.playtrd.ui;

import no.playtrd.v10.playtrd.ObjectPosition;
import no.playtrd.v10.playtrd.impl.PlaytrdFactoryImpl;

import org.eclipse.swt.graphics.Color;
import org.jscience.geography.coordinates.LatLong;

import swingxmap.IPositionProvider;

public class ObjectPositionProvider implements IPositionProvider {

	private ObjectPosition position;
	
	public ObjectPositionProvider(ObjectPosition position) {
		this.position = position;
	}

	public ObjectPosition getObjectPosition() {
		return position;
	}
	
	public LatLong getPosition() {
		return position.getGlobePosition();
	}

	public String getToolTip() {
		return position.getPositioned().toString();
	}

	public boolean isReadOnly() {
		return false;
	}

	public Color getColor() {
		return null;
	}

	public void setPosition(double latitude, double longitude) {
		position.setGlobePosition(PlaytrdFactoryImpl.createLatLong(latitude, longitude));
	}
}
