package no.playtrd.runtime;

import org.eclipse.e4.tm.ui.ModelContext;
import org.eclipse.e4.tm.ui.ModelPartContent;
import org.eclipse.e4.tm.ui.TmPartStyle;

public class TmRuntimeComponent extends AbstractRuntime.Component {

	private TmPartStyle partStyle;
	private ModelContext modelContext;
	
	public TmRuntimeComponent(AbstractRuntime runtime) {
		super(runtime);
	}

	private TmPartStyle getTmPartStyle() {
		if (partStyle == null) {
			partStyle = (TmPartStyle)runtime.getContextAdapter(TmPartStyle.class);
		}
		return partStyle;
	}
	public void setPartStyle(TmPartStyle partStyle) {
		this.partStyle = partStyle;
	}

	private ModelContext getModelContext() {
		if (modelContext == null) {
			modelContext = (ModelContext)runtime.getContextAdapter(ModelContext.class);
		}
		return modelContext;
	}
	public void setModelContext(ModelContext modelContext) {
		this.modelContext = modelContext;
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(ModelContext.class)) {
			return modelContext;
		}
		return super.getAdapter(adapter);
	}

	protected ModelPartContent modelContent;

	@Override
	protected void doStart() {
		modelContent = new ModelPartContent(getTmPartStyle().getTmComposite(runtime));
		modelContent.setModelContext(getModelContext());
		super.doStart();
	}

	@Override
	protected void doPause() {
		super.doPause();
	}

	@Override
	protected void doResume() {
		super.doResume();
	}

	@Override
	protected void doStop() {
		modelContent.dispose();
		super.doStop();
	}
}
