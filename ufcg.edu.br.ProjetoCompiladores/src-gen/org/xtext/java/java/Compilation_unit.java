/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Compilation_unit#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.java.java.Compilation_unit#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.java.java.Compilation_unit#getType_declarations <em>Type declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getCompilation_unit()
 * @model
 * @generated
 */
public interface Compilation_unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(Package_statement)
   * @see org.xtext.java.java.JavaPackage#getCompilation_unit_Package()
   * @model containment="true"
   * @generated
   */
  Package_statement getPackage();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Compilation_unit#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(Package_statement value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Import_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getCompilation_unit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import_statement> getImports();

  /**
   * Returns the value of the '<em><b>Type declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Type_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type declarations</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getCompilation_unit_Type_declarations()
   * @model containment="true"
   * @generated
   */
  EList<Type_declaration> getType_declarations();

} // Compilation_unit
