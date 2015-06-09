/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.For_Statement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getPv <em>Pv</em>}</li>
 *   <li>{@link org.xtext.java.java.For_Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getFor_Statement()
 * @model
 * @generated
 */
public interface For_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable_declaration)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Variable()
   * @model containment="true"
   * @generated
   */
  Variable_declaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable_declaration value);

  /**
   * Returns the value of the '<em><b>Pv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pv</em>' attribute.
   * @see #setPv(String)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Pv()
   * @model
   * @generated
   */
  String getPv();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getPv <em>Pv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pv</em>' attribute.
   * @see #getPv()
   * @generated
   */
  void setPv(String value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.java.java.JavaPackage#getFor_Statement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.For_Statement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // For_Statement
