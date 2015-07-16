package org.xtext.java.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.xtext.java.java.Class_declaration;
import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Method_call;
import org.xtext.java.java.Method_declaration;
import org.xtext.java.java.Parameter;
import org.xtext.java.java.Parameter_list;
import org.xtext.java.java.Parameter_list_method_call;
import org.xtext.java.validation.AbstractJavaValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class JavaValidator extends AbstractJavaValidator {
  public List<Method_declaration> metodosDeclarados;
  
  @Check
  public void runChecks(final Class_declaration cd) {
    ArrayList<Method_declaration> _arrayList = new ArrayList<Method_declaration>();
    this.metodosDeclarados = _arrayList;
    EList<Field_declaration> _fields = cd.getFields();
    for (final Field_declaration fd : _fields) {
      EObject _name = fd.getName();
      if ((_name instanceof Method_declaration)) {
        EObject _name_1 = fd.getName();
        this.addMetodos(((Method_declaration) _name_1));
      }
    }
  }
  
  public boolean addMetodos(final Method_declaration method) {
    return this.metodosDeclarados.add(method);
  }
  
  @Check
  public void verificaExistenciaDeMetodo(final Method_call method) {
    Parameter_list_method_call pc = method.getParameter();
    int parametrosChamada = 0;
    boolean _notEquals = (!Objects.equal(pc, null));
    if (_notEquals) {
      parametrosChamada = 1;
      int _parametrosChamada = parametrosChamada;
      EList<String> _parameters = pc.getParameters();
      int _size = _parameters.size();
      parametrosChamada = (_parametrosChamada + _size);
    } else {
      parametrosChamada = 0;
    }
    boolean existeMetodo = false;
    boolean mesmaQuantidadeDeParametros = false;
    for (final Method_declaration m : this.metodosDeclarados) {
      String _name = m.getName();
      String _name_1 = method.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        existeMetodo = true;
        boolean _verificaQuantidadeDeParametros = this.verificaQuantidadeDeParametros(m, parametrosChamada);
        if (_verificaQuantidadeDeParametros) {
          mesmaQuantidadeDeParametros = true;
        }
      }
    }
    if ((!existeMetodo)) {
      this.error("O método ainda não foi declarado", JavaPackage.Literals.METHOD_CALL__NAME);
      return;
    }
    if ((!mesmaQuantidadeDeParametros)) {
      this.error("Números de parâmetros incorreto", JavaPackage.Literals.METHOD_CALL__PARAMETER);
      return;
    }
  }
  
  public boolean verificaQuantidadeDeParametros(final Method_declaration method, final int parametrosChamada) {
    Parameter_list pd = method.getParameter();
    int parametrosDeclaracao = 0;
    boolean _notEquals = (!Objects.equal(pd, null));
    if (_notEquals) {
      parametrosDeclaracao = 1;
      int _parametrosDeclaracao = parametrosDeclaracao;
      EList<Parameter> _parameters = pd.getParameters();
      int _size = _parameters.size();
      parametrosDeclaracao = (_parametrosDeclaracao + _size);
    } else {
      parametrosDeclaracao = 0;
    }
    return (parametrosDeclaracao == parametrosChamada);
  }
}
