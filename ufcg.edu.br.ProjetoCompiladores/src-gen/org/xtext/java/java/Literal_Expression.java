/**
 */
package org.xtext.java.java;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Literal_Expression#getExp <em>Exp</em>}</li>
 *   <li>{@link org.xtext.java.java.Literal_Expression#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link org.xtext.java.java.Literal_Expression#getExp2 <em>Exp2</em>}</li>
 *   <li>{@link org.xtext.java.java.Literal_Expression#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.java.java.Literal_Expression#getChar <em>Char</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getLiteral_Expression()
 * @model
 * @generated
 */
public interface Literal_Expression extends Return_value
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute.
   * @see #setExp(String)
   * @see org.xtext.java.java.JavaPackage#getLiteral_Expression_Exp()
   * @model
   * @generated
   */
  String getExp();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Literal_Expression#getExp <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' attribute.
   * @see #getExp()
   * @generated
   */
  void setExp(String value);

  /**
   * Returns the value of the '<em><b>Exp1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp1</em>' attribute.
   * @see #setExp1(int)
   * @see org.xtext.java.java.JavaPackage#getLiteral_Expression_Exp1()
   * @model
   * @generated
   */
  int getExp1();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Literal_Expression#getExp1 <em>Exp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp1</em>' attribute.
   * @see #getExp1()
   * @generated
   */
  void setExp1(int value);

  /**
   * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp2</em>' containment reference.
   * @see #setExp2(Float_Literal)
   * @see org.xtext.java.java.JavaPackage#getLiteral_Expression_Exp2()
   * @model containment="true"
   * @generated
   */
  Float_Literal getExp2();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Literal_Expression#getExp2 <em>Exp2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp2</em>' containment reference.
   * @see #getExp2()
   * @generated
   */
  void setExp2(Float_Literal value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.java.java.JavaPackage#getLiteral_Expression_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Literal_Expression#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Char</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Char</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Char</em>' attribute.
   * @see #setChar(String)
   * @see org.xtext.java.java.JavaPackage#getLiteral_Expression_Char()
   * @model
   * @generated
   */
  String getChar();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Literal_Expression#getChar <em>Char</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Char</em>' attribute.
   * @see #getChar()
   * @generated
   */
  void setChar(String value);

} // Literal_Expression
