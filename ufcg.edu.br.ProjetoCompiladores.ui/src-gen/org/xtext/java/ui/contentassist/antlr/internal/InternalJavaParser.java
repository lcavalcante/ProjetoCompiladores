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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC_COMMENT", "RULE_MODIFIER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'float'", "'long'", "'double'", "';'", "'interface'", "'{'", "'}'", "'extends'", "','", "'class'", "'implements'", "'('", "')'", "'[]'", "'static'", "':'", "'break'", "'continue'", "'package'", "'.'", "'import'", "'.*;'"
    };
    public static final int RULE_MODIFIER=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DOC_COMMENT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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


    // $ANTLR start "entryRuleConstructor_declaration"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:228:1: entryRuleConstructor_declaration : ruleConstructor_declaration EOF ;
    public final void entryRuleConstructor_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:229:1: ( ruleConstructor_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:230:1: ruleConstructor_declaration EOF
            {
             before(grammarAccess.getConstructor_declarationRule()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration421);
            ruleConstructor_declaration();

            state._fsp--;

             after(grammarAccess.getConstructor_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor_declaration428); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:237:1: ruleConstructor_declaration : ( ( rule__Constructor_declaration__Group__0 ) ) ;
    public final void ruleConstructor_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:241:2: ( ( ( rule__Constructor_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:242:1: ( ( rule__Constructor_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:242:1: ( ( rule__Constructor_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:243:1: ( rule__Constructor_declaration__Group__0 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:244:1: ( rule__Constructor_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:244:2: rule__Constructor_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration454);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:256:1: entryRuleParameter_list : ruleParameter_list EOF ;
    public final void entryRuleParameter_list() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:257:1: ( ruleParameter_list EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:258:1: ruleParameter_list EOF
            {
             before(grammarAccess.getParameter_listRule()); 
            pushFollow(FOLLOW_ruleParameter_list_in_entryRuleParameter_list481);
            ruleParameter_list();

            state._fsp--;

             after(grammarAccess.getParameter_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter_list488); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:265:1: ruleParameter_list : ( ( rule__Parameter_list__Group__0 ) ) ;
    public final void ruleParameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:269:2: ( ( ( rule__Parameter_list__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:270:1: ( ( rule__Parameter_list__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:270:1: ( ( rule__Parameter_list__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:271:1: ( rule__Parameter_list__Group__0 )
            {
             before(grammarAccess.getParameter_listAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:272:1: ( rule__Parameter_list__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:272:2: rule__Parameter_list__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list514);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:284:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:285:1: ( ruleParameter EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:286:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter541);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter548); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:293:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:297:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:298:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:298:1: ( ( rule__Parameter__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:299:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:300:1: ( rule__Parameter__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:300:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter574);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:312:1: entryRuleVariable_declaration : ruleVariable_declaration EOF ;
    public final void entryRuleVariable_declaration() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:313:1: ( ruleVariable_declaration EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:314:1: ruleVariable_declaration EOF
            {
             before(grammarAccess.getVariable_declarationRule()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration601);
            ruleVariable_declaration();

            state._fsp--;

             after(grammarAccess.getVariable_declarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declaration608); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:321:1: ruleVariable_declaration : ( ( rule__Variable_declaration__Group__0 ) ) ;
    public final void ruleVariable_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:325:2: ( ( ( rule__Variable_declaration__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:326:1: ( ( rule__Variable_declaration__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:326:1: ( ( rule__Variable_declaration__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:327:1: ( rule__Variable_declaration__Group__0 )
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:328:1: ( rule__Variable_declaration__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:328:2: rule__Variable_declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration634);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:340:1: entryRuleVariable_declarator : ruleVariable_declarator EOF ;
    public final void entryRuleVariable_declarator() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:341:1: ( ruleVariable_declarator EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:342:1: ruleVariable_declarator EOF
            {
             before(grammarAccess.getVariable_declaratorRule()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator661);
            ruleVariable_declarator();

            state._fsp--;

             after(grammarAccess.getVariable_declaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable_declarator668); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:349:1: ruleVariable_declarator : ( ( rule__Variable_declarator__Group__0 ) ) ;
    public final void ruleVariable_declarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:353:2: ( ( ( rule__Variable_declarator__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:354:1: ( ( rule__Variable_declarator__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:354:1: ( ( rule__Variable_declarator__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:355:1: ( rule__Variable_declarator__Group__0 )
            {
             before(grammarAccess.getVariable_declaratorAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:356:1: ( rule__Variable_declarator__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:356:2: rule__Variable_declarator__Group__0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator694);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:368:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:369:1: ( ruleType EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:370:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType721);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType728); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:377:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:381:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:382:1: ( ( rule__Type__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:382:1: ( ( rule__Type__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:383:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:384:1: ( rule__Type__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:384:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType754);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:396:1: entryRuleType_specifier : ruleType_specifier EOF ;
    public final void entryRuleType_specifier() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:397:1: ( ruleType_specifier EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:398:1: ruleType_specifier EOF
            {
             before(grammarAccess.getType_specifierRule()); 
            pushFollow(FOLLOW_ruleType_specifier_in_entryRuleType_specifier781);
            ruleType_specifier();

            state._fsp--;

             after(grammarAccess.getType_specifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType_specifier788); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:405:1: ruleType_specifier : ( ( rule__Type_specifier__Alternatives ) ) ;
    public final void ruleType_specifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:409:2: ( ( ( rule__Type_specifier__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:410:1: ( ( rule__Type_specifier__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:410:1: ( ( rule__Type_specifier__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:411:1: ( rule__Type_specifier__Alternatives )
            {
             before(grammarAccess.getType_specifierAccess().getAlternatives()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:412:1: ( rule__Type_specifier__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:412:2: rule__Type_specifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier814);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:424:1: entryRuleStatic_initializer : ruleStatic_initializer EOF ;
    public final void entryRuleStatic_initializer() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:425:1: ( ruleStatic_initializer EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:426:1: ruleStatic_initializer EOF
            {
             before(grammarAccess.getStatic_initializerRule()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer841);
            ruleStatic_initializer();

            state._fsp--;

             after(grammarAccess.getStatic_initializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatic_initializer848); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:433:1: ruleStatic_initializer : ( ( rule__Static_initializer__Group__0 ) ) ;
    public final void ruleStatic_initializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:437:2: ( ( ( rule__Static_initializer__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:438:1: ( ( rule__Static_initializer__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:438:1: ( ( rule__Static_initializer__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:439:1: ( rule__Static_initializer__Group__0 )
            {
             before(grammarAccess.getStatic_initializerAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:440:1: ( rule__Static_initializer__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:440:2: rule__Static_initializer__Group__0
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer874);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:452:1: entryRuleStatement_block : ruleStatement_block EOF ;
    public final void entryRuleStatement_block() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:453:1: ( ruleStatement_block EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:454:1: ruleStatement_block EOF
            {
             before(grammarAccess.getStatement_blockRule()); 
            pushFollow(FOLLOW_ruleStatement_block_in_entryRuleStatement_block901);
            ruleStatement_block();

            state._fsp--;

             after(grammarAccess.getStatement_blockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_block908); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:461:1: ruleStatement_block : ( ( rule__Statement_block__Group__0 ) ) ;
    public final void ruleStatement_block() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:465:2: ( ( ( rule__Statement_block__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:466:1: ( ( rule__Statement_block__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:466:1: ( ( rule__Statement_block__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:467:1: ( rule__Statement_block__Group__0 )
            {
             before(grammarAccess.getStatement_blockAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:468:1: ( rule__Statement_block__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:468:2: rule__Statement_block__Group__0
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block934);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:480:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:481:1: ( ruleStatement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:482:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement961);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement968); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:489:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:493:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:494:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:494:1: ( ( rule__Statement__Alternatives ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:495:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:496:1: ( rule__Statement__Alternatives )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:496:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement994);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:508:1: entryRulePackage_statement : rulePackage_statement EOF ;
    public final void entryRulePackage_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:509:1: ( rulePackage_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:510:1: rulePackage_statement EOF
            {
             before(grammarAccess.getPackage_statementRule()); 
            pushFollow(FOLLOW_rulePackage_statement_in_entryRulePackage_statement1021);
            rulePackage_statement();

            state._fsp--;

             after(grammarAccess.getPackage_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_statement1028); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:517:1: rulePackage_statement : ( ( rule__Package_statement__Group__0 ) ) ;
    public final void rulePackage_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:521:2: ( ( ( rule__Package_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:522:1: ( ( rule__Package_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:522:1: ( ( rule__Package_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:523:1: ( rule__Package_statement__Group__0 )
            {
             before(grammarAccess.getPackage_statementAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:524:1: ( rule__Package_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:524:2: rule__Package_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1054);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:536:1: entryRulePackage_name : rulePackage_name EOF ;
    public final void entryRulePackage_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:537:1: ( rulePackage_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:538:1: rulePackage_name EOF
            {
             before(grammarAccess.getPackage_nameRule()); 
            pushFollow(FOLLOW_rulePackage_name_in_entryRulePackage_name1081);
            rulePackage_name();

            state._fsp--;

             after(grammarAccess.getPackage_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name1088); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:545:1: rulePackage_name : ( ( rule__Package_name__Group__0 ) ) ;
    public final void rulePackage_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:549:2: ( ( ( rule__Package_name__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:550:1: ( ( rule__Package_name__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:550:1: ( ( rule__Package_name__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:551:1: ( rule__Package_name__Group__0 )
            {
             before(grammarAccess.getPackage_nameAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:552:1: ( rule__Package_name__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:552:2: rule__Package_name__Group__0
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1114);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:564:1: entryRulePackage_name_aux : rulePackage_name_aux EOF ;
    public final void entryRulePackage_name_aux() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:565:1: ( rulePackage_name_aux EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:566:1: rulePackage_name_aux EOF
            {
             before(grammarAccess.getPackage_name_auxRule()); 
            pushFollow(FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1141);
            rulePackage_name_aux();

            state._fsp--;

             after(grammarAccess.getPackage_name_auxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage_name_aux1148); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:573:1: rulePackage_name_aux : ( ( rule__Package_name_aux__Group__0 )* ) ;
    public final void rulePackage_name_aux() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:577:2: ( ( ( rule__Package_name_aux__Group__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:578:1: ( ( rule__Package_name_aux__Group__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:578:1: ( ( rule__Package_name_aux__Group__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:579:1: ( rule__Package_name_aux__Group__0 )*
            {
             before(grammarAccess.getPackage_name_auxAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:580:1: ( rule__Package_name_aux__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:580:2: rule__Package_name_aux__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1174);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:592:1: entryRuleImport_statement : ruleImport_statement EOF ;
    public final void entryRuleImport_statement() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:593:1: ( ruleImport_statement EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:594:1: ruleImport_statement EOF
            {
             before(grammarAccess.getImport_statementRule()); 
            pushFollow(FOLLOW_ruleImport_statement_in_entryRuleImport_statement1202);
            ruleImport_statement();

            state._fsp--;

             after(grammarAccess.getImport_statementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport_statement1209); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:601:1: ruleImport_statement : ( ( rule__Import_statement__Group__0 ) ) ;
    public final void ruleImport_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:605:2: ( ( ( rule__Import_statement__Group__0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:606:1: ( ( rule__Import_statement__Group__0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:606:1: ( ( rule__Import_statement__Group__0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:607:1: ( rule__Import_statement__Group__0 )
            {
             before(grammarAccess.getImport_statementAccess().getGroup()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:608:1: ( rule__Import_statement__Group__0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:608:2: rule__Import_statement__Group__0
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1235);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:620:1: entryRuleClass_name : ruleClass_name EOF ;
    public final void entryRuleClass_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:621:1: ( ruleClass_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:622:1: ruleClass_name EOF
            {
             before(grammarAccess.getClass_nameRule()); 
            pushFollow(FOLLOW_ruleClass_name_in_entryRuleClass_name1262);
            ruleClass_name();

            state._fsp--;

             after(grammarAccess.getClass_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass_name1269); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:629:1: ruleClass_name : ( rulePackage_name ) ;
    public final void ruleClass_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:633:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:634:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:634:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:635:1: rulePackage_name
            {
             before(grammarAccess.getClass_nameAccess().getPackage_nameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackage_name_in_ruleClass_name1295);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:648:1: entryRuleInterface_name : ruleInterface_name EOF ;
    public final void entryRuleInterface_name() throws RecognitionException {
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:649:1: ( ruleInterface_name EOF )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:650:1: ruleInterface_name EOF
            {
             before(grammarAccess.getInterface_nameRule()); 
            pushFollow(FOLLOW_ruleInterface_name_in_entryRuleInterface_name1321);
            ruleInterface_name();

            state._fsp--;

             after(grammarAccess.getInterface_nameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface_name1328); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:657:1: ruleInterface_name : ( rulePackage_name ) ;
    public final void ruleInterface_name() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:661:2: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:662:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:662:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:663:1: rulePackage_name
            {
             before(grammarAccess.getInterface_nameAccess().getPackage_nameParserRuleCall()); 
            pushFollow(FOLLOW_rulePackage_name_in_ruleInterface_name1354);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:676:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );
    public final void rule__Type_declaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:680:1: ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:681:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:681:1: ( ( rule__Type_declaration__NameAssignment_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:682:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:683:1: ( rule__Type_declaration__NameAssignment_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:683:2: rule__Type_declaration__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11389);
                    rule__Type_declaration__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getType_declarationAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:687:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:687:6: ( ( rule__Type_declaration__NameAssignment_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:688:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getType_declarationAccess().getNameAssignment_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:689:1: ( rule__Type_declaration__NameAssignment_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:689:2: rule__Type_declaration__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11407);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:698:1: rule__Field_declaration__Alternatives : ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) );
    public final void rule__Field_declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:702:1: ( ( ( rule__Field_declaration__Group_0__0 ) ) | ( ( rule__Field_declaration__NameAssignment_1 ) ) | ( ( rule__Field_declaration__DebugAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_DOC_COMMENT:
            case RULE_MODIFIER:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 21:
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
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:703:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:703:1: ( ( rule__Field_declaration__Group_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:704:1: ( rule__Field_declaration__Group_0__0 )
                    {
                     before(grammarAccess.getField_declarationAccess().getGroup_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:705:1: ( rule__Field_declaration__Group_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:705:2: rule__Field_declaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1440);
                    rule__Field_declaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:709:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:709:6: ( ( rule__Field_declaration__NameAssignment_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:710:1: ( rule__Field_declaration__NameAssignment_1 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:711:1: ( rule__Field_declaration__NameAssignment_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:711:2: rule__Field_declaration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1458);
                    rule__Field_declaration__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:715:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:715:6: ( ( rule__Field_declaration__DebugAssignment_2 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:716:1: ( rule__Field_declaration__DebugAssignment_2 )
                    {
                     before(grammarAccess.getField_declarationAccess().getDebugAssignment_2()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:717:1: ( rule__Field_declaration__DebugAssignment_2 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:717:2: rule__Field_declaration__DebugAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1476);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:726:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) );
    public final void rule__Field_declaration__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:730:1: ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:731:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:731:1: ( ( rule__Field_declaration__NameAssignment_0_1_0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:732:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:733:1: ( rule__Field_declaration__NameAssignment_0_1_0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:733:2: rule__Field_declaration__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11509);
                    rule__Field_declaration__NameAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:737:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:737:6: ( ( rule__Field_declaration__NameAssignment_0_1_1 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:738:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    {
                     before(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:739:1: ( rule__Field_declaration__NameAssignment_0_1_1 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:739:2: rule__Field_declaration__NameAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11527);
                    rule__Field_declaration__NameAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getField_declarationAccess().getNameAssignment_0_1_1()); 

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


    // $ANTLR start "rule__Type_specifier__Alternatives"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:748:1: rule__Type_specifier__Alternatives : ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) );
    public final void rule__Type_specifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:752:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'char' ) | ( 'short' ) | ( 'int' ) | ( 'float' ) | ( 'long' ) | ( 'double' ) | ( ruleClass_name ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
                {
                alt5=8;
                }
                break;
            case RULE_ID:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:753:1: ( 'boolean' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:753:1: ( 'boolean' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:754:1: 'boolean'
                    {
                     before(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Type_specifier__Alternatives1561); 
                     after(grammarAccess.getType_specifierAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:761:6: ( 'byte' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:761:6: ( 'byte' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:762:1: 'byte'
                    {
                     before(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Type_specifier__Alternatives1581); 
                     after(grammarAccess.getType_specifierAccess().getByteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:769:6: ( 'char' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:769:6: ( 'char' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:770:1: 'char'
                    {
                     before(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Type_specifier__Alternatives1601); 
                     after(grammarAccess.getType_specifierAccess().getCharKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:777:6: ( 'short' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:777:6: ( 'short' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:778:1: 'short'
                    {
                     before(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__Type_specifier__Alternatives1621); 
                     after(grammarAccess.getType_specifierAccess().getShortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:785:6: ( 'int' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:785:6: ( 'int' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:786:1: 'int'
                    {
                     before(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__Type_specifier__Alternatives1641); 
                     after(grammarAccess.getType_specifierAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:793:6: ( 'float' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:793:6: ( 'float' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:794:1: 'float'
                    {
                     before(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__Type_specifier__Alternatives1661); 
                     after(grammarAccess.getType_specifierAccess().getFloatKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:801:6: ( 'long' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:801:6: ( 'long' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:802:1: 'long'
                    {
                     before(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 
                    match(input,19,FOLLOW_19_in_rule__Type_specifier__Alternatives1681); 
                     after(grammarAccess.getType_specifierAccess().getLongKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:809:6: ( 'double' )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:809:6: ( 'double' )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:810:1: 'double'
                    {
                     before(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 
                    match(input,20,FOLLOW_20_in_rule__Type_specifier__Alternatives1701); 
                     after(grammarAccess.getType_specifierAccess().getDoubleKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:817:6: ( ruleClass_name )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:817:6: ( ruleClass_name )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:818:1: ruleClass_name
                    {
                     before(grammarAccess.getType_specifierAccess().getClass_nameParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1720);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:828:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:832:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:833:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:833:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:834:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:835:1: ( rule__Statement__Group_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:835:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1752);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:839:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:839:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:840:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:841:1: ( rule__Statement__Group_1__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:841:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1770);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:845:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:845:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:846:1: ( rule__Statement__Group_2__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_2()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:847:1: ( rule__Statement__Group_2__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:847:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1788);
                    rule__Statement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:851:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:851:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:852:1: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:853:1: ( rule__Statement__Group_3__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:853:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1806);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:862:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );
    public final void rule__Import_statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:866:1: ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:867:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:867:1: ( ( rule__Import_statement__Group_1_0__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:868:1: ( rule__Import_statement__Group_1_0__0 )
                    {
                     before(grammarAccess.getImport_statementAccess().getGroup_1_0()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:869:1: ( rule__Import_statement__Group_1_0__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:869:2: rule__Import_statement__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_11839);
                    rule__Import_statement__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImport_statementAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:873:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:873:6: ( ( rule__Import_statement__Group_1_1__0 ) )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:874:1: ( rule__Import_statement__Group_1_1__0 )
                    {
                     before(grammarAccess.getImport_statementAccess().getGroup_1_1()); 
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:875:1: ( rule__Import_statement__Group_1_1__0 )
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:875:2: rule__Import_statement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_11857);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:886:1: rule__Compilation_unit__Group__0 : rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 ;
    public final void rule__Compilation_unit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:890:1: ( rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:891:2: rule__Compilation_unit__Group__0__Impl rule__Compilation_unit__Group__1
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__01888);
            rule__Compilation_unit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__01891);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:898:1: rule__Compilation_unit__Group__0__Impl : ( ( rule__Compilation_unit__PackageAssignment_0 )? ) ;
    public final void rule__Compilation_unit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:902:1: ( ( ( rule__Compilation_unit__PackageAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:903:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:903:1: ( ( rule__Compilation_unit__PackageAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:904:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            {
             before(grammarAccess.getCompilation_unitAccess().getPackageAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:905:1: ( rule__Compilation_unit__PackageAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:905:2: rule__Compilation_unit__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl1918);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:915:1: rule__Compilation_unit__Group__1 : rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 ;
    public final void rule__Compilation_unit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:919:1: ( rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:920:2: rule__Compilation_unit__Group__1__Impl rule__Compilation_unit__Group__2
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__11949);
            rule__Compilation_unit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__11952);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:927:1: rule__Compilation_unit__Group__1__Impl : ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) ;
    public final void rule__Compilation_unit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:931:1: ( ( ( rule__Compilation_unit__ImportsAssignment_1 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:932:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:932:1: ( ( rule__Compilation_unit__ImportsAssignment_1 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:933:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            {
             before(grammarAccess.getCompilation_unitAccess().getImportsAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:934:1: ( rule__Compilation_unit__ImportsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:934:2: rule__Compilation_unit__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl1979);
            	    rule__Compilation_unit__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:944:1: rule__Compilation_unit__Group__2 : rule__Compilation_unit__Group__2__Impl ;
    public final void rule__Compilation_unit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:948:1: ( rule__Compilation_unit__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:949:2: rule__Compilation_unit__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22010);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:955:1: rule__Compilation_unit__Group__2__Impl : ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) ;
    public final void rule__Compilation_unit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:959:1: ( ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:960:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:960:1: ( ( rule__Compilation_unit__Type_declarationsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:961:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            {
             before(grammarAccess.getCompilation_unitAccess().getType_declarationsAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:962:1: ( rule__Compilation_unit__Type_declarationsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_DOC_COMMENT && LA10_0<=RULE_MODIFIER)||LA10_0==22||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:962:2: rule__Compilation_unit__Type_declarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2037);
            	    rule__Compilation_unit__Type_declarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:978:1: rule__Type_declaration__Group__0 : rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 ;
    public final void rule__Type_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:982:1: ( rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:983:2: rule__Type_declaration__Group__0__Impl rule__Type_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02074);
            rule__Type_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02077);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:990:1: rule__Type_declaration__Group__0__Impl : ( ( rule__Type_declaration__DocAssignment_0 )? ) ;
    public final void rule__Type_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:994:1: ( ( ( rule__Type_declaration__DocAssignment_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:995:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:995:1: ( ( rule__Type_declaration__DocAssignment_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:996:1: ( rule__Type_declaration__DocAssignment_0 )?
            {
             before(grammarAccess.getType_declarationAccess().getDocAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:997:1: ( rule__Type_declaration__DocAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOC_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:997:2: rule__Type_declaration__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2104);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1007:1: rule__Type_declaration__Group__1 : rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 ;
    public final void rule__Type_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1011:1: ( rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1012:2: rule__Type_declaration__Group__1__Impl rule__Type_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12135);
            rule__Type_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12138);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1019:1: rule__Type_declaration__Group__1__Impl : ( ( rule__Type_declaration__Alternatives_1 ) ) ;
    public final void rule__Type_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1023:1: ( ( ( rule__Type_declaration__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1024:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1024:1: ( ( rule__Type_declaration__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1025:1: ( rule__Type_declaration__Alternatives_1 )
            {
             before(grammarAccess.getType_declarationAccess().getAlternatives_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1026:1: ( rule__Type_declaration__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1026:2: rule__Type_declaration__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2165);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1036:1: rule__Type_declaration__Group__2 : rule__Type_declaration__Group__2__Impl ;
    public final void rule__Type_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1040:1: ( rule__Type_declaration__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1041:2: rule__Type_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22195);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1047:1: rule__Type_declaration__Group__2__Impl : ( ';' ) ;
    public final void rule__Type_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1051:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1052:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1052:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1053:1: ';'
            {
             before(grammarAccess.getType_declarationAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Type_declaration__Group__2__Impl2223); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1072:1: rule__Interface_declaration__Group__0 : rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 ;
    public final void rule__Interface_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1076:1: ( rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1077:2: rule__Interface_declaration__Group__0__Impl rule__Interface_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02260);
            rule__Interface_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02263);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1084:1: rule__Interface_declaration__Group__0__Impl : ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Interface_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1088:1: ( ( ( rule__Interface_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1089:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1089:1: ( ( rule__Interface_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1090:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getInterface_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1091:1: ( rule__Interface_declaration__ModifiersAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_MODIFIER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1091:2: rule__Interface_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2290);
            	    rule__Interface_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1101:1: rule__Interface_declaration__Group__1 : rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 ;
    public final void rule__Interface_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1105:1: ( rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1106:2: rule__Interface_declaration__Group__1__Impl rule__Interface_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12321);
            rule__Interface_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12324);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1113:1: rule__Interface_declaration__Group__1__Impl : ( 'interface' ) ;
    public final void rule__Interface_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1117:1: ( ( 'interface' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1118:1: ( 'interface' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1118:1: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1119:1: 'interface'
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Interface_declaration__Group__1__Impl2352); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1132:1: rule__Interface_declaration__Group__2 : rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 ;
    public final void rule__Interface_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1136:1: ( rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1137:2: rule__Interface_declaration__Group__2__Impl rule__Interface_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22383);
            rule__Interface_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22386);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1144:1: rule__Interface_declaration__Group__2__Impl : ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) ;
    public final void rule__Interface_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1148:1: ( ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1149:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1149:1: ( ( rule__Interface_declaration__InterfaceNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1150:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1151:1: ( rule__Interface_declaration__InterfaceNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1151:2: rule__Interface_declaration__InterfaceNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2413);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1161:1: rule__Interface_declaration__Group__3 : rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 ;
    public final void rule__Interface_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1165:1: ( rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1166:2: rule__Interface_declaration__Group__3__Impl rule__Interface_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32443);
            rule__Interface_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32446);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1173:1: rule__Interface_declaration__Group__3__Impl : ( ( rule__Interface_declaration__Group_3__0 )? ) ;
    public final void rule__Interface_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1177:1: ( ( ( rule__Interface_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1178:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1178:1: ( ( rule__Interface_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1179:1: ( rule__Interface_declaration__Group_3__0 )?
            {
             before(grammarAccess.getInterface_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1180:1: ( rule__Interface_declaration__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1180:2: rule__Interface_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2473);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1190:1: rule__Interface_declaration__Group__4 : rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 ;
    public final void rule__Interface_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1194:1: ( rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1195:2: rule__Interface_declaration__Group__4__Impl rule__Interface_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42504);
            rule__Interface_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42507);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1202:1: rule__Interface_declaration__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1206:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1207:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1207:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1208:1: '{'
            {
             before(grammarAccess.getInterface_declarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__Interface_declaration__Group__4__Impl2535); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1221:1: rule__Interface_declaration__Group__5 : rule__Interface_declaration__Group__5__Impl ;
    public final void rule__Interface_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1225:1: ( rule__Interface_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1226:2: rule__Interface_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52566);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1232:1: rule__Interface_declaration__Group__5__Impl : ( '}' ) ;
    public final void rule__Interface_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1236:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1237:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1237:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1238:1: '}'
            {
             before(grammarAccess.getInterface_declarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Interface_declaration__Group__5__Impl2594); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1263:1: rule__Interface_declaration__Group_3__0 : rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 ;
    public final void rule__Interface_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1267:1: ( rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1268:2: rule__Interface_declaration__Group_3__0__Impl rule__Interface_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02637);
            rule__Interface_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02640);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1275:1: rule__Interface_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Interface_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1279:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1280:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1280:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1281:1: 'extends'
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Interface_declaration__Group_3__0__Impl2668); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1294:1: rule__Interface_declaration__Group_3__1 : rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 ;
    public final void rule__Interface_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1298:1: ( rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1299:2: rule__Interface_declaration__Group_3__1__Impl rule__Interface_declaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__12699);
            rule__Interface_declaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__12702);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1306:1: rule__Interface_declaration__Group_3__1__Impl : ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Interface_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1310:1: ( ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1311:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1311:1: ( ( rule__Interface_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1312:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1313:1: ( rule__Interface_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1313:2: rule__Interface_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl2729);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1323:1: rule__Interface_declaration__Group_3__2 : rule__Interface_declaration__Group_3__2__Impl ;
    public final void rule__Interface_declaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1327:1: ( rule__Interface_declaration__Group_3__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1328:2: rule__Interface_declaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__22759);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1334:1: rule__Interface_declaration__Group_3__2__Impl : ( ( rule__Interface_declaration__Group_3_2__0 )* ) ;
    public final void rule__Interface_declaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1338:1: ( ( ( rule__Interface_declaration__Group_3_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1339:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1339:1: ( ( rule__Interface_declaration__Group_3_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1340:1: ( rule__Interface_declaration__Group_3_2__0 )*
            {
             before(grammarAccess.getInterface_declarationAccess().getGroup_3_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1341:1: ( rule__Interface_declaration__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1341:2: rule__Interface_declaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl2786);
            	    rule__Interface_declaration__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1357:1: rule__Interface_declaration__Group_3_2__0 : rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 ;
    public final void rule__Interface_declaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1361:1: ( rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1362:2: rule__Interface_declaration__Group_3_2__0__Impl rule__Interface_declaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__02823);
            rule__Interface_declaration__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__02826);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1369:1: rule__Interface_declaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Interface_declaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1373:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1374:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1374:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1375:1: ','
            {
             before(grammarAccess.getInterface_declarationAccess().getCommaKeyword_3_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Interface_declaration__Group_3_2__0__Impl2854); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1388:1: rule__Interface_declaration__Group_3_2__1 : rule__Interface_declaration__Group_3_2__1__Impl ;
    public final void rule__Interface_declaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1392:1: ( rule__Interface_declaration__Group_3_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1393:2: rule__Interface_declaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__12885);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1399:1: rule__Interface_declaration__Group_3_2__1__Impl : ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__Interface_declaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1403:1: ( ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1404:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1404:1: ( ( rule__Interface_declaration__ExtendsAssignment_3_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1405:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsAssignment_3_2_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1406:1: ( rule__Interface_declaration__ExtendsAssignment_3_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1406:2: rule__Interface_declaration__ExtendsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl2912);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1420:1: rule__Class_declaration__Group__0 : rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 ;
    public final void rule__Class_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1424:1: ( rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1425:2: rule__Class_declaration__Group__0__Impl rule__Class_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__02946);
            rule__Class_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__02949);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1432:1: rule__Class_declaration__Group__0__Impl : ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Class_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1436:1: ( ( ( rule__Class_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1437:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1437:1: ( ( rule__Class_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1438:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getClass_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1439:1: ( rule__Class_declaration__ModifiersAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_MODIFIER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1439:2: rule__Class_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl2976);
            	    rule__Class_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1449:1: rule__Class_declaration__Group__1 : rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 ;
    public final void rule__Class_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1453:1: ( rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1454:2: rule__Class_declaration__Group__1__Impl rule__Class_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13007);
            rule__Class_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13010);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1461:1: rule__Class_declaration__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1465:1: ( ( 'class' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1466:1: ( 'class' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1466:1: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1467:1: 'class'
            {
             before(grammarAccess.getClass_declarationAccess().getClassKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Class_declaration__Group__1__Impl3038); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1480:1: rule__Class_declaration__Group__2 : rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 ;
    public final void rule__Class_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1484:1: ( rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1485:2: rule__Class_declaration__Group__2__Impl rule__Class_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23069);
            rule__Class_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23072);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1492:1: rule__Class_declaration__Group__2__Impl : ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) ;
    public final void rule__Class_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1496:1: ( ( ( rule__Class_declaration__ClassNameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1497:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1497:1: ( ( rule__Class_declaration__ClassNameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1498:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            {
             before(grammarAccess.getClass_declarationAccess().getClassNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1499:1: ( rule__Class_declaration__ClassNameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1499:2: rule__Class_declaration__ClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3099);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1509:1: rule__Class_declaration__Group__3 : rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 ;
    public final void rule__Class_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1513:1: ( rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1514:2: rule__Class_declaration__Group__3__Impl rule__Class_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33129);
            rule__Class_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33132);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1521:1: rule__Class_declaration__Group__3__Impl : ( ( rule__Class_declaration__Group_3__0 )? ) ;
    public final void rule__Class_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1525:1: ( ( ( rule__Class_declaration__Group_3__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1526:1: ( ( rule__Class_declaration__Group_3__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1526:1: ( ( rule__Class_declaration__Group_3__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1527:1: ( rule__Class_declaration__Group_3__0 )?
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1528:1: ( rule__Class_declaration__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1528:2: rule__Class_declaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3159);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1538:1: rule__Class_declaration__Group__4 : rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 ;
    public final void rule__Class_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1542:1: ( rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1543:2: rule__Class_declaration__Group__4__Impl rule__Class_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43190);
            rule__Class_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43193);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1550:1: rule__Class_declaration__Group__4__Impl : ( ( rule__Class_declaration__Group_4__0 )? ) ;
    public final void rule__Class_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1554:1: ( ( ( rule__Class_declaration__Group_4__0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1555:1: ( ( rule__Class_declaration__Group_4__0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1555:1: ( ( rule__Class_declaration__Group_4__0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1556:1: ( rule__Class_declaration__Group_4__0 )?
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_4()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1557:1: ( rule__Class_declaration__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1557:2: rule__Class_declaration__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3220);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1567:1: rule__Class_declaration__Group__5 : rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 ;
    public final void rule__Class_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1571:1: ( rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1572:2: rule__Class_declaration__Group__5__Impl rule__Class_declaration__Group__6
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53251);
            rule__Class_declaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53254);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1579:1: rule__Class_declaration__Group__5__Impl : ( '{' ) ;
    public final void rule__Class_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1583:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1584:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1585:1: '{'
            {
             before(grammarAccess.getClass_declarationAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Class_declaration__Group__5__Impl3282); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1598:1: rule__Class_declaration__Group__6 : rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 ;
    public final void rule__Class_declaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1602:1: ( rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1603:2: rule__Class_declaration__Group__6__Impl rule__Class_declaration__Group__7
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63313);
            rule__Class_declaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63316);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1610:1: rule__Class_declaration__Group__6__Impl : ( ( rule__Class_declaration__FieldsAssignment_6 )* ) ;
    public final void rule__Class_declaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1614:1: ( ( ( rule__Class_declaration__FieldsAssignment_6 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1615:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1615:1: ( ( rule__Class_declaration__FieldsAssignment_6 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1616:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            {
             before(grammarAccess.getClass_declarationAccess().getFieldsAssignment_6()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1617:1: ( rule__Class_declaration__FieldsAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_MODIFIER)||(LA18_0>=13 && LA18_0<=21)||LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1617:2: rule__Class_declaration__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3343);
            	    rule__Class_declaration__FieldsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1627:1: rule__Class_declaration__Group__7 : rule__Class_declaration__Group__7__Impl ;
    public final void rule__Class_declaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1631:1: ( rule__Class_declaration__Group__7__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1632:2: rule__Class_declaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73374);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1638:1: rule__Class_declaration__Group__7__Impl : ( '}' ) ;
    public final void rule__Class_declaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1642:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1643:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1643:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1644:1: '}'
            {
             before(grammarAccess.getClass_declarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_24_in_rule__Class_declaration__Group__7__Impl3402); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1673:1: rule__Class_declaration__Group_3__0 : rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 ;
    public final void rule__Class_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1677:1: ( rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1678:2: rule__Class_declaration__Group_3__0__Impl rule__Class_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03449);
            rule__Class_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03452);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1685:1: rule__Class_declaration__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1689:1: ( ( 'extends' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1690:1: ( 'extends' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1690:1: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1691:1: 'extends'
            {
             before(grammarAccess.getClass_declarationAccess().getExtendsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Class_declaration__Group_3__0__Impl3480); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1704:1: rule__Class_declaration__Group_3__1 : rule__Class_declaration__Group_3__1__Impl ;
    public final void rule__Class_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1708:1: ( rule__Class_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1709:2: rule__Class_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13511);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1715:1: rule__Class_declaration__Group_3__1__Impl : ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) ;
    public final void rule__Class_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1719:1: ( ( ( rule__Class_declaration__ExtendAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1720:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1720:1: ( ( rule__Class_declaration__ExtendAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1721:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getExtendAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1722:1: ( rule__Class_declaration__ExtendAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1722:2: rule__Class_declaration__ExtendAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3538);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1736:1: rule__Class_declaration__Group_4__0 : rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 ;
    public final void rule__Class_declaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1740:1: ( rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1741:2: rule__Class_declaration__Group_4__0__Impl rule__Class_declaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03572);
            rule__Class_declaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03575);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1748:1: rule__Class_declaration__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__Class_declaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1752:1: ( ( 'implements' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1753:1: ( 'implements' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1753:1: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1754:1: 'implements'
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__Class_declaration__Group_4__0__Impl3603); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1767:1: rule__Class_declaration__Group_4__1 : rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 ;
    public final void rule__Class_declaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1771:1: ( rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1772:2: rule__Class_declaration__Group_4__1__Impl rule__Class_declaration__Group_4__2
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13634);
            rule__Class_declaration__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13637);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1779:1: rule__Class_declaration__Group_4__1__Impl : ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) ;
    public final void rule__Class_declaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1783:1: ( ( ( rule__Class_declaration__ImplementAssignment_4_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1784:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1784:1: ( ( rule__Class_declaration__ImplementAssignment_4_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1785:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getImplementAssignment_4_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1786:1: ( rule__Class_declaration__ImplementAssignment_4_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1786:2: rule__Class_declaration__ImplementAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl3664);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1796:1: rule__Class_declaration__Group_4__2 : rule__Class_declaration__Group_4__2__Impl ;
    public final void rule__Class_declaration__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1800:1: ( rule__Class_declaration__Group_4__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1801:2: rule__Class_declaration__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__23694);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1807:1: rule__Class_declaration__Group_4__2__Impl : ( ( rule__Class_declaration__Group_4_2__0 )* ) ;
    public final void rule__Class_declaration__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1811:1: ( ( ( rule__Class_declaration__Group_4_2__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1812:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1812:1: ( ( rule__Class_declaration__Group_4_2__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1813:1: ( rule__Class_declaration__Group_4_2__0 )*
            {
             before(grammarAccess.getClass_declarationAccess().getGroup_4_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1814:1: ( rule__Class_declaration__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1814:2: rule__Class_declaration__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl3721);
            	    rule__Class_declaration__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1830:1: rule__Class_declaration__Group_4_2__0 : rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 ;
    public final void rule__Class_declaration__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1834:1: ( rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1835:2: rule__Class_declaration__Group_4_2__0__Impl rule__Class_declaration__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__03758);
            rule__Class_declaration__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__03761);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1842:1: rule__Class_declaration__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Class_declaration__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1846:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1847:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1847:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1848:1: ','
            {
             before(grammarAccess.getClass_declarationAccess().getCommaKeyword_4_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Class_declaration__Group_4_2__0__Impl3789); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1861:1: rule__Class_declaration__Group_4_2__1 : rule__Class_declaration__Group_4_2__1__Impl ;
    public final void rule__Class_declaration__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1865:1: ( rule__Class_declaration__Group_4_2__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1866:2: rule__Class_declaration__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__13820);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1872:1: rule__Class_declaration__Group_4_2__1__Impl : ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) ;
    public final void rule__Class_declaration__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1876:1: ( ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1877:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1877:1: ( ( rule__Class_declaration__ImplementsAssignment_4_2_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1878:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsAssignment_4_2_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1879:1: ( rule__Class_declaration__ImplementsAssignment_4_2_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1879:2: rule__Class_declaration__ImplementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl3847);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1893:1: rule__Field_declaration__Group_0__0 : rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 ;
    public final void rule__Field_declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1897:1: ( rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1898:2: rule__Field_declaration__Group_0__0__Impl rule__Field_declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__03881);
            rule__Field_declaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__03884);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1905:1: rule__Field_declaration__Group_0__0__Impl : ( ( rule__Field_declaration__DocAssignment_0_0 )? ) ;
    public final void rule__Field_declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1909:1: ( ( ( rule__Field_declaration__DocAssignment_0_0 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1910:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1910:1: ( ( rule__Field_declaration__DocAssignment_0_0 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1911:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            {
             before(grammarAccess.getField_declarationAccess().getDocAssignment_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1912:1: ( rule__Field_declaration__DocAssignment_0_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOC_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1912:2: rule__Field_declaration__DocAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl3911);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1922:1: rule__Field_declaration__Group_0__1 : rule__Field_declaration__Group_0__1__Impl ;
    public final void rule__Field_declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1926:1: ( rule__Field_declaration__Group_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1927:2: rule__Field_declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__13942);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1933:1: rule__Field_declaration__Group_0__1__Impl : ( ( rule__Field_declaration__Alternatives_0_1 ) ) ;
    public final void rule__Field_declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1937:1: ( ( ( rule__Field_declaration__Alternatives_0_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1938:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1938:1: ( ( rule__Field_declaration__Alternatives_0_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1939:1: ( rule__Field_declaration__Alternatives_0_1 )
            {
             before(grammarAccess.getField_declarationAccess().getAlternatives_0_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1940:1: ( rule__Field_declaration__Alternatives_0_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1940:2: rule__Field_declaration__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl3969);
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


    // $ANTLR start "rule__Constructor_declaration__Group__0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1954:1: rule__Constructor_declaration__Group__0 : rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 ;
    public final void rule__Constructor_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1958:1: ( rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1959:2: rule__Constructor_declaration__Group__0__Impl rule__Constructor_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04003);
            rule__Constructor_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04006);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1966:1: rule__Constructor_declaration__Group__0__Impl : ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Constructor_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1970:1: ( ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1971:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1971:1: ( ( rule__Constructor_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1972:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getConstructor_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1973:1: ( rule__Constructor_declaration__ModifiersAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_MODIFIER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1973:2: rule__Constructor_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4033);
            	    rule__Constructor_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1983:1: rule__Constructor_declaration__Group__1 : rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 ;
    public final void rule__Constructor_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1987:1: ( rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1988:2: rule__Constructor_declaration__Group__1__Impl rule__Constructor_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14064);
            rule__Constructor_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14067);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1995:1: rule__Constructor_declaration__Group__1__Impl : ( ( rule__Constructor_declaration__NameAssignment_1 ) ) ;
    public final void rule__Constructor_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1999:1: ( ( ( rule__Constructor_declaration__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2000:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2000:1: ( ( rule__Constructor_declaration__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2001:1: ( rule__Constructor_declaration__NameAssignment_1 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2002:1: ( rule__Constructor_declaration__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2002:2: rule__Constructor_declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4094);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2012:1: rule__Constructor_declaration__Group__2 : rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 ;
    public final void rule__Constructor_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2016:1: ( rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2017:2: rule__Constructor_declaration__Group__2__Impl rule__Constructor_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24124);
            rule__Constructor_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24127);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2024:1: rule__Constructor_declaration__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2028:1: ( ( '(' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2029:1: ( '(' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2029:1: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2030:1: '('
            {
             before(grammarAccess.getConstructor_declarationAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Constructor_declaration__Group__2__Impl4155); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2043:1: rule__Constructor_declaration__Group__3 : rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 ;
    public final void rule__Constructor_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2047:1: ( rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2048:2: rule__Constructor_declaration__Group__3__Impl rule__Constructor_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__34186);
            rule__Constructor_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__34189);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2055:1: rule__Constructor_declaration__Group__3__Impl : ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) ;
    public final void rule__Constructor_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2059:1: ( ( ( rule__Constructor_declaration__ParametersAssignment_3 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2060:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2060:1: ( ( rule__Constructor_declaration__ParametersAssignment_3 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2061:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            {
             before(grammarAccess.getConstructor_declarationAccess().getParametersAssignment_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2062:1: ( rule__Constructor_declaration__ParametersAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=13 && LA22_0<=20)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2062:2: rule__Constructor_declaration__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl4216);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2072:1: rule__Constructor_declaration__Group__4 : rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 ;
    public final void rule__Constructor_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2076:1: ( rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2077:2: rule__Constructor_declaration__Group__4__Impl rule__Constructor_declaration__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__44247);
            rule__Constructor_declaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__44250);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2084:1: rule__Constructor_declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2088:1: ( ( ')' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2089:1: ( ')' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2089:1: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2090:1: ')'
            {
             before(grammarAccess.getConstructor_declarationAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Constructor_declaration__Group__4__Impl4278); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2103:1: rule__Constructor_declaration__Group__5 : rule__Constructor_declaration__Group__5__Impl ;
    public final void rule__Constructor_declaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2107:1: ( rule__Constructor_declaration__Group__5__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2108:2: rule__Constructor_declaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__54309);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2114:1: rule__Constructor_declaration__Group__5__Impl : ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) ;
    public final void rule__Constructor_declaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2118:1: ( ( ( rule__Constructor_declaration__StatementAssignment_5 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2119:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2119:1: ( ( rule__Constructor_declaration__StatementAssignment_5 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2120:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            {
             before(grammarAccess.getConstructor_declarationAccess().getStatementAssignment_5()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2121:1: ( rule__Constructor_declaration__StatementAssignment_5 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2121:2: rule__Constructor_declaration__StatementAssignment_5
            {
            pushFollow(FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl4336);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2143:1: rule__Parameter_list__Group__0 : rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 ;
    public final void rule__Parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2147:1: ( rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2148:2: rule__Parameter_list__Group__0__Impl rule__Parameter_list__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__04378);
            rule__Parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__04381);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2155:1: rule__Parameter_list__Group__0__Impl : ( ( rule__Parameter_list__ParameterAssignment_0 ) ) ;
    public final void rule__Parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2159:1: ( ( ( rule__Parameter_list__ParameterAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2160:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2160:1: ( ( rule__Parameter_list__ParameterAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2161:1: ( rule__Parameter_list__ParameterAssignment_0 )
            {
             before(grammarAccess.getParameter_listAccess().getParameterAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2162:1: ( rule__Parameter_list__ParameterAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2162:2: rule__Parameter_list__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl4408);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2172:1: rule__Parameter_list__Group__1 : rule__Parameter_list__Group__1__Impl ;
    public final void rule__Parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2176:1: ( rule__Parameter_list__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2177:2: rule__Parameter_list__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__14438);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2183:1: rule__Parameter_list__Group__1__Impl : ( ( rule__Parameter_list__Group_1__0 )* ) ;
    public final void rule__Parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2187:1: ( ( ( rule__Parameter_list__Group_1__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2188:1: ( ( rule__Parameter_list__Group_1__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2188:1: ( ( rule__Parameter_list__Group_1__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2189:1: ( rule__Parameter_list__Group_1__0 )*
            {
             before(grammarAccess.getParameter_listAccess().getGroup_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2190:1: ( rule__Parameter_list__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2190:2: rule__Parameter_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl4465);
            	    rule__Parameter_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2204:1: rule__Parameter_list__Group_1__0 : rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 ;
    public final void rule__Parameter_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2208:1: ( rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2209:2: rule__Parameter_list__Group_1__0__Impl rule__Parameter_list__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__04500);
            rule__Parameter_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__04503);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2216:1: rule__Parameter_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameter_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2220:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2221:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2221:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2222:1: ','
            {
             before(grammarAccess.getParameter_listAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Parameter_list__Group_1__0__Impl4531); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2235:1: rule__Parameter_list__Group_1__1 : rule__Parameter_list__Group_1__1__Impl ;
    public final void rule__Parameter_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2239:1: ( rule__Parameter_list__Group_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2240:2: rule__Parameter_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__14562);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2246:1: rule__Parameter_list__Group_1__1__Impl : ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameter_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2250:1: ( ( ( rule__Parameter_list__ParametersAssignment_1_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2251:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2251:1: ( ( rule__Parameter_list__ParametersAssignment_1_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2252:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParameter_listAccess().getParametersAssignment_1_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2253:1: ( rule__Parameter_list__ParametersAssignment_1_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2253:2: rule__Parameter_list__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl4589);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2267:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2271:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2272:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04623);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04626);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2279:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2283:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2284:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2284:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2285:1: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2286:1: ( rule__Parameter__TypeAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2286:2: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4653);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2296:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2300:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2301:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14683);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14686);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2308:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2312:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2313:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2313:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2314:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2315:1: ( rule__Parameter__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2315:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4713);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2325:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2329:1: ( rule__Parameter__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2330:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24743);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2336:1: rule__Parameter__Group__2__Impl : ( ( '[]' )* ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2340:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2341:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2341:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2342:1: ( '[]' )*
            {
             before(grammarAccess.getParameterAccess().getLeftSquareBracketRightSquareBracketKeyword_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2343:1: ( '[]' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2344:2: '[]'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__Parameter__Group__2__Impl4772); 

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2361:1: rule__Variable_declaration__Group__0 : rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 ;
    public final void rule__Variable_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2365:1: ( rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2366:2: rule__Variable_declaration__Group__0__Impl rule__Variable_declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__04811);
            rule__Variable_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__04814);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2373:1: rule__Variable_declaration__Group__0__Impl : ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) ;
    public final void rule__Variable_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2377:1: ( ( ( rule__Variable_declaration__ModifiersAssignment_0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2378:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2378:1: ( ( rule__Variable_declaration__ModifiersAssignment_0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2379:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            {
             before(grammarAccess.getVariable_declarationAccess().getModifiersAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2380:1: ( rule__Variable_declaration__ModifiersAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_MODIFIER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2380:2: rule__Variable_declaration__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl4841);
            	    rule__Variable_declaration__ModifiersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2390:1: rule__Variable_declaration__Group__1 : rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 ;
    public final void rule__Variable_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2394:1: ( rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2395:2: rule__Variable_declaration__Group__1__Impl rule__Variable_declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__14872);
            rule__Variable_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__14875);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2402:1: rule__Variable_declaration__Group__1__Impl : ( ( rule__Variable_declaration__TypeAssignment_1 ) ) ;
    public final void rule__Variable_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2406:1: ( ( ( rule__Variable_declaration__TypeAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2407:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2407:1: ( ( rule__Variable_declaration__TypeAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2408:1: ( rule__Variable_declaration__TypeAssignment_1 )
            {
             before(grammarAccess.getVariable_declarationAccess().getTypeAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2409:1: ( rule__Variable_declaration__TypeAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2409:2: rule__Variable_declaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl4902);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2419:1: rule__Variable_declaration__Group__2 : rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 ;
    public final void rule__Variable_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2423:1: ( rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2424:2: rule__Variable_declaration__Group__2__Impl rule__Variable_declaration__Group__3
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__24932);
            rule__Variable_declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__24935);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2431:1: rule__Variable_declaration__Group__2__Impl : ( ( rule__Variable_declaration__NameAssignment_2 ) ) ;
    public final void rule__Variable_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2435:1: ( ( ( rule__Variable_declaration__NameAssignment_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2436:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2436:1: ( ( rule__Variable_declaration__NameAssignment_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2437:1: ( rule__Variable_declaration__NameAssignment_2 )
            {
             before(grammarAccess.getVariable_declarationAccess().getNameAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2438:1: ( rule__Variable_declaration__NameAssignment_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2438:2: rule__Variable_declaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl4962);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2448:1: rule__Variable_declaration__Group__3 : rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 ;
    public final void rule__Variable_declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2452:1: ( rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2453:2: rule__Variable_declaration__Group__3__Impl rule__Variable_declaration__Group__4
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__34992);
            rule__Variable_declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__34995);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2460:1: rule__Variable_declaration__Group__3__Impl : ( ( rule__Variable_declaration__Group_3__0 )* ) ;
    public final void rule__Variable_declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2464:1: ( ( ( rule__Variable_declaration__Group_3__0 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2465:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2465:1: ( ( rule__Variable_declaration__Group_3__0 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2466:1: ( rule__Variable_declaration__Group_3__0 )*
            {
             before(grammarAccess.getVariable_declarationAccess().getGroup_3()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2467:1: ( rule__Variable_declaration__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2467:2: rule__Variable_declaration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5022);
            	    rule__Variable_declaration__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2477:1: rule__Variable_declaration__Group__4 : rule__Variable_declaration__Group__4__Impl ;
    public final void rule__Variable_declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2481:1: ( rule__Variable_declaration__Group__4__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2482:2: rule__Variable_declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45053);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2488:1: rule__Variable_declaration__Group__4__Impl : ( ';' ) ;
    public final void rule__Variable_declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2492:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2493:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2493:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2494:1: ';'
            {
             before(grammarAccess.getVariable_declarationAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Variable_declaration__Group__4__Impl5081); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2517:1: rule__Variable_declaration__Group_3__0 : rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 ;
    public final void rule__Variable_declaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2521:1: ( rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2522:2: rule__Variable_declaration__Group_3__0__Impl rule__Variable_declaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05122);
            rule__Variable_declaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05125);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2529:1: rule__Variable_declaration__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable_declaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2533:1: ( ( ',' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2534:1: ( ',' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2534:1: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2535:1: ','
            {
             before(grammarAccess.getVariable_declarationAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Variable_declaration__Group_3__0__Impl5153); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2548:1: rule__Variable_declaration__Group_3__1 : rule__Variable_declaration__Group_3__1__Impl ;
    public final void rule__Variable_declaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2552:1: ( rule__Variable_declaration__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2553:2: rule__Variable_declaration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__15184);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2559:1: rule__Variable_declaration__Group_3__1__Impl : ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) ;
    public final void rule__Variable_declaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2563:1: ( ( ( rule__Variable_declaration__NamesAssignment_3_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2564:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2564:1: ( ( rule__Variable_declaration__NamesAssignment_3_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2565:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            {
             before(grammarAccess.getVariable_declarationAccess().getNamesAssignment_3_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2566:1: ( rule__Variable_declaration__NamesAssignment_3_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2566:2: rule__Variable_declaration__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl5211);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2580:1: rule__Variable_declarator__Group__0 : rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 ;
    public final void rule__Variable_declarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2584:1: ( rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2585:2: rule__Variable_declarator__Group__0__Impl rule__Variable_declarator__Group__1
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__05245);
            rule__Variable_declarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__05248);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2592:1: rule__Variable_declarator__Group__0__Impl : ( ( rule__Variable_declarator__NameAssignment_0 ) ) ;
    public final void rule__Variable_declarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2596:1: ( ( ( rule__Variable_declarator__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2597:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2597:1: ( ( rule__Variable_declarator__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2598:1: ( rule__Variable_declarator__NameAssignment_0 )
            {
             before(grammarAccess.getVariable_declaratorAccess().getNameAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2599:1: ( rule__Variable_declarator__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2599:2: rule__Variable_declarator__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl5275);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2609:1: rule__Variable_declarator__Group__1 : rule__Variable_declarator__Group__1__Impl ;
    public final void rule__Variable_declarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2613:1: ( rule__Variable_declarator__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2614:2: rule__Variable_declarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__15305);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2620:1: rule__Variable_declarator__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Variable_declarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2624:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2625:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2625:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2626:1: ( '[]' )*
            {
             before(grammarAccess.getVariable_declaratorAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2627:1: ( '[]' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2628:2: '[]'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__Variable_declarator__Group__1__Impl5334); 

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2643:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2647:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2648:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__05371);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__05374);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2655:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2659:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2660:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2660:1: ( ( rule__Type__NameAssignment_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2661:1: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2662:1: ( rule__Type__NameAssignment_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2662:2: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl5401);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2672:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2676:1: ( rule__Type__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2677:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__15431);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2683:1: rule__Type__Group__1__Impl : ( ( '[]' )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2687:1: ( ( ( '[]' )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2688:1: ( ( '[]' )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2688:1: ( ( '[]' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2689:1: ( '[]' )*
            {
             before(grammarAccess.getTypeAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2690:1: ( '[]' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2691:2: '[]'
            	    {
            	    match(input,31,FOLLOW_31_in_rule__Type__Group__1__Impl5460); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2706:1: rule__Static_initializer__Group__0 : rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 ;
    public final void rule__Static_initializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2710:1: ( rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2711:2: rule__Static_initializer__Group__0__Impl rule__Static_initializer__Group__1
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__05497);
            rule__Static_initializer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__05500);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2718:1: rule__Static_initializer__Group__0__Impl : ( 'static' ) ;
    public final void rule__Static_initializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2722:1: ( ( 'static' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2723:1: ( 'static' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2723:1: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2724:1: 'static'
            {
             before(grammarAccess.getStatic_initializerAccess().getStaticKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Static_initializer__Group__0__Impl5528); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2737:1: rule__Static_initializer__Group__1 : rule__Static_initializer__Group__1__Impl ;
    public final void rule__Static_initializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2741:1: ( rule__Static_initializer__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2742:2: rule__Static_initializer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__15559);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2748:1: rule__Static_initializer__Group__1__Impl : ( ( rule__Static_initializer__NameAssignment_1 ) ) ;
    public final void rule__Static_initializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2752:1: ( ( ( rule__Static_initializer__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2753:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2753:1: ( ( rule__Static_initializer__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2754:1: ( rule__Static_initializer__NameAssignment_1 )
            {
             before(grammarAccess.getStatic_initializerAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2755:1: ( rule__Static_initializer__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2755:2: rule__Static_initializer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl5586);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2769:1: rule__Statement_block__Group__0 : rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 ;
    public final void rule__Statement_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2773:1: ( rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2774:2: rule__Statement_block__Group__0__Impl rule__Statement_block__Group__1
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__05620);
            rule__Statement_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__05623);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2781:1: rule__Statement_block__Group__0__Impl : ( () ) ;
    public final void rule__Statement_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2785:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2786:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2786:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2787:1: ()
            {
             before(grammarAccess.getStatement_blockAccess().getStatement_blockAction_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2788:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2790:1: 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2800:1: rule__Statement_block__Group__1 : rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 ;
    public final void rule__Statement_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2804:1: ( rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2805:2: rule__Statement_block__Group__1__Impl rule__Statement_block__Group__2
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__15681);
            rule__Statement_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__15684);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2812:1: rule__Statement_block__Group__1__Impl : ( '{' ) ;
    public final void rule__Statement_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2816:1: ( ( '{' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2817:1: ( '{' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2817:1: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2818:1: '{'
            {
             before(grammarAccess.getStatement_blockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Statement_block__Group__1__Impl5712); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2831:1: rule__Statement_block__Group__2 : rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 ;
    public final void rule__Statement_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2835:1: ( rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2836:2: rule__Statement_block__Group__2__Impl rule__Statement_block__Group__3
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__25743);
            rule__Statement_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__25746);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2843:1: rule__Statement_block__Group__2__Impl : ( ( rule__Statement_block__StatementsAssignment_2 )* ) ;
    public final void rule__Statement_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2847:1: ( ( ( rule__Statement_block__StatementsAssignment_2 )* ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2848:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2848:1: ( ( rule__Statement_block__StatementsAssignment_2 )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2849:1: ( rule__Statement_block__StatementsAssignment_2 )*
            {
             before(grammarAccess.getStatement_blockAccess().getStatementsAssignment_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2850:1: ( rule__Statement_block__StatementsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==21||(LA29_0>=34 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2850:2: rule__Statement_block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl5773);
            	    rule__Statement_block__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2860:1: rule__Statement_block__Group__3 : rule__Statement_block__Group__3__Impl ;
    public final void rule__Statement_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2864:1: ( rule__Statement_block__Group__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2865:2: rule__Statement_block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__35804);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2871:1: rule__Statement_block__Group__3__Impl : ( '}' ) ;
    public final void rule__Statement_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2875:1: ( ( '}' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2876:1: ( '}' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2876:1: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2877:1: '}'
            {
             before(grammarAccess.getStatement_blockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Statement_block__Group__3__Impl5832); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2898:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2902:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2903:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__05871);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__05874);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2910:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__NameAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2914:1: ( ( ( rule__Statement__NameAssignment_0_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2915:1: ( ( rule__Statement__NameAssignment_0_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2915:1: ( ( rule__Statement__NameAssignment_0_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2916:1: ( rule__Statement__NameAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2917:1: ( rule__Statement__NameAssignment_0_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2917:2: rule__Statement__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Statement__NameAssignment_0_0_in_rule__Statement__Group_0__0__Impl5901);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2927:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2931:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2932:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__15931);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__15934);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2939:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2943:1: ( ( ':' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2944:1: ( ':' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2944:1: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2945:1: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,33,FOLLOW_33_in_rule__Statement__Group_0__1__Impl5962); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2958:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2962:1: ( rule__Statement__Group_0__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2963:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__25993);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2969:1: rule__Statement__Group_0__2__Impl : ( ( rule__Statement__StatementAssignment_0_2 ) ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2973:1: ( ( ( rule__Statement__StatementAssignment_0_2 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2974:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2974:1: ( ( rule__Statement__StatementAssignment_0_2 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2975:1: ( rule__Statement__StatementAssignment_0_2 )
            {
             before(grammarAccess.getStatementAccess().getStatementAssignment_0_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2976:1: ( rule__Statement__StatementAssignment_0_2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2976:2: rule__Statement__StatementAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Statement__StatementAssignment_0_2_in_rule__Statement__Group_0__2__Impl6020);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2992:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2996:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:2997:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06056);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06059);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3004:1: rule__Statement__Group_1__0__Impl : ( () ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3008:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3009:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3009:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3010:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_1_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3011:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3013:1: 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3023:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3027:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3028:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16117);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16120);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3035:1: rule__Statement__Group_1__1__Impl : ( 'break' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3039:1: ( ( 'break' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3040:1: ( 'break' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3040:1: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3041:1: 'break'
            {
             before(grammarAccess.getStatementAccess().getBreakKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__Statement__Group_1__1__Impl6148); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3054:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3058:1: ( rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3059:2: rule__Statement__Group_1__2__Impl rule__Statement__Group_1__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26179);
            rule__Statement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__3_in_rule__Statement__Group_1__26182);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3066:1: rule__Statement__Group_1__2__Impl : ( ( rule__Statement__NameAssignment_1_2 )? ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3070:1: ( ( ( rule__Statement__NameAssignment_1_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3071:1: ( ( rule__Statement__NameAssignment_1_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3071:1: ( ( rule__Statement__NameAssignment_1_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3072:1: ( rule__Statement__NameAssignment_1_2 )?
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3073:1: ( rule__Statement__NameAssignment_1_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3073:2: rule__Statement__NameAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_1_2_in_rule__Statement__Group_1__2__Impl6209);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3083:1: rule__Statement__Group_1__3 : rule__Statement__Group_1__3__Impl ;
    public final void rule__Statement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3087:1: ( rule__Statement__Group_1__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3088:2: rule__Statement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__3__Impl_in_rule__Statement__Group_1__36240);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3094:1: rule__Statement__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3098:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3099:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3099:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3100:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_3()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group_1__3__Impl6268); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3121:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3125:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3126:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06307);
            rule__Statement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06310);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3133:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3137:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3138:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3138:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3139:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3140:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3142:1: 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3152:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3156:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3157:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__16368);
            rule__Statement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__16371);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3164:1: rule__Statement__Group_2__1__Impl : ( 'continue' ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3168:1: ( ( 'continue' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3169:1: ( 'continue' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3169:1: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3170:1: 'continue'
            {
             before(grammarAccess.getStatementAccess().getContinueKeyword_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Statement__Group_2__1__Impl6399); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3183:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3187:1: ( rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3188:2: rule__Statement__Group_2__2__Impl rule__Statement__Group_2__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__26430);
            rule__Statement__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_2__3_in_rule__Statement__Group_2__26433);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3195:1: rule__Statement__Group_2__2__Impl : ( ( rule__Statement__NameAssignment_2_2 )? ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3199:1: ( ( ( rule__Statement__NameAssignment_2_2 )? ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3200:1: ( ( rule__Statement__NameAssignment_2_2 )? )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3200:1: ( ( rule__Statement__NameAssignment_2_2 )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3201:1: ( rule__Statement__NameAssignment_2_2 )?
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_2_2()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3202:1: ( rule__Statement__NameAssignment_2_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3202:2: rule__Statement__NameAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__Statement__NameAssignment_2_2_in_rule__Statement__Group_2__2__Impl6460);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3212:1: rule__Statement__Group_2__3 : rule__Statement__Group_2__3__Impl ;
    public final void rule__Statement__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3216:1: ( rule__Statement__Group_2__3__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3217:2: rule__Statement__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__3__Impl_in_rule__Statement__Group_2__36491);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3223:1: rule__Statement__Group_2__3__Impl : ( ';' ) ;
    public final void rule__Statement__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3227:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3228:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3228:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3229:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group_2__3__Impl6519); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3250:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3254:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3255:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__06558);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__06561);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3262:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3266:1: ( ( () ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3267:1: ( () )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3267:1: ( () )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3268:1: ()
            {
             before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3269:1: ()
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3271:1: 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3281:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3285:1: ( rule__Statement__Group_3__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3286:2: rule__Statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__16619);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3292:1: rule__Statement__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3296:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3297:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3297:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3298:1: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group_3__1__Impl6647); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3315:1: rule__Package_statement__Group__0 : rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 ;
    public final void rule__Package_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3319:1: ( rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3320:2: rule__Package_statement__Group__0__Impl rule__Package_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__06682);
            rule__Package_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__06685);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3327:1: rule__Package_statement__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3331:1: ( ( 'package' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3332:1: ( 'package' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3332:1: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3333:1: 'package'
            {
             before(grammarAccess.getPackage_statementAccess().getPackageKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Package_statement__Group__0__Impl6713); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3346:1: rule__Package_statement__Group__1 : rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 ;
    public final void rule__Package_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3350:1: ( rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3351:2: rule__Package_statement__Group__1__Impl rule__Package_statement__Group__2
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__16744);
            rule__Package_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__16747);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3358:1: rule__Package_statement__Group__1__Impl : ( ( rule__Package_statement__NameAssignment_1 ) ) ;
    public final void rule__Package_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3362:1: ( ( ( rule__Package_statement__NameAssignment_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3363:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3363:1: ( ( rule__Package_statement__NameAssignment_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3364:1: ( rule__Package_statement__NameAssignment_1 )
            {
             before(grammarAccess.getPackage_statementAccess().getNameAssignment_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3365:1: ( rule__Package_statement__NameAssignment_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3365:2: rule__Package_statement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl6774);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3375:1: rule__Package_statement__Group__2 : rule__Package_statement__Group__2__Impl ;
    public final void rule__Package_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3379:1: ( rule__Package_statement__Group__2__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3380:2: rule__Package_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__26804);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3386:1: rule__Package_statement__Group__2__Impl : ( ';' ) ;
    public final void rule__Package_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3390:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3391:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3391:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3392:1: ';'
            {
             before(grammarAccess.getPackage_statementAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Package_statement__Group__2__Impl6832); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3411:1: rule__Package_name__Group__0 : rule__Package_name__Group__0__Impl rule__Package_name__Group__1 ;
    public final void rule__Package_name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3415:1: ( rule__Package_name__Group__0__Impl rule__Package_name__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3416:2: rule__Package_name__Group__0__Impl rule__Package_name__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__06869);
            rule__Package_name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__06872);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3423:1: rule__Package_name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Package_name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3427:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3428:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3428:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3429:1: RULE_ID
            {
             before(grammarAccess.getPackage_nameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl6899); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3440:1: rule__Package_name__Group__1 : rule__Package_name__Group__1__Impl ;
    public final void rule__Package_name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3444:1: ( rule__Package_name__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3445:2: rule__Package_name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__16928);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3451:1: rule__Package_name__Group__1__Impl : ( rulePackage_name_aux ) ;
    public final void rule__Package_name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3455:1: ( ( rulePackage_name_aux ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3456:1: ( rulePackage_name_aux )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3456:1: ( rulePackage_name_aux )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3457:1: rulePackage_name_aux
            {
             before(grammarAccess.getPackage_nameAccess().getPackage_name_auxParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl6955);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3472:1: rule__Package_name_aux__Group__0 : rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 ;
    public final void rule__Package_name_aux__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3476:1: ( rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3477:2: rule__Package_name_aux__Group__0__Impl rule__Package_name_aux__Group__1
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__06988);
            rule__Package_name_aux__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__06991);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3484:1: rule__Package_name_aux__Group__0__Impl : ( '.' ) ;
    public final void rule__Package_name_aux__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3488:1: ( ( '.' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3489:1: ( '.' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3489:1: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3490:1: '.'
            {
             before(grammarAccess.getPackage_name_auxAccess().getFullStopKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Package_name_aux__Group__0__Impl7019); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3503:1: rule__Package_name_aux__Group__1 : rule__Package_name_aux__Group__1__Impl ;
    public final void rule__Package_name_aux__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3507:1: ( rule__Package_name_aux__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3508:2: rule__Package_name_aux__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__17050);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3514:1: rule__Package_name_aux__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package_name_aux__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3518:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3519:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3519:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3520:1: RULE_ID
            {
             before(grammarAccess.getPackage_name_auxAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl7077); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3535:1: rule__Import_statement__Group__0 : rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 ;
    public final void rule__Import_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3539:1: ( rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3540:2: rule__Import_statement__Group__0__Impl rule__Import_statement__Group__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__07110);
            rule__Import_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__07113);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3547:1: rule__Import_statement__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3551:1: ( ( 'import' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3552:1: ( 'import' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3552:1: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3553:1: 'import'
            {
             before(grammarAccess.getImport_statementAccess().getImportKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Import_statement__Group__0__Impl7141); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3566:1: rule__Import_statement__Group__1 : rule__Import_statement__Group__1__Impl ;
    public final void rule__Import_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3570:1: ( rule__Import_statement__Group__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3571:2: rule__Import_statement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__17172);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3577:1: rule__Import_statement__Group__1__Impl : ( ( rule__Import_statement__Alternatives_1 ) ) ;
    public final void rule__Import_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3581:1: ( ( ( rule__Import_statement__Alternatives_1 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3582:1: ( ( rule__Import_statement__Alternatives_1 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3582:1: ( ( rule__Import_statement__Alternatives_1 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3583:1: ( rule__Import_statement__Alternatives_1 )
            {
             before(grammarAccess.getImport_statementAccess().getAlternatives_1()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3584:1: ( rule__Import_statement__Alternatives_1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3584:2: rule__Import_statement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl7199);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3598:1: rule__Import_statement__Group_1_0__0 : rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 ;
    public final void rule__Import_statement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3602:1: ( rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3603:2: rule__Import_statement__Group_1_0__0__Impl rule__Import_statement__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__07233);
            rule__Import_statement__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__07236);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3610:1: rule__Import_statement__Group_1_0__0__Impl : ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) ;
    public final void rule__Import_statement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3614:1: ( ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3615:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3615:1: ( ( rule__Import_statement__ClassnameAssignment_1_0_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3616:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            {
             before(grammarAccess.getImport_statementAccess().getClassnameAssignment_1_0_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3617:1: ( rule__Import_statement__ClassnameAssignment_1_0_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3617:2: rule__Import_statement__ClassnameAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl7263);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3627:1: rule__Import_statement__Group_1_0__1 : rule__Import_statement__Group_1_0__1__Impl ;
    public final void rule__Import_statement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3631:1: ( rule__Import_statement__Group_1_0__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3632:2: rule__Import_statement__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__17293);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3638:1: rule__Import_statement__Group_1_0__1__Impl : ( ';' ) ;
    public final void rule__Import_statement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3642:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3643:1: ( ';' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3643:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3644:1: ';'
            {
             before(grammarAccess.getImport_statementAccess().getSemicolonKeyword_1_0_1()); 
            match(input,21,FOLLOW_21_in_rule__Import_statement__Group_1_0__1__Impl7321); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3661:1: rule__Import_statement__Group_1_1__0 : rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 ;
    public final void rule__Import_statement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3665:1: ( rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3666:2: rule__Import_statement__Group_1_1__0__Impl rule__Import_statement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__07356);
            rule__Import_statement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__07359);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3673:1: rule__Import_statement__Group_1_1__0__Impl : ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) ;
    public final void rule__Import_statement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3677:1: ( ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3678:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3678:1: ( ( rule__Import_statement__PackagenameAssignment_1_1_0 ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3679:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            {
             before(grammarAccess.getImport_statementAccess().getPackagenameAssignment_1_1_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3680:1: ( rule__Import_statement__PackagenameAssignment_1_1_0 )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3680:2: rule__Import_statement__PackagenameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl7386);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3690:1: rule__Import_statement__Group_1_1__1 : rule__Import_statement__Group_1_1__1__Impl ;
    public final void rule__Import_statement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3694:1: ( rule__Import_statement__Group_1_1__1__Impl )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3695:2: rule__Import_statement__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__17416);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3701:1: rule__Import_statement__Group_1_1__1__Impl : ( '.*;' ) ;
    public final void rule__Import_statement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3705:1: ( ( '.*;' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3706:1: ( '.*;' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3706:1: ( '.*;' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3707:1: '.*;'
            {
             before(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 
            match(input,39,FOLLOW_39_in_rule__Import_statement__Group_1_1__1__Impl7444); 
             after(grammarAccess.getImport_statementAccess().getFullStopAsteriskSemicolonKeyword_1_1_1()); 

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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3725:1: rule__Head__ElementsAssignment : ( ruleCompilation_unit ) ;
    public final void rule__Head__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3729:1: ( ( ruleCompilation_unit ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3730:1: ( ruleCompilation_unit )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3730:1: ( ruleCompilation_unit )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3731:1: ruleCompilation_unit
            {
             before(grammarAccess.getHeadAccess().getElementsCompilation_unitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment7484);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3740:1: rule__Compilation_unit__PackageAssignment_0 : ( rulePackage_statement ) ;
    public final void rule__Compilation_unit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3744:1: ( ( rulePackage_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3745:1: ( rulePackage_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3745:1: ( rulePackage_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3746:1: rulePackage_statement
            {
             before(grammarAccess.getCompilation_unitAccess().getPackagePackage_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_07515);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3755:1: rule__Compilation_unit__ImportsAssignment_1 : ( ruleImport_statement ) ;
    public final void rule__Compilation_unit__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3759:1: ( ( ruleImport_statement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3760:1: ( ruleImport_statement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3760:1: ( ruleImport_statement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3761:1: ruleImport_statement
            {
             before(grammarAccess.getCompilation_unitAccess().getImportsImport_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_17546);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3770:1: rule__Compilation_unit__Type_declarationsAssignment_2 : ( ruleType_declaration ) ;
    public final void rule__Compilation_unit__Type_declarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3774:1: ( ( ruleType_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3775:1: ( ruleType_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3775:1: ( ruleType_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3776:1: ruleType_declaration
            {
             before(grammarAccess.getCompilation_unitAccess().getType_declarationsType_declarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_27577);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3785:1: rule__Type_declaration__DocAssignment_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Type_declaration__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3789:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3790:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3791:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getType_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_07608); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3800:1: rule__Type_declaration__NameAssignment_1_0 : ( ruleClass_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3804:1: ( ( ruleClass_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3805:1: ( ruleClass_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3805:1: ( ruleClass_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3806:1: ruleClass_declaration
            {
             before(grammarAccess.getType_declarationAccess().getNameClass_declarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_07639);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3815:1: rule__Type_declaration__NameAssignment_1_1 : ( ruleInterface_declaration ) ;
    public final void rule__Type_declaration__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3819:1: ( ( ruleInterface_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3820:1: ( ruleInterface_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3820:1: ( ruleInterface_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3821:1: ruleInterface_declaration
            {
             before(grammarAccess.getType_declarationAccess().getNameInterface_declarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_17670);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3830:1: rule__Interface_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Interface_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3834:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3835:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3835:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3836:1: RULE_MODIFIER
            {
             before(grammarAccess.getInterface_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Interface_declaration__ModifiersAssignment_07701); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3845:1: rule__Interface_declaration__InterfaceNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface_declaration__InterfaceNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3849:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3850:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3850:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3851:1: RULE_ID
            {
             before(grammarAccess.getInterface_declarationAccess().getInterfaceNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_27732); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3860:1: rule__Interface_declaration__ExtendAssignment_3_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3864:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3865:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3865:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3866:1: ruleInterface_name
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendInterface_nameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_17763);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3875:1: rule__Interface_declaration__ExtendsAssignment_3_2_1 : ( ruleInterface_name ) ;
    public final void rule__Interface_declaration__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3879:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3880:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3880:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3881:1: ruleInterface_name
            {
             before(grammarAccess.getInterface_declarationAccess().getExtendsInterface_nameParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_17794);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3890:1: rule__Class_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Class_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3894:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3895:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3895:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3896:1: RULE_MODIFIER
            {
             before(grammarAccess.getClass_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Class_declaration__ModifiersAssignment_07825); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3905:1: rule__Class_declaration__ClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class_declaration__ClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3909:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3910:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3910:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3911:1: RULE_ID
            {
             before(grammarAccess.getClass_declarationAccess().getClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_27856); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3920:1: rule__Class_declaration__ExtendAssignment_3_1 : ( ruleClass_name ) ;
    public final void rule__Class_declaration__ExtendAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3924:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3925:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3925:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3926:1: ruleClass_name
            {
             before(grammarAccess.getClass_declarationAccess().getExtendClass_nameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_17887);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3935:1: rule__Class_declaration__ImplementAssignment_4_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3939:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3940:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3940:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3941:1: ruleInterface_name
            {
             before(grammarAccess.getClass_declarationAccess().getImplementInterface_nameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_17918);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3950:1: rule__Class_declaration__ImplementsAssignment_4_2_1 : ( ruleInterface_name ) ;
    public final void rule__Class_declaration__ImplementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3954:1: ( ( ruleInterface_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3955:1: ( ruleInterface_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3955:1: ( ruleInterface_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3956:1: ruleInterface_name
            {
             before(grammarAccess.getClass_declarationAccess().getImplementsInterface_nameParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_17949);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3965:1: rule__Class_declaration__FieldsAssignment_6 : ( ruleField_declaration ) ;
    public final void rule__Class_declaration__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3969:1: ( ( ruleField_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3970:1: ( ruleField_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3970:1: ( ruleField_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3971:1: ruleField_declaration
            {
             before(grammarAccess.getClass_declarationAccess().getFieldsField_declarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_67980);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3980:1: rule__Field_declaration__DocAssignment_0_0 : ( RULE_DOC_COMMENT ) ;
    public final void rule__Field_declaration__DocAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3984:1: ( ( RULE_DOC_COMMENT ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3985:1: ( RULE_DOC_COMMENT )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3985:1: ( RULE_DOC_COMMENT )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3986:1: RULE_DOC_COMMENT
            {
             before(grammarAccess.getField_declarationAccess().getDocDOC_COMMENTTerminalRuleCall_0_0_0()); 
            match(input,RULE_DOC_COMMENT,FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_08011); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3995:1: rule__Field_declaration__NameAssignment_0_1_0 : ( ruleVariable_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:3999:1: ( ( ruleVariable_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4000:1: ( ruleVariable_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4000:1: ( ruleVariable_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4001:1: ruleVariable_declaration
            {
             before(grammarAccess.getField_declarationAccess().getNameVariable_declarationParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_08042);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4010:1: rule__Field_declaration__NameAssignment_0_1_1 : ( ruleConstructor_declaration ) ;
    public final void rule__Field_declaration__NameAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4014:1: ( ( ruleConstructor_declaration ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4015:1: ( ruleConstructor_declaration )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4015:1: ( ruleConstructor_declaration )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4016:1: ruleConstructor_declaration
            {
             before(grammarAccess.getField_declarationAccess().getNameConstructor_declarationParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_18073);
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


    // $ANTLR start "rule__Field_declaration__NameAssignment_1"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4025:1: rule__Field_declaration__NameAssignment_1 : ( ruleStatic_initializer ) ;
    public final void rule__Field_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4029:1: ( ( ruleStatic_initializer ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4030:1: ( ruleStatic_initializer )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4030:1: ( ruleStatic_initializer )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4031:1: ruleStatic_initializer
            {
             before(grammarAccess.getField_declarationAccess().getNameStatic_initializerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_18104);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4040:1: rule__Field_declaration__DebugAssignment_2 : ( ( ';' ) ) ;
    public final void rule__Field_declaration__DebugAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4044:1: ( ( ( ';' ) ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4045:1: ( ( ';' ) )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4045:1: ( ( ';' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4046:1: ( ';' )
            {
             before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4047:1: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4048:1: ';'
            {
             before(grammarAccess.getField_declarationAccess().getDebugSemicolonKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Field_declaration__DebugAssignment_28140); 
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


    // $ANTLR start "rule__Constructor_declaration__ModifiersAssignment_0"
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4063:1: rule__Constructor_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Constructor_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4067:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4068:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4068:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4069:1: RULE_MODIFIER
            {
             before(grammarAccess.getConstructor_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Constructor_declaration__ModifiersAssignment_08179); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4078:1: rule__Constructor_declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor_declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4082:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4083:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4083:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4084:1: RULE_ID
            {
             before(grammarAccess.getConstructor_declarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_18210); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4093:1: rule__Constructor_declaration__ParametersAssignment_3 : ( ruleParameter_list ) ;
    public final void rule__Constructor_declaration__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4097:1: ( ( ruleParameter_list ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4098:1: ( ruleParameter_list )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4098:1: ( ruleParameter_list )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4099:1: ruleParameter_list
            {
             before(grammarAccess.getConstructor_declarationAccess().getParametersParameter_listParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_38241);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4108:1: rule__Constructor_declaration__StatementAssignment_5 : ( ruleStatement_block ) ;
    public final void rule__Constructor_declaration__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4112:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4113:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4113:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4114:1: ruleStatement_block
            {
             before(grammarAccess.getConstructor_declarationAccess().getStatementStatement_blockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_58272);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4123:1: rule__Parameter_list__ParameterAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4127:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4128:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4128:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4129:1: ruleParameter
            {
             before(grammarAccess.getParameter_listAccess().getParameterParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_08303);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4138:1: rule__Parameter_list__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameter_list__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4142:1: ( ( ruleParameter ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4143:1: ( ruleParameter )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4143:1: ( ruleParameter )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4144:1: ruleParameter
            {
             before(grammarAccess.getParameter_listAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_18334);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4153:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4157:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4158:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4158:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4159:1: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_08365);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4168:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4172:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4173:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4173:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4174:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_18396); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4183:1: rule__Variable_declaration__ModifiersAssignment_0 : ( RULE_MODIFIER ) ;
    public final void rule__Variable_declaration__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4187:1: ( ( RULE_MODIFIER ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4188:1: ( RULE_MODIFIER )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4188:1: ( RULE_MODIFIER )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4189:1: RULE_MODIFIER
            {
             before(grammarAccess.getVariable_declarationAccess().getModifiersMODIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_MODIFIER,FOLLOW_RULE_MODIFIER_in_rule__Variable_declaration__ModifiersAssignment_08427); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4198:1: rule__Variable_declaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Variable_declaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4202:1: ( ( ruleType ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4203:1: ( ruleType )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4203:1: ( ruleType )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4204:1: ruleType
            {
             before(grammarAccess.getVariable_declarationAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_18458);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4213:1: rule__Variable_declaration__NameAssignment_2 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4217:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4218:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4218:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4219:1: ruleVariable_declarator
            {
             before(grammarAccess.getVariable_declarationAccess().getNameVariable_declaratorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_28489);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4228:1: rule__Variable_declaration__NamesAssignment_3_1 : ( ruleVariable_declarator ) ;
    public final void rule__Variable_declaration__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4232:1: ( ( ruleVariable_declarator ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4233:1: ( ruleVariable_declarator )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4233:1: ( ruleVariable_declarator )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4234:1: ruleVariable_declarator
            {
             before(grammarAccess.getVariable_declarationAccess().getNamesVariable_declaratorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_18520);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4243:1: rule__Variable_declarator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_declarator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4247:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4248:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4248:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4249:1: RULE_ID
            {
             before(grammarAccess.getVariable_declaratorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_08551); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4258:1: rule__Type__NameAssignment_0 : ( ruleType_specifier ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4262:1: ( ( ruleType_specifier ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4263:1: ( ruleType_specifier )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4263:1: ( ruleType_specifier )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4264:1: ruleType_specifier
            {
             before(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_08582);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4273:1: rule__Static_initializer__NameAssignment_1 : ( ruleStatement_block ) ;
    public final void rule__Static_initializer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4277:1: ( ( ruleStatement_block ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4278:1: ( ruleStatement_block )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4278:1: ( ruleStatement_block )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4279:1: ruleStatement_block
            {
             before(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_18613);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4288:1: rule__Statement_block__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Statement_block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4292:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4293:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4293:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4294:1: ruleStatement
            {
             before(grammarAccess.getStatement_blockAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_28644);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4303:1: rule__Statement__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4307:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4308:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4308:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4309:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_0_08675); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4318:1: rule__Statement__StatementAssignment_0_2 : ( ruleStatement ) ;
    public final void rule__Statement__StatementAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4322:1: ( ( ruleStatement ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4323:1: ( ruleStatement )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4323:1: ( ruleStatement )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4324:1: ruleStatement
            {
             before(grammarAccess.getStatementAccess().getStatementStatementParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_0_28706);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4333:1: rule__Statement__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4337:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4338:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4338:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4339:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_1_28737); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4348:1: rule__Statement__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4352:1: ( ( RULE_ID ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4353:1: ( RULE_ID )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4353:1: ( RULE_ID )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4354:1: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_28768); 
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4363:1: rule__Package_statement__NameAssignment_1 : ( rulePackage_name ) ;
    public final void rule__Package_statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4367:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4368:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4368:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4369:1: rulePackage_name
            {
             before(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_18799);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4378:1: rule__Import_statement__ClassnameAssignment_1_0_0 : ( ruleClass_name ) ;
    public final void rule__Import_statement__ClassnameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4382:1: ( ( ruleClass_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4383:1: ( ruleClass_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4383:1: ( ruleClass_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4384:1: ruleClass_name
            {
             before(grammarAccess.getImport_statementAccess().getClassnameClass_nameParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_08830);
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
    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4393:1: rule__Import_statement__PackagenameAssignment_1_1_0 : ( rulePackage_name ) ;
    public final void rule__Import_statement__PackagenameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4397:1: ( ( rulePackage_name ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4398:1: ( rulePackage_name )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4398:1: ( rulePackage_name )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:4399:1: rulePackage_name
            {
             before(grammarAccess.getImport_statementAccess().getPackagenamePackage_nameParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_08861);
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
    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\6\2\uffff";
    static final String DFA2_maxS =
        "\2\33\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\17\uffff\1\3\4\uffff\1\2",
            "\1\1\17\uffff\1\3\4\uffff\1\2",
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
            return "676:1: rule__Type_declaration__Alternatives_1 : ( ( ( rule__Type_declaration__NameAssignment_1_0 ) ) | ( ( rule__Type_declaration__NameAssignment_1_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\5\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\4\1\uffff\1\4\1\uffff";
    static final String DFA4_maxS =
        "\2\24\1\uffff\1\45\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\1\uffff\1\1\6\uffff\10\2",
            "\1\3\1\uffff\1\1\6\uffff\10\2",
            "",
            "\1\2\30\uffff\1\4\1\uffff\1\2\5\uffff\1\2",
            ""
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
            return "726:1: rule__Field_declaration__Alternatives_0_1 : ( ( ( rule__Field_declaration__NameAssignment_0_1_0 ) ) | ( ( rule__Field_declaration__NameAssignment_0_1_1 ) ) );";
        }
    }
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\1\4\1\25\1\4\2\uffff\1\25";
    static final String DFA7_maxS =
        "\1\4\1\47\1\4\2\uffff\1\47";
    static final String DFA7_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\4\17\uffff\1\2\1\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\4\17\uffff\1\2\1\uffff\1\3"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "862:1: rule__Import_statement__Alternatives_1 : ( ( ( rule__Import_statement__Group_1_0__0 ) ) | ( ( rule__Import_statement__Group_1_1__0 ) ) );";
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
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_entryRuleConstructor_declaration421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor_declaration428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0_in_ruleConstructor_declaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_entryRuleParameter_list481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter_list488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0_in_ruleParameter_list514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_entryRuleVariable_declaration601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declaration608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0_in_ruleVariable_declaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_entryRuleVariable_declarator661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable_declarator668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0_in_ruleVariable_declarator694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_entryRuleType_specifier781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType_specifier788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_specifier__Alternatives_in_ruleType_specifier814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_entryRuleStatic_initializer841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatic_initializer848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0_in_ruleStatic_initializer874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_entryRuleStatement_block901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_block908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0_in_ruleStatement_block934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_entryRulePackage_statement1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_statement1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0_in_rulePackage_statement1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_entryRulePackage_name1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0_in_rulePackage_name1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_entryRulePackage_name_aux1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage_name_aux1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0_in_rulePackage_name_aux1174 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_entryRuleImport_statement1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport_statement1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0_in_ruleImport_statement1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_entryRuleClass_name1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass_name1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleClass_name1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_entryRuleInterface_name1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface_name1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_ruleInterface_name1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_0_in_rule__Type_declaration__Alternatives_11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__NameAssignment_1_1_in_rule__Type_declaration__Alternatives_11407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0_in_rule__Field_declaration__Alternatives1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_1_in_rule__Field_declaration__Alternatives1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DebugAssignment_2_in_rule__Field_declaration__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_0_in_rule__Field_declaration__Alternatives_0_11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__NameAssignment_0_1_1_in_rule__Field_declaration__Alternatives_0_11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type_specifier__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type_specifier__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type_specifier__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type_specifier__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type_specifier__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type_specifier__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type_specifier__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type_specifier__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Type_specifier__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0_in_rule__Import_statement__Alternatives_11839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0_in_rule__Import_statement__Alternatives_11857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__0__Impl_in_rule__Compilation_unit__Group__01888 = new BitSet(new long[]{0x0000004008400060L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1_in_rule__Compilation_unit__Group__01891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__PackageAssignment_0_in_rule__Compilation_unit__Group__0__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__1__Impl_in_rule__Compilation_unit__Group__11949 = new BitSet(new long[]{0x0000004008400060L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2_in_rule__Compilation_unit__Group__11952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__ImportsAssignment_1_in_rule__Compilation_unit__Group__1__Impl1979 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Group__2__Impl_in_rule__Compilation_unit__Group__22010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compilation_unit__Type_declarationsAssignment_2_in_rule__Compilation_unit__Group__2__Impl2037 = new BitSet(new long[]{0x0000000008400062L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__0__Impl_in_rule__Type_declaration__Group__02074 = new BitSet(new long[]{0x0000000008400060L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1_in_rule__Type_declaration__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__DocAssignment_0_in_rule__Type_declaration__Group__0__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__1__Impl_in_rule__Type_declaration__Group__12135 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2_in_rule__Type_declaration__Group__12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Alternatives_1_in_rule__Type_declaration__Group__1__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type_declaration__Group__2__Impl_in_rule__Type_declaration__Group__22195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type_declaration__Group__2__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__0__Impl_in_rule__Interface_declaration__Group__02260 = new BitSet(new long[]{0x0000000008400060L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1_in_rule__Interface_declaration__Group__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ModifiersAssignment_0_in_rule__Interface_declaration__Group__0__Impl2290 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__1__Impl_in_rule__Interface_declaration__Group__12321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2_in_rule__Interface_declaration__Group__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface_declaration__Group__1__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__2__Impl_in_rule__Interface_declaration__Group__22383 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3_in_rule__Interface_declaration__Group__22386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__InterfaceNameAssignment_2_in_rule__Interface_declaration__Group__2__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__3__Impl_in_rule__Interface_declaration__Group__32443 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4_in_rule__Interface_declaration__Group__32446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0_in_rule__Interface_declaration__Group__3__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__4__Impl_in_rule__Interface_declaration__Group__42504 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5_in_rule__Interface_declaration__Group__42507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface_declaration__Group__4__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group__5__Impl_in_rule__Interface_declaration__Group__52566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Interface_declaration__Group__5__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__0__Impl_in_rule__Interface_declaration__Group_3__02637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1_in_rule__Interface_declaration__Group_3__02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Interface_declaration__Group_3__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__1__Impl_in_rule__Interface_declaration__Group_3__12699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2_in_rule__Interface_declaration__Group_3__12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendAssignment_3_1_in_rule__Interface_declaration__Group_3__1__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3__2__Impl_in_rule__Interface_declaration__Group_3__22759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0_in_rule__Interface_declaration__Group_3__2__Impl2786 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__0__Impl_in_rule__Interface_declaration__Group_3_2__02823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1_in_rule__Interface_declaration__Group_3_2__02826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Interface_declaration__Group_3_2__0__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__Group_3_2__1__Impl_in_rule__Interface_declaration__Group_3_2__12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface_declaration__ExtendsAssignment_3_2_1_in_rule__Interface_declaration__Group_3_2__1__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__0__Impl_in_rule__Class_declaration__Group__02946 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1_in_rule__Class_declaration__Group__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ModifiersAssignment_0_in_rule__Class_declaration__Group__0__Impl2976 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__1__Impl_in_rule__Class_declaration__Group__13007 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2_in_rule__Class_declaration__Group__13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Class_declaration__Group__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__2__Impl_in_rule__Class_declaration__Group__23069 = new BitSet(new long[]{0x0000000012800000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3_in_rule__Class_declaration__Group__23072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ClassNameAssignment_2_in_rule__Class_declaration__Group__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__3__Impl_in_rule__Class_declaration__Group__33129 = new BitSet(new long[]{0x0000000012800000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4_in_rule__Class_declaration__Group__33132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0_in_rule__Class_declaration__Group__3__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__4__Impl_in_rule__Class_declaration__Group__43190 = new BitSet(new long[]{0x0000000012800000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5_in_rule__Class_declaration__Group__43193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0_in_rule__Class_declaration__Group__4__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__5__Impl_in_rule__Class_declaration__Group__53251 = new BitSet(new long[]{0x00000001013FE070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6_in_rule__Class_declaration__Group__53254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class_declaration__Group__5__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__6__Impl_in_rule__Class_declaration__Group__63313 = new BitSet(new long[]{0x00000001013FE070L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7_in_rule__Class_declaration__Group__63316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__FieldsAssignment_6_in_rule__Class_declaration__Group__6__Impl3343 = new BitSet(new long[]{0x00000001003FE072L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group__7__Impl_in_rule__Class_declaration__Group__73374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Class_declaration__Group__7__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__0__Impl_in_rule__Class_declaration__Group_3__03449 = new BitSet(new long[]{0x00000000001FE050L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1_in_rule__Class_declaration__Group_3__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Class_declaration__Group_3__0__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_3__1__Impl_in_rule__Class_declaration__Group_3__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ExtendAssignment_3_1_in_rule__Class_declaration__Group_3__1__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__0__Impl_in_rule__Class_declaration__Group_4__03572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1_in_rule__Class_declaration__Group_4__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Class_declaration__Group_4__0__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__1__Impl_in_rule__Class_declaration__Group_4__13634 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2_in_rule__Class_declaration__Group_4__13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementAssignment_4_1_in_rule__Class_declaration__Group_4__1__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4__2__Impl_in_rule__Class_declaration__Group_4__23694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0_in_rule__Class_declaration__Group_4__2__Impl3721 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__0__Impl_in_rule__Class_declaration__Group_4_2__03758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1_in_rule__Class_declaration__Group_4_2__03761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Class_declaration__Group_4_2__0__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__Group_4_2__1__Impl_in_rule__Class_declaration__Group_4_2__13820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class_declaration__ImplementsAssignment_4_2_1_in_rule__Class_declaration__Group_4_2__1__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__0__Impl_in_rule__Field_declaration__Group_0__03881 = new BitSet(new long[]{0x00000000001FE070L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1_in_rule__Field_declaration__Group_0__03884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__DocAssignment_0_0_in_rule__Field_declaration__Group_0__0__Impl3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Group_0__1__Impl_in_rule__Field_declaration__Group_0__13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field_declaration__Alternatives_0_1_in_rule__Field_declaration__Group_0__1__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__0__Impl_in_rule__Constructor_declaration__Group__04003 = new BitSet(new long[]{0x00000000001FE070L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1_in_rule__Constructor_declaration__Group__04006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ModifiersAssignment_0_in_rule__Constructor_declaration__Group__0__Impl4033 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__1__Impl_in_rule__Constructor_declaration__Group__14064 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2_in_rule__Constructor_declaration__Group__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__NameAssignment_1_in_rule__Constructor_declaration__Group__1__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__2__Impl_in_rule__Constructor_declaration__Group__24124 = new BitSet(new long[]{0x00000000401FE050L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3_in_rule__Constructor_declaration__Group__24127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constructor_declaration__Group__2__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__3__Impl_in_rule__Constructor_declaration__Group__34186 = new BitSet(new long[]{0x00000000401FE050L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4_in_rule__Constructor_declaration__Group__34189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__ParametersAssignment_3_in_rule__Constructor_declaration__Group__3__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__4__Impl_in_rule__Constructor_declaration__Group__44247 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5_in_rule__Constructor_declaration__Group__44250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Constructor_declaration__Group__4__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__Group__5__Impl_in_rule__Constructor_declaration__Group__54309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor_declaration__StatementAssignment_5_in_rule__Constructor_declaration__Group__5__Impl4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__0__Impl_in_rule__Parameter_list__Group__04378 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1_in_rule__Parameter_list__Group__04381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParameterAssignment_0_in_rule__Parameter_list__Group__0__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group__1__Impl_in_rule__Parameter_list__Group__14438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0_in_rule__Parameter_list__Group__1__Impl4465 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__0__Impl_in_rule__Parameter_list__Group_1__04500 = new BitSet(new long[]{0x00000000001FE050L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1_in_rule__Parameter_list__Group_1__04503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Parameter_list__Group_1__0__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__Group_1__1__Impl_in_rule__Parameter_list__Group_1__14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter_list__ParametersAssignment_1_1_in_rule__Parameter_list__Group_1__1__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__04623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__04626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_in_rule__Parameter__Group__0__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__14683 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__14686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_1_in_rule__Parameter__Group__1__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__24743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Parameter__Group__2__Impl4772 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__0__Impl_in_rule__Variable_declaration__Group__04811 = new BitSet(new long[]{0x00000000001FE050L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1_in_rule__Variable_declaration__Group__04814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__ModifiersAssignment_0_in_rule__Variable_declaration__Group__0__Impl4841 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__1__Impl_in_rule__Variable_declaration__Group__14872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2_in_rule__Variable_declaration__Group__14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__TypeAssignment_1_in_rule__Variable_declaration__Group__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__2__Impl_in_rule__Variable_declaration__Group__24932 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3_in_rule__Variable_declaration__Group__24935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NameAssignment_2_in_rule__Variable_declaration__Group__2__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__3__Impl_in_rule__Variable_declaration__Group__34992 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4_in_rule__Variable_declaration__Group__34995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0_in_rule__Variable_declaration__Group__3__Impl5022 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group__4__Impl_in_rule__Variable_declaration__Group__45053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Variable_declaration__Group__4__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__0__Impl_in_rule__Variable_declaration__Group_3__05122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1_in_rule__Variable_declaration__Group_3__05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Variable_declaration__Group_3__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__Group_3__1__Impl_in_rule__Variable_declaration__Group_3__15184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declaration__NamesAssignment_3_1_in_rule__Variable_declaration__Group_3__1__Impl5211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__0__Impl_in_rule__Variable_declarator__Group__05245 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1_in_rule__Variable_declarator__Group__05248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__NameAssignment_0_in_rule__Variable_declarator__Group__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable_declarator__Group__1__Impl_in_rule__Variable_declarator__Group__15305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Variable_declarator__Group__1__Impl5334 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__05371 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__05374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_0_in_rule__Type__Group__0__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__15431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Type__Group__1__Impl5460 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__0__Impl_in_rule__Static_initializer__Group__05497 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1_in_rule__Static_initializer__Group__05500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Static_initializer__Group__0__Impl5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__Group__1__Impl_in_rule__Static_initializer__Group__15559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Static_initializer__NameAssignment_1_in_rule__Static_initializer__Group__1__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__0__Impl_in_rule__Statement_block__Group__05620 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1_in_rule__Statement_block__Group__05623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__1__Impl_in_rule__Statement_block__Group__15681 = new BitSet(new long[]{0x0000000C01200010L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2_in_rule__Statement_block__Group__15684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement_block__Group__1__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__2__Impl_in_rule__Statement_block__Group__25743 = new BitSet(new long[]{0x0000000C01200010L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3_in_rule__Statement_block__Group__25746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement_block__StatementsAssignment_2_in_rule__Statement_block__Group__2__Impl5773 = new BitSet(new long[]{0x0000000C00200012L});
    public static final BitSet FOLLOW_rule__Statement_block__Group__3__Impl_in_rule__Statement_block__Group__35804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Statement_block__Group__3__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__05871 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__05874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_0_0_in_rule__Statement__Group_0__0__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__15931 = new BitSet(new long[]{0x0000000C00200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__15934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_0__1__Impl5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__25993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementAssignment_0_2_in_rule__Statement__Group_0__2__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__06056 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__06059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__16117 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2_in_rule__Statement__Group_1__16120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_1__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__2__Impl_in_rule__Statement__Group_1__26179 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__3_in_rule__Statement__Group_1__26182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_1_2_in_rule__Statement__Group_1__2__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__3__Impl_in_rule__Statement__Group_1__36240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group_1__3__Impl6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__06307 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__06310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__16368 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__16371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_2__1__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__26430 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__3_in_rule__Statement__Group_2__26433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__NameAssignment_2_2_in_rule__Statement__Group_2__2__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__3__Impl_in_rule__Statement__Group_2__36491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group_2__3__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__06558 = new BitSet(new long[]{0x0000000C00200010L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__06561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__16619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group_3__1__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__0__Impl_in_rule__Package_statement__Group__06682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1_in_rule__Package_statement__Group__06685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Package_statement__Group__0__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__1__Impl_in_rule__Package_statement__Group__16744 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2_in_rule__Package_statement__Group__16747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__NameAssignment_1_in_rule__Package_statement__Group__1__Impl6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_statement__Group__2__Impl_in_rule__Package_statement__Group__26804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Package_statement__Group__2__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__0__Impl_in_rule__Package_name__Group__06869 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1_in_rule__Package_name__Group__06872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name__Group__0__Impl6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name__Group__1__Impl_in_rule__Package_name__Group__16928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_aux_in_rule__Package_name__Group__1__Impl6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__0__Impl_in_rule__Package_name_aux__Group__06988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1_in_rule__Package_name_aux__Group__06991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Package_name_aux__Group__0__Impl7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package_name_aux__Group__1__Impl_in_rule__Package_name_aux__Group__17050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package_name_aux__Group__1__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__0__Impl_in_rule__Import_statement__Group__07110 = new BitSet(new long[]{0x00000000001FE050L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1_in_rule__Import_statement__Group__07113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Import_statement__Group__0__Impl7141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group__1__Impl_in_rule__Import_statement__Group__17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Alternatives_1_in_rule__Import_statement__Group__1__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__0__Impl_in_rule__Import_statement__Group_1_0__07233 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1_in_rule__Import_statement__Group_1_0__07236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__ClassnameAssignment_1_0_0_in_rule__Import_statement__Group_1_0__0__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_0__1__Impl_in_rule__Import_statement__Group_1_0__17293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Import_statement__Group_1_0__1__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__0__Impl_in_rule__Import_statement__Group_1_1__07356 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1_in_rule__Import_statement__Group_1_1__07359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__PackagenameAssignment_1_1_0_in_rule__Import_statement__Group_1_1__0__Impl7386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import_statement__Group_1_1__1__Impl_in_rule__Import_statement__Group_1_1__17416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Import_statement__Group_1_1__1__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompilation_unit_in_rule__Head__ElementsAssignment7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_statement_in_rule__Compilation_unit__PackageAssignment_07515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_statement_in_rule__Compilation_unit__ImportsAssignment_17546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_declaration_in_rule__Compilation_unit__Type_declarationsAssignment_27577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Type_declaration__DocAssignment_07608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_declaration_in_rule__Type_declaration__NameAssignment_1_07639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_declaration_in_rule__Type_declaration__NameAssignment_1_17670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Interface_declaration__ModifiersAssignment_07701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface_declaration__InterfaceNameAssignment_27732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendAssignment_3_17763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Interface_declaration__ExtendsAssignment_3_2_17794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Class_declaration__ModifiersAssignment_07825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class_declaration__ClassNameAssignment_27856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Class_declaration__ExtendAssignment_3_17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementAssignment_4_17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_name_in_rule__Class_declaration__ImplementsAssignment_4_2_17949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_declaration_in_rule__Class_declaration__FieldsAssignment_67980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_COMMENT_in_rule__Field_declaration__DocAssignment_0_08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declaration_in_rule__Field_declaration__NameAssignment_0_1_08042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_declaration_in_rule__Field_declaration__NameAssignment_0_1_18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatic_initializer_in_rule__Field_declaration__NameAssignment_18104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Field_declaration__DebugAssignment_28140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Constructor_declaration__ModifiersAssignment_08179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor_declaration__NameAssignment_18210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_list_in_rule__Constructor_declaration__ParametersAssignment_38241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Constructor_declaration__StatementAssignment_58272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParameterAssignment_08303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Parameter_list__ParametersAssignment_1_18334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Parameter__TypeAssignment_08365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_18396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MODIFIER_in_rule__Variable_declaration__ModifiersAssignment_08427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Variable_declaration__TypeAssignment_18458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NameAssignment_28489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_declarator_in_rule__Variable_declaration__NamesAssignment_3_18520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable_declarator__NameAssignment_08551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_specifier_in_rule__Type__NameAssignment_08582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_block_in_rule__Static_initializer__NameAssignment_18613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement_block__StatementsAssignment_28644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_0_08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Statement__StatementAssignment_0_28706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_1_28737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Statement__NameAssignment_2_28768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Package_statement__NameAssignment_18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_name_in_rule__Import_statement__ClassnameAssignment_1_0_08830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_name_in_rule__Import_statement__PackagenameAssignment_1_1_08861 = new BitSet(new long[]{0x0000000000000002L});

}