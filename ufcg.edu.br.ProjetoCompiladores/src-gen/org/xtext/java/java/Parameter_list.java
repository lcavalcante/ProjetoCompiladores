/**
 */
package org.xtext.java.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Parameter_list#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.java.java.Parameter_list#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getParameter_list()
 * @model
 * @generated
 */
public interface Parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.xtext.java.java.JavaPackage#getParameter_list_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Parameter_list#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

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
   * @see org.xtext.java.java.JavaPackage#getParameter_list_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Parameter_list
