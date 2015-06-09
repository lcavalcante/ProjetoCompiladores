/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Static_initializer#getStatic <em>Static</em>}</li>
 *   <li>{@link org.xtext.java.java.Static_initializer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getStatic_initializer()
 * @model
 * @generated
 */
public interface Static_initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(String)
   * @see org.xtext.java.java.JavaPackage#getStatic_initializer_Static()
   * @model
   * @generated
   */
  String getStatic();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Static_initializer#getStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #getStatic()
   * @generated
   */
  void setStatic(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Statement_block)
   * @see org.xtext.java.java.JavaPackage#getStatic_initializer_Name()
   * @model containment="true"
   * @generated
   */
  Statement_block getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Static_initializer#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Statement_block value);

} // Static_initializer
