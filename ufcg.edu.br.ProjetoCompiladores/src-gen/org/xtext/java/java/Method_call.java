/**
 */
package org.xtext.java.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Method_call#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getMethod_call()
 * @model
 * @generated
 */
public interface Method_call extends Return_value
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
   * @see #setParameter(Parameter_list_method_call)
   * @see org.xtext.java.java.JavaPackage#getMethod_call_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter_list_method_call getParameter();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Method_call#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter_list_method_call value);

} // Method_call
