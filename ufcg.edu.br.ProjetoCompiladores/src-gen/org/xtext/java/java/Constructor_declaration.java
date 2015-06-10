/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Constructor_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.Constructor_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Constructor_declaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.java.java.Constructor_declaration#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getConstructor_declaration()
 * @model
 * @generated
 */
public interface Constructor_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getConstructor_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.java.java.JavaPackage#getConstructor_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Constructor_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameter_list)
   * @see org.xtext.java.java.JavaPackage#getConstructor_declaration_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameter_list getParameters();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Constructor_declaration#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameter_list value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement_block)
   * @see org.xtext.java.java.JavaPackage#getConstructor_declaration_Statement()
   * @model containment="true"
   * @generated
   */
  Statement_block getStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Constructor_declaration#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement_block value);

} // Constructor_declaration
