package no.hal.scxml.javascript;

import java.net.URL;
import java.util.Arrays;

import no.hal.scxml.javascript.JavascriptEvaluator;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.Rules;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.SCXMLListener;
import org.apache.commons.scxml.env.SimpleDispatcher;
import org.apache.commons.scxml.env.SimpleErrorHandler;
import org.apache.commons.scxml.env.SimpleErrorReporter;
import org.apache.commons.scxml.env.URLResolver;
import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.model.CustomAction;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.Transition;
import org.apache.commons.scxml.model.TransitionTarget;

import org.xml.sax.InputSource;

import junit.framework.TestCase;

public abstract class JavascriptTest extends TestCase implements SCXMLListener {

	protected SCXMLExecutor exec = null;
	protected Evaluator evaluator = null;

	protected SCXML scxml = null;

	protected void setUp() {
		setUp(getTestName());
	}

	static JavascriptTest currentTest = null;
	
	protected String getTestName() {
		String name = getClass().getName();
		int pos = name.lastIndexOf('.');
		if (pos >= 0) {
			name = name.substring(pos + 1);
		}
		name = Character.toLowerCase(name.charAt(0)) + name.substring(1) + ".xml";
		return name;
	}

	protected void setUp(String name) {
		evaluator = new JavascriptEvaluator();
		exec = new SCXMLExecutor(evaluator, new SimpleDispatcher(), new SimpleErrorReporter());
		URL url = getClass().getResource(name);
		try {
			currentTest = this;
	        Digester scxmlParser = SCXMLParser.newInstance(null, new URLResolver(url), Arrays.asList(
	        		new CustomAction(ScriptAction.JAVASCRIPT_NAMESPACE, "script", ScriptAction.class),
	        		new CustomAction(ScriptAction.JAVASCRIPT_NAMESPACE, "scriptTest", ScriptTestAction.class)
	        ));
	        Rules rules = scxmlParser.getRules();
	        rules.setNamespaceURI(ScriptAction.JAVASCRIPT_NAMESPACE);
	        rules.add("!*/script", new ScriptBodyRule());
	        scxmlParser.setErrorHandler(new SimpleErrorHandler());
            scxml = (SCXML)scxmlParser.parse(new InputSource(url.openStream()));
	        if (scxml != null) {
	        	SCXMLParser.updateSCXML(scxml);
	        }
			exec.getRootContext().setLocal("url", url);
			exec.setStateMachine(scxml);
			exec.addListener(scxml, this);
		} catch (Exception e) {
			System.err.println("Exception when starting state machine: " + e);
		} finally {
			currentTest = null;
		}
	}
	
	protected void go() {
		try {
			exec.go();
		} catch (ModelException e) {
			fail(e.getMessage());
		}
	}

	public void onEntry(TransitionTarget target) {
	}
	public void onExit(TransitionTarget source) {
	}
	public void onTransition(TransitionTarget source, TransitionTarget target, Transition transition) {
	}
}
