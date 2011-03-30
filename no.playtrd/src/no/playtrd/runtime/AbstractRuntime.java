package no.playtrd.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import no.playtrd.Activator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class AbstractRuntime extends LifeCycleImpl implements IAdaptable {
	
	private IAdaptable context;

	public AbstractRuntime(IAdaptable context) {
		this.context = context;
	}

	public static abstract class Component extends LifeCycleImpl implements IAdaptable {
		
		protected final AbstractRuntime runtime;
		
		public Component(AbstractRuntime runtime) {
			this.runtime = runtime;
		}

		public AbstractRuntime getRuntime() {
			return runtime;
		}
		
		public Object getAdapter(Class adapter) {
			if (adapter.isInstance(this)) {
				return this;
			}
			return null;
		}
	}

	protected Collection<Component> runtimeComponents = new ArrayList<AbstractRuntime.Component>();
	
	protected void addRuntimeComponent(Component comp) {
		if (! runtimeComponents.contains(comp)) {
			runtimeComponents.add(comp);
		}
	}
	
	public Object getAdapter(Class adapter) {
		for (Component component: runtimeComponents) {
			Object o = component.getAdapter(adapter);
			if (o != null) {
				return o;
			}
		}
		return null;
	}

	public <T> T getContextAdapter(Class<T> adapter) {
		return (context != null ? (T)context.getAdapter(adapter) : null);
	}

	@Override
	protected void doStart() {
		doLifeCycleTransition(runtimeComponents, this.lifeCycleState, RUNNING);
		super.doStart();
	}

	@Override
	protected void doPause() {
		doLifeCycleTransition(runtimeComponents, this.lifeCycleState, PAUSED);
		super.doPause();
	}

	@Override
	protected void doResume() {
		doLifeCycleTransition(runtimeComponents, this.lifeCycleState, RUNNING);
		super.doResume();
	}

	@Override
	protected void doStop() {
		doLifeCycleTransition(runtimeComponents, this.lifeCycleState, PAUSED);
		super.doStop();
	}

	@Override
	protected void doRestart() {
		doLifeCycleTransition(runtimeComponents, this.lifeCycleState, PAUSED);
		super.doRestart();
	}
	
	//
	
	public static <T> T getEObject(ResourceSet resourceSet, Class<T> clazz, int severity) {
		List<T> eObjects = getEObjects(resourceSet, clazz, 1, 1, severity);
		return (eObjects.size() > 0 ? eObjects.get(0) : null);
	}

	public static <T> T getEObject(TreeIterator<EObject> allContents, Class<T> clazz, int severity) {
		List<T> eObjects = getEObjects(allContents, clazz, 1, 1, severity);
		return (eObjects.size() > 0 ? eObjects.get(0) : null);
	}
	
	public static <T> List<T> getEObjects(ResourceSet resourceSet, Class<T> clazz, int minCount, int maxCount, int severity) {
		List<T> eObjects = new ArrayList<T>();
		for (Resource resource: resourceSet.getResources()) {
			getEObjects(resource.getAllContents(), clazz, maxCount, eObjects);
		}
		return checkEObjects(eObjects, clazz, minCount, maxCount, severity);
	}

	protected static <T> List<T> checkEObjects(List<T> eObjects, Class<T> clazz, int minCount, int maxCount,int severity) {
		if (eObjects.size() < minCount && severity >= 0) {
			Activator.getDefault().log(severity, "Didn't find between " + minCount + " and " + maxCount + " objects of " + clazz);
		}
		return eObjects;
	}

	public static <T> List<T> getEObjects(TreeIterator<EObject> allContents, Class<T> clazz, int minCount, int maxCount, int severity) {
		List<T> eObjects = new ArrayList<T>();
		getEObjects(allContents, clazz, maxCount, eObjects);
		return checkEObjects(eObjects, clazz, minCount, maxCount, severity);
	}

	private static <T> void getEObjects(TreeIterator<EObject> allContents, Class<T> clazz, int maxCount, List<T> result) {
		while (allContents.hasNext()) {
			Object o = allContents.next();
			if (clazz.isInstance(o)) {
				result.add((T)o);
				if (maxCount >= 0 && result.size() >= maxCount) {
					break;
				}
			}
		}
	}
}
