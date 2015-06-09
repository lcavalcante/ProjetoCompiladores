package org.xtext.java.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.java.services.JavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC_COMMENT", "RULE_MODIFIER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "';'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "'static'", "':'", "'break'", "'continue'", "'package'", "'.'", "'import'", "'.*;;'"
    };
    public static final int RULE_MODIFIER=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_DOC_COMMENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaParser.tokenNames; }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g"; }


     
     	private JavaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JavaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleHead"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:60:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:61:1: ( ruleHead EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:62:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead61);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:69:1: ruleHead : ( ( rule__Head__ElementsAssignment ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:73:2: ( ( ( rule__Head__ElementsAssignment ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:74:1: ( ( rule__Head__ElementsAssignment ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:74:1: ( ( rule__Head__ElementsAssignment ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:75:1: ( rule__Head__ElementsAssignment )
            {
             before(grammarAccess.getHeadAccess().getElementsAssignment()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:76:1: ( rule__Head__ElementsAssignment )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:76:2: rule__Head__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Head__ElementsAssignment_in_ruleHead94);
            rule__Head__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:88:1: entryRuleCompilation_unit : ruleCompilation_unit EOF ;
    public final void entryRuleCompilation_unit() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:89:1: ( ruleCompilation_unit EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:90:1: ruleCompilation_unit EOF
            {
             before(grammarAccess.getCompilation_unitRule()); 
            pushFollow(FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit121);
            ruleCompilation_unit();

            state._fsp--;

             after(grammarAccess.getCompilation_unitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompilation_unit128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompilation_unit"


    // $ANTLR start "ruleCompilation_unit"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:97:1: ruleCompilation_unit : ( ( rule__Compilation_unit__Group__0 ) ) ;
    public final void ruleCompilation_unit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:101:2: ( ( ( rule__Compilation_unit__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:102:1: ( ( rule__Compilation_unit__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:102:1: ( ( rule__Compilation_unit__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:103:1: ( rule__Compilation_unit__Group__0 )
            {
             before(grammarAccess.getCompilation_unitAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:104:1: ( rule__Compilation_unit__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:104:2: rule__Compilation_unit__Group__0
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit154);
            rule__Compilation_unit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompilation_unitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompilation_unit"


    // $ANTLR start "entryRuleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:116:1: entryRuleType_declaration : ruleType_declaration EOF ;
    public final void entryRuleType_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:117:1: ( ruleType_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:118:1: ruleType_declaration EOF
            {
             before(grammarAccess.getType_declarationRule()); 
            pushFollow(FOLLOW_ruleType_declaration_in_entryRuleType_declaration181);
            ruleType_declaration();

            state._fsp--;

             after(grammarAccess.getType_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_declaration188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_declaration"


    // $ANTLR start "ruleType_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:125:1: ruleType_declaration : ( ( rule__Type_declaration__Group__0 ) ) ;
    public final void ruleType_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:129:2: ( ( ( rule__Type_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:130:1: ( ( rule__Type_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:130:1: ( ( rule__Type_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:131:1: ( rule__Type_declaration__Group__0 )
            {
             before(grammarAccess.getType_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:132:1: ( rule__Type_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:132:2: rule__Type_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration214);
            rule__Type_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_declaration"


    // $ANTLR start "entryRuleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:144:1: entryRuleInterface_declaration : ruleInterface_declaration EOF ;
    public final void entryRuleInterface_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:145:1: ( ruleInterface_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:146:1: ruleInterface_declaration EOF
            {
             before(grammarAccess.getInterface_declarationRule()); 
            pushFollow(FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration241);
            ruleInterface_declaration();

            state._fsp--;

             after(grammarAccess.getInterface_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_declaration248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface_declaration"


    // $ANTLR start "ruleInterface_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:153:1: ruleInterface_declaration : ( ( rule__Interface_declaration__Group__0 ) ) ;
    public final void ruleInterface_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:157:2: ( ( ( rule__Interface_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:158:1: ( ( rule__Interface_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:158:1: ( ( rule__Interface_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:159:1: ( rule__Interface_declaration__Group__0 )
            {
             before(grammarAccess.getInterface_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:160:1: ( rule__Interface_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:160:2: rule__Interface_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration274);
            rule__Interface_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterface_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface_declaration"


    // $ANTLR start "entryRuleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:172:1: entryRuleClass_declaration : ruleClass_declaration EOF ;
    public final void entryRuleClass_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:173:1: ( ruleClass_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:174:1: ruleClass_declaration EOF
            {
             before(grammarAccess.getClass_declarationRule()); 
            pushFollow(FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration301);
            ruleClass_declaration();

            state._fsp--;

             after(grammarAccess.getClass_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_declaration308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass_declaration"


    // $ANTLR start "ruleClass_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:181:1: ruleClass_declaration : ( ( rule__Class_declaration__Group__0 ) ) ;
    public final void ruleClass_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:185:2: ( ( ( rule__Class_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:186:1: ( ( rule__Class_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:186:1: ( ( rule__Class_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:187:1: ( rule__Class_declaration__Group__0 )
            {
             before(grammarAccess.getClass_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:188:1: ( rule__Class_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:188:2: rule__Class_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration334);
            rule__Class_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClass_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass_declaration"


    // $ANTLR start "entryRuleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:200:1: entryRuleField_declaration : ruleField_declaration EOF ;
    public final void entryRuleField_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:201:1: ( ruleField_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:202:1: ruleField_declaration EOF
            {
             before(grammarAccess.getField_declarationRule()); 
            pushFollow(FOLLOW_ruleField_declaration_in_entryRuleField_declaration361);
            ruleField_declaration();

            state._fsp--;

             after(grammarAccess.getField_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_declaration368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField_declaration"


    // $ANTLR start "ruleField_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:209:1: ruleField_declaration : ( ( rule__Field_declaration__Alternatives ) ) ;
    public final void ruleField_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:213:2: ( ( ( rule__Field_declaration__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:214:1: ( ( rule__Field_declaration__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:214:1: ( ( rule__Field_declaration__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:215:1: ( rule__Field_declaration__Alternatives )
            {
             before(grammarAccess.getField_declarationAccess().getAlternatives()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:216:1: ( rule__Field_declaration__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:216:2: rule__Field_declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration394);
            rule__Field_declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getField_declarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField_declaration"


    // $ANTLR start "entryRuleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:228:1: entryRuleMethod_declaration : ruleMethod_declaration EOF ;
    public final void entryRuleMethod_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:229:1: ( ruleMethod_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:230:1: ruleMethod_declaration EOF
            {
             before(grammarAccess.getMethod_declarationRule()); 
            pushFollow(FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration421);
            ruleMethod_declaration();

            state._fsp--;

             after(grammarAccess.getMethod_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod_declaration428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod_declaration"


    // $ANTLR start "ruleMethod_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:237:1: ruleMethod_declaration : ( ( rule__Method_declaration__Group__0 ) ) ;
    public final void ruleMethod_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:241:2: ( ( ( rule__Method_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:242:1: ( ( rule__Method_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:242:1: ( ( rule__Method_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:243:1: ( rule__Method_declaration__Group__0 )
            {
             before(grammarAccess.getMethod_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:244:1: ( rule__Method_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:244:2: rule__Method_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration454);
            rule__Method_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethod_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod_declaration"


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:256:1: entryRuleConstructor_declaration : ruleConstructor_declaration EOF ;
    public final void entryRuleConstructor_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:257:1: ( ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:258:1: ruleConstructor_declaration EOF
            {
             before(grammarAccess.getConstructor_declarationRule()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration481);
            ruleConstructor_declaration();

            state._fsp--;

             after(grammarAccess.getConstructor_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor_declaration"


    // $ANTLR start "ruleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:265:1: ruleConstructor_declaration : ( ( rule__Constructor_declaration__Group__0 ) ) ;
    public final void ruleConstructor_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:269:2: ( ( ( rule__Constructor_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:270:1: ( ( rule__Constructor_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:270:1: ( ( rule__Constructor_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:271:1: ( rule__Constructor_declaration__Group__0 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:272:1: ( rule__Constructor_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:272:2: rule__Constructor_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration514);
            rule__Constructor_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructor_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor_declaration"


    // $ANTLR start "entryRuleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:284:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:285:1: ( ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:286:1: ruleParameter_list EOF
            {
             before(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list541);
            ruleParameter_list();

            state._fsp--;

             after(grammarAccess.getParameter_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter_list"


    // $ANTLR start "ruleParameter_list"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:293:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:297:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:298:1: ( ( rule__Parameter_list__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:298:1: ( ( rule__Parameter_list__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:299:1: ( rule__Parameter_list__Group__0 )
            {
             before(grammarAccess.getParameter_listAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:300:1: ( rule__Parameter_list__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:300:2: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list574);
            rule__Parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter_list"


    // $ANTLR start "entryRuleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:312:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:313:1: ( ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:314:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter601);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:321:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:325:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:326:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:326:1: ( ( rule__Parameter__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:327:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:328:1: ( rule__Parameter__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:328:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter634);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:340:1: entryRuleVariable_declaration : ruleVariable_declaration EOF ;
    public final void entryRuleVariable_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:341:1: ( ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:342:1: ruleVariable_declaration EOF
            {
             before(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration661);
            ruleVariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable_declaration"


    // $ANTLR start "ruleVariable_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:349:1: ruleVariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void ruleVariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:353:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:354:1: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:354:1: ( ( rule__Variable_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:355:1: ( rule__Variable_declaration__Group__0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:356:1: ( rule__Variable_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:356:2: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration694);
            rule__Variable_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_declaration"


    // $ANTLR start "entryRuleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:368:1: entryRuleVariable_declarator : ruleVariable_declarator EOF ;
    public final void entryRuleVariable_declarator() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:369:1: ( ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:370:1: ruleVariable_declarator EOF
            {
             before(grammarAccess.getVariable_declaratorRule()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator721);
            ruleVariable_declarator();

            state._fsp--;

             after(grammarAccess.getVariable_declaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable_declarator"


    // $ANTLR start "ruleVariable_declarator"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:377:1: ruleVariable_declarator : ( ( rule__Variable_declarator__Group__0 ) ) ;
    public final void ruleVariable_declarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:381:2: ( ( ( rule__Variable_declarator__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:382:1: ( ( rule__Variable_declarator__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:382:1: ( ( rule__Variable_declarator__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:383:1: ( rule__Variable_declarator__Group__0 )
            {
             before(grammarAccess.getVariable_declaratorAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:384:1: ( rule__Variable_declarator__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:384:2: rule__Variable_declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator754);
            rule__Variable_declarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable_declarator"


    // $ANTLR start "entryRuleType"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:396:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:397:1: ( ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:398:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType781);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:405:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:409:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:410:1: ( ( rule__Type__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:410:1: ( ( rule__Type__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:411:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:412:1: ( rule__Type__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:412:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType814);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:424:1: entryRuleType_specifier : ruleType_specifier EOF ;
    public final void entryRuleType_specifier() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:425:1: ( ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:426:1: ruleType_specifier EOF
            {
             before(grammarAccess.getType_specifierRule()); 
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier841);
            ruleType_specifier();

            state._fsp--;

             after(grammarAccess.getType_specifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType_specifier"


    // $ANTLR start "ruleType_specifier"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:433:1: ruleType_specifier : ( ( rule__Type_specifier__Alternatives ) ) ;
    public final void ruleType_specifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:437:2: ( ( ( rule__Type_specifier__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:438:1: ( ( rule__Type_specifier__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:438:1: ( ( rule__Type_specifier__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:439:1: ( rule__Type_specifier__Alternatives )
            {
             before(grammarAccess.getType_specifierAccess().getAlternatives()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:440:1: ( rule__Type_specifier__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:440:2: rule__Type_specifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier874);
            rule__Type_specifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getType_specifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_specifier"


    // $ANTLR start "entryRuleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:452:1: entryRuleStatic_initializer : ruleStatic_initializer EOF ;
    public final void entryRuleStatic_initializer() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:453:1: ( ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:454:1: ruleStatic_initializer EOF
            {
             before(grammarAccess.getStatic_initializerRule()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer901);
            ruleStatic_initializer();

            state._fsp--;

             after(grammarAccess.getStatic_initializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatic_initializer"


    // $ANTLR start "ruleStatic_initializer"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:461:1: ruleStatic_initializer : ( ( rule__Static_initializer__Group__0 ) ) ;
    public final void ruleStatic_initializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:465:2: ( ( ( rule__Static_initializer__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:466:1: ( ( rule__Static_initializer__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:466:1: ( ( rule__Static_initializer__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:467:1: ( rule__Static_initializer__Group__0 )
            {
             before(grammarAccess.getStatic_initializerAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:468:1: ( rule__Static_initializer__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:468:2: rule__Static_initializer__Group__0
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer934);
            rule__Static_initializer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatic_initializerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatic_initializer"


    // $ANTLR start "entryRuleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:480:1: entryRuleStatement_block : ruleStatement_block EOF ;
    public final void entryRuleStatement_block() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:481:1: ( ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:482:1: ruleStatement_block EOF
            {
             before(grammarAccess.getStatement_blockRule()); 
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block961);
            ruleStatement_block();

            state._fsp--;

             after(grammarAccess.getStatement_blockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement_block"


    // $ANTLR start "ruleStatement_block"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:489:1: ruleStatement_block : ( ( rule__Statement_block__Group__0 ) ) ;
    public final void ruleStatement_block() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:493:2: ( ( ( rule__Statement_block__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:494:1: ( ( rule__Statement_block__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:494:1: ( ( rule__Statement_block__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:495:1: ( rule__Statement_block__Group__0 )
            {
             before(grammarAccess.getStatement_blockAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:496:1: ( rule__Statement_block__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:496:2: rule__Statement_block__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block994);
            rule__Statement_block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_blockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement_block"


    // $ANTLR start "entryRuleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:508:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:509:1: ( ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:510:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement1021);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:517:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:521:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:522:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:522:1: ( ( rule__Statement__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:523:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:524:1: ( rule__Statement__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:524:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement1054);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:536:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:537:1: ( rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:538:1: rulePackage_statement EOF
            {
             before(grammarAccess.getPackage_statementRule()); 
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1081);
            rulePackage_statement();

            state._fsp--;

             after(grammarAccess.getPackage_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_statement"


    // $ANTLR start "rulePackage_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:545:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:549:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:550:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:550:1: ( ( rule__Package_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:551:1: ( rule__Package_statement__Group__0 )
            {
             before(grammarAccess.getPackage_statementAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:552:1: ( rule__Package_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:552:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1114);
            rule__Package_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackage_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_statement"


    // $ANTLR start "entryRulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:564:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:565:1: ( rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:566:1: rulePackage_name EOF
            {
             before(grammarAccess.getPackage_nameRule()); 
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1141);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getPackage_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_name"


    // $ANTLR start "rulePackage_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:573:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:577:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:578:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:578:1: ( ( rule__Package_name__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:579:1: ( rule__Package_name__Group__0 )
            {
             before(grammarAccess.getPackage_nameAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:580:1: ( rule__Package_name__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:580:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1174);
            rule__Package_name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackage_nameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_name"


    // $ANTLR start "entryRulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:592:1: entryRulePackage_name_aux : rulePackage_name_aux EOF ;
    public final void entryRulePackage_name_aux() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:593:1: ( rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:594:1: rulePackage_name_aux EOF
            {
             before(grammarAccess.getPackage_name_auxRule()); 
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1201);
            rulePackage_name_aux();

            state._fsp--;

             after(grammarAccess.getPackage_name_auxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage_name_aux"


    // $ANTLR start "rulePackage_name_aux"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:601:1: rulePackage_name_aux : ( ( rule__Package_name_aux__Group__0 )* ) ;
    public final void rulePackage_name_aux() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:605:2: ( ( ( rule__Package_name_aux__Group__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:606:1: ( ( rule__Package_name_aux__Group__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:606:1: ( ( rule__Package_name_aux__Group__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:607:1: ( rule__Package_name_aux__Group__0 )*
            {
             before(grammarAccess.getPackage_name_auxAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:608:1: ( rule__Package_name_aux__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:608:2: rule__Package_name_aux__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1234);
            	    rule__Package_name_aux__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPackage_name_auxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage_name_aux"


    // $ANTLR start "entryRuleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:620:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:621:1: ( ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:622:1: ruleImport_statement EOF
            {
             before(grammarAccess.getImport_statementRule()); 
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1262);
            ruleImport_statement();

            state._fsp--;

             after(grammarAccess.getImport_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport_statement"


    // $ANTLR start "ruleImport_statement"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:629:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:633:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:634:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:634:1: ( ( rule__Import_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:635:1: ( rule__Import_statement__Group__0 )
            {
             before(grammarAccess.getImport_statementAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:636:1: ( rule__Import_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:636:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1295);
            rule__Import_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImport_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport_statement"


    // $ANTLR start "entryRuleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:648:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:649:1: ( ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:650:1: ruleClass_name EOF
            {
             before(grammarAccess.getClass_nameRule()); 
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1322);
            ruleClass_name();

            state._fsp--;

             after(grammarAccess.getClass_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass_name"


    // $ANTLR start "ruleClass_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:657:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:661:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:662:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:662:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:663:1: rulePackage_name
            {
             before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1355);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass_name"


    // $ANTLR start "entryRuleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:676:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:677:1: ( ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:678:1: ruleInterface_name EOF
            {
             before(grammarAccess.getInterface_nameRule()); 
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1381);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getInterface_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface_name"


    // $ANTLR start "ruleInterface_name"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:685:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:689:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:690:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:690:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:691:1: rulePackage_name
            {
             before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1414);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface_name"


    // $ANTLR start "rule__Type_declaration__Alternatives_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:704:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:708:1: ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:709:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:709:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:710:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:711:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:711:2: rule__Type_declaration__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11449);
                    rule__Type_declaration__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:715:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:715:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:716:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getType_declarationAccess().getNameAssignment_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:717:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:717:2: rule__Type_declaration__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11467);
                    rule__Type_declaration__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_declarationAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Alternatives_1"


    // $ANTLR start "rule__Field_declaration__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:726:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:730:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_DOC_COMMENT:
            case RULE_MODIFIER:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:731:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:731:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:732:1: ( rule__Field_declaration__Group_0__0 )
                    {
                     before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:733:1: ( rule__Field_declaration__Group_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:733:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1500);
                    rule__Field_declaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:737:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:737:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:738:1: ( rule__Field_declaration__NameAssignment_1 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:739:1: ( rule__Field_declaration__NameAssignment_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:739:2: rule__Field_declaration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1518);
                    rule__Field_declaration__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:743:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:743:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:744:1: ( rule__Field_declaration__DebugAssignment_2 )
                    {
                     before(grammarAccess.getField_declarationAccess().getDebugAssignment_2()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:745:1: ( rule__Field_declaration__DebugAssignment_2 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:745:2: rule__Field_declaration__DebugAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1536);
                    rule__Field_declaration__DebugAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getDebugAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Alternatives"


    // $ANTLR start "rule__Field_declaration__Alternatives_0_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:754:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:758:1: ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:759:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:759:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:760:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:761:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:761:2: rule__Field_declaration__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11569);
                    rule__Field_declaration__NameAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:765:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:765:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:766:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:767:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:767:2: rule__Field_declaration__NameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11587);
                    rule__Field_declaration__NameAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:771:6: ( ( rule__Field_declaration__NameAssignment_0_1_2 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:771:6: ( ( rule__Field_declaration__NameAssignment_0_1_2 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:772:1: ( rule__Field_declaration__NameAssignment_0_1_2 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_2()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:773:1: ( rule__Field_declaration__NameAssignment_0_1_2 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:773:2: rule__Field_declaration__NameAssignment_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11605);
                    rule__Field_declaration__NameAssignment_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Alternatives_0_1"


    // $ANTLR start "rule__Method_declaration__Alternatives_7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:782:1: rule__Method_declaration__Alternatives_7 : ( ( ( rule__Method_declaration__StatementAssignment_7_0 ) ) | ( ( rule__Method_declaration__DebugAssignment_7_1 ) ) );
    public final void rule__Method_declaration__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:786:1: ( ( ( rule__Method_declaration__StatementAssignment_7_0 ) ) | ( ( rule__Method_declaration__DebugAssignment_7_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:787:1: ( ( rule__Method_declaration__StatementAssignment_7_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:787:1: ( ( rule__Method_declaration__StatementAssignment_7_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:788:1: ( rule__Method_declaration__StatementAssignment_7_0 )
                    {
                     before(grammarAccess.getMethod_declarationAccess().getStatementAssignment_7_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:789:1: ( rule__Method_declaration__StatementAssignment_7_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:789:2: rule__Method_declaration__StatementAssignment_7_0
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__StatementAssignment_7_0_in_rule__Method_declaration__Alternatives_71638);
                    rule__Method_declaration__StatementAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethod_declarationAccess().getStatementAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:793:6: ( ( rule__Method_declaration__DebugAssignment_7_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:793:6: ( ( rule__Method_declaration__DebugAssignment_7_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:794:1: ( rule__Method_declaration__DebugAssignment_7_1 )
                    {
                     before(grammarAccess.getMethod_declarationAccess().getDebugAssignment_7_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:795:1: ( rule__Method_declaration__DebugAssignment_7_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:795:2: rule__Method_declaration__DebugAssignment_7_1
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__DebugAssignment_7_1_in_rule__Method_declaration__Alternatives_71656);
                    rule__Method_declaration__DebugAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethod_declarationAccess().getDebugAssignment_7_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Alternatives_7"


    // $ANTLR start "rule__Type_specifier__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:804:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:808:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case RULE_ID:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:809:1: ( 'boolean' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:809:1: ( 'boolean' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:810:1: 'boolean'
                    {
                     before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Type_specifier__Alternatives1690); 
                     after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:817:6: ( 'byte' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:817:6: ( 'byte' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:818:1: 'byte'
                    {
                     before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Type_specifier__Alternatives1710); 
                     after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:825:6: ( 'char' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:825:6: ( 'char' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:826:1: 'char'
                    {
                     before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Type_specifier__Alternatives1730); 
                     after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:833:6: ( 'short' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:833:6: ( 'short' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:834:1: 'short'
                    {
                     before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Type_specifier__Alternatives1750); 
                     after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:841:6: ( 'int' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:841:6: ( 'int' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:842:1: 'int'
                    {
                     before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives1770); 
                     after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:849:6: ( 'float' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:849:6: ( 'float' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:850:1: 'float'
                    {
                     before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives1790); 
                     after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:857:6: ( 'long' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:857:6: ( 'long' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:858:1: 'long'
                    {
                     before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives1810); 
                     after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:865:6: ( 'double' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:865:6: ( 'double' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:866:1: 'double'
                    {
                     before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives1830); 
                     after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:873:6: ( ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:873:6: ( ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:874:1: ruleClass_name
                    {
                     before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1849);
                    ruleClass_name();

                    state._fsp--;

                     after(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_specifier__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:884:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:888:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:889:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:889:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:890:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:891:1: ( rule__Statement__Group_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:891:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1881);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:895:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:895:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:896:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:897:1: ( rule__Statement__Group_1__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:897:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1899);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:901:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:901:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:902:1: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:903:1: ( rule__Statement__Group_2__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:903:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1917);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:907:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:907:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:908:1: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:909:1: ( rule__Statement__Group_3__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:909:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1935);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Import_statement__Alternatives_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:918:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:922:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:923:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:923:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:924:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                     before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:925:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:925:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_11968);
                    rule__Import_statement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImport_statementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:929:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:929:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:930:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                     before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:931:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:931:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_11986);
                    rule__Import_statement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImport_statementAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Alternatives_1"


    // $ANTLR start "rule__Compilation_unit__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:942:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:946:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:947:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02017);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02020);
            rule__Compilation_unit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__0"


    // $ANTLR start "rule__Compilation_unit__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:954:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__PackageAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:958:1: ( ( ( rule__Compilation_unit__PackageAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:959:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:959:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:960:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            {
             before(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:961:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:961:2: rule__Compilation_unit__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl2047);
                    rule__Compilation_unit__PackageAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__0__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:971:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:975:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:976:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12078);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12081);
            rule__Compilation_unit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__1"


    // $ANTLR start "rule__Compilation_unit__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:983:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:987:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:988:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:988:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:989:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
             before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:990:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:990:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2108);
            	    rule__Compilation_unit__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__1__Impl"


    // $ANTLR start "rule__Compilation_unit__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1000:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1004:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1005:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22139);
            rule__Compilation_unit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__2"


    // $ANTLR start "rule__Compilation_unit__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1011:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1015:1: ( ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1016:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1016:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1017:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            {
             before(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1018:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_DOC_COMMENT && LA11_0<=RULE_MODIFIER)||LA11_0==20||LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1018:2: rule__Compilation_unit__Type_declarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2166);
            	    rule__Compilation_unit__Type_declarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Group__2__Impl"


    // $ANTLR start "rule__Type_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1034:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1038:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1039:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02203);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02206);
            rule__Type_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__0"


    // $ANTLR start "rule__Type_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1046:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__DocAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1050:1: ( ( ( rule__Type_declaration__DocAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1051:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1051:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1052:1: ( rule__Type_declaration__DocAssignment_0 )?
            {
             before(grammarAccess.getType_declarationAccess().getDocAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1053:1: ( rule__Type_declaration__DocAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1053:2: rule__Type_declaration__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2233);
                    rule__Type_declaration__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getType_declarationAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__0__Impl"


    // $ANTLR start "rule__Type_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1063:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1067:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1068:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12264);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12267);
            rule__Type_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__1"


    // $ANTLR start "rule__Type_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1075:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1079:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1080:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1080:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1081:1: ( rule__Type_declaration__Alternatives_1 )
            {
             before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1082:1: ( rule__Type_declaration__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1082:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2294);
            rule__Type_declaration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getType_declarationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__1__Impl"


    // $ANTLR start "rule__Type_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1092:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1096:1: ( rule__Type_declaration__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1097:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22324);
            rule__Type_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__2"


    // $ANTLR start "rule__Type_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1103:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1107:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1108:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1108:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1109:1: ';'
            {
             before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Type_declaration__Group__2__Impl2352); 
             after(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1128:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1132:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1133:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02389);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02392);
            rule__Interface_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__0"


    // $ANTLR start "rule__Interface_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1140:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1144:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1145:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1145:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1146:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1147:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_MODIFIER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1147:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2419);
            	    rule__Interface_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1157:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1161:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1162:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12450);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12453);
            rule__Interface_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__1"


    // $ANTLR start "rule__Interface_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1169:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1173:1: ( ( 'interface' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1174:1: ( 'interface' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1174:1: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1175:1: 'interface'
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2481); 
             after(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1188:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1192:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1193:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22512);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22515);
            rule__Interface_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__2"


    // $ANTLR start "rule__Interface_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1200:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1204:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1205:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1205:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1206:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1207:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1207:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2542);
            rule__Interface_declaration__InterfaceNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1217:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1221:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1222:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32572);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32575);
            rule__Interface_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__3"


    // $ANTLR start "rule__Interface_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1229:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1233:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1234:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1234:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1235:1: ( rule__Interface_declaration__Group_3__0 )?
            {
             before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1236:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1236:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2602);
                    rule__Interface_declaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterface_declarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__3__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1246:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1250:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1251:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42633);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42636);
            rule__Interface_declaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__4"


    // $ANTLR start "rule__Interface_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1258:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1262:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1263:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1263:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1264:1: '{'
            {
             before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl2664); 
             after(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__4__Impl"


    // $ANTLR start "rule__Interface_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1277:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1281:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1282:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52695);
            rule__Interface_declaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__5"


    // $ANTLR start "rule__Interface_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1288:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1292:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1293:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1293:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1294:1: '}'
            {
             before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl2723); 
             after(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group__5__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1319:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1323:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1324:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02766);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02769);
            rule__Interface_declaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__0"


    // $ANTLR start "rule__Interface_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1331:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1335:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1336:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1336:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1337:1: 'extends'
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl2797); 
             after(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1350:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1354:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1355:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__12828);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__12831);
            rule__Interface_declaration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__1"


    // $ANTLR start "rule__Interface_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1362:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1366:1: ( ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1367:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1367:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1368:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1369:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1369:2: rule__Interface_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl2858);
            rule__Interface_declaration__ExtendAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1379:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1383:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1384:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__22888);
            rule__Interface_declaration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__2"


    // $ANTLR start "rule__Interface_declaration__Group_3__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1390:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1394:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1395:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1395:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1396:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
             before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1397:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1397:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl2915);
            	    rule__Interface_declaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3__2__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1413:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1417:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1418:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__02952);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__02955);
            rule__Interface_declaration__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1425:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1429:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1430:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1430:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1431:1: ','
            {
             before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl2983); 
             after(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1444:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1448:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1449:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13014);
            rule__Interface_declaration__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1"


    // $ANTLR start "rule__Interface_declaration__Group_3_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1455:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1459:1: ( ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1460:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1460:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1461:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1462:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1462:2: rule__Interface_declaration__ExtendsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3041);
            rule__Interface_declaration__ExtendsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1476:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1480:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1481:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03075);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03078);
            rule__Class_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__0"


    // $ANTLR start "rule__Class_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1488:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1492:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1493:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1493:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1494:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1495:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MODIFIER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1495:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3105);
            	    rule__Class_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1505:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1509:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1510:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13136);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13139);
            rule__Class_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__1"


    // $ANTLR start "rule__Class_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1517:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1521:1: ( ( 'class' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1522:1: ( 'class' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1522:1: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1523:1: 'class'
            {
             before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3167); 
             after(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1536:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1540:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1541:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23198);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23201);
            rule__Class_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__2"


    // $ANTLR start "rule__Class_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1548:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1552:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1553:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1553:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1554:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1555:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1555:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3228);
            rule__Class_declaration__ClassNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1565:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1569:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1570:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33258);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33261);
            rule__Class_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__3"


    // $ANTLR start "rule__Class_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1577:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1581:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1582:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1582:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1583:1: ( rule__Class_declaration__Group_3__0 )?
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:1: ( rule__Class_declaration__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3288);
                    rule__Class_declaration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_declarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__3__Impl"


    // $ANTLR start "rule__Class_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1594:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1598:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1599:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43319);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43322);
            rule__Class_declaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__4"


    // $ANTLR start "rule__Class_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1606:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1610:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1611:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1611:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1612:1: ( rule__Class_declaration__Group_4__0 )?
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1613:1: ( rule__Class_declaration__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1613:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3349);
                    rule__Class_declaration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClass_declarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__4__Impl"


    // $ANTLR start "rule__Class_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1623:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1627:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1628:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53380);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53383);
            rule__Class_declaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__5"


    // $ANTLR start "rule__Class_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1635:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1639:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1640:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1640:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1641:1: '{'
            {
             before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3411); 
             after(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__5__Impl"


    // $ANTLR start "rule__Class_declaration__Group__6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1654:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1658:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1659:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63442);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63445);
            rule__Class_declaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__6"


    // $ANTLR start "rule__Class_declaration__Group__6__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1666:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1670:1: ( ( ( rule__Class_declaration__FieldsAssignment_6 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1671:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1671:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1672:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            {
             before(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1673:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_MODIFIER)||(LA19_0>=11 && LA19_0<=19)||LA19_0==30) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1673:2: rule__Class_declaration__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3472);
            	    rule__Class_declaration__FieldsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__6__Impl"


    // $ANTLR start "rule__Class_declaration__Group__7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1683:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1687:1: ( rule__Class_declaration__Group__7__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1688:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73503);
            rule__Class_declaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__7"


    // $ANTLR start "rule__Class_declaration__Group__7__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1694:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1698:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1699:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1699:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1700:1: '}'
            {
             before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3531); 
             after(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group__7__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1729:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1733:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1734:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03578);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03581);
            rule__Class_declaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__0"


    // $ANTLR start "rule__Class_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1741:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1745:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1746:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1746:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1747:1: 'extends'
            {
             before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl3609); 
             after(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1760:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1764:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1765:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13640);
            rule__Class_declaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__1"


    // $ANTLR start "rule__Class_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1771:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1775:1: ( ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1776:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1776:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1777:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1778:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1778:2: rule__Class_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3667);
            rule__Class_declaration__ExtendAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1792:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1796:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1797:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03701);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03704);
            rule__Class_declaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__0"


    // $ANTLR start "rule__Class_declaration__Group_4__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1804:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1808:1: ( ( 'implements' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1809:1: ( 'implements' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1809:1: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1810:1: 'implements'
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl3732); 
             after(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1823:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1827:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1828:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13763);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13766);
            rule__Class_declaration__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__1"


    // $ANTLR start "rule__Class_declaration__Group_4__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1835:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1839:1: ( ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1840:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1840:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1841:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1842:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1842:2: rule__Class_declaration__ImplementAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl3793);
            rule__Class_declaration__ImplementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__1__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1852:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1856:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1857:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__23823);
            rule__Class_declaration__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__2"


    // $ANTLR start "rule__Class_declaration__Group_4__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1863:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1867:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1868:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1868:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1869:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1870:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1870:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl3850);
            	    rule__Class_declaration__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4__2__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1886:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1890:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1891:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__03887);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__03890);
            rule__Class_declaration__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__0"


    // $ANTLR start "rule__Class_declaration__Group_4_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1898:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1902:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1903:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1903:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1904:1: ','
            {
             before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl3918); 
             after(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__0__Impl"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1917:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1921:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1922:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__13949);
            rule__Class_declaration__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__1"


    // $ANTLR start "rule__Class_declaration__Group_4_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1928:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1932:1: ( ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1933:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1933:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1934:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1935:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1935:2: rule__Class_declaration__ImplementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl3976);
            rule__Class_declaration__ImplementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__Group_4_2__1__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1949:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1953:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1954:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04010);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04013);
            rule__Field_declaration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__0"


    // $ANTLR start "rule__Field_declaration__Group_0__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1961:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__DocAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1965:1: ( ( ( rule__Field_declaration__DocAssignment_0_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1966:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1966:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1967:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            {
             before(grammarAccess.getField_declarationAccess().getDocAssignment_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1968:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOC_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1968:2: rule__Field_declaration__DocAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4040);
                    rule__Field_declaration__DocAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getField_declarationAccess().getDocAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__0__Impl"


    // $ANTLR start "rule__Field_declaration__Group_0__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1978:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1982:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1983:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14071);
            rule__Field_declaration__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__1"


    // $ANTLR start "rule__Field_declaration__Group_0__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1989:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1993:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1994:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1994:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1995:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
             before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1996:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1996:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4098);
            rule__Field_declaration__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__Group_0__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2010:1: rule__Method_declaration__Group__0 : rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 ;
    public final void rule__Method_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2014:1: ( rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2015:2: rule__Method_declaration__Group__0__Impl rule__Method_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04132);
            rule__Method_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04135);
            rule__Method_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__0"


    // $ANTLR start "rule__Method_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2022:1: rule__Method_declaration__Group__0__Impl : ( ( rule__Method_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Method_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2026:1: ( ( ( rule__Method_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2027:1: ( ( rule__Method_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2027:1: ( ( rule__Method_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2028:1: ( rule__Method_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getMethod_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2029:1: ( rule__Method_declaration__ModifiersAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_MODIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2029:2: rule__Method_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Method_declaration__ModifiersAssignment_0_in_rule__Method_declaration__Group__0__Impl4162);
            	    rule__Method_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMethod_declarationAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__0__Impl"


    // $ANTLR start "rule__Method_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2039:1: rule__Method_declaration__Group__1 : rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 ;
    public final void rule__Method_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2043:1: ( rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2044:2: rule__Method_declaration__Group__1__Impl rule__Method_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14193);
            rule__Method_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14196);
            rule__Method_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__1"


    // $ANTLR start "rule__Method_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2051:1: rule__Method_declaration__Group__1__Impl : ( ( rule__Method_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Method_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2055:1: ( ( ( rule__Method_declaration__TypeAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2056:1: ( ( rule__Method_declaration__TypeAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2056:1: ( ( rule__Method_declaration__TypeAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2057:1: ( rule__Method_declaration__TypeAssignment_1 )
            {
             before(grammarAccess.getMethod_declarationAccess().getTypeAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2058:1: ( rule__Method_declaration__TypeAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2058:2: rule__Method_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Method_declaration__TypeAssignment_1_in_rule__Method_declaration__Group__1__Impl4223);
            rule__Method_declaration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethod_declarationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__1__Impl"


    // $ANTLR start "rule__Method_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2068:1: rule__Method_declaration__Group__2 : rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 ;
    public final void rule__Method_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2072:1: ( rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2073:2: rule__Method_declaration__Group__2__Impl rule__Method_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24253);
            rule__Method_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24256);
            rule__Method_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__2"


    // $ANTLR start "rule__Method_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2080:1: rule__Method_declaration__Group__2__Impl : ( ( rule__Method_declaration__NameAssignment_2 ) ) ;
    public final void rule__Method_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2084:1: ( ( ( rule__Method_declaration__NameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2085:1: ( ( rule__Method_declaration__NameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2085:1: ( ( rule__Method_declaration__NameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2086:1: ( rule__Method_declaration__NameAssignment_2 )
            {
             before(grammarAccess.getMethod_declarationAccess().getNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2087:1: ( rule__Method_declaration__NameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2087:2: rule__Method_declaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Method_declaration__NameAssignment_2_in_rule__Method_declaration__Group__2__Impl4283);
            rule__Method_declaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethod_declarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__2__Impl"


    // $ANTLR start "rule__Method_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2097:1: rule__Method_declaration__Group__3 : rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 ;
    public final void rule__Method_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2101:1: ( rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2102:2: rule__Method_declaration__Group__3__Impl rule__Method_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34313);
            rule__Method_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34316);
            rule__Method_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__3"


    // $ANTLR start "rule__Method_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2109:1: rule__Method_declaration__Group__3__Impl : ( '(' ) ;
    public final void rule__Method_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2113:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2114:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2114:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2115:1: '('
            {
             before(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4344); 
             after(grammarAccess.getMethod_declarationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__3__Impl"


    // $ANTLR start "rule__Method_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2128:1: rule__Method_declaration__Group__4 : rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 ;
    public final void rule__Method_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2132:1: ( rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2133:2: rule__Method_declaration__Group__4__Impl rule__Method_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44375);
            rule__Method_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44378);
            rule__Method_declaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__4"


    // $ANTLR start "rule__Method_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2140:1: rule__Method_declaration__Group__4__Impl : ( ( rule__Method_declaration__ParameterAssignment_4 )? ) ;
    public final void rule__Method_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2144:1: ( ( ( rule__Method_declaration__ParameterAssignment_4 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2145:1: ( ( rule__Method_declaration__ParameterAssignment_4 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2145:1: ( ( rule__Method_declaration__ParameterAssignment_4 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2146:1: ( rule__Method_declaration__ParameterAssignment_4 )?
            {
             before(grammarAccess.getMethod_declarationAccess().getParameterAssignment_4()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2147:1: ( rule__Method_declaration__ParameterAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=11 && LA23_0<=18)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2147:2: rule__Method_declaration__ParameterAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Method_declaration__ParameterAssignment_4_in_rule__Method_declaration__Group__4__Impl4405);
                    rule__Method_declaration__ParameterAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethod_declarationAccess().getParameterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__4__Impl"


    // $ANTLR start "rule__Method_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2157:1: rule__Method_declaration__Group__5 : rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 ;
    public final void rule__Method_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2161:1: ( rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2162:2: rule__Method_declaration__Group__5__Impl rule__Method_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54436);
            rule__Method_declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54439);
            rule__Method_declaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__5"


    // $ANTLR start "rule__Method_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2169:1: rule__Method_declaration__Group__5__Impl : ( ')' ) ;
    public final void rule__Method_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2173:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2174:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2174:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2175:1: ')'
            {
             before(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_28_in_rule__Method_declaration__Group__5__Impl4467); 
             after(grammarAccess.getMethod_declarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__5__Impl"


    // $ANTLR start "rule__Method_declaration__Group__6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2188:1: rule__Method_declaration__Group__6 : rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 ;
    public final void rule__Method_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2192:1: ( rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2193:2: rule__Method_declaration__Group__6__Impl rule__Method_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64498);
            rule__Method_declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64501);
            rule__Method_declaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__6"


    // $ANTLR start "rule__Method_declaration__Group__6__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2200:1: rule__Method_declaration__Group__6__Impl : ( ( '[]' )* ) ;
    public final void rule__Method_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2204:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2205:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2205:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2206:1: ( '[]' )*
            {
             before(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2207:1: ( '[]' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2208:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Method_declaration__Group__6__Impl4530); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMethod_declarationAccess().getLeftSquareBracketRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__6__Impl"


    // $ANTLR start "rule__Method_declaration__Group__7"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2219:1: rule__Method_declaration__Group__7 : rule__Method_declaration__Group__7__Impl ;
    public final void rule__Method_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2223:1: ( rule__Method_declaration__Group__7__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2224:2: rule__Method_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74563);
            rule__Method_declaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__7"


    // $ANTLR start "rule__Method_declaration__Group__7__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2230:1: rule__Method_declaration__Group__7__Impl : ( ( rule__Method_declaration__Alternatives_7 ) ) ;
    public final void rule__Method_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2234:1: ( ( ( rule__Method_declaration__Alternatives_7 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2235:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2235:1: ( ( rule__Method_declaration__Alternatives_7 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2236:1: ( rule__Method_declaration__Alternatives_7 )
            {
             before(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2237:1: ( rule__Method_declaration__Alternatives_7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2237:2: rule__Method_declaration__Alternatives_7
            {
            pushFollow(FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4590);
            rule__Method_declaration__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getMethod_declarationAccess().getAlternatives_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__Group__7__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2263:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2267:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2268:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04636);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04639);
            rule__Constructor_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__0"


    // $ANTLR start "rule__Constructor_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2275:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2279:1: ( ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2280:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2280:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2281:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getConstructor_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2282:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MODIFIER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2282:2: rule__Constructor_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4666);
            	    rule__Constructor_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConstructor_declarationAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__0__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2292:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2296:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2297:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14697);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14700);
            rule__Constructor_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__1"


    // $ANTLR start "rule__Constructor_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2304:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2308:1: ( ( ( rule__Constructor_declaration__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2309:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2309:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2310:1: ( rule__Constructor_declaration__NameAssignment_1 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2311:1: ( rule__Constructor_declaration__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2311:2: rule__Constructor_declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4727);
            rule__Constructor_declaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructor_declarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__1__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2321:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2325:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2326:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24757);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24760);
            rule__Constructor_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__2"


    // $ANTLR start "rule__Constructor_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2333:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2337:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2338:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2338:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2339:1: '('
            {
             before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl4788); 
             after(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__2__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2352:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2356:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2357:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__34819);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__34822);
            rule__Constructor_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__3"


    // $ANTLR start "rule__Constructor_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2364:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2368:1: ( ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2369:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2369:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2370:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            {
             before(grammarAccess.getConstructor_declarationAccess().getParametersAssignment_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2371:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=11 && LA26_0<=18)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2371:2: rule__Constructor_declaration__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl4849);
                    rule__Constructor_declaration__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructor_declarationAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__3__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2381:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2385:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2386:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__44880);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__44883);
            rule__Constructor_declaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__4"


    // $ANTLR start "rule__Constructor_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2393:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2397:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2398:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2398:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2399:1: ')'
            {
             before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl4911); 
             after(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__4__Impl"


    // $ANTLR start "rule__Constructor_declaration__Group__5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2412:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2416:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2417:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__54942);
            rule__Constructor_declaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__5"


    // $ANTLR start "rule__Constructor_declaration__Group__5__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2423:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2427:1: ( ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2428:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2428:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2429:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getStatementAssignment_5()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2430:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2430:2: rule__Constructor_declaration__StatementAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl4969);
            rule__Constructor_declaration__StatementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstructor_declarationAccess().getStatementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__Group__5__Impl"


    // $ANTLR start "rule__Parameter_list__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2452:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2456:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2457:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05011);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05014);
            rule__Parameter_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0"


    // $ANTLR start "rule__Parameter_list__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2464:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2468:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2469:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2469:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2470:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
             before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2471:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2471:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5041);
            rule__Parameter_list__ParameterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2481:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2485:1: ( rule__Parameter_list__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2486:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15071);
            rule__Parameter_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1"


    // $ANTLR start "rule__Parameter_list__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2492:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2496:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2497:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2497:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2498:1: ( rule__Parameter_list__Group_1__0 )*
            {
             before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2499:1: ( rule__Parameter_list__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2499:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5098);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getParameter_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2513:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2517:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2518:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05133);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05136);
            rule__Parameter_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0"


    // $ANTLR start "rule__Parameter_list__Group_1__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2525:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2529:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2530:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2530:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2531:1: ','
            {
             before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5164); 
             after(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter_list__Group_1__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2544:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2548:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2549:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15195);
            rule__Parameter_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1"


    // $ANTLR start "rule__Parameter_list__Group_1__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2555:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2559:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2560:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2560:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2561:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2562:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2562:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5222);
            rule__Parameter_list__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2576:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2580:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2581:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05256);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05259);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2588:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2592:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2593:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2593:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2594:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2595:1: ( rule__Parameter__TypeAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2595:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5286);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2605:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2609:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2610:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15316);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15319);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2617:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2621:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2622:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2622:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2623:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2624:1: ( rule__Parameter__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2624:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl5346);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2634:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2638:1: ( rule__Parameter__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2639:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25376);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2645:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2649:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2650:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2650:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2651:1: ( '[]' )*
            {
             before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2652:1: ( '[]' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2653:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Parameter__Group__2__Impl5405); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2670:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2674:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2675:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05444);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05447);
            rule__Variable_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0"


    // $ANTLR start "rule__Variable_declaration__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2682:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2686:1: ( ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2687:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2687:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2688:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2689:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_MODIFIER) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2689:2: rule__Variable_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl5474);
            	    rule__Variable_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2699:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2703:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2704:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15505);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15508);
            rule__Variable_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1"


    // $ANTLR start "rule__Variable_declaration__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2711:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2715:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2716:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2716:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2717:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2718:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2718:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5535);
            rule__Variable_declaration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2728:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2732:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2733:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25565);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25568);
            rule__Variable_declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2"


    // $ANTLR start "rule__Variable_declaration__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2740:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2744:1: ( ( ( rule__Variable_declaration__NameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2745:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2745:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2746:1: ( rule__Variable_declaration__NameAssignment_2 )
            {
             before(grammarAccess.getVariable_declarationAccess().getNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2747:1: ( rule__Variable_declaration__NameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2747:2: rule__Variable_declaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl5595);
            rule__Variable_declaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2757:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2761:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2762:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35625);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35628);
            rule__Variable_declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__3"


    // $ANTLR start "rule__Variable_declaration__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2769:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2773:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2774:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2774:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2775:1: ( rule__Variable_declaration__Group_3__0 )*
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2776:1: ( rule__Variable_declaration__Group_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2776:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5655);
            	    rule__Variable_declaration__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getVariable_declarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration__Group__4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2786:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2790:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2791:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45686);
            rule__Variable_declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__4"


    // $ANTLR start "rule__Variable_declaration__Group__4__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2797:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2801:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2802:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2802:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2803:1: ';'
            {
             before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Variable_declaration__Group__4__Impl5714); 
             after(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group__4__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2826:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2830:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2831:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05755);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05758);
            rule__Variable_declaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__0"


    // $ANTLR start "rule__Variable_declaration__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2838:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2842:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2843:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2843:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2844:1: ','
            {
             before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl5786); 
             after(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2857:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2861:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2862:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__15817);
            rule__Variable_declaration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__1"


    // $ANTLR start "rule__Variable_declaration__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2868:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2872:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2873:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2873:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2874:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
             before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2875:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2875:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl5844);
            rule__Variable_declaration__NamesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2889:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2893:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2894:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__05878);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__05881);
            rule__Variable_declarator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__0"


    // $ANTLR start "rule__Variable_declarator__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2901:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2905:1: ( ( ( rule__Variable_declarator__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2906:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2906:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2907:1: ( rule__Variable_declarator__NameAssignment_0 )
            {
             before(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2908:1: ( rule__Variable_declarator__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2908:2: rule__Variable_declarator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl5908);
            rule__Variable_declarator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__0__Impl"


    // $ANTLR start "rule__Variable_declarator__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2918:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2922:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2923:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__15938);
            rule__Variable_declarator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__1"


    // $ANTLR start "rule__Variable_declarator__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2929:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2933:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2934:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2934:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2935:1: ( '[]' )*
            {
             before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2936:1: ( '[]' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2937:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl5967); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2952:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2956:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2957:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06004);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06007);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2964:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2968:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2969:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2969:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2970:1: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2971:1: ( rule__Type__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2971:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl6034);
            rule__Type__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2981:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2985:1: ( rule__Type__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2986:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16064);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2992:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2996:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2997:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2997:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2998:1: ( '[]' )*
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2999:1: ( '[]' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3000:2: '[]'
            	    {
            	    match(input,29,FOLLOW_29_in_rule__Type__Group__1__Impl6093); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Static_initializer__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3015:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3019:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3020:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06130);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06133);
            rule__Static_initializer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__0"


    // $ANTLR start "rule__Static_initializer__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3027:1: rule__Static_initializer__Group__0__Impl : ( 'static' ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3031:1: ( ( 'static' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3032:1: ( 'static' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3032:1: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3033:1: 'static'
            {
             before(grammarAccess.getStatic_initializerAccess().getStaticKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Static_initializer__Group__0__Impl6161); 
             after(grammarAccess.getStatic_initializerAccess().getStaticKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__0__Impl"


    // $ANTLR start "rule__Static_initializer__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3046:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3050:1: ( rule__Static_initializer__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3051:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16192);
            rule__Static_initializer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__1"


    // $ANTLR start "rule__Static_initializer__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3057:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3061:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3062:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3062:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3063:1: ( rule__Static_initializer__NameAssignment_1 )
            {
             before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3064:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3064:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6219);
            rule__Static_initializer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3078:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3082:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3083:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06253);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06256);
            rule__Statement_block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__0"


    // $ANTLR start "rule__Statement_block__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3090:1: rule__Statement_block__Group__0__Impl : ( () ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3094:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3095:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3095:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3096:1: ()
            {
             before(grammarAccess.getStatement_blockAccess().getStatement_blockAction_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3097:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3099:1: 
            {
            }

             after(grammarAccess.getStatement_blockAccess().getStatement_blockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__0__Impl"


    // $ANTLR start "rule__Statement_block__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3109:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3113:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3114:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16314);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16317);
            rule__Statement_block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__1"


    // $ANTLR start "rule__Statement_block__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3121:1: rule__Statement_block__Group__1__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3125:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3126:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3126:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3127:1: '{'
            {
             before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Statement_block__Group__1__Impl6345); 
             after(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__1__Impl"


    // $ANTLR start "rule__Statement_block__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3140:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3144:1: ( rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3145:2: rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26376);
            rule__Statement_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__26379);
            rule__Statement_block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__2"


    // $ANTLR start "rule__Statement_block__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3152:1: rule__Statement_block__Group__2__Impl : ( ( rule__Statement_block__StatementsAssignment_2 )* ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3156:1: ( ( ( rule__Statement_block__StatementsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3157:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3157:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3158:1: ( rule__Statement_block__StatementsAssignment_2 )*
            {
             before(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3159:1: ( rule__Statement_block__StatementsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==19||(LA33_0>=32 && LA33_0<=33)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3159:2: rule__Statement_block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl6406);
            	    rule__Statement_block__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__2__Impl"


    // $ANTLR start "rule__Statement_block__Group__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3169:1: rule__Statement_block__Group__3 : rule__Statement_block__Group__3__Impl ;
    public final void rule__Statement_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3173:1: ( rule__Statement_block__Group__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3174:2: rule__Statement_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__36437);
            rule__Statement_block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__3"


    // $ANTLR start "rule__Statement_block__Group__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3180:1: rule__Statement_block__Group__3__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3184:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3185:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3185:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3186:1: '}'
            {
             before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Statement_block__Group__3__Impl6465); 
             after(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3207:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3211:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3212:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__06504);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__06507);
            rule__Statement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3219:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__NameAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3223:1: ( ( ( rule__Statement__NameAssignment_0_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3224:1: ( ( rule__Statement__NameAssignment_0_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3224:1: ( ( rule__Statement__NameAssignment_0_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3225:1: ( rule__Statement__NameAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3226:1: ( rule__Statement__NameAssignment_0_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3226:2: rule__Statement__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_0_0_in_rule__Statement__Group_0__0__Impl6534);
            rule__Statement__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3236:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3240:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3241:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__16564);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__16567);
            rule__Statement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3248:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3252:1: ( ( ':' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3253:1: ( ':' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3253:1: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3254:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,31,FOLLOW_31_in_rule__Statement__Group_0__1__Impl6595); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3267:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3271:1: ( rule__Statement__Group_0__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3272:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__26626);
            rule__Statement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2"


    // $ANTLR start "rule__Statement__Group_0__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3278:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__StatementAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3282:1: ( ( ( rule__Statement__StatementAssignment_0_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3283:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3283:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3284:1: ( rule__Statement__StatementAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3285:1: ( rule__Statement__StatementAssignment_0_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3285:2: rule__Statement__StatementAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_0_2_in_rule__Statement__Group_0__2__Impl6653);
            rule__Statement__StatementAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3301:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3305:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3306:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06689);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06692);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3313:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3317:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3318:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3318:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3319:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_1_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3320:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3322:1: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3332:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3336:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3337:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16750);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16753);
            rule__Statement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3344:1: rule__Statement__Group_1__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3348:1: ( ( 'break' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3349:1: ( 'break' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3349:1: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3350:1: 'break'
            {
             before(grammarAccess.getStatementAccess().getBreakKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Statement__Group_1__1__Impl6781); 
             after(grammarAccess.getStatementAccess().getBreakKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3363:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3367:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3368:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26812);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__3_in_rule__Statement__Group_1__26815);
            rule__Statement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3375:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__NameAssignment_1_2 )? ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3379:1: ( ( ( rule__Statement__NameAssignment_1_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3380:1: ( ( rule__Statement__NameAssignment_1_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3380:1: ( ( rule__Statement__NameAssignment_1_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3381:1: ( rule__Statement__NameAssignment_1_2 )?
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3382:1: ( rule__Statement__NameAssignment_1_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3382:2: rule__Statement__NameAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_1_2_in_rule__Statement__Group_1__2__Impl6842);
                    rule__Statement__NameAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3392:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3396:1: ( rule__Statement__Group_1__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3397:2: rule__Statement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__3__Impl_in_rule__Statement__Group_1__36873);
            rule__Statement__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__3"


    // $ANTLR start "rule__Statement__Group_1__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3403:1: rule__Statement__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3407:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3408:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3408:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3409:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_3()); 
            match(input,19,FOLLOW_19_in_rule__Statement__Group_1__3__Impl6901); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__3__Impl"


    // $ANTLR start "rule__Statement__Group_2__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3430:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3434:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3435:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06940);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06943);
            rule__Statement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0"


    // $ANTLR start "rule__Statement__Group_2__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3442:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3446:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3447:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3447:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3448:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3449:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3451:1: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__0__Impl"


    // $ANTLR start "rule__Statement__Group_2__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3461:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3465:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3466:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__17001);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__17004);
            rule__Statement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1"


    // $ANTLR start "rule__Statement__Group_2__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3473:1: rule__Statement__Group_2__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3477:1: ( ( 'continue' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3478:1: ( 'continue' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3478:1: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3479:1: 'continue'
            {
             before(grammarAccess.getStatementAccess().getContinueKeyword_2_1()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_2__1__Impl7032); 
             after(grammarAccess.getStatementAccess().getContinueKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__1__Impl"


    // $ANTLR start "rule__Statement__Group_2__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3492:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3496:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3497:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__27063);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__3_in_rule__Statement__Group_2__27066);
            rule__Statement__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2"


    // $ANTLR start "rule__Statement__Group_2__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3504:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__NameAssignment_2_2 )? ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3508:1: ( ( ( rule__Statement__NameAssignment_2_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3509:1: ( ( rule__Statement__NameAssignment_2_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3509:1: ( ( rule__Statement__NameAssignment_2_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3510:1: ( rule__Statement__NameAssignment_2_2 )?
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_2_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3511:1: ( rule__Statement__NameAssignment_2_2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3511:2: rule__Statement__NameAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_2_2_in_rule__Statement__Group_2__2__Impl7093);
                    rule__Statement__NameAssignment_2_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__2__Impl"


    // $ANTLR start "rule__Statement__Group_2__3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3521:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3525:1: ( rule__Statement__Group_2__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3526:2: rule__Statement__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__3__Impl_in_rule__Statement__Group_2__37124);
            rule__Statement__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3"


    // $ANTLR start "rule__Statement__Group_2__3__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3532:1: rule__Statement__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3536:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3537:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3537:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3538:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_2_3()); 
            match(input,19,FOLLOW_19_in_rule__Statement__Group_2__3__Impl7152); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_2__3__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3559:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3563:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3564:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__07191);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__07194);
            rule__Statement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3571:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3575:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3576:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3576:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3577:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3578:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3580:1: 
            {
            }

             after(grammarAccess.getStatementAccess().getStatementAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3590:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3594:1: ( rule__Statement__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3595:2: rule__Statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__17252);
            rule__Statement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3601:1: rule__Statement__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3605:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3606:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3606:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3607:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 
            match(input,19,FOLLOW_19_in_rule__Statement__Group_3__1__Impl7280); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3624:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3628:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3629:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__07315);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__07318);
            rule__Package_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__0"


    // $ANTLR start "rule__Package_statement__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3636:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3640:1: ( ( 'package' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3641:1: ( 'package' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3641:1: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3642:1: 'package'
            {
             before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Package_statement__Group__0__Impl7346); 
             after(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__0__Impl"


    // $ANTLR start "rule__Package_statement__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3655:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3659:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3660:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__17377);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__17380);
            rule__Package_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__1"


    // $ANTLR start "rule__Package_statement__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3667:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__NameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3671:1: ( ( ( rule__Package_statement__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3672:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3672:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3673:1: ( rule__Package_statement__NameAssignment_1 )
            {
             before(grammarAccess.getPackage_statementAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3674:1: ( rule__Package_statement__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3674:2: rule__Package_statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl7407);
            rule__Package_statement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackage_statementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__1__Impl"


    // $ANTLR start "rule__Package_statement__Group__2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3684:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3688:1: ( rule__Package_statement__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3689:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__27437);
            rule__Package_statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__2"


    // $ANTLR start "rule__Package_statement__Group__2__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3695:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3699:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3700:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3700:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3701:1: ';'
            {
             before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Package_statement__Group__2__Impl7465); 
             after(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__Group__2__Impl"


    // $ANTLR start "rule__Package_name__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3720:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3724:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3725:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__07502);
            rule__Package_name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__07505);
            rule__Package_name__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__0"


    // $ANTLR start "rule__Package_name__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3732:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3736:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3737:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3737:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3738:1: RULE_ID
            {
             before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl7532); 
             after(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__0__Impl"


    // $ANTLR start "rule__Package_name__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3749:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3753:1: ( rule__Package_name__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3754:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__17561);
            rule__Package_name__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__1"


    // $ANTLR start "rule__Package_name__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3760:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_aux ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3764:1: ( ( rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3765:1: ( rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3765:1: ( rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3766:1: rulePackage_name_aux
            {
             before(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl7588);
            rulePackage_name_aux();

            state._fsp--;

             after(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name__Group__1__Impl"


    // $ANTLR start "rule__Package_name_aux__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3781:1: rule__Package_name_aux__Group__0 : rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 ;
    public final void rule__Package_name_aux__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3785:1: ( rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3786:2: rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__07621);
            rule__Package_name_aux__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__07624);
            rule__Package_name_aux__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__0"


    // $ANTLR start "rule__Package_name_aux__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3793:1: rule__Package_name_aux__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_aux__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3797:1: ( ( '.' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3798:1: ( '.' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3798:1: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3799:1: '.'
            {
             before(grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Package_name_aux__Group__0__Impl7652); 
             after(grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__0__Impl"


    // $ANTLR start "rule__Package_name_aux__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3812:1: rule__Package_name_aux__Group__1 : rule__Package_name_aux__Group__1__Impl ;
    public final void rule__Package_name_aux__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3816:1: ( rule__Package_name_aux__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3817:2: rule__Package_name_aux__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__17683);
            rule__Package_name_aux__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__1"


    // $ANTLR start "rule__Package_name_aux__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3823:1: rule__Package_name_aux__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_aux__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3827:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3828:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3828:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3829:1: RULE_ID
            {
             before(grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl7710); 
             after(grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_name_aux__Group__1__Impl"


    // $ANTLR start "rule__Import_statement__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3844:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3848:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3849:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__07743);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__07746);
            rule__Import_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__0"


    // $ANTLR start "rule__Import_statement__Group__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3856:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3860:1: ( ( 'import' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3861:1: ( 'import' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3861:1: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3862:1: 'import'
            {
             before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Import_statement__Group__0__Impl7774); 
             after(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__0__Impl"


    // $ANTLR start "rule__Import_statement__Group__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3875:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3879:1: ( rule__Import_statement__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3880:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__17805);
            rule__Import_statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__1"


    // $ANTLR start "rule__Import_statement__Group__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3886:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3890:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3891:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3891:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3892:1: ( rule__Import_statement__Alternatives_1 )
            {
             before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3893:1: ( rule__Import_statement__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3893:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl7832);
            rule__Import_statement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getImport_statementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3907:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3911:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3912:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__07866);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__07869);
            rule__Import_statement__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__0"


    // $ANTLR start "rule__Import_statement__Group_1_0__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3919:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3923:1: ( ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3924:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3924:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3925:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            {
             before(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3926:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3926:2: rule__Import_statement__ClassnameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl7896);
            rule__Import_statement__ClassnameAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_0__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3936:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3940:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3941:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__17926);
            rule__Import_statement__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__1"


    // $ANTLR start "rule__Import_statement__Group_1_0__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3947:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3951:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3952:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3952:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3953:1: ';'
            {
             before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            match(input,19,FOLLOW_19_in_rule__Import_statement__Group_1_0__1__Impl7954); 
             after(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_0__1__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3970:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3974:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3975:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__07989);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__07992);
            rule__Import_statement__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__0"


    // $ANTLR start "rule__Import_statement__Group_1_1__0__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3982:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3986:1: ( ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3987:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3987:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3988:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            {
             before(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3989:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3989:2: rule__Import_statement__PackagenameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8019);
            rule__Import_statement__PackagenameAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__0__Impl"


    // $ANTLR start "rule__Import_statement__Group_1_1__1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3999:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4003:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4004:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18049);
            rule__Import_statement__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__1"


    // $ANTLR start "rule__Import_statement__Group_1_1__1__Impl"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4010:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4014:1: ( ( '.*;;' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4015:1: ( '.*;;' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4015:1: ( '.*;;' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4016:1: '.*;;'
            {
             before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonSemicolonKeyword_1_1_1()); 
            match(input,37,FOLLOW_37_in_rule__Import_statement__Group_1_1__1__Impl8077); 
             after(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonSemicolonKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__Group_1_1__1__Impl"


    // $ANTLR start "rule__Head__ElementsAssignment"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4034:1: rule__Head__ElementsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Head__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4038:1: ( ( ruleCompilation_unit ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4039:1: ( ruleCompilation_unit )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4039:1: ( ruleCompilation_unit )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4040:1: ruleCompilation_unit
            {
             before(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment8117);
            ruleCompilation_unit();

            state._fsp--;

             after(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Head__ElementsAssignment"


    // $ANTLR start "rule__Compilation_unit__PackageAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4049:1: rule__Compilation_unit__PackageAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4053:1: ( ( rulePackage_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4054:1: ( rulePackage_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4054:1: ( rulePackage_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4055:1: rulePackage_statement
            {
             before(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_08148);
            rulePackage_statement();

            state._fsp--;

             after(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__PackageAssignment_0"


    // $ANTLR start "rule__Compilation_unit__ImportsAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4064:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4068:1: ( ( ruleImport_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4069:1: ( ruleImport_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4069:1: ( ruleImport_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4070:1: ruleImport_statement
            {
             before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_18179);
            ruleImport_statement();

            state._fsp--;

             after(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__ImportsAssignment_1"


    // $ANTLR start "rule__Compilation_unit__Type_declarationsAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4079:1: rule__Compilation_unit__Type_declarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__Type_declarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4083:1: ( ( ruleType_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4084:1: ( ruleType_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4084:1: ( ruleType_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4085:1: ruleType_declaration
            {
             before(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_28210);
            ruleType_declaration();

            state._fsp--;

             after(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compilation_unit__Type_declarationsAssignment_2"


    // $ANTLR start "rule__Type_declaration__DocAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4094:1: rule__Type_declaration__DocAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4098:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4099:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4099:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4100:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_08241); 
             after(grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__DocAssignment_0"


    // $ANTLR start "rule__Type_declaration__NameAssignment_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4109:1: rule__Type_declaration__NameAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4113:1: ( ( ruleClass_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4114:1: ( ruleClass_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4114:1: ( ruleClass_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4115:1: ruleClass_declaration
            {
             before(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_08272);
            ruleClass_declaration();

            state._fsp--;

             after(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__NameAssignment_1_0"


    // $ANTLR start "rule__Type_declaration__NameAssignment_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4124:1: rule__Type_declaration__NameAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4128:1: ( ( ruleInterface_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4129:1: ( ruleInterface_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4129:1: ( ruleInterface_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4130:1: ruleInterface_declaration
            {
             before(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_18303);
            ruleInterface_declaration();

            state._fsp--;

             after(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_declaration__NameAssignment_1_1"


    // $ANTLR start "rule__Interface_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4139:1: rule__Interface_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4143:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4144:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4144:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4145:1: RULE_MODIFIER
            {
             before(grammarAccess.getInterface_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Interface_declaration__ModifiersAssignment_08334); 
             after(grammarAccess.getInterface_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Interface_declaration__InterfaceNameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4154:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4158:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4159:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4159:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4160:1: RULE_ID
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_28365); 
             after(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__InterfaceNameAssignment_2"


    // $ANTLR start "rule__Interface_declaration__ExtendAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4169:1: rule__Interface_declaration__ExtendAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4173:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4174:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4174:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4175:1: ruleInterface_name
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_18396);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ExtendAssignment_3_1"


    // $ANTLR start "rule__Interface_declaration__ExtendsAssignment_3_2_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4184:1: rule__Interface_declaration__ExtendsAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4188:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4189:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4189:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4190:1: ruleInterface_name
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_18427);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface_declaration__ExtendsAssignment_3_2_1"


    // $ANTLR start "rule__Class_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4199:1: rule__Class_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4203:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4204:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4204:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4205:1: RULE_MODIFIER
            {
             before(grammarAccess.getClass_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Class_declaration__ModifiersAssignment_08458); 
             after(grammarAccess.getClass_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Class_declaration__ClassNameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4214:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4218:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4219:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4219:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4220:1: RULE_ID
            {
             before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_28489); 
             after(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ClassNameAssignment_2"


    // $ANTLR start "rule__Class_declaration__ExtendAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4229:1: rule__Class_declaration__ExtendAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4233:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4234:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4234:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4235:1: ruleClass_name
            {
             before(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_18520);
            ruleClass_name();

            state._fsp--;

             after(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ExtendAssignment_3_1"


    // $ANTLR start "rule__Class_declaration__ImplementAssignment_4_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4244:1: rule__Class_declaration__ImplementAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4248:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4249:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4249:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4250:1: ruleInterface_name
            {
             before(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_18551);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ImplementAssignment_4_1"


    // $ANTLR start "rule__Class_declaration__ImplementsAssignment_4_2_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4259:1: rule__Class_declaration__ImplementsAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4263:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4264:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4264:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4265:1: ruleInterface_name
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_18582);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__ImplementsAssignment_4_2_1"


    // $ANTLR start "rule__Class_declaration__FieldsAssignment_6"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4274:1: rule__Class_declaration__FieldsAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4278:1: ( ( ruleField_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4279:1: ( ruleField_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4279:1: ( ruleField_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4280:1: ruleField_declaration
            {
             before(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_68613);
            ruleField_declaration();

            state._fsp--;

             after(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class_declaration__FieldsAssignment_6"


    // $ANTLR start "rule__Field_declaration__DocAssignment_0_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4289:1: rule__Field_declaration__DocAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__DocAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4293:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4294:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4294:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4295:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_08644); 
             after(grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__DocAssignment_0_0"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4304:1: rule__Field_declaration__NameAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4308:1: ( ( ruleVariable_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4309:1: ( ruleVariable_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4309:1: ( ruleVariable_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4310:1: ruleVariable_declaration
            {
             before(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_08675);
            ruleVariable_declaration();

            state._fsp--;

             after(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_0"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4319:1: rule__Field_declaration__NameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4323:1: ( ( ruleConstructor_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4324:1: ( ruleConstructor_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4324:1: ( ruleConstructor_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4325:1: ruleConstructor_declaration
            {
             before(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_18706);
            ruleConstructor_declaration();

            state._fsp--;

             after(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_1"


    // $ANTLR start "rule__Field_declaration__NameAssignment_0_1_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4334:1: rule__Field_declaration__NameAssignment_0_1_2 : ( ruleMethod_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4338:1: ( ( ruleMethod_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4339:1: ( ruleMethod_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4339:1: ( ruleMethod_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4340:1: ruleMethod_declaration
            {
             before(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__NameAssignment_0_1_28737);
            ruleMethod_declaration();

            state._fsp--;

             after(grammarAccess.getField_declarationAccess().getNameMethod_declarationParserRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_0_1_2"


    // $ANTLR start "rule__Field_declaration__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4349:1: rule__Field_declaration__NameAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4353:1: ( ( ruleStatic_initializer ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4354:1: ( ruleStatic_initializer )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4354:1: ( ruleStatic_initializer )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4355:1: ruleStatic_initializer
            {
             before(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_18768);
            ruleStatic_initializer();

            state._fsp--;

             after(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__NameAssignment_1"


    // $ANTLR start "rule__Field_declaration__DebugAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4364:1: rule__Field_declaration__DebugAssignment_2 : ( ( ';' ) ) ;
    public final void rule__Field_declaration__DebugAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4368:1: ( ( ( ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4369:1: ( ( ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4369:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4370:1: ( ';' )
            {
             before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4371:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4372:1: ';'
            {
             before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Field_declaration__DebugAssignment_28804); 
             after(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 

            }

             after(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field_declaration__DebugAssignment_2"


    // $ANTLR start "rule__Method_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4387:1: rule__Method_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Method_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4391:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4392:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4392:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4393:1: RULE_MODIFIER
            {
             before(grammarAccess.getMethod_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Method_declaration__ModifiersAssignment_08843); 
             after(grammarAccess.getMethod_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Method_declaration__TypeAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4402:1: rule__Method_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Method_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4406:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4407:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4407:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4408:1: ruleType
            {
             before(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Method_declaration__TypeAssignment_18874);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethod_declarationAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__TypeAssignment_1"


    // $ANTLR start "rule__Method_declaration__NameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4417:1: rule__Method_declaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Method_declaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4421:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4422:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4422:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4423:1: RULE_ID
            {
             before(grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Method_declaration__NameAssignment_28905); 
             after(grammarAccess.getMethod_declarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__NameAssignment_2"


    // $ANTLR start "rule__Method_declaration__ParameterAssignment_4"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4432:1: rule__Method_declaration__ParameterAssignment_4 : ( ruleParameter_list ) ;
    public final void rule__Method_declaration__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4436:1: ( ( ruleParameter_list ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4437:1: ( ruleParameter_list )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4437:1: ( ruleParameter_list )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4438:1: ruleParameter_list
            {
             before(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterAssignment_48936);
            ruleParameter_list();

            state._fsp--;

             after(grammarAccess.getMethod_declarationAccess().getParameterParameter_listParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__ParameterAssignment_4"


    // $ANTLR start "rule__Method_declaration__StatementAssignment_7_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4447:1: rule__Method_declaration__StatementAssignment_7_0 : ( ruleStatement_block ) ;
    public final void rule__Method_declaration__StatementAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4451:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4452:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4452:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4453:1: ruleStatement_block
            {
             before(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementAssignment_7_08967);
            ruleStatement_block();

            state._fsp--;

             after(grammarAccess.getMethod_declarationAccess().getStatementStatement_blockParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__StatementAssignment_7_0"


    // $ANTLR start "rule__Method_declaration__DebugAssignment_7_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4462:1: rule__Method_declaration__DebugAssignment_7_1 : ( ( ';' ) ) ;
    public final void rule__Method_declaration__DebugAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4466:1: ( ( ( ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4467:1: ( ( ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4467:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4468:1: ( ';' )
            {
             before(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4469:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4470:1: ';'
            {
             before(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Method_declaration__DebugAssignment_7_19003); 
             after(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 

            }

             after(grammarAccess.getMethod_declarationAccess().getDebugSemicolonKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method_declaration__DebugAssignment_7_1"


    // $ANTLR start "rule__Constructor_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4485:1: rule__Constructor_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Constructor_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4489:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4490:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4490:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4491:1: RULE_MODIFIER
            {
             before(grammarAccess.getConstructor_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Constructor_declaration__ModifiersAssignment_09042); 
             after(grammarAccess.getConstructor_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Constructor_declaration__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4500:1: rule__Constructor_declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4504:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4505:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4505:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4506:1: RULE_ID
            {
             before(grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_19073); 
             after(grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__NameAssignment_1"


    // $ANTLR start "rule__Constructor_declaration__ParametersAssignment_3"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4515:1: rule__Constructor_declaration__ParametersAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4519:1: ( ( ruleParameter_list ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4520:1: ( ruleParameter_list )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4520:1: ( ruleParameter_list )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4521:1: ruleParameter_list
            {
             before(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_39104);
            ruleParameter_list();

            state._fsp--;

             after(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__ParametersAssignment_3"


    // $ANTLR start "rule__Constructor_declaration__StatementAssignment_5"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4530:1: rule__Constructor_declaration__StatementAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4534:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4535:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4535:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4536:1: ruleStatement_block
            {
             before(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_59135);
            ruleStatement_block();

            state._fsp--;

             after(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor_declaration__StatementAssignment_5"


    // $ANTLR start "rule__Parameter_list__ParameterAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4545:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4549:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4550:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4550:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4551:1: ruleParameter
            {
             before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_09166);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParameterAssignment_0"


    // $ANTLR start "rule__Parameter_list__ParametersAssignment_1_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4560:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4564:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4565:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4565:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4566:1: ruleParameter
            {
             before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_19197);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_list__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4575:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4579:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4580:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4580:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4581:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_09228);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4590:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4594:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4595:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4595:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4596:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_19259); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Variable_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4605:1: rule__Variable_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Variable_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4609:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4610:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4610:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4611:1: RULE_MODIFIER
            {
             before(grammarAccess.getVariable_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Variable_declaration__ModifiersAssignment_09290); 
             after(grammarAccess.getVariable_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__ModifiersAssignment_0"


    // $ANTLR start "rule__Variable_declaration__TypeAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4620:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4624:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4625:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4625:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4626:1: ruleType
            {
             before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_19321);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__TypeAssignment_1"


    // $ANTLR start "rule__Variable_declaration__NameAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4635:1: rule__Variable_declaration__NameAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4639:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4640:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4640:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4641:1: ruleVariable_declarator
            {
             before(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_29352);
            ruleVariable_declarator();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__NameAssignment_2"


    // $ANTLR start "rule__Variable_declaration__NamesAssignment_3_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4650:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4654:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4655:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4655:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4656:1: ruleVariable_declarator
            {
             before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_19383);
            ruleVariable_declarator();

            state._fsp--;

             after(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration__NamesAssignment_3_1"


    // $ANTLR start "rule__Variable_declarator__NameAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4665:1: rule__Variable_declarator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4669:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4670:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4670:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4671:1: RULE_ID
            {
             before(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_09414); 
             after(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declarator__NameAssignment_0"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4680:1: rule__Type__NameAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4684:1: ( ( ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4685:1: ( ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4685:1: ( ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4686:1: ruleType_specifier
            {
             before(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_09445);
            ruleType_specifier();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Static_initializer__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4695:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4699:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4700:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4700:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4701:1: ruleStatement_block
            {
             before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_19476);
            ruleStatement_block();

            state._fsp--;

             after(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Static_initializer__NameAssignment_1"


    // $ANTLR start "rule__Statement_block__StatementsAssignment_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4710:1: rule__Statement_block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4714:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4715:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4715:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4716:1: ruleStatement
            {
             before(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_29507);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_block__StatementsAssignment_2"


    // $ANTLR start "rule__Statement__NameAssignment_0_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4725:1: rule__Statement__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4729:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4730:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4730:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4731:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_0_09538); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_0_0"


    // $ANTLR start "rule__Statement__StatementAssignment_0_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4740:1: rule__Statement__StatementAssignment_0_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4744:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4745:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4745:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4746:1: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_0_29569);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StatementAssignment_0_2"


    // $ANTLR start "rule__Statement__NameAssignment_1_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4755:1: rule__Statement__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4759:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4760:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4760:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4761:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_1_29600); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_1_2"


    // $ANTLR start "rule__Statement__NameAssignment_2_2"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4770:1: rule__Statement__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4774:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4775:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4775:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4776:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_29631); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_2_2"


    // $ANTLR start "rule__Package_statement__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4785:1: rule__Package_statement__NameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4789:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4790:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4790:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4791:1: rulePackage_name
            {
             before(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_19662);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package_statement__NameAssignment_1"


    // $ANTLR start "rule__Import_statement__ClassnameAssignment_1_0_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4800:1: rule__Import_statement__ClassnameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassnameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4804:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4805:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4805:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4806:1: ruleClass_name
            {
             before(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_09693);
            ruleClass_name();

            state._fsp--;

             after(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__ClassnameAssignment_1_0_0"


    // $ANTLR start "rule__Import_statement__PackagenameAssignment_1_1_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4815:1: rule__Import_statement__PackagenameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PackagenameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4819:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4820:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4820:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4821:1: rulePackage_name
            {
             before(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_09724);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import_statement__PackagenameAssignment_1_1_0"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\6\2\uffff";
    static final String DFA2_maxS =
        "\2\31\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\15\uffff\1\3\4\uffff\1\2",
            "\1\1\15\uffff\1\3\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "704:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\22\uffff";
    static final String DFA4_eofS =
        "\22\uffff";
    static final String DFA4_minS =
        "\14\4\1\23\1\4\3\uffff\1\4";
    static final String DFA4_maxS =
        "\2\22\10\35\1\43\2\35\1\4\3\uffff\1\43";
    static final String DFA4_acceptS =
        "\16\uffff\1\2\1\1\1\3\1\uffff";
    static final String DFA4_specialS =
        "\22\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\1\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12\1\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\30\uffff\1\13",
            "\1\14\26\uffff\1\16\1\uffff\1\13\5\uffff\1\15",
            "\1\14\30\uffff\1\13",
            "\1\17\4\uffff\1\17\2\uffff\1\20\1\uffff\1\17",
            "\1\21",
            "",
            "",
            "",
            "\1\14\30\uffff\1\13\5\uffff\1\15"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "754:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\6\uffff";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\1\4\1\23\1\4\2\uffff\1\23";
    static final String DFA8_maxS =
        "\1\4\1\45\1\4\2\uffff\1\45";
    static final String DFA8_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA8_specialS =
        "\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\3\17\uffff\1\2\1\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\3\17\uffff\1\2\1\uffff\1\4"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "918:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Head__ElementsAssignment_in_ruleHead94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_entryRuleCompilation_unit121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompilation_unit128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0_in_ruleCompilation_unit154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_entryRuleType_declaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_declaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0_in_ruleType_declaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_entryRuleInterface_declaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_declaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0_in_ruleInterface_declaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_entryRuleClass_declaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_declaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0_in_ruleClass_declaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_entryRuleField_declaration361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_declaration368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_in_ruleField_declaration394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_entryRuleMethod_declaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod_declaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0_in_ruleMethod_declaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1234 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_2_in_rule__Field_declaration__Alternatives_0_11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__StatementAssignment_7_0_in_rule__Method_declaration__Alternatives_71638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__DebugAssignment_7_1_in_rule__Method_declaration__Alternatives_71656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type_specifier__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type_specifier__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type_specifier__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type_specifier__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_11968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_11986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__02017 = new BitSet(new long[]{0x0000001002100060L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__02020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__12078 = new BitSet(new long[]{0x0000001002100060L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl2108 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2166 = new BitSet(new long[]{0x0000000002100062L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02203 = new BitSet(new long[]{0x0000000002100060L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12264 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_declaration__Group__2__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02389 = new BitSet(new long[]{0x0000000002100060L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2419 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface_declaration__Group__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22512 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32572 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42633 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface_declaration__Group__4__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__5__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group_3__0__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__12828 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__12831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__22888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl2915 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__02952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group_3_2__0__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__03075 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__03078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl3105 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23198 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33258 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43319 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53380 = new BitSet(new long[]{0x00000000404FF870L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Class_declaration__Group__5__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63442 = new BitSet(new long[]{0x00000000404FF870L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3472 = new BitSet(new long[]{0x00000000400FF872L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class_declaration__Group__7__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03578 = new BitSet(new long[]{0x000000000007F850L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group_3__0__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group_4__0__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13763 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__23823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl3850 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__03887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__03890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group_4_2__0__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__04010 = new BitSet(new long[]{0x000000000007F870L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__04013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__0__Impl_in_rule__Method_declaration__Group__04132 = new BitSet(new long[]{0x000000000007F870L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1_in_rule__Method_declaration__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ModifiersAssignment_0_in_rule__Method_declaration__Group__0__Impl4162 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__1__Impl_in_rule__Method_declaration__Group__14193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2_in_rule__Method_declaration__Group__14196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__TypeAssignment_1_in_rule__Method_declaration__Group__1__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__2__Impl_in_rule__Method_declaration__Group__24253 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3_in_rule__Method_declaration__Group__24256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__NameAssignment_2_in_rule__Method_declaration__Group__2__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__3__Impl_in_rule__Method_declaration__Group__34313 = new BitSet(new long[]{0x000000001007F850L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4_in_rule__Method_declaration__Group__34316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Method_declaration__Group__3__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__4__Impl_in_rule__Method_declaration__Group__44375 = new BitSet(new long[]{0x000000001007F850L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5_in_rule__Method_declaration__Group__44378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__ParameterAssignment_4_in_rule__Method_declaration__Group__4__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__5__Impl_in_rule__Method_declaration__Group__54436 = new BitSet(new long[]{0x0000000020280000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6_in_rule__Method_declaration__Group__54439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Method_declaration__Group__5__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__6__Impl_in_rule__Method_declaration__Group__64498 = new BitSet(new long[]{0x0000000020280000L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7_in_rule__Method_declaration__Group__64501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Method_declaration__Group__6__Impl4530 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Group__7__Impl_in_rule__Method_declaration__Group__74563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Method_declaration__Alternatives_7_in_rule__Method_declaration__Group__7__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04636 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4666 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14697 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24757 = new BitSet(new long[]{0x000000001007F850L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constructor_declaration__Group__2__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__34819 = new BitSet(new long[]{0x000000001007F850L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__34822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__44880 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__44883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constructor_declaration__Group__4__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__54942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__05011 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__05014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl5098 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__05133 = new BitSet(new long[]{0x000000000007F850L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__05136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Parameter_list__Group_1__0__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__15195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__05256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__05259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__15316 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__15319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__25376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Parameter__Group__2__Impl5405 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__05444 = new BitSet(new long[]{0x000000000007F850L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__05447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl5474 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__15505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__25565 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__25568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__35625 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__35628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5655 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Variable_declaration__Group__4__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Variable_declaration__Group_3__0__Impl5786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__15817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__05878 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__05881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__15938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Variable_declarator__Group__1__Impl5967 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__06004 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__06007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__16064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group__1__Impl6093 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__06130 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__06133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Static_initializer__Group__0__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__06253 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__06256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__16314 = new BitSet(new long[]{0x0000000300480010L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement_block__Group__1__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__26376 = new BitSet(new long[]{0x0000000300480010L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__26379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl6406 = new BitSet(new long[]{0x0000000300080012L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__36437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement_block__Group__3__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__06504 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__06507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_0_0_in_rule__Statement__Group_0__0__Impl6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__16564 = new BitSet(new long[]{0x0000000300080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__16567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_0__1__Impl6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__26626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_0_2_in_rule__Statement__Group_0__2__Impl6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06689 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16750 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Statement__Group_1__1__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26812 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__3_in_rule__Statement__Group_1__26815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_2_in_rule__Statement__Group_1__2__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__3__Impl_in_rule__Statement__Group_1__36873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_1__3__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06940 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__17001 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_2__1__Impl7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__27063 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__3_in_rule__Statement__Group_2__27066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_2_2_in_rule__Statement__Group_2__2__Impl7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__3__Impl_in_rule__Statement__Group_2__37124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_2__3__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__07191 = new BitSet(new long[]{0x0000000300080010L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__07194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__17252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statement__Group_3__1__Impl7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__07315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__07318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Package_statement__Group__0__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__17377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__17380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__27437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Package_statement__Group__2__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__07502 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__07505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__07621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__07624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Package_name_aux__Group__0__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl7710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__07743 = new BitSet(new long[]{0x000000000007F850L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__07746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Import_statement__Group__0__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl7832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__07866 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__07869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__17926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import_statement__Group_1_0__1__Impl7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__07989 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__07992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__18049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Import_statement__Group_1_1__1__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_08148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_18179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_28210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_08241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_08272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_18303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Interface_declaration__ModifiersAssignment_08334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_28365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_18396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_18427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Class_declaration__ModifiersAssignment_08458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_28489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_18520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_18551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_18582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_68613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_08644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_18706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_declaration_in_rule__Field_declaration__NameAssignment_0_1_28737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_18768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Field_declaration__DebugAssignment_28804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Method_declaration__ModifiersAssignment_08843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Method_declaration__TypeAssignment_18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Method_declaration__NameAssignment_28905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Method_declaration__ParameterAssignment_48936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Method_declaration__StatementAssignment_7_08967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Method_declaration__DebugAssignment_7_19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Constructor_declaration__ModifiersAssignment_09042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_19073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_39104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_59135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_09166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_19197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_09228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_19259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Variable_declaration__ModifiersAssignment_09290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_19321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_29352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_19383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_09414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_09445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_19476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_29507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_0_09538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_0_29569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_1_29600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_29631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_19662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_09693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_09724 = new BitSet(new long[]{0x0000000000000002L});

}