/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Try_statement#getTry <em>Try</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getTryStatement <em>Try Statement</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getCatchs <em>Catchs</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getCatchStatements <em>Catch Statements</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getFinally <em>Finally</em>}</li>
 *   <li>{@link org.xtext.java.java.Try_statement#getFinallyStatement <em>Finally Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getTry_statement()
 * @model
 * @generated
 */
public interface Try_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Try</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try</em>' attribute.
   * @see #setTry(String)
   * @see org.xtext.java.java.JavaPackage#getTry_statement_Try()
   * @model
   * @generated
   */
  String getTry();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Try_statement#getTry <em>Try</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try</em>' attribute.
   * @see #getTry()
   * @generated
   */
  void setTry(String value);

  /**
   * Returns the value of the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try Statement</em>' containment reference.
   * @see #setTryStatement(Statement)
   * @see org.xtext.java.java.JavaPackage#getTry_statement_TryStatement()
   * @model containment="true"
   * @generated
   */
  Statement getTryStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Try_statement#getTryStatement <em>Try Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try Statement</em>' containment reference.
   * @see #getTryStatement()
   * @generated
   */
  void setTryStatement(Statement value);

  /**
   * Returns the value of the '<em><b>Catchs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catchs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catchs</em>' attribute list.
   * @see org.xtext.java.java.JavaPackage#getTry_statement_Catchs()
   * @model unique="false"
   * @generated
   */
  EList<String> getCatchs();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getTry_statement_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Catch Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Statements</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getTry_statement_CatchStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getCatchStatements();

  /**
   * Returns the value of the '<em><b>Finally</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally</em>' attribute.
   * @see #setFinally(String)
   * @see org.xtext.java.java.JavaPackage#getTry_statement_Finally()
   * @model
   * @generated
   */
  String getFinally();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Try_statement#getFinally <em>Finally</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally</em>' attribute.
   * @see #getFinally()
   * @generated
   */
  void setFinally(String value);

  /**
   * Returns the value of the '<em><b>Finally Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally Statement</em>' containment reference.
   * @see #setFinallyStatement(Statement)
   * @see org.xtext.java.java.JavaPackage#getTry_statement_FinallyStatement()
   * @model containment="true"
   * @generated
   */
  Statement getFinallyStatement();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Try_statement#getFinallyStatement <em>Finally Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally Statement</em>' containment reference.
   * @see #getFinallyStatement()
   * @generated
   */
  void setFinallyStatement(Statement value);

} // Try_statement
