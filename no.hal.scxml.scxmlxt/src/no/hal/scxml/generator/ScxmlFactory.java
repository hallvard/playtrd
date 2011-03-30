package no.hal.scxml.generator;

import org.apache.commons.scxml.model.Initial;
import org.apache.commons.scxml.model.OnEntry;
import org.apache.commons.scxml.model.OnExit;
import org.apache.commons.scxml.model.Parallel;
import org.apache.commons.scxml.model.State;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;

public class ScxmlFactory {

	public <T> T create(Class<T> c) {
		T scxmlObject = null;
		if (c == State.class) {
			scxmlObject = (T)createState();
		} else if (c == Parallel.class) {
			scxmlObject = (T)createParallel();
		} else if (c == Transition.class) {
			scxmlObject = (T)createTransition();
		} else if (c == Initial.class) {
			scxmlObject = (T)createInitial();
		} else if (c == OnEntry.class) {
			scxmlObject = (T)createOnEntry();
		} else if (c == OnExit.class) {
			scxmlObject = (T)createOnExit();
		} else if (c == Parallel.class) {
			scxmlObject = (T)createParallel();
		} else if (c == Parallel.class) {
			scxmlObject = (T)createParallel();
		}
		if (scxmlObject == null) {
			try {
				scxmlObject = (T)c.newInstance();
			} catch (Exception e) {
			}
		}
		return scxmlObject;
	}

	protected String getStateNameString(TransitionTarget tt) {
		return (tt != null ? tt.getId() : "?");
	}
	
	public State createState() {
		return new State() {
			public String toString() {
				return "[State " + getStateNameString(this) + "]";
			}
		};
	}

	public Parallel createParallel() {
		return new Parallel() {
			public String toString() {
				return "[Parallel " + getStateNameString(this) + "]";
			}
		};
	}

	public Transition createTransition() {
		return new Transition() {
			public String toString() {
				return "[Transition " + getStateNameString(getParent()) + " -> " + getNext() + " on " + getEvent() + "]";
			}
		};
	}

	public Initial createInitial() {
		return new Initial() {
			public String toString() {
				return "[Initial " + getTransition() + "]";
			}
		};
	}

	public OnEntry createOnEntry() {
		return new OnEntry() {
			public String toString() {
				return "[OnEntry in " + getStateNameString(getParent()) + "]";
			}
		};
	}

	public OnExit createOnExit() {
		return new OnExit() {
			public String toString() {
				return "[OnExit in " + getStateNameString(getParent()) + "]";
			}
		};
	}
}
