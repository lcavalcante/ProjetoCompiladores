package org.xtext.java.validation

import java.util.ArrayList
import java.util.List
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
	
	@Check 
	def runChecks(Class_declaration cd) {
		metodosDeclarados = new ArrayList<Method_declaration>();
		for (Field_declaration fd : cd.fields) {
			if (fd.name instanceof Method_declaration) {
				addMetodos(fd.name as Method_declaration);
//			} else if (fd.name instanceof Method_call) {
//				verificaExistenciaDeMetodo(fd.name as Method_call);
			}
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
			error("O método ainda não foi declarado", JavaPackage.Literals.METHOD_CALL__NAME);
			return;
		}
		if(!mesmaQuantidadeDeParametros) {
			error("Números de parâmetros incorreto", JavaPackage.Literals.METHOD_CALL__PARAMETER);
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
		for (Statement smt : statements) {
			if (smt instanceof Return_Statement) {
				if (md.type.name.toString == "void") {
					error("@@@@@@@@@@@@@@@" + smt.toString +" ************ " + smt.value, null);
					if (smt.value != null) {
						error("Métodos void não deve retornar nada", JavaPackage.Literals.METHOD_DECLARATION__NAME);
					}
				}	 
			}
		}
	} 
}
