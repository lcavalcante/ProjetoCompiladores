/**
 */
package org.xtext.java.java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.java.java.Expression#getNumericExpression3 <em>Numeric Expression3</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getAux <em>Aux</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getLogicalExpression <em>Logical Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getBitExpression <em>Bit Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getCastExpression <em>Cast Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getCreatingExpression <em>Creating Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getLiteralExpression <em>Literal Expression</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getNull <em>Null</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getSuper <em>Super</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getThis <em>This</em>}</li>
 *   <li>{@link org.xtext.java.java.Expression#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.java.java.JavaPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Numeric Expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeric Expression3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeric Expression3</em>' containment reference.
   * @see #setNumericExpression3(Numeric_Expression_NR)
   * @see org.xtext.java.java.JavaPackage#getExpression_NumericExpression3()
   * @model containment="true"
   * @generated
   */
  Numeric_Expression_NR getNumericExpression3();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getNumericExpression3 <em>Numeric Expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeric Expression3</em>' containment reference.
   * @see #getNumericExpression3()
   * @generated
   */
  void setNumericExpression3(Numeric_Expression_NR value);

  /**
   * Returns the value of the '<em><b>Aux</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aux</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aux</em>' containment reference.
   * @see #setAux(Expression_aux)
   * @see org.xtext.java.java.JavaPackage#getExpression_Aux()
   * @model containment="true"
   * @generated
   */
  Expression_aux getAux();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getAux <em>Aux</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aux</em>' containment reference.
   * @see #getAux()
   * @generated
   */
  void setAux(Expression_aux value);

  /**
   * Returns the value of the '<em><b>Logical Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical Expression</em>' containment reference.
   * @see #setLogicalExpression(Logical_Expression_NR)
   * @see org.xtext.java.java.JavaPackage#getExpression_LogicalExpression()
   * @model containment="true"
   * @generated
   */
  Logical_Expression_NR getLogicalExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getLogicalExpression <em>Logical Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical Expression</em>' containment reference.
   * @see #getLogicalExpression()
   * @generated
   */
  void setLogicalExpression(Logical_Expression_NR value);

  /**
   * Returns the value of the '<em><b>Bit Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Expression</em>' containment reference.
   * @see #setBitExpression(Bit_Expression_NR)
   * @see org.xtext.java.java.JavaPackage#getExpression_BitExpression()
   * @model containment="true"
   * @generated
   */
  Bit_Expression_NR getBitExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getBitExpression <em>Bit Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Expression</em>' containment reference.
   * @see #getBitExpression()
   * @generated
   */
  void setBitExpression(Bit_Expression_NR value);

  /**
   * Returns the value of the '<em><b>Cast Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast Expression</em>' containment reference.
   * @see #setCastExpression(Cast_Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_CastExpression()
   * @model containment="true"
   * @generated
   */
  Cast_Expression getCastExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getCastExpression <em>Cast Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast Expression</em>' containment reference.
   * @see #getCastExpression()
   * @generated
   */
  void setCastExpression(Cast_Expression value);

  /**
   * Returns the value of the '<em><b>Creating Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creating Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creating Expression</em>' containment reference.
   * @see #setCreatingExpression(Creating_Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_CreatingExpression()
   * @model containment="true"
   * @generated
   */
  Creating_Expression getCreatingExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getCreatingExpression <em>Creating Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creating Expression</em>' containment reference.
   * @see #getCreatingExpression()
   * @generated
   */
  void setCreatingExpression(Creating_Expression value);

  /**
   * Returns the value of the '<em><b>Literal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Expression</em>' containment reference.
   * @see #setLiteralExpression(Literal_Expression)
   * @see org.xtext.java.java.JavaPackage#getExpression_LiteralExpression()
   * @model containment="true"
   * @generated
   */
  Literal_Expression getLiteralExpression();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getLiteralExpression <em>Literal Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Expression</em>' containment reference.
   * @see #getLiteralExpression()
   * @generated
   */
  void setLiteralExpression(Literal_Expression value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' attribute.
   * @see #setSuper(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_Super()
   * @model
   * @generated
   */
  String getSuper();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getSuper <em>Super</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' attribute.
   * @see #getSuper()
   * @generated
   */
  void setSuper(String value);

  /**
   * Returns the value of the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>This</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>This</em>' attribute.
   * @see #setThis(String)
   * @see org.xtext.java.java.JavaPackage#getExpression_This()
   * @model
   * @generated
   */
  String getThis();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getThis <em>This</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>This</em>' attribute.
   * @see #getThis()
   * @generated
   */
  void setThis(String value);

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
   * @see org.xtext.java.java.JavaPackage#getExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.java.java.Expression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Expression
