/**
 * 
 */
package no.playtrd.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class MultiAdapter extends AdapterImpl {
	
	private List<Notifier> notifiers = new ArrayList<Notifier>();
	
	public void addTarget(Notifier notifier) {
		notifier.eAdapters().add(this);
		notifiers.add(notifier);
	}
	
	public void clearTargets() {
		for (Notifier notifier : notifiers) {
			notifier.eAdapters().remove(this);
		}
		notifiers.clear();
	}
}