/**
 */
package org.xtext.java.java.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.java.java.Import_statement;
import org.xtext.java.java.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.impl.Import_statementImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.java.java.impl.Import_statementImpl#getPackagename <em>Packagename</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Import_statementImpl extends MinimalEObjectImpl.Container implements Import_statement
{
  /**
   * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected static final String CLASSNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected String classname = CLASSNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagename()
   * @generated
   * @ordered
   */
  protected static final String PACKAGENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackagename() <em>Packagename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackagename()
   * @generated
   * @ordered
   */
  protected String packagename = PACKAGENAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Import_statementImpl()
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
    return JavaPackage.Literals.IMPORT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(String newClassname)
  {
    String oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.IMPORT_STATEMENT__CLASSNAME, oldClassname, classname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackagename()
  {
    return packagename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackagename(String newPackagename)
  {
    String oldPackagename = packagename;
    packagename = newPackagename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavaPackage.IMPORT_STATEMENT__PACKAGENAME, oldPackagename, packagename));
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
      case JavaPackage.IMPORT_STATEMENT__CLASSNAME:
        return getClassname();
      case JavaPackage.IMPORT_STATEMENT__PACKAGENAME:
        return getPackagename();
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
      case JavaPackage.IMPORT_STATEMENT__CLASSNAME:
        setClassname((String)newValue);
        return;
      case JavaPackage.IMPORT_STATEMENT__PACKAGENAME:
        setPackagename((String)newValue);
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
      case JavaPackage.IMPORT_STATEMENT__CLASSNAME:
        setClassname(CLASSNAME_EDEFAULT);
        return;
      case JavaPackage.IMPORT_STATEMENT__PACKAGENAME:
        setPackagename(PACKAGENAME_EDEFAULT);
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
      case JavaPackage.IMPORT_STATEMENT__CLASSNAME:
        return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
      case JavaPackage.IMPORT_STATEMENT__PACKAGENAME:
        return PACKAGENAME_EDEFAULT == null ? packagename != null : !PACKAGENAME_EDEFAULT.equals(packagename);
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
    result.append(" (classname: ");
    result.append(classname);
    result.append(", packagename: ");
    result.append(packagename);
    result.append(')');
    return result.toString();
  }

} //Import_statementImpl
