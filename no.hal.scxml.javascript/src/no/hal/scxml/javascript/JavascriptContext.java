/*******************************************************************************
 * Copyright (c) 2008 Hallvard Trætteberg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hallvard Trætteberg - initial API and implementation
 ******************************************************************************/
package no.hal.scxml.javascript;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.scxml.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class JavascriptContext extends ScriptableObject implements Context {

	public String getClassName() {
		return "SCXMLContext";
	}

	public JavascriptContext(JavascriptContext parentScope) {
		setParentScope(parentScope);
	}

	//

	private Map<String, Object> vars = null;

	public void reset() {
		vars = null;
	}

	public Map getVars() {
		return (vars == null ? Collections.EMPTY_MAP : vars);
	}

	//

	public Context getParent() {
		Scriptable parentScope = getParentScope();
		return parentScope instanceof JavascriptContext ? (JavascriptContext)parentScope : null;
	}

	private boolean hasLocal(String name) {
		return (vars != null && vars.containsKey(name));
	}
	public boolean has(String name) {
		if (hasLocal(name)) {
			return true;
		}
		return (getParent() != null && getParent().has(name));
	}

	public Object get(String name) {
		if (hasLocal(name)) {
			return vars.get(name);
		}
		return (getParent() != null ? getParent().get(name) : null);
	}

	public void set(String name, Object value) {
		if (hasLocal(name)) {
			setLocal(name, value);
		} else if (getParent() != null) {
			getParent().set(name, value);
		}
	}

	protected Object wrap(Object value) {
		return value;
	}
	
	public void setLocal(String name, Object value) {
		if (vars == null) {
			vars = new HashMap<String, Object>();
		}
		vars.put(name, value);
		super.put(name, this, wrap(value));
	}
	
	public void put(String name, Scriptable start, Object value) {
		if (hasLocal(name)) {
			setLocal(name, value);
		} else {
			super.put(name, start, wrap(value));
		}
	}
}
