package swingxmap;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.measure.unit.NonSI;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.JXMapKit.DefaultProviders;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.painter.Painter;
import org.jscience.geography.coordinates.LatLong;

public class MapViewContent implements Iterable<IPositionProvider> {

	public final static GeoPosition torgetITrondheim = new GeoPosition(63.43057,10.39221);

	private Control focusTarget = null;
	private JXMapKit mapKit;
	
	public void createControls(Composite parent) {
	    mapKit = new JXMapKit();
	    mapKit.setDefaultProvider(DefaultProviders.OpenStreetMaps);

	    mapKit.getMainMap().setPanEnabled(false);
	    DraggingPositionHandler mouseHandler = new DraggingPositionHandler();
		mapKit.getMainMap().addMouseListener(mouseHandler);
		mapKit.getMainMap().addMouseMotionListener(mouseHandler);
		
		mapKit.setAddressLocation(torgetITrondheim);
		mapKit.setAddressLocationShown(true);
		mapKit.setZoom(3);

		mapKit.getZoomSlider().getModel().addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				invalidateOverlayPainter();
			}
		});

	    Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
//		composite.addListener(SWT.MouseMove, genericListener);
//		composite.addListener(SWT.MouseDown, genericListener);
//		composite.addListener(SWT.MouseUp, genericListener);
		Frame frame = SWT_AWT.new_Frame(composite);
		frame.setLayout(new BorderLayout());
		Container swingParent = new Panel();
		frame.add(swingParent, BorderLayout.CENTER);
//		Container swingParent = frame;
		swingParent.setLayout(new BorderLayout());
		swingParent.add(mapKit, BorderLayout.CENTER);
		
		focusTarget = composite;
	    
	    invalidateOverlayPainter();
	}

	private class DraggingPositionHandler extends MouseAdapter implements IPositionProvider, MouseMotionListener {
		
		private IPositionProvider draggingProvider = null;
		private GeoPosition lastPosition = null;
		
		public void mouseMoved(MouseEvent e) {
			updateMousePosition((int)e.getX(), (int)e.getY());
		}
    	public void mousePressed(MouseEvent e) {
    		draggingProvider = findTopMostPositionProvider(e.getX(), e.getY());
//    		System.out.println("findTopMostPositionProvider: " + draggingProvider);
    		if (draggingProvider == null) {
    			draggingProvider = findEmptyPositionProvider();
    		}
//    		System.out.println("Dragging " + draggingProvider);
    		setLastPosition(e);
    		setSelectedPosition(draggingProvider != null ? this : null);
    	}
		private void setLastPosition(MouseEvent e) {
			lastPosition = mapKit.getMainMap().convertPointToGeoPosition(new Point2D.Double(e.getX(), e.getY()));
		}
		public void mouseDragged(MouseEvent e) {
			updateMousePosition((int)e.getX(), (int)e.getY());
			if (draggingProvider != null && (! draggingProvider.isReadOnly())) {
				setLastPosition(e);
				updatePositions();
			}
		}
    	public void mouseReleased(MouseEvent e) {
    		setPosition(lastPosition.getLatitude(), lastPosition.getLongitude());
    	}
    	
		public LatLong getPosition() {
			return LatLong.valueOf(lastPosition.getLatitude(), lastPosition.getLongitude(), NonSI.DEGREE_ANGLE);
		}
		public boolean isReadOnly() {
			return false;
		}
		public void setPosition(double latitude, double longitude) {
			if (draggingProvider != null && (! draggingProvider.isReadOnly())) {
				draggingProvider.setPosition(latitude, longitude);
			}
		}
		public String getToolTip() {
			return (draggingProvider != null ? draggingProvider.getToolTip() : null);
		}
		public org.eclipse.swt.graphics.Color getColor() {
			return (draggingProvider != null ? draggingProvider.getColor() : null);
		}
    }
	
	protected void updateMousePosition(int x, int y) {
		String status = getToolTipText(x, y, ", ");
		GeoPosition location = mapKit.getMainMap().convertPointToGeoPosition(new Point2D.Double(x, y));
		String geoString = " (" + location.getLatitude() + ", " + location.getLongitude() + ")";
		status = (status != null ? status + geoString : geoString);
		updateStatus(status);
	}
	protected void updateStatus(String status) {
	}

	private List<IPositionProvider> locations = new ArrayList<IPositionProvider>();
	
	public void addPosition(double lat, double lng) {
		addPosition(new GeoPosition(lat, lng));
	}
	public void addPosition(GeoPosition position) {
		locations.add(new GeoPositionProvider(position));
	}
	public void addPosition(IPositionProvider position) {
		locations.add(position);
	}
	public void removePosition(IPositionProvider position) {
		locations.remove(position);
	}
	public void clearPositions() {
		locations.clear();
		selectedPosition = null;
	}
	
	public Iterator<IPositionProvider> iterator() {
		return getProviders();
	}
	
	public void updatePositions() {
		invalidateOverlayPainter();
	}
	
	protected void paintLocation(Graphics2D g2d, GeoPosition location, Point2D position) {
		double size = 4.0;
		g2d.drawOval((int)(position.getX() - size / 2), (int)(position.getY() - size / 2), (int)size, (int)size);
	}

	private Color defaultPositionColor = Color.black;
	private Color defaultSelectedPositionColor = Color.red;

	private IPositionProvider selectedPosition = null;
	
	public void setSelectedPosition(IPositionProvider provider) {
		selectedPosition = provider;
		updatePositions();
	}
	
	private boolean isSelected(IPositionProvider provider) {
		if (selectedPosition == provider) {
			return true;
		}
		if (selectedPosition instanceof DraggingPositionHandler && ((DraggingPositionHandler)selectedPosition).draggingProvider == provider) {
			return true;
		}
		return false;
	}
	
	
	private static GeoPosition createGeoPosition(IPositionProvider provider) {
		LatLong latLong = provider.getPosition();
		return new GeoPosition(latLong.latitudeValue(NonSI.DEGREE_ANGLE), latLong.longitudeValue(NonSI.DEGREE_ANGLE));
	}

	public class DefaultLocationsPainter implements Painter<JXMapViewer> {
		public void paint(Graphics2D g2d, JXMapViewer mapViewer, int width, int height) {
			g2d.setStroke(new BasicStroke(2.0f));
			for (IPositionProvider provider: locations.toArray(new IPositionProvider[locations.size()])) {
				if ((! isSelected(provider)) && provider.getPosition() != null) {
					paintPosition(g2d, provider);
				}
			}
			if (selectedPosition != null && selectedPosition.getPosition() != null) {
				paintPosition(g2d, selectedPosition);
			}
		}
		private void paintPosition(Graphics2D g2d, IPositionProvider provider) {
			GeoPosition location = createGeoPosition(provider);
			Point2D position = mapKit.getMainMap().convertGeoPositionToPoint(location);
			org.eclipse.swt.graphics.Color c = provider.getColor();
			g2d.setColor(c != null ? new Color(c.getRed(), c.getGreen(), c.getBlue()) : (provider == selectedPosition ? defaultSelectedPositionColor : defaultPositionColor));
			paintLocation(g2d, location, position);
		}
		protected void paintLocation(Graphics2D g2d, GeoPosition location, Point2D position) {
			MapViewContent.this.paintLocation(g2d, location, position);
		}
	};
	private Painter<JXMapViewer> locationsPainter = new DefaultLocationsPainter();

	public Iterator<IPositionProvider> getProviders() {
		return new PositionProviderIterator();
	}
	
	private class PositionProviderIterator implements Iterator<IPositionProvider> {
		
		private Point2D point;
		private Iterator<IPositionProvider> providers;
		private IPositionProvider currentProvider = null;
		
		public PositionProviderIterator() {
			providers = locations.iterator();
		}
		public PositionProviderIterator(Point point) {
			this();
			this.point = point;
		}

		public boolean hasNext() {
			if (currentProvider == null) {
				getNext();
			}
			return currentProvider != null;
		}

		private void getNext() {
			currentProvider = null;
			while (providers.hasNext() && currentProvider == null) {
				IPositionProvider provider = providers.next();
				if (point == null) {
					currentProvider = provider;
				} else if (provider.getPosition() != null) {
					GeoPosition location = createGeoPosition(provider);
					Point2D position = mapKit.getMainMap().convertGeoPositionToPoint(location);
					double dx = position.getX() - point.getX(), dy = position.getY() - point.getY(), distance = Math.sqrt(dx * dx + dy * dy);
					if (distance <= 4.0) {
						currentProvider = provider;
					}
				}
			}
		}

		public IPositionProvider next() {
			IPositionProvider provider = currentProvider;
			getNext();
			return provider;
		}

		public void remove() {
			providers.remove();
		}
	}
	
	public IPositionProvider findTopMostPositionProvider(int x, int y) {
		IPositionProvider currentProvider = null;
		for (Iterator<IPositionProvider> providers = new PositionProviderIterator(new Point(x, y)); providers.hasNext();) {
			currentProvider = providers.next();
		}
		return currentProvider;
	}

	public IPositionProvider findEmptyPositionProvider() {
		for (Iterator<IPositionProvider> providers = new PositionProviderIterator(); providers.hasNext();) {
			IPositionProvider currentProvider = providers.next();
			if (currentProvider.getPosition() == null) {
//				return currentProvider;
			}
		}
		return null;
	}
	
	public String getToolTipText(int x, int y, String separator) {
		String toolTip = null;
		Iterator<IPositionProvider> providers = new PositionProviderIterator(new Point(x, y));
		while (providers.hasNext()) {
			IPositionProvider provider = providers.next();
			String positionToolTip = provider.getToolTip();
			if (positionToolTip == null);
			else if (toolTip == null) {
				toolTip = positionToolTip;
			} else {
				toolTip += separator + positionToolTip;
			}
		}
		return toolTip;
	}
	
	public void setLocationsPainter(Painter<JXMapViewer> painter) {
		this.locationsPainter = painter;
	}
	
	private void invalidateOverlayPainter() {
		mapKit.getMainMap().setOverlayPainter(locationsPainter);
		mapKit.getMainMap().repaint();
	}

	public void setFocus() {
		focusTarget.setFocus();
//		mapKit.getMainMap().requestFocus();
	}
}
