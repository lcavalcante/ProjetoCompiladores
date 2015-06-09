/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.java.java.Switch_Statement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.java.java.JavaPackage#getSwitch_Statement()
 * @model
 * @generated
 */
public interface Switch_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.java.java.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.java.java.JavaPackage#getSwitch_Statement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Switch_Statement
