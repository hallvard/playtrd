package no.hal.scxml.javascript;

import org.apache.commons.digester.Rule;

public class ScriptBodyRule extends Rule {

	public void body(String namespace, String name, String text) throws Exception {
		if (ScriptAction.JAVASCRIPT_NAMESPACE.equals(namespace) && ScriptAction.SCRIPT_TAG.equals(name)) {
			if (getDigester().peek() instanceof ScriptAction) {
				((ScriptAction)getDigester().peek()).setScript(text);
			}
		}
	}
}
