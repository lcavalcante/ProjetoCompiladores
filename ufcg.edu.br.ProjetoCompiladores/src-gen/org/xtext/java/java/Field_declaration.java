/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Field_declaration#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.xtext.java.java.Field_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Field_declaration#getDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getField_declaration()
 * @model
 * @generated
 */
public interface Field_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' attribute.
   * @see #setDoc(String)
   * @see org.xtext.java.java.JavaPackage#getField_declaration_Doc()
   * @model
   * @generated
   */
  String getDoc();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Field_declaration#getDoc <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' attribute.
   * @see #getDoc()
   * @generated
   */
  void setDoc(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EObject)
   * @see org.xtext.java.java.JavaPackage#getField_declaration_Name()
   * @model containment="true"
   * @generated
   */
  EObject getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Field_declaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EObject value);

  /**
   * Returns the value of the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' attribute.
   * @see #setDebug(String)
   * @see org.xtext.java.java.JavaPackage#getField_declaration_Debug()
   * @model
   * @generated
   */
  String getDebug();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Field_declaration#getDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #getDebug()
   * @generated
   */
  void setDebug(String value);

} // Field_declaration
