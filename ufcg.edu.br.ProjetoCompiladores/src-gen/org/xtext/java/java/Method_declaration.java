/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Method_declaration#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.xtext.java.java.Method_declaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.java.java.Method_declaration#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.java.java.Method_declaration#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.java.java.Method_declaration#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Method_declaration#getDebug <em>Debug</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getMethod_declaration()
 * @model
 * @generated
 */
public interface Method_declaration extends EObject
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
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Modifiers()
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
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter_list)
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter_list getParameter();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_declaration#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter_list value);

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
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Statement()
   * @model containment="true"
   * @generated
   */
  Statement_block getStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_declaration#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement_block value);

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
   * @see org.xtext.java.java.JavaPackage#getMethod_declaration_Debug()
   * @model
   * @generated
   */
  String getDebug();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_declaration#getDebug <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug</em>' attribute.
   * @see #getDebug()
   * @generated
   */
  void setDebug(String value);

} // Method_declaration
