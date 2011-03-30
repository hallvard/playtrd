package no.playtrd.runtime;

import java.util.ArrayList;
import java.util.List;


public class LifeCycleImpl implements LifeCycle {

	protected Object lifeCycleState = null;

	public boolean inLifeCycleState(Object lifeCycleState) {
		return this.lifeCycleState == lifeCycleState;
	}

	public void dispose() {
	}

	private List<Listener> lifeCycleListeners = new ArrayList<LifeCycle.Listener>();

	public void addLifeCycleListener(Listener listener) {
		lifeCycleListeners.add(listener);
	}

	public void removeLifeCycleListener(Listener listener) {
		lifeCycleListeners.remove(listener);
	}

	private void setLifeCycleState(Object newState) {
		lifeCycleState = newState;
		for (Listener listener: lifeCycleListeners) {
			listener.lifeCycleStateChanged(this);
		}
	}

	protected void doLifeCycleTransition(LifeCycle lifeCycle, Object fromState, Object toState) {
		if (! lifeCycle.inLifeCycleState(fromState)) {
			return;
		}
		if (fromState == null && toState == RUNNING) {
			lifeCycle.start();
		} else if (fromState == RUNNING && toState == PAUSED) {
			lifeCycle.pause();
		} else if (fromState == RUNNING && toState == STOPPED) {
			lifeCycle.stop();
		} else if (fromState == PAUSED && toState == RUNNING) {
			lifeCycle.resume();
		} else if (fromState == PAUSED && toState == STOPPED) {
			lifeCycle.stop();
		} else if (fromState == STOPPED && toState == RUNNING) {
			lifeCycle.restart();
		}
	}
	protected void doLifeCycleTransition(Iterable<? extends LifeCycle> lifeCycles, Object fromState, Object toState) {
		for (LifeCycle lifeCycle: lifeCycles) {
			doLifeCycleTransition(lifeCycle, fromState, toState);
		}
	}
	
	public void start() {
		if (lifeCycleState == null) {
			doStart();
		}
	}
	protected void doStart() {
		setLifeCycleState(RUNNING);
	}

	public void pause() {
		if (lifeCycleState == RUNNING) {
			doPause();
		}
	}
	protected void doPause() {
		setLifeCycleState(PAUSED);
	}


	public void resume() {
		if (lifeCycleState == PAUSED) {
			doResume();
		}
	}
	protected void doResume() {
		setLifeCycleState(RUNNING);
	}

	public void stop() {
		if (lifeCycleState == PAUSED || lifeCycleState == STOPPED) {
			doStop();
		}
	}
	protected void doStop() {
		setLifeCycleState(STOPPED);
	}

	public void restart() {
		if (lifeCycleState == STOPPED) {
			doRestart();
		}
	}
	protected void doRestart() {
		doStart();
	}
}
