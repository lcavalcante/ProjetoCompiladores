package org.xtext.java.validation

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import org.xtext.java.java.Class_declaration
import org.xtext.java.java.Field_declaration
import org.xtext.java.java.JavaPackage
import org.xtext.java.java.Method_call
import org.xtext.java.java.Method_declaration
import org.xtext.java.java.Parameter_list
import org.xtext.java.java.Parameter_list_method_call
import org.xtext.java.java.Return_Statement
import org.xtext.java.java.Statement
import org.xtext.java.java.Variable_declaration
import org.xtext.java.java.Type
import org.xtext.java.java.Type_declaration
import org.xtext.java.java.Variable_declarator
import org.xtext.java.java.Expression
import java.awt.font.NumericShaper.Range
import org.xtext.java.java.Numeric_Expression_NR
import org.xtext.java.java.Literal_Expression
import org.xtext.java.java.Logical_Expression_NR

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class JavaValidator extends AbstractJavaValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	public List<Method_declaration> metodosDeclarados;
	
	public Map<String, Type> tipos;
	
	public Map<String, String> classeExtends = new HashMap<String, String>();
	
	@Check 
	def populaClasses(Type_declaration td) {
		if (td.name instanceof Class_declaration) {
			var Class_declaration cd = td.name as Class_declaration;
			classeExtends.put(cd.className, cd.extend);
			classeExtends.put(cd.className, cd.implement);
		}
	}
	
	@Check 
	def runChecks(Class_declaration cd) {
		metodosDeclarados = new ArrayList<Method_declaration>();
		tipos = new HashMap<String, Type>();
		for (Field_declaration fd : cd.fields) {
			if (fd.name instanceof Method_declaration) {
				addMetodos(fd.name as Method_declaration);
			}
			addTipos(fd, tipos);
		}
	}
	
	def addMetodos(Method_declaration method) {
		metodosDeclarados.add(method);
	}
	
	@Check
	def verificaExistenciaDeMetodo(Method_call method) {
		var Parameter_list_method_call pc = method.getParameter();
		var int parametrosChamada;
		if (pc != null) {
			parametrosChamada = 1;
			parametrosChamada += pc.getParameters().size();
		} else {
			parametrosChamada = 0;
		}
		var boolean existeMetodo = false;
		var boolean mesmaQuantidadeDeParametros = false;
		for (Method_declaration m : metodosDeclarados) {
			if (m.name == method.name) {
				existeMetodo = true;
				if (verificaQuantidadeDeParametros(m, parametrosChamada)) {
					mesmaQuantidadeDeParametros = true;
				}
			}
		}
		if (!existeMetodo) {
			error("O método ainda não foi declarado", method, JavaPackage.Literals.METHOD_CALL__PARAMETER)
			return;
		}
		if(!mesmaQuantidadeDeParametros) {
			error("Números de parâmetros incorreto", method, JavaPackage.Literals.METHOD_CALL__PARAMETER);
			return;
		}
	}
	
	def verificaQuantidadeDeParametros(Method_declaration method, int parametrosChamada) {
		var Parameter_list pd = method.getParameter();
		var int parametrosDeclaracao;
		if (pd != null) {
			parametrosDeclaracao = 1;
			parametrosDeclaracao += pd.getParameters().size();
		} else {
			parametrosDeclaracao = 0;
		}
		return parametrosDeclaracao == parametrosChamada;
	}
	
	@Check
	def checaRetornoDosMetodos(Method_declaration md) {
		var EList<Statement> statements = md.statement.statements;
		var Map<String, Type> tiposMetodo = new HashMap<String, Type>();
		var boolean temReturn = false;
		for (Statement smt : statements) {
			addTiposMetodo(smt, tiposMetodo);
			if (smt.returnSmt instanceof Return_Statement) {
				temReturn = true;
				if (md.type.name.toString == "void") {
					if (smt.returnSmt.rv.name != null) {
						error("Métodos void não devem retornar nada", smt.returnSmt, JavaPackage.Literals.RETURN_STATEMENT__RV);
					}
				} else {
					if (smt.returnSmt.rv == null) {
						error("O método deve retornar " + md.type.name.toString, smt.returnSmt, JavaPackage.Literals.RETURN_STATEMENT__RV);
					}
					var retorno = tipos.get(smt.returnSmt.rv.name.toString);
					var retorno2 = tiposMetodo.get(smt.returnSmt.rv.name.toString);
					if (retorno == null && retorno2 == null) {
						error("A variável de retorno ainda não foi declarada", smt.returnSmt, JavaPackage.Literals.RETURN_STATEMENT__RV);
					} else if ((retorno == null && retorno2.name.toString != md.type.name.toString)
						|| (retorno2 == null && retorno.name.toString != md.type.name.toString)
					) {
						error("O tipo do retorno e o tipo do método são diferentes", smt.returnSmt, JavaPackage.Literals.RETURN_STATEMENT__RV);
					} else if (retorno2 != null && retorno != null
						&& retorno2.name.toString != md.type.name.toString
						&& retorno.name.toString != md.type.name.toString
					) {
						error("O tipo do retorno e o tipo do método são diferentes", smt.returnSmt, JavaPackage.Literals.RETURN_STATEMENT__RV);
					}
				}	 
			}
		}
		if (!temReturn && md.type.name.toString != "void") {
			error("O método deve retornar " + md.type.name.toString, md, JavaPackage.Literals.METHOD_DECLARATION__NAME);
		}
	} 

	def addTipos(Field_declaration fd, Map<String, Type> tipos) {
		if (fd.name instanceof Variable_declaration) {
			var Variable_declaration vd = fd.name as Variable_declaration;
			var Type nome = tipos.get(vd.name.name.toString);
			if (nome != null) {
				error("Já existe uma variável com o mesmo identificador", vd, JavaPackage.Literals.VARIABLE_DECLARATION__NAME);
			} else {
				tipos.put(vd.name.name.toString, vd.type);	
				checarTiposVariaveis(vd.name, tipos);			
			}
		} else if (fd.name instanceof Method_declaration) {
			var Method_declaration md = fd.name as Method_declaration;
			tipos.put(md.name.toString, md.type);
		} 
	}
	
	def addTiposMetodo(Statement smt, Map<String, Type> tipos) {
		if (smt.variable instanceof Variable_declaration) {
			var Variable_declaration v = smt.variable as Variable_declaration;
			var Type nome = tipos.get(v.name.name.toString);
			if (nome != null) {
				error("Já existe uma variável com o mesmo identificador", smt.variable, JavaPackage.Literals.VARIABLE_DECLARATION__NAME);
			}
			tipos.put(v.name.name.toString, v.type);
			checarTiposVariaveis(smt.variable.name, tipos);
		} 
	}
	
	def checarTiposVariaveis(Variable_declarator vd, Map<String, Type> tipos) {
		var Type tipo = tipos.get(vd.name.toString);
		if (vd.initializer != null
			&& vd.initializer.expression != null
		) {
			if (vd.initializer.expression.literalExpression instanceof Literal_Expression) {
				if (tipo.name.toString == "String" && vd.initializer.expression.literalExpression.string == null) {
					error("O valor da variável não casa com seu tipo", vd, JavaPackage.Literals.VARIABLE_DECLARATOR__NAME);
				} else if (tipo.name.toString == "int" && vd.initializer.expression.literalExpression.string != null) {
					error("O valor da variável não casa com seu tipo", vd, JavaPackage.Literals.VARIABLE_DECLARATOR__NAME);
				}
			} 
			if (!(vd.initializer.expression.logicalExpression instanceof Logical_Expression_NR)) {
				if (tipo.name.toString == "boolean") {
					error("O valor da variável não casa com seu tipo", vd, JavaPackage.Literals.VARIABLE_DECLARATOR__NAME);
				}
			}
		}
	}	
}
