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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.java.java.Class_declaration;
import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getImplement <em>Implement</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Class_declarationImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class_declarationImpl extends MinimalEObjectImpl.Container implements Class_declaration
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
   * The default value of the '{@link #getExtend() <em>Extend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtend()
   * @generated
   * @ordered
   */
  protected static final String EXTEND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtend() <em>Extend</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtend()
   * @generated
   * @ordered
   */
  protected String extend = EXTEND_EDEFAULT;

  /**
   * The default value of the '{@link #getImplement() <em>Implement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplement()
   * @generated
   * @ordered
   */
  protected static final String IMPLEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImplement() <em>Implement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplement()
   * @generated
   * @ordered
   */
  protected String implement = IMPLEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getImplements() <em>Implements</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplements()
   * @generated
   * @ordered
   */
  protected EList<String> implements_;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field_declaration> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Class_declarationImpl()
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
    return JavaPackage.Literals.CLASS_DECLARATION;
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
      modifiers = new EDataTypeEList<String>(String.class, this, JavaPackage.CLASS_DECLARATION__MODIFIERS);
    }
    return modifiers;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS_DECLARATION__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtend()
  {
    return extend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtend(String newExtend)
  {
    String oldExtend = extend;
    extend = newExtend;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS_DECLARATION__EXTEND, oldExtend, extend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImplement()
  {
    return implement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplement(String newImplement)
  {
    String oldImplement = implement;
    implement = newImplement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.CLASS_DECLARATION__IMPLEMENT, oldImplement, implement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getImplements()
  {
    if (implements_ == null)
    {
      implements_ = new EDataTypeEList<String>(String.class, this, JavaPackage.CLASS_DECLARATION__IMPLEMENTS);
    }
    return implements_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field_declaration> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field_declaration>(Field_declaration.class, this, JavaPackage.CLASS_DECLARATION__FIELDS);
    }
    return fields;
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
      case JavaPackage.CLASS_DECLARATION__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case JavaPackage.CLASS_DECLARATION__MODIFIERS:
        return getModifiers();
      case JavaPackage.CLASS_DECLARATION__CLASS_NAME:
        return getClassName();
      case JavaPackage.CLASS_DECLARATION__EXTEND:
        return getExtend();
      case JavaPackage.CLASS_DECLARATION__IMPLEMENT:
        return getImplement();
      case JavaPackage.CLASS_DECLARATION__IMPLEMENTS:
        return getImplements();
      case JavaPackage.CLASS_DECLARATION__FIELDS:
        return getFields();
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
      case JavaPackage.CLASS_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.CLASS_DECLARATION__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case JavaPackage.CLASS_DECLARATION__EXTEND:
        setExtend((String)newValue);
        return;
      case JavaPackage.CLASS_DECLARATION__IMPLEMENT:
        setImplement((String)newValue);
        return;
      case JavaPackage.CLASS_DECLARATION__IMPLEMENTS:
        getImplements().clear();
        getImplements().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.CLASS_DECLARATION__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field_declaration>)newValue);
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
      case JavaPackage.CLASS_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case JavaPackage.CLASS_DECLARATION__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case JavaPackage.CLASS_DECLARATION__EXTEND:
        setExtend(EXTEND_EDEFAULT);
        return;
      case JavaPackage.CLASS_DECLARATION__IMPLEMENT:
        setImplement(IMPLEMENT_EDEFAULT);
        return;
      case JavaPackage.CLASS_DECLARATION__IMPLEMENTS:
        getImplements().clear();
        return;
      case JavaPackage.CLASS_DECLARATION__FIELDS:
        getFields().clear();
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
      case JavaPackage.CLASS_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case JavaPackage.CLASS_DECLARATION__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case JavaPackage.CLASS_DECLARATION__EXTEND:
        return EXTEND_EDEFAULT == null ? extend != null : !EXTEND_EDEFAULT.equals(extend);
      case JavaPackage.CLASS_DECLARATION__IMPLEMENT:
        return IMPLEMENT_EDEFAULT == null ? implement != null : !IMPLEMENT_EDEFAULT.equals(implement);
      case JavaPackage.CLASS_DECLARATION__IMPLEMENTS:
        return implements_ != null && !implements_.isEmpty();
      case JavaPackage.CLASS_DECLARATION__FIELDS:
        return fields != null && !fields.isEmpty();
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
    result.append(", className: ");
    result.append(className);
    result.append(", extend: ");
    result.append(extend);
    result.append(", implement: ");
    result.append(implement);
    result.append(", implements: ");
    result.append(implements_);
    result.append(')');
    return result.toString();
  }

} //Class_declarationImpl
