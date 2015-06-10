/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Import_statement#getClassname <em>Classname</em>}</li>
 *   <li>{@link org.xtext.java.java.Import_statement#getPackagename <em>Packagename</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getImport_statement()
 * @model
 * @generated
 */
public interface Import_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see org.xtext.java.java.JavaPackage#getImport_statement_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Import_statement#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

  /**
   * Returns the value of the '<em><b>Packagename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packagename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packagename</em>' attribute.
   * @see #setPackagename(String)
   * @see org.xtext.java.java.JavaPackage#getImport_statement_Packagename()
   * @model
   * @generated
   */
  String getPackagename();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Import_statement#getPackagename <em>Packagename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packagename</em>' attribute.
   * @see #getPackagename()
   * @generated
   */
  void setPackagename(String value);

} // Import_statement
