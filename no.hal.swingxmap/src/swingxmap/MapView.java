package swingxmap;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MapView extends ViewPart {

//	public final static GeoPosition torgetITrondheim = new GeoPosition(63.43057, 10.39221);
//	private JXMapKit mapKit; 
//	private JLabel status;
//
//	private int[] eventTypeMapping = {
//			SWT.MouseMove, java.awt.Event.MOUSE_MOVE,
//			SWT.MouseDown, java.awt.Event.MOUSE_DOWN,
//			SWT.MouseUp, java.awt.Event.MOUSE_UP,
//	};
//	private int[] buttonMapping = {
//			1, java.awt.event.MouseEvent.BUTTON1,
//			2, java.awt.event.MouseEvent.BUTTON2,
//			3, java.awt.event.MouseEvent.BUTTON3,
//	};
//	
//	private int getMappedInt(int sourceInt, int[] mapping, int def) {
//		for (int i  = 0; i  < mapping.length; i += 2) {
//			if (mapping[i] == sourceInt) {
//				return mapping[i + 1];
//			}
//		}
//		return def;
//	}
//	
//	private Listener genericListener = new Listener() {
//		public void handleEvent(Event e) {
//			JXMapViewer mainMap = mapKit.getMainMap();
//			AWTEvent awtEvent = null;
//			if (e.type == SWT.MouseMove || e.type == SWT.MouseDown || e.type == SWT.MouseUp) {
//				int eventType = getMappedInt(e.type, eventTypeMapping, 0);
//				int button = getMappedInt(e.button, buttonMapping, java.awt.event.MouseEvent.NOBUTTON);
//				if (eventType != 0) {
//					awtEvent = new java.awt.event.MouseEvent(mainMap, eventType, e.time, 0, e.x, e.y, 0, false, button);
//				}
////				System.out.println("Mouse event: " + e + " -> " + awtEvent);
//				if (button != java.awt.event.MouseEvent.NOBUTTON) {
//					System.out.println("Button " + e.button + " is " + button);
//				}
//			}
//			if (awtEvent != null) {
//				mainMap.dispatchEvent(awtEvent);
//			}
//		}
//	};

	private MapViewContent mapViewContent;
	
	public void createPartControl(Composite parent) {
		mapViewContent = new MapViewContent();
		mapViewContent.createControls(parent);
	}

	public void setFocus() {
		mapViewContent.setFocus();
	}
}
