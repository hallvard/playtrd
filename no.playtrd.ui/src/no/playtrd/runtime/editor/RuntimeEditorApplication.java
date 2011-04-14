/*******************************************************************************
 * Copyright (c) 2008 Hallvard Traetteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Traetteberg - initial API and implementation
 ******************************************************************************/
package no.playtrd.runtime.editor;

import java.util.List;

import no.hal.scxml.scxmlxt.util.ScxmlxtAdapterFactory;
import no.playtrd.runtime.AbstractRuntime;
import no.playtrd.runtime.Runtime;
import no.playtrd.v10.playtrd.Game;

import org.eclipse.core.runtime.Status;
import org.eclipse.e4.tm.ui.EditorPartModelContext;
import org.eclipse.e4.tm.ui.ModelContext;
import org.eclipse.e4.tm.ui.TmPartStyle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;

public class RuntimeEditorApplication extends EcoreEditor {

	private Runtime runtime;
	
	private Runtime getRuntime() {
		if (runtime == null) {
			runtime = new Runtime(this);
		}
		return runtime;
	}
	
	private TmPartStyle partStyle;

	protected Composite createPageContainer(Composite parent) {
		partStyle = new TmPartStyle.SashStyle();
		partStyle.createPageContainer(parent);
		partStyle.addTmComposite(getRuntime());
		return partStyle.getTreeParent();
	}

	protected void initializeEditingDomain() {
		super.initializeEditingDomain();
	}

	public void createPages() {

		getRuntime();

		super.createPages();

		adapterFactory.insertAdapterFactory(new ScxmlxtAdapterFactory());

		selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider.FontProvider(adapterFactory, selectionViewer));

		loadToolkitModel();
		
//		selectionViewer.setLabelProvider(new TmLabelProvider((ILabelProvider)selectionViewer.getLabelProvider()));
		//		((Control)model).setDataObject(resource.getContents().get(0));
		
		getContainer().getDisplay().asyncExec(new Runnable() {
			public void run() {
				getRuntime().start();
			}
		});
	}
	
	private Game<?> game;
	
	public Game<?> getGame() {
		if (game == null && getEditingDomain() != null) {
			game = AbstractRuntime.getEObject(editingDomain.getResourceSet(), Game.class, Status.OK);
		}
		return game;
	}
	
	public void dispose() {
		if (runtime != null) {
			getRuntime().stop();
		}
		super.dispose();
	}

	private EditorPartModelContext modelContext;

	protected ModelContext getModelContext() {
		if (modelContext == null) {
			modelContext = new EditorPartModelContext(this);
		}
		return modelContext;
	}

	public Object getAdapter(@SuppressWarnings("rawtypes") Class key) {
		if (key.equals(EditingDomain.class)) {
			return getEditingDomain();
		} else if (key.equals(URIConverter.class)) {
			return getEditingDomain().getResourceSet().getURIConverter();
		} else if (key.equals(Game.class)) {
			return getGame();
		} else if (key.equals(ResourceSet.class)) {
			return getEditingDomain().getResourceSet();
		} else if (key.equals(Composite.class)) {
			return getContainer();
		} else if (IEditorInput.class.isAssignableFrom(key) && key.isInstance(getEditorInput())) {
			return getEditorInput();
		} else if (key.equals(TmPartStyle.class)) {
			return partStyle;
		} else if (key.equals(ModelContext.class)) {
			return getModelContext();
		}
		Object o = getRuntime().getAdapter(key);
		if (o != null) {
			return o;
		}
		return super.getAdapter(key);
	}

	public final static String TM_FILE_EXTENSION = "tm";

	private void loadToolkitModel() {
		ResourceSet resSet = getEditingDomain().getResourceSet();
		List<Resource> resources = resSet.getResources();
		Resource tmResource = null;
		for (Resource res: resources.toArray(new Resource[resources.size()])) {
			URI uri = res.getURI();
			URI tmUri = uri.trimFileExtension().appendFileExtension(TM_FILE_EXTENSION);
			if (resSet.getURIConverter().exists(tmUri, null)) {
				try {
					tmResource = resSet.getResource(tmUri, true);
					break;
				} catch (RuntimeException re) {
				}
			}
		}
		System.out.println("Loaded " + tmResource);
	}
}
