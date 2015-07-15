package org.xtext.java.validation;

import org.xtext.java.java.Method_declaration;
import org.xtext.java.java.Parameter_list;

public class JavaValidator {
	
	Map<String, Method_declaration> metodosDeclarados = new HashMap<String, Method_declaration>();
	
	private boolean addMetodos(Method_declaration method) {
		String nome = method.getName();
		Method_declaration m = metodosDeclarados.get(nome);
		if (m != null){
			return false;
		} else {
			metodosDeclaras.put(method.getName(), method);
			return true;
		}
	}
	
	private boolean checaMetodos(Method_call method) {
		String nome = method.getName();
		Method_declaration m = metodosDeclarados.get(nome);
		if (m == null) {
			return false;
		} else {
			int parametrosDeclaracao;
			Parameter_list pd = m.getParameter();
			if (pd != null) {
				parametrosDeclaracao = 1;
				parametrosDeclaracao += pd.getParameters().size();
			} else {
				parametrosDeclaracao = 0;
			}
			
			int parametrosChamada;
			Parameter_list_method_call pc = method.getParameter();
			if (pc != null) {
				parametrosChamada = 1;
				parametrosChamada += pc.getParameters().size();
			} else {
				parametrosChamada = 0;
			}
			
			if (parametrosChamada != parametrosDeclaracao) {
				return false;
			}
			return true;
		}
	}

}
