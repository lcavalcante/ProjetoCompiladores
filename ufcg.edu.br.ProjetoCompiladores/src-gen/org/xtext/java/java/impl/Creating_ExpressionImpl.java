/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Arg_List;
import org.xtext.java.java.Creating_Expression;
import org.xtext.java.java.Expression;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creating Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Creating_ExpressionImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Creating_ExpressionImpl#getArgList <em>Arg List</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Creating_ExpressionImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Creating_ExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Creating_ExpressionImpl extends MinimalEObjectImpl.Container implements Creating_Expression
{
  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgList() <em>Arg List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgList()
   * @generated
   * @ordered
   */
  protected Arg_List argList;

  /**
   * The default value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected static final String TYPE_SPECIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected String typeSpecifier = TYPE_SPECIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Creating_ExpressionImpl()
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
    return JavaPackage.Literals.CREATING_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg_List getArgList()
  {
    return argList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgList(Arg_List newArgList, NotificationChain msgs)
  {
    Arg_List oldArgList = argList;
    argList = newArgList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__ARG_LIST, oldArgList, newArgList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgList(Arg_List newArgList)
  {
    if (newArgList != argList)
    {
      NotificationChain msgs = null;
      if (argList != null)
        msgs = ((InternalEObject)argList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CREATING_EXPRESSION__ARG_LIST, null, msgs);
      if (newArgList != null)
        msgs = ((InternalEObject)newArgList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CREATING_EXPRESSION__ARG_LIST, null, msgs);
      msgs = basicSetArgList(newArgList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__ARG_LIST, newArgList, newArgList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeSpecifier()
  {
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpecifier(String newTypeSpecifier)
  {
    String oldTypeSpecifier = typeSpecifier;
    typeSpecifier = newTypeSpecifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__TYPE_SPECIFIER, oldTypeSpecifier, typeSpecifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CREATING_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.CREATING_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CREATING_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case JavaPackage.CREATING_EXPRESSION__ARG_LIST:
        return basicSetArgList(null, msgs);
      case JavaPackage.CREATING_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case JavaPackage.CREATING_EXPRESSION__CLASS_NAME:
        return getClassName();
      case JavaPackage.CREATING_EXPRESSION__ARG_LIST:
        return getArgList();
      case JavaPackage.CREATING_EXPRESSION__TYPE_SPECIFIER:
        return getTypeSpecifier();
      case JavaPackage.CREATING_EXPRESSION__EXPRESSION:
        return getExpression();
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
      case JavaPackage.CREATING_EXPRESSION__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case JavaPackage.CREATING_EXPRESSION__ARG_LIST:
        setArgList((Arg_List)newValue);
        return;
      case JavaPackage.CREATING_EXPRESSION__TYPE_SPECIFIER:
        setTypeSpecifier((String)newValue);
        return;
      case JavaPackage.CREATING_EXPRESSION__EXPRESSION:
        setExpression((Expression)newValue);
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
      case JavaPackage.CREATING_EXPRESSION__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case JavaPackage.CREATING_EXPRESSION__ARG_LIST:
        setArgList((Arg_List)null);
        return;
      case JavaPackage.CREATING_EXPRESSION__TYPE_SPECIFIER:
        setTypeSpecifier(TYPE_SPECIFIER_EDEFAULT);
        return;
      case JavaPackage.CREATING_EXPRESSION__EXPRESSION:
        setExpression((Expression)null);
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
      case JavaPackage.CREATING_EXPRESSION__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case JavaPackage.CREATING_EXPRESSION__ARG_LIST:
        return argList != null;
      case JavaPackage.CREATING_EXPRESSION__TYPE_SPECIFIER:
        return TYPE_SPECIFIER_EDEFAULT == null ? typeSpecifier != null : !TYPE_SPECIFIER_EDEFAULT.equals(typeSpecifier);
      case JavaPackage.CREATING_EXPRESSION__EXPRESSION:
        return expression != null;
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
    result.append(" (className: ");
    result.append(className);
    result.append(", typeSpecifier: ");
    result.append(typeSpecifier);
    result.append(')');
    return result.toString();
  }

} //Creating_ExpressionImpl
