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
/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpinnerImpl.java,v 1.2 2009/05/07 15:10:40 pwebster Exp $
 */
package org.eclipse.e4.tm.swt.widgets.impl;

import org.eclipse.e4.tm.swt.widgets.Spinner;
import org.eclipse.e4.tm.swt.widgets.WidgetsPackage;
import org.eclipse.e4.tm.widgets.impl.BoundedValueControlImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpinnerImpl extends BoundedValueControlImpl<Integer> implements Spinner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetsPackage.Literals.SPINNER;
	}

} //SpinnerImpl
