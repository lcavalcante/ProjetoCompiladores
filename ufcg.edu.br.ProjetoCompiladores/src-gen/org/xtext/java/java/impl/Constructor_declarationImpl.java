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

import org.xtext.java.java.Constructor_declaration;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Parameter_list;
import org.xtext.java.java.Statement_block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Constructor_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Constructor_declarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Constructor_declarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Constructor_declarationImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Constructor_declarationImpl extends MinimalEObjectImpl.Container implements Constructor_declaration
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected Parameter_list parameters;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Constructor_declarationImpl()
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
    return JavaPackage.Literals.CONSTRUCTOR_DECLARATION;
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
      modifiers = new EDataTypeEList<String>(String.class, this, JavaPackage.CONSTRUCTOR_DECLARATION__MODIFIERS);
    }
    return modifiers;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONSTRUCTOR_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(Parameter_list newParameters, NotificationChain msgs)
  {
    Parameter_list oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(Parameter_list newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS, newParameters, newParameters));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT, oldStatement, newStatement);
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
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT, newStatement, newStatement));
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
      case JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS:
        return basicSetParameters(null, msgs);
      case JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT:
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
      case JavaPackage.CONSTRUCTOR_DECLARATION__MODIFIERS:
        return getModifiers();
      case JavaPackage.CONSTRUCTOR_DECLARATION__NAME:
        return getName();
      case JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS:
        return getParameters();
      case JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT:
        return getStatement();
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
      case JavaPackage.CONSTRUCTOR_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS:
        setParameters((Parameter_list)newValue);
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT:
        setStatement((Statement_block)newValue);
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
      case JavaPackage.CONSTRUCTOR_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS:
        setParameters((Parameter_list)null);
        return;
      case JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT:
        setStatement((Statement_block)null);
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
      case JavaPackage.CONSTRUCTOR_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case JavaPackage.CONSTRUCTOR_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JavaPackage.CONSTRUCTOR_DECLARATION__PARAMETERS:
        return parameters != null;
      case JavaPackage.CONSTRUCTOR_DECLARATION__STATEMENT:
        return statement != null;
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
    result.append(')');
    return result.toString();
  }

} //Constructor_declarationImpl
