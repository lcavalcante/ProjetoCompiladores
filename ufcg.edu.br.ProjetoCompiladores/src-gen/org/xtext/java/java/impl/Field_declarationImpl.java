/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Variable_declarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Field_declarationImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Field_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Field_declarationImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Field_declarationImpl#getVariableDeclarator <em>Variable Declarator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Field_declarationImpl extends MinimalEObjectImpl.Container implements Field_declaration
{
  /**
   * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected static final String DOC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoc()
   * @generated
   * @ordered
   */
  protected String doc = DOC_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EObject name;

  /**
   * The default value of the '{@link #getDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected static final String DEBUG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected String debug = DEBUG_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariableDeclarator() <em>Variable Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarator()
   * @generated
   * @ordered
   */
  protected Variable_declarator variableDeclarator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Field_declarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JavaPackage.Literals.FIELD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoc()
  {
    return doc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoc(String newDoc)
  {
    String oldDoc = doc;
    doc = newDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__DOC, oldDoc, doc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(EObject newName, NotificationChain msgs)
  {
    EObject oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(EObject newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(String newDebug)
  {
    String oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__DEBUG, oldDebug, debug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declarator getVariableDeclarator()
  {
    return variableDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclarator(Variable_declarator newVariableDeclarator, NotificationChain msgs)
  {
    Variable_declarator oldVariableDeclarator = variableDeclarator;
    variableDeclarator = newVariableDeclarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR, oldVariableDeclarator, newVariableDeclarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclarator(Variable_declarator newVariableDeclarator)
  {
    if (newVariableDeclarator != variableDeclarator)
    {
      NotificationChain msgs = null;
      if (variableDeclarator != null)
        msgs = ((InternalEObject)variableDeclarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR, null, msgs);
      if (newVariableDeclarator != null)
        msgs = ((InternalEObject)newVariableDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR, null, msgs);
      msgs = basicSetVariableDeclarator(newVariableDeclarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR, newVariableDeclarator, newVariableDeclarator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JavaPackage.FIELD_DECLARATION__NAME:
        return basicSetName(null, msgs);
      case JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR:
        return basicSetVariableDeclarator(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JavaPackage.FIELD_DECLARATION__DOC:
        return getDoc();
      case JavaPackage.FIELD_DECLARATION__NAME:
        return getName();
      case JavaPackage.FIELD_DECLARATION__DEBUG:
        return getDebug();
      case JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR:
        return getVariableDeclarator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaPackage.FIELD_DECLARATION__DOC:
        setDoc((String)newValue);
        return;
      case JavaPackage.FIELD_DECLARATION__NAME:
        setName((EObject)newValue);
        return;
      case JavaPackage.FIELD_DECLARATION__DEBUG:
        setDebug((String)newValue);
        return;
      case JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR:
        setVariableDeclarator((Variable_declarator)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JavaPackage.FIELD_DECLARATION__DOC:
        setDoc(DOC_EDEFAULT);
        return;
      case JavaPackage.FIELD_DECLARATION__NAME:
        setName((EObject)null);
        return;
      case JavaPackage.FIELD_DECLARATION__DEBUG:
        setDebug(DEBUG_EDEFAULT);
        return;
      case JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR:
        setVariableDeclarator((Variable_declarator)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JavaPackage.FIELD_DECLARATION__DOC:
        return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
      case JavaPackage.FIELD_DECLARATION__NAME:
        return name != null;
      case JavaPackage.FIELD_DECLARATION__DEBUG:
        return DEBUG_EDEFAULT == null ? debug != null : !DEBUG_EDEFAULT.equals(debug);
      case JavaPackage.FIELD_DECLARATION__VARIABLE_DECLARATOR:
        return variableDeclarator != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (doc: ");
    result.append(doc);
    result.append(", debug: ");
    result.append(debug);
    result.append(')');
    return result.toString();
  }

} //Field_declarationImpl
