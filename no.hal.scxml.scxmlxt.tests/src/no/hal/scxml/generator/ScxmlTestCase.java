package no.hal.scxml.generator;

import java.util.StringTokenizer;

import junit.framework.TestCase;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;

import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.TransitionTarget;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ScxmlTestCase extends TestCase {

	protected SCXML scxml = null;

	protected ScxmlRunner scxmlRunner;
	
	protected void setUp(String domainDataName) throws Exception {
		super.setUp();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(ScxmlxtPackage.eNS_URI, ScxmlxtPackage.eINSTANCE);
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		scxmlRunner = new ScxmlRunner(resourceSet);
		URI baseUri = URI.createURI(this.getClass().getResource(domainDataName).toString());
		scxmlRunner.init(resourceSet.getResource(URI.createURI(domainDataName).resolve(baseUri), true).getContents().get(0), baseUri);
	}

	protected void startScxml() {
		scxmlRunner.start();
	}
	protected void resumeScxml() {
		scxmlRunner.resume();
	}

	private void assertState(String stateId, boolean expected, boolean def) {
		assertTrue("State " + stateId + " is " + (expected ? "not " : "") + "active ", scxmlRunner.stateCheck(stateId, expected, def));
	}

	private void assertState(String stateIds, boolean expected) {
		StringTokenizer ids = new StringTokenizer(stateIds);
		while (ids.hasMoreTokens()) {
			assertState(ids.nextToken(), expected, false);
		}
	}
	protected void assertInState(String stateIds) {
		assertState(stateIds, true);
	}
	protected void assertNotInState(String stateIds) {
		assertState(stateIds, false);
	}
	
	protected EObject getEObject(TransitionTarget state) {
		return scxmlRunner.getEObject(state);
	}

	protected TransitionTarget getState(String stateId) {
		return scxmlRunner.getState(stateId);
	}
	
	protected Object eGet(EObject eObject, String name) {
		return eObject.eGet(eObject.eClass().getEStructuralFeature(name));
	}
	protected void eSet(EObject eObject, String name, Object value) {
		eObject.eSet(eObject.eClass().getEStructuralFeature(name), value);
	}
}
