package org.openstreetmap.osm.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.openstreetmap.osm.Node;
import org.openstreetmap.osm.OSM;

import junit.framework.TestCase;

public class OsmResourceTest extends TestCase {

	public OsmResourceTest() {
	}

	protected void setUp() {
	}
	
	public void testOsmQueryData() {
		Resource.Factory resoureFactory = new OsmResourceFactoryImpl();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("osm", resoureFactory);
		URI resourceUri = URI.createURI(getClass().getResource("data.osm").toString());
		Resource resource = resourceSet.getResource(resourceUri, true);
		assertTrue(resource.getContents().size() == 1);
		EObject root = resource.getContents().get(0);
		assertTrue(root instanceof OSM);
		assertTrue(root.eContents().size() == 37);
		for (EObject child : root.eContents()) {
			assertTrue(child instanceof Node);
			Node node = (Node)child;
			assertTrue(node.getTags().size() > 0);
		}
	}
}
