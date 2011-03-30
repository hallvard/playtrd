
package no.hal.scxml;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ScxmlxtStandaloneSetup extends ScxmlxtStandaloneSetupGenerated{

	public static void doSetup() {
		new ScxmlxtStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

