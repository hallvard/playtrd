package no.playtrd.runtime;

import org.eclipse.emf.edit.provider.IDisposable;

public interface LifeCycle extends IDisposable {
	
	Object RUNNING = new Object(), PAUSED = new Object(), STOPPED = new Object();
	
	public boolean inLifeCycleState(Object lifeCycleState);
	
	public void start();
	
	public void pause();
	public void resume();

	public void stop();
	public void restart();
	
	public interface Listener {
		public void lifeCycleStateChanged(LifeCycle lifeCycle);
	}
}
