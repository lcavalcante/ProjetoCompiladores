/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Return_Statement#getRv <em>Rv</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getReturn_Statement()
 * @model
 * @generated
 */
public interface Return_Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Rv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rv</em>' containment reference.
   * @see #setRv(Return_value)
   * @see org.xtext.java.java.JavaPackage#getReturn_Statement_Rv()
   * @model containment="true"
   * @generated
   */
  Return_value getRv();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Return_Statement#getRv <em>Rv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rv</em>' containment reference.
   * @see #getRv()
   * @generated
   */
  void setRv(Return_value value);

} // Return_Statement
