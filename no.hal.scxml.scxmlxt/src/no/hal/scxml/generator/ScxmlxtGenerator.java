package no.hal.scxml.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import no.hal.scxml.ScxmlxtStandaloneSetup;
import no.hal.scxml.scxmlxt.AbstractState;
import no.hal.scxml.scxmlxt.AbstractUriLiteral;
import no.hal.scxml.scxmlxt.ScxmlxtFactory;
import no.hal.scxml.scxmlxt.ScxmlxtPackage;
import no.hal.scxml.scxmlxt.State;
import no.hal.scxml.scxmlxt.StateMachine;
import no.hal.scxml.scxmlxt.VarDef;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class ScxmlxtGenerator {

	private static final String SCXMLXT = "scxmlxt";

	private EObject model;
	private URI scxmlxtBaseUri;

	private ResourceSet resourceSet;

	private Injector injector;
	private ResourceSet scxmlxtResourceSet;

	public ScxmlxtGenerator(EObject model, URI scxmlxtBaseUri) {
		super();
		this.model = model;
		this.scxmlxtBaseUri = scxmlxtBaseUri;
		this.resourceSet = new ResourceSetImpl();

		this.injector = new ScxmlxtStandaloneSetup().createInjectorAndDoEMFRegistration();
		this.scxmlxtResourceSet = injector.getInstance(XtextResourceSet.class);
	}

	public URIConverter getUriConverter() {
		return resourceSet.getURIConverter();
	}

//	private StatemachineRuntimeSupport statemachineRuntimeSupport = new StatemachineRuntimeSupport();

	private Map<String, Object> rootVariables = new HashMap<String, Object>();


	public Map<String, Object> getRootVariables() {
		return rootVariables;
	}

	public final static String MODEL_RESOURCE_VARIABLE_NAME = "thisModelResource";

	private Resource modelResource;

	public StateMachine generateScxmlxt() {
		modelResource = model.eResource();
//		runtimeStateResource = (getUriConverter().exists(stateModel, null) ? resourceSet.getResource(stateModel, true) : resourceSet.createResource(stateModel));
//		statemachineRuntimeSupport.setRuntimeStates(runtimeStateResource);
		StateMachine stateMachine = ScxmlxtFactory.eINSTANCE.createStateMachine();
		rootVariables.put(MODEL_RESOURCE_VARIABLE_NAME, modelResource);
//		rootVariables.put("thisRuntimeStateResource", runtimeStateResource);
		generateScxmlxt(modelResource.getContents().iterator(), stateMachine);
		return stateMachine;
	}

	private void generateScxmlxt(Iterator<EObject> eObjects, AbstractState parent) {
		while (eObjects.hasNext()) {
			EObject eObject = eObjects.next();
			State state = getEObjectState(eObject);
			if (state != null) {
				state.setName(getStateName(eObject, parent));
				state.setInitialTransition(ScxmlxtFactory.eINSTANCE.createInitialTransition());
				parent.getStates().add(state);
			}
			generateScxmlxt(eObject.eContents().iterator(), (state != null ? state : parent));
		}
	}

	public State getEObjectState(EObject eObject) {
		List<EClass> eClasses = new ArrayList<EClass>();
		eClasses.add(eObject.eClass());
		collectSuperTypes(eClasses);
		State state = null;
		MergingCopier copier = new MergingCopier();
		// merging is implemented by means of adding/overwriting features
		// hence, superTypes should be handled first
		Collections.reverse(eClasses);
		for (EClass eClass: eClasses) {
			state = getEObjectState(eObject, eClass, state, copier);
		}
		return state;
	}

	private void collectSuperTypes(List<EClass> superTypes) {
		for (int i = 0; i < superTypes.size(); i++) {
			EClass eClass = superTypes.get(i);
			for (EClass superType: eClass.getESuperTypes()) {
				if (! superTypes.contains(superType)) {
					superTypes.add(superType);
				}
			}
		}
	}

	private Map<URI, StateMachine> uriStateMachineMap = new HashMap<URI, StateMachine>();

	public static String getFullName(AbstractState abstractState, EObject root) {
		String name = null;
		while (abstractState instanceof State && abstractState != root) {
			State state = (State)abstractState;
			name = (name == null ? state.getName() : state.getName() + "." + name);
			abstractState = (AbstractState)abstractState.eContainer();
		}
		return name;
	}

	private static class MergingCopier extends Copier {

		private EObject root;

		public void setRoot(EObject root) {
			this.root = root;
		}

		private Map<String, EObject> fullNameMap = new HashMap<String, EObject>();

		protected EObject createCopy(EObject eObject) {
			// check if eObject has the same name as an existing one in mergeInto
			String fullName = (eObject instanceof State ? getFullName((State)eObject, root) : null);
			if (fullName != null && fullNameMap.containsKey(fullName)) {
				// in this case, reuse the existing copy
				return fullNameMap.get(fullName);
			}
			EObject copy = super.createCopy(eObject);
			if (fullName != null) {
				fullNameMap.put(fullName, copy);
			}
			return copy;
		}
	}

	private State getEObjectState(EObject eObject, EClass eClass, State mergeInto, MergingCopier copier) {
		URI scxmlxtUri = URI.createURI(eClass.getName()).appendFileExtension(SCXMLXT).resolve(scxmlxtBaseUri);
		StateMachine stateMachine = uriStateMachineMap.get(scxmlxtUri);
		if (stateMachine == null) {
			try {
				Resource scxmlxtResource = scxmlxtResourceSet.getResource(scxmlxtUri, true);
				stateMachine = (StateMachine)scxmlxtResource.getContents().get(0);
				uriStateMachineMap.put(scxmlxtUri, stateMachine);
			} catch (Exception e) {
			}
		}
		if (stateMachine != null) {
			State state = (mergeInto != null ? mergeInto : ScxmlxtFactory.eINSTANCE.createState());
			// add a variable referencing the owning eObject
			// should be initialized first, so other variables can use it
			state.getVariables().add(createEObjectVariable(eObject, eClass));
			// copy content
			copier.setRoot(stateMachine);
			state.getStates().addAll(copier.copyAll(stateMachine.getStates()));
			state.getTransitions().addAll(copier.copyAll(stateMachine.getTransitions()));
			state.getVariables().addAll(copier.copyAll(stateMachine.getVariables()));
			copier.copyReferences();
			return state;
		}
		return null;
	}

	private String getEObjectVariableName(EClass eClass) {
		return "this" + eClass.getName();
	}
	public boolean isEObjectVariableName(String name, EObject eObject) {
		String prefix = "this";
		return name.startsWith(prefix) && name.length() > prefix.length();
	}

	private VarDef createEObjectVariable(EObject eObject, EClass eClass) {
		Resource resource = eObject.eResource();
		URI uri = resource.getURI().appendFragment(resource.getURIFragment(eObject));
		return createUriVariable(getEObjectVariableName(eClass), ScxmlxtFactory.eINSTANCE.createEObjectUriLiteral(), uri);
	}

	private VarDef createUriVariable(String name, AbstractUriLiteral uriLiteral, URI uri) {
		VarDef var = ScxmlxtFactory.eINSTANCE.createVarDef();
		var.setName(name);
		uriLiteral.setUri(uri);
		var.setInit(uriLiteral);
		return var;
	}

	private String getStateName(EObject eObject, AbstractState parent) {
		String name = null;
		if (name == null) {
			EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
			if (nameFeature != null) {
				Object nameValue = eObject.eGet(nameFeature);
				if (nameValue != null) {
					name = nameValue.toString();
				}
			}
		}
		if (name == null) {
			name = eObject.eClass().getName();
			EStructuralFeature eContainingFeature = eObject.eContainingFeature();
			if (eContainingFeature != null) {
				name += ".@" + eContainingFeature.getName();
				Object siblingsValue = eObject.eGet(eContainingFeature);
				if (siblingsValue instanceof List<?>) {
					List<?> siblings = (List<?>)siblingsValue;
					if (siblings.size() > 1) {
						name += "." + siblings.indexOf(eObject);
					}
				}
			}
		}
		if (name == null) {
			Resource resource = eObject.eResource();
			if (resource != null) {
				name = resource.getURIFragment(eObject);
			}
		}
		return name;
	}

	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(ScxmlxtPackage.eNS_URI, ScxmlxtPackage.eINSTANCE);

		URI baseUri = URI.createURI(String.valueOf(ScxmlxtGenerator.class.getResource("TestGame.ecore")));
		URI model = URI.createURI("Game1.xmi").resolve(baseUri);

		ScxmlxtGenerator scxmlxtGenerator = new ScxmlxtGenerator(new ResourceSetImpl().getResource(model, true).getContents().get(0), baseUri);
		scxmlxtGenerator.generateScxmlxt();
	}
}
