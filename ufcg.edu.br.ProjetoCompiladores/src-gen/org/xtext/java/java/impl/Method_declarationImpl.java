/**
 */
package org.xtext.java.java.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Method_declaration;
import org.xtext.java.java.Parameter_list;
import org.xtext.java.java.Statement_block;
import org.xtext.java.java.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Method_declarationImpl#getDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Method_declarationImpl extends MinimalEObjectImpl.Container implements Method_declaration
{
  /**
   * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifiers()
   * @generated
   * @ordered
   */
  protected EList<String> modifiers;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter_list parameter;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement_block statement;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Method_declarationImpl()
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
    return JavaPackage.Literals.METHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModifiers()
  {
    if (modifiers == null)
    {
      modifiers = new EDataTypeEList<String>(String.class, this, JavaPackage.METHOD_DECLARATION__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(Parameter_list newParameter, NotificationChain msgs)
  {
    Parameter_list oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(Parameter_list newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__PARAMETER, newParameter, newParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement_block newStatement, NotificationChain msgs)
  {
    Statement_block oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement_block newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.METHOD_DECLARATION__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__STATEMENT, newStatement, newStatement));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.METHOD_DECLARATION__DEBUG, oldDebug, debug));
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
      case JavaPackage.METHOD_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case JavaPackage.METHOD_DECLARATION__PARAMETER:
        return basicSetParameter(null, msgs);
      case JavaPackage.METHOD_DECLARATION__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case JavaPackage.METHOD_DECLARATION__MODIFIERS:
        return getModifiers();
      case JavaPackage.METHOD_DECLARATION__TYPE:
        return getType();
      case JavaPackage.METHOD_DECLARATION__NAME:
        return getName();
      case JavaPackage.METHOD_DECLARATION__PARAMETER:
        return getParameter();
      case JavaPackage.METHOD_DECLARATION__STATEMENT:
        return getStatement();
      case JavaPackage.METHOD_DECLARATION__DEBUG:
        return getDebug();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavaPackage.METHOD_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.METHOD_DECLARATION__TYPE:
        setType((Type)newValue);
        return;
      case JavaPackage.METHOD_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case JavaPackage.METHOD_DECLARATION__PARAMETER:
        setParameter((Parameter_list)newValue);
        return;
      case JavaPackage.METHOD_DECLARATION__STATEMENT:
        setStatement((Statement_block)newValue);
        return;
      case JavaPackage.METHOD_DECLARATION__DEBUG:
        setDebug((String)newValue);
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
      case JavaPackage.METHOD_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case JavaPackage.METHOD_DECLARATION__TYPE:
        setType((Type)null);
        return;
      case JavaPackage.METHOD_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JavaPackage.METHOD_DECLARATION__PARAMETER:
        setParameter((Parameter_list)null);
        return;
      case JavaPackage.METHOD_DECLARATION__STATEMENT:
        setStatement((Statement_block)null);
        return;
      case JavaPackage.METHOD_DECLARATION__DEBUG:
        setDebug(DEBUG_EDEFAULT);
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
      case JavaPackage.METHOD_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case JavaPackage.METHOD_DECLARATION__TYPE:
        return type != null;
      case JavaPackage.METHOD_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JavaPackage.METHOD_DECLARATION__PARAMETER:
        return parameter != null;
      case JavaPackage.METHOD_DECLARATION__STATEMENT:
        return statement != null;
      case JavaPackage.METHOD_DECLARATION__DEBUG:
        return DEBUG_EDEFAULT == null ? debug != null : !DEBUG_EDEFAULT.equals(debug);
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
    result.append(" (modifiers: ");
    result.append(modifiers);
    result.append(", name: ");
    result.append(name);
    result.append(", debug: ");
    result.append(debug);
    result.append(')');
    return result.toString();
  }

} //Method_declarationImpl
