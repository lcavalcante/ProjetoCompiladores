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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.java.java.Compilation_unit;
import org.xtext.java.java.Import_statement;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Package_statement;
import org.xtext.java.java.Type_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Compilation_unitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Compilation_unitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Compilation_unitImpl#getType_declarations <em>Type declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Compilation_unitImpl extends MinimalEObjectImpl.Container implements Compilation_unit
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected Package_statement package_;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import_statement> imports;

  /**
   * The cached value of the '{@link #getType_declarations() <em>Type declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_declarations()
   * @generated
   * @ordered
   */
  protected EList<Type_declaration> type_declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Compilation_unitImpl()
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
    return JavaPackage.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Package_statement getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(Package_statement newPackage, NotificationChain msgs)
  {
    Package_statement oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(Package_statement newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaPackage.COMPILATION_UNIT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.COMPILATION_UNIT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import_statement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import_statement>(Import_statement.class, this, JavaPackage.COMPILATION_UNIT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type_declaration> getType_declarations()
  {
    if (type_declarations == null)
    {
      type_declarations = new EObjectContainmentEList<Type_declaration>(Type_declaration.class, this, JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS);
    }
    return type_declarations;
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
      case JavaPackage.COMPILATION_UNIT__PACKAGE:
        return basicSetPackage(null, msgs);
      case JavaPackage.COMPILATION_UNIT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return ((InternalEList<?>)getType_declarations()).basicRemove(otherEnd, msgs);
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
      case JavaPackage.COMPILATION_UNIT__PACKAGE:
        return getPackage();
      case JavaPackage.COMPILATION_UNIT__IMPORTS:
        return getImports();
      case JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return getType_declarations();
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
      case JavaPackage.COMPILATION_UNIT__PACKAGE:
        setPackage((Package_statement)newValue);
        return;
      case JavaPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import_statement>)newValue);
        return;
      case JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getType_declarations().clear();
        getType_declarations().addAll((Collection<? extends Type_declaration>)newValue);
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
      case JavaPackage.COMPILATION_UNIT__PACKAGE:
        setPackage((Package_statement)null);
        return;
      case JavaPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        return;
      case JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getType_declarations().clear();
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
      case JavaPackage.COMPILATION_UNIT__PACKAGE:
        return package_ != null;
      case JavaPackage.COMPILATION_UNIT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case JavaPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return type_declarations != null && !type_declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Compilation_unitImpl
