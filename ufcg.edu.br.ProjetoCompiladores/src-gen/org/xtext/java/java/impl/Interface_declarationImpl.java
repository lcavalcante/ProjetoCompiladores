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

import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.Interface_declaration;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Interface_declarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Interface_declarationImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Interface_declarationImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Interface_declarationImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Interface_declarationImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Interface_declarationImpl extends MinimalEObjectImpl.Container implements Interface_declaration
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
   * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceName()
   * @generated
   * @ordered
   */
  protected String interfaceName = INTERFACE_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<String> extends_;

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
  protected Interface_declarationImpl()
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
    return JavaPackage.Literals.INTERFACE_DECLARATION;
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
      modifiers = new EDataTypeEList<String>(String.class, this, JavaPackage.INTERFACE_DECLARATION__MODIFIERS);
    }
    return modifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceName()
  {
    return interfaceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceName(String newInterfaceName)
  {
    String oldInterfaceName = interfaceName;
    interfaceName = newInterfaceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INTERFACE_DECLARATION__INTERFACE_NAME, oldInterfaceName, interfaceName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.INTERFACE_DECLARATION__EXTEND, oldExtend, extend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EDataTypeEList<String>(String.class, this, JavaPackage.INTERFACE_DECLARATION__EXTENDS);
    }
    return extends_;
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
      fields = new EObjectContainmentEList<Field_declaration>(Field_declaration.class, this, JavaPackage.INTERFACE_DECLARATION__FIELDS);
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
      case JavaPackage.INTERFACE_DECLARATION__FIELDS:
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
      case JavaPackage.INTERFACE_DECLARATION__MODIFIERS:
        return getModifiers();
      case JavaPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        return getInterfaceName();
      case JavaPackage.INTERFACE_DECLARATION__EXTEND:
        return getExtend();
      case JavaPackage.INTERFACE_DECLARATION__EXTENDS:
        return getExtends();
      case JavaPackage.INTERFACE_DECLARATION__FIELDS:
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
      case JavaPackage.INTERFACE_DECLARATION__MODIFIERS:
        getModifiers().clear();
        getModifiers().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        setInterfaceName((String)newValue);
        return;
      case JavaPackage.INTERFACE_DECLARATION__EXTEND:
        setExtend((String)newValue);
        return;
      case JavaPackage.INTERFACE_DECLARATION__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends String>)newValue);
        return;
      case JavaPackage.INTERFACE_DECLARATION__FIELDS:
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
      case JavaPackage.INTERFACE_DECLARATION__MODIFIERS:
        getModifiers().clear();
        return;
      case JavaPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        setInterfaceName(INTERFACE_NAME_EDEFAULT);
        return;
      case JavaPackage.INTERFACE_DECLARATION__EXTEND:
        setExtend(EXTEND_EDEFAULT);
        return;
      case JavaPackage.INTERFACE_DECLARATION__EXTENDS:
        getExtends().clear();
        return;
      case JavaPackage.INTERFACE_DECLARATION__FIELDS:
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
      case JavaPackage.INTERFACE_DECLARATION__MODIFIERS:
        return modifiers != null && !modifiers.isEmpty();
      case JavaPackage.INTERFACE_DECLARATION__INTERFACE_NAME:
        return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
      case JavaPackage.INTERFACE_DECLARATION__EXTEND:
        return EXTEND_EDEFAULT == null ? extend != null : !EXTEND_EDEFAULT.equals(extend);
      case JavaPackage.INTERFACE_DECLARATION__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case JavaPackage.INTERFACE_DECLARATION__FIELDS:
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
    result.append(", interfaceName: ");
    result.append(interfaceName);
    result.append(", extend: ");
    result.append(extend);
    result.append(", extends: ");
    result.append(extends_);
    result.append(')');
    return result.toString();
  }

} //Interface_declarationImpl
