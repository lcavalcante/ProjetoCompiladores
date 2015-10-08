/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Variable_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.Variable_declaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.java.java.Variable_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Variable_declaration#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getVariable_declaration()
 * @model
 * @generated
 */
public interface Variable_declaration extends EObject
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
   * @see org.xtext.java.java.JavaPackage#getVariable_declaration_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.java.java.JavaPackage#getVariable_declaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Variable_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Variable_declarator)
   * @see org.xtext.java.java.JavaPackage#getVariable_declaration_Name()
   * @model containment="true"
   * @generated
   */
  Variable_declarator getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Variable_declaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable_declarator value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Variable_declarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getVariable_declaration_Names()
   * @model containment="true"
   * @generated
   */
  EList<Variable_declarator> getNames();

} // Variable_declaration
