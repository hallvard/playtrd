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
 * $Id: Control.java,v 1.4 2009/10/23 12:40:31 htraetteb Exp $
 */
package org.eclipse.e4.tm.widgets;

import org.eclipse.e4.tm.layouts.LayoutData;
import org.eclipse.e4.tm.styles.Styled;
import org.eclipse.e4.tm.util.ObjectData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.tm.widgets.Control#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.widgets.Control#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.widgets.Control#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.widgets.Control#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link org.eclipse.e4.tm.widgets.Control#getToolTip <em>Tool Tip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/e4/swt.ecore access='property'"
 * @generated
 */
public interface Control extends ObjectData, Styled {
	/**
	 * Returns the value of the '<em><b>Composite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.e4.tm.widgets.AbstractComposite#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' container reference.
	 * @see #setComposite(AbstractComposite)
	 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl_Composite()
	 * @see org.eclipse.e4.tm.widgets.AbstractComposite#getControls
	 * @model opposite="controls" resolveProxies="false" transient="false"
	 * @generated
	 */
	AbstractComposite<Control> getComposite();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.widgets.Control#getComposite <em>Composite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' container reference.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(AbstractComposite<Control> value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl_Enabled()
	 * @model default="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.widgets.Control#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.widgets.Control#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Data</em>' containment reference.
	 * @see #setLayoutData(LayoutData)
	 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl_LayoutData()
	 * @model containment="true"
	 * @generated
	 */
	LayoutData getLayoutData();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.widgets.Control#getLayoutData <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Data</em>' containment reference.
	 * @see #getLayoutData()
	 * @generated
	 */
	void setLayoutData(LayoutData value);

	/**
	 * Returns the value of the '<em><b>Tool Tip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Tip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Tip</em>' attribute.
	 * @see #setToolTip(String)
	 * @see org.eclipse.e4.tm.widgets.WidgetsPackage#getControl_ToolTip()
	 * @model annotation="http://www.eclipse.org/e4/swt.ecore realName='toolTipText'"
	 * @generated
	 */
	String getToolTip();

	/**
	 * Sets the value of the '{@link org.eclipse.e4.tm.widgets.Control#getToolTip <em>Tool Tip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Tip</em>' attribute.
	 * @see #getToolTip()
	 * @generated
	 */
	void setToolTip(String value);

} // Control
