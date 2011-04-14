package no.playtrd.runtime;

import no.hal.scxml.generator.ScxmlRunner;
import no.hal.scxml.scxmlxt.StateMachine;
import no.playtrd.v10.playtrd.Game;

import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.js4emf.ecore.JavascriptSupport;

public class ScxmlRuntimeComponent extends AbstractRuntime.Component {

	private ScxmlRunner scxmlRunner;
	
	public ScxmlRuntimeComponent(AbstractRuntime runtime) {
		super(runtime);
	}
	
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(StateMachine.class)) {
			return scxmlRunner.getStateMachine();
		} else if (adapter.equals(SCXML.class)) {
			return scxmlRunner.getSCXML();
		}
		return super.getAdapter(adapter);
	}

	@Override
	protected void doStart() {
		scxmlRunner = new ScxmlRunner(runtime.getContextAdapter(ResourceSet.class));
		Game game = runtime.getContextAdapter(Game.class);
		if (game == null) {
			return;
		}
		URI baseUri = game.eResource().getURI();
		try {
			scxmlRunner.init(game, baseUri);
			game.setStateMachine(scxmlRunner.getStateMachine());
			JavascriptSupport javascriptSupport = runtime.getContextAdapter(JavascriptSupport.class);
			scxmlRunner.setJavascriptSupport(javascriptSupport);
			scxmlRunner.start();
		} catch (ModelException e) {
			System.err.println("Exception when starting " + this + ": " + e);
		}
		super.doStart();
	}

	@Override
	protected void doPause() {
		scxmlRunner.pause();
		super.doPause();
	}

	@Override
	protected void doResume() {
		scxmlRunner.resume();
		super.doResume();
	}

	@Override
	protected void doStop() {
		scxmlRunner = null;
		super.doStop();
	}
}
