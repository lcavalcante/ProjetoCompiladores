package org.xtext.java.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_CATCH=18;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int RULE_CHAR=16;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_INCREMENT=5;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EXPONENTIAL=20;
    public static final int RULE_MOD=7;
    public static final int RULE_ID=9;
    public static final int RULE_HEXA=14;
    public static final int RULE_DOC_COMMENT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_FINALLY=19;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_EXPOENT_PART=12;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=15;
    public static final int RULE_SL_COMMENT=23;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_DECIMAL_DIGITS=11;
    public static final int T__35=35;
    public static final int RULE_PLUS=21;
    public static final int T__36=36;
    public static final int RULE_DECREMENT=6;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_FLOAT_TYPE_SUFIX=13;
    public static final int RULE_TRY=17;
    public static final int RULE_WS=24;
    public static final int RULE_STATIC=8;
    public static final int RULE_MINUS=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalJavaLexer() {;} 
    public InternalJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:11:7: ( 'false' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12:7: ( 'true' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:13:7: ( '[]' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:13:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:14:7: ( 'boolean' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:14:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:15:7: ( 'byte' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:15:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:16:7: ( 'char' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:16:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:17:7: ( 'short' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:17:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:18:7: ( 'int' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:19:7: ( 'float' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:19:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:20:7: ( 'long' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:20:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:21:7: ( 'double' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:22:7: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:23:7: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:23:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:24:7: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:25:7: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:26:7: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:26:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:27:7: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:27:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:28:7: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:28:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:29:7: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:29:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:30:7: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:31:7: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:32:7: ( '[' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:33:7: ( ']' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:34:7: ( '=' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:35:7: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:36:7: ( 'instanceof' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:36:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:37:7: ( 'l' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:37:9: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:38:7: ( 'new' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:38:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:39:7: ( '~' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:39:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:40:7: ( '!' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:40:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:41:7: ( 'synchronized' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:41:9: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:42:7: ( 'return' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:42:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:43:7: ( 'throw' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:43:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:44:7: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:44:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:45:7: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:45:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:46:7: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:46:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:47:7: ( 'switch' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:47:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:48:7: ( 'case' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:48:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:49:7: ( 'default' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:49:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:50:7: ( 'for' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:50:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:51:7: ( 'while' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:51:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:52:7: ( 'do' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:52:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:53:7: ( 'if' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:53:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:54:7: ( 'else' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:54:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:55:7: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:55:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:56:7: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:56:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:57:7: ( '*' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:57:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:58:7: ( 'null' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:58:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:59:7: ( 'super' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:59:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:60:7: ( 'this' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:60:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "RULE_DECREMENT"
    public final void mRULE_DECREMENT() throws RecognitionException {
        try {
            int _type = RULE_DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12605:16: ( '--' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12605:18: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECREMENT"

    // $ANTLR start "RULE_INCREMENT"
    public final void mRULE_INCREMENT() throws RecognitionException {
        try {
            int _type = RULE_INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12607:16: ( '++' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12607:18: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCREMENT"

    // $ANTLR start "RULE_STATIC"
    public final void mRULE_STATIC() throws RecognitionException {
        try {
            int _type = RULE_STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12609:13: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12609:15: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC"

    // $ANTLR start "RULE_HEXA"
    public final void mRULE_HEXA() throws RecognitionException {
        try {
            int _type = RULE_HEXA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12611:11: ( '0' 'x' ( '0' .. '9' 'a' .. 'f' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12611:13: '0' 'x' ( '0' .. '9' 'a' .. 'f' )*
            {
            match('0'); 
            match('x'); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12611:21: ( '0' .. '9' 'a' .. 'f' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12611:22: '0' .. '9' 'a' .. 'f'
            	    {
            	    matchRange('0','9'); 
            	    matchRange('a','f'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXA"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:18: ( ( 'e' | 'e+' | 'e-' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:20: ( 'e' | 'e+' | 'e-' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:20: ( 'e' | 'e+' | 'e-' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='e') ) {
                switch ( input.LA(2) ) {
                case '+':
                    {
                    alt2=2;
                    }
                    break;
                case '-':
                    {
                    alt2=3;
                    }
                    break;
                default:
                    alt2=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:21: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:25: 'e+'
                    {
                    match("e+"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12613:30: 'e-'
                    {
                    match("e-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENTIAL"

    // $ANTLR start "RULE_EXPOENT_PART"
    public final void mRULE_EXPOENT_PART() throws RecognitionException {
        try {
            int _type = RULE_EXPOENT_PART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12615:19: ( RULE_EXPONENTIAL RULE_DECIMAL_DIGITS )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12615:21: RULE_EXPONENTIAL RULE_DECIMAL_DIGITS
            {
            mRULE_EXPONENTIAL(); 
            mRULE_DECIMAL_DIGITS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPOENT_PART"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12617:11: ( '+' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12617:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12619:12: ( '-' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12619:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_MOD"
    public final void mRULE_MOD() throws RecognitionException {
        try {
            int _type = RULE_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12621:100: 'transient'
                    {
                    match("transient"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD"

    // $ANTLR start "RULE_TRY"
    public final void mRULE_TRY() throws RecognitionException {
        try {
            int _type = RULE_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12623:10: ( 'try' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12623:12: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRY"

    // $ANTLR start "RULE_CATCH"
    public final void mRULE_CATCH() throws RecognitionException {
        try {
            int _type = RULE_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12625:12: ( 'catch' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12625:14: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CATCH"

    // $ANTLR start "RULE_FINALLY"
    public final void mRULE_FINALLY() throws RecognitionException {
        try {
            int _type = RULE_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12627:14: ( 'finally' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12627:16: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FINALLY"

    // $ANTLR start "RULE_FLOAT_TYPE_SUFIX"
    public final void mRULE_FLOAT_TYPE_SUFIX() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_TYPE_SUFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12629:23: ( ( 'f' | 'd' ) )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12629:25: ( 'f' | 'd' )
            {
            if ( input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_TYPE_SUFIX"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12631:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12631:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12631:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12633:21: ( ( '0' .. '9' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12633:23: ( '0' .. '9' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12633:23: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12633:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12635:13: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12635:15: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12635:19: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12635:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12637:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12637:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12637:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12637:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:41: ( '\\r' )? '\\n'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12639:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12641:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12641:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12641:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12643:11: ( '\\'' . '\\'' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12643:13: '\\'' . '\\''
            {
            match('\''); 
            matchAny(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12645:18: ( '/**' )
            // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:12645:20: '/**'
            {
            match("/**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_HEXA | RULE_EXPONENTIAL | RULE_EXPOENT_PART | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_DECIMAL_DIGITS | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_CHAR | RULE_DOC_COMMENT )
        int alt12=71;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:100: T__40
                {
                mT__40(); 

                }
                break;
            case 17 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:106: T__41
                {
                mT__41(); 

                }
                break;
            case 18 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:112: T__42
                {
                mT__42(); 

                }
                break;
            case 19 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:118: T__43
                {
                mT__43(); 

                }
                break;
            case 20 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:124: T__44
                {
                mT__44(); 

                }
                break;
            case 21 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:130: T__45
                {
                mT__45(); 

                }
                break;
            case 22 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:136: T__46
                {
                mT__46(); 

                }
                break;
            case 23 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:142: T__47
                {
                mT__47(); 

                }
                break;
            case 24 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:148: T__48
                {
                mT__48(); 

                }
                break;
            case 25 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:154: T__49
                {
                mT__49(); 

                }
                break;
            case 26 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:160: T__50
                {
                mT__50(); 

                }
                break;
            case 27 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:166: T__51
                {
                mT__51(); 

                }
                break;
            case 28 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:172: T__52
                {
                mT__52(); 

                }
                break;
            case 29 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:178: T__53
                {
                mT__53(); 

                }
                break;
            case 30 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:184: T__54
                {
                mT__54(); 

                }
                break;
            case 31 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:190: T__55
                {
                mT__55(); 

                }
                break;
            case 32 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:196: T__56
                {
                mT__56(); 

                }
                break;
            case 33 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:202: T__57
                {
                mT__57(); 

                }
                break;
            case 34 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:208: T__58
                {
                mT__58(); 

                }
                break;
            case 35 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:214: T__59
                {
                mT__59(); 

                }
                break;
            case 36 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:220: T__60
                {
                mT__60(); 

                }
                break;
            case 37 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:226: T__61
                {
                mT__61(); 

                }
                break;
            case 38 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:232: T__62
                {
                mT__62(); 

                }
                break;
            case 39 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:238: T__63
                {
                mT__63(); 

                }
                break;
            case 40 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:244: T__64
                {
                mT__64(); 

                }
                break;
            case 41 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:250: T__65
                {
                mT__65(); 

                }
                break;
            case 42 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:256: T__66
                {
                mT__66(); 

                }
                break;
            case 43 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:262: T__67
                {
                mT__67(); 

                }
                break;
            case 44 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:268: T__68
                {
                mT__68(); 

                }
                break;
            case 45 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:274: T__69
                {
                mT__69(); 

                }
                break;
            case 46 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:280: T__70
                {
                mT__70(); 

                }
                break;
            case 47 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:286: T__71
                {
                mT__71(); 

                }
                break;
            case 48 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:292: T__72
                {
                mT__72(); 

                }
                break;
            case 49 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:298: T__73
                {
                mT__73(); 

                }
                break;
            case 50 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:304: T__74
                {
                mT__74(); 

                }
                break;
            case 51 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:310: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 52 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:325: RULE_INCREMENT
                {
                mRULE_INCREMENT(); 

                }
                break;
            case 53 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:340: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 54 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:352: RULE_HEXA
                {
                mRULE_HEXA(); 

                }
                break;
            case 55 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:362: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 56 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:379: RULE_EXPOENT_PART
                {
                mRULE_EXPOENT_PART(); 

                }
                break;
            case 57 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:397: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 58 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:407: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 59 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:418: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 60 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:427: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 61 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:436: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 62 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:447: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 63 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:460: RULE_FLOAT_TYPE_SUFIX
                {
                mRULE_FLOAT_TYPE_SUFIX(); 

                }
                break;
            case 64 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:482: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 65 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:490: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 66 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:510: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 67 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:522: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:538: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 69 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:554: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 70 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:562: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 71 :
                // ../ufcg.edu.br.ProjetoCompiladores.ui/src-gen/org/xtext/java/ui/contentassist/antlr/internal/InternalJava.g:1:572: RULE_DOC_COMMENT
                {
                mRULE_DOC_COMMENT(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\141\1\162\4\uffff\1\150\1\uffff\1\151\4\uffff";
    static final String DFA3_maxS =
        "\1\164\1\165\4\uffff\1\162\1\uffff\1\157\4\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\uffff\1\10\1\11\1\2\1\3";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\4\uffff\1\2\7\uffff\1\3\1\uffff\1\1\2\uffff\1\4\1\6",
            "\1\10\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\12",
            "",
            "\1\13\5\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "12621:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\52\1\40\1\56\4\40\1\77\1\52\3\uffff\1\107\6\uffff\1\40\2\uffff\1\40\1\uffff\2\40\1\uffff\1\121\1\123\1\41\1\40\6\uffff\4\40\1\uffff\2\40\2\uffff\16\40\1\161\1\40\1\uffff\1\164\3\40\2\107\1\170\1\uffff\10\40\5\uffff\1\40\2\uffff\2\40\1\u0087\3\40\1\u008b\17\40\1\u009d\2\40\1\uffff\2\40\1\uffff\3\40\1\uffff\1\u00a6\11\40\1\u00b0\1\uffff\2\40\1\uffff\1\40\1\u00b4\1\40\1\uffff\2\40\1\u00b8\1\40\1\u00ba\1\40\1\u00bc\2\40\1\u00bf\7\40\1\uffff\3\40\1\u00ca\3\40\1\u00ce\1\uffff\1\u00cf\10\40\1\uffff\1\u00d8\1\u00d9\1\u00db\1\uffff\1\40\1\u00dd\1\40\1\uffff\1\40\1\uffff\1\u00e0\1\uffff\1\u00e1\1\40\1\uffff\1\u00e3\1\u00e4\2\40\1\u00e7\5\40\1\uffff\3\40\2\uffff\2\40\1\u00f2\5\40\2\uffff\1\40\1\uffff\1\40\1\uffff\2\40\2\uffff\1\40\2\uffff\1\40\1\u00fe\1\uffff\1\u00ff\3\40\1\u0103\1\u0104\2\40\1\u00db\1\u0107\1\uffff\1\40\1\u00db\3\40\1\u010c\2\40\1\u010f\2\40\2\uffff\3\40\2\uffff\1\u0115\1\u0116\1\uffff\1\u0117\1\u00db\2\40\1\uffff\2\40\1\uffff\1\u011c\4\40\3\uffff\1\40\2\u00db\1\40\1\uffff\1\40\1\u0124\2\40\2\u00db\1\40\1\uffff\1\u0128\1\u0129\1\40\2\uffff\1\u012b\1\uffff";
    static final String DFA12_eofS =
        "\u012c\uffff";
    static final String DFA12_minS =
        "\1\11\1\44\1\150\1\135\1\157\1\141\1\150\1\146\2\44\3\uffff\1\44\6\uffff\1\141\2\uffff\1\145\1\uffff\1\150\1\141\1\uffff\1\55\1\53\1\170\1\142\3\uffff\1\52\2\uffff\1\154\1\157\1\162\1\156\1\uffff\1\141\1\151\2\uffff\1\157\1\164\1\145\2\141\1\156\1\163\1\157\1\156\1\151\1\160\1\141\1\163\1\160\1\44\1\156\1\uffff\1\44\1\146\1\164\1\163\2\60\1\44\1\uffff\1\167\1\154\2\164\1\151\1\143\1\142\1\151\5\uffff\1\163\1\0\1\uffff\1\163\1\141\1\44\1\141\1\145\1\156\1\44\1\145\1\163\1\154\1\145\1\141\1\162\1\163\1\164\1\145\1\143\1\162\1\143\1\164\1\145\1\164\1\44\1\164\1\154\1\uffff\1\147\1\142\1\uffff\1\141\2\145\1\uffff\1\44\1\154\1\151\1\165\1\154\1\153\1\154\1\166\2\164\1\0\1\uffff\1\145\1\164\1\uffff\1\154\1\44\1\163\1\uffff\1\167\1\141\1\44\1\145\1\44\1\153\1\44\1\163\1\151\1\44\1\150\1\164\1\150\1\143\1\162\1\151\1\162\1\uffff\1\141\1\145\1\162\1\44\1\154\1\165\1\156\1\44\1\uffff\1\44\1\166\1\162\1\145\1\141\1\151\1\141\1\145\1\162\1\uffff\3\44\1\uffff\1\151\1\44\1\144\1\uffff\1\141\1\uffff\1\44\1\uffff\1\44\1\156\1\uffff\2\44\1\162\1\150\1\44\1\143\1\146\1\156\1\155\1\164\1\uffff\1\145\1\154\1\144\2\uffff\1\145\1\156\1\44\1\147\1\143\1\164\1\143\1\141\2\uffff\1\171\1\uffff\1\145\1\uffff\1\163\1\156\2\uffff\1\165\2\uffff\1\157\1\44\1\uffff\1\44\1\141\1\143\1\145\2\44\1\164\1\163\2\44\1\uffff\1\145\1\44\1\145\1\164\1\143\1\44\1\156\1\141\1\44\1\145\1\156\2\uffff\1\143\1\145\1\156\2\uffff\2\44\1\uffff\2\44\1\145\1\164\1\uffff\1\164\1\146\1\uffff\1\44\1\151\1\145\1\157\1\164\3\uffff\1\144\2\44\1\145\1\uffff\1\172\1\44\1\146\1\163\2\44\1\145\1\uffff\2\44\1\144\2\uffff\1\44\1\uffff";
    static final String DFA12_maxS =
        "\1\176\1\uffff\1\162\1\135\1\171\1\157\1\171\1\156\2\uffff\3\uffff\1\uffff\6\uffff\1\165\2\uffff\1\145\1\uffff\1\150\1\165\1\uffff\1\55\1\53\1\170\1\142\3\uffff\1\57\2\uffff\1\154\1\157\1\162\1\156\1\uffff\1\171\1\162\2\uffff\1\157\1\164\1\145\2\141\1\156\1\164\1\157\1\156\1\151\1\160\1\141\1\164\1\160\1\uffff\1\156\1\uffff\1\uffff\1\146\1\164\1\163\2\71\1\uffff\1\uffff\1\167\1\154\2\164\1\151\1\143\1\142\1\157\5\uffff\1\163\1\uffff\1\uffff\1\163\1\141\1\uffff\1\141\1\145\1\156\1\uffff\1\157\1\163\1\154\1\145\1\141\1\162\1\163\1\164\1\145\1\143\1\162\1\143\1\164\1\145\1\164\1\uffff\1\164\1\157\1\uffff\1\147\1\142\1\uffff\1\141\2\145\1\uffff\1\uffff\1\154\1\151\1\165\1\154\1\153\1\154\1\166\2\164\1\uffff\1\uffff\1\145\1\164\1\uffff\1\154\1\uffff\1\163\1\uffff\1\167\1\141\1\uffff\1\145\1\uffff\1\153\1\uffff\1\163\1\151\1\uffff\1\150\1\164\1\150\1\143\1\162\1\151\1\162\1\uffff\1\141\1\145\1\162\1\uffff\1\154\1\165\1\156\1\uffff\1\uffff\1\uffff\1\166\1\162\1\145\1\141\1\151\1\141\1\145\1\162\1\uffff\3\uffff\1\uffff\1\151\1\uffff\1\144\1\uffff\1\141\1\uffff\1\uffff\1\uffff\1\uffff\1\156\1\uffff\2\uffff\1\162\1\150\1\uffff\1\143\1\146\1\156\1\155\1\164\1\uffff\1\145\1\154\1\144\2\uffff\1\145\1\156\1\uffff\1\147\1\143\1\164\1\143\1\141\2\uffff\1\171\1\uffff\1\145\1\uffff\1\163\1\156\2\uffff\1\165\2\uffff\1\157\1\uffff\1\uffff\1\uffff\1\141\1\143\1\145\2\uffff\1\164\1\163\2\uffff\1\uffff\1\145\1\uffff\1\145\1\164\1\143\1\uffff\1\156\1\141\1\uffff\1\145\1\156\2\uffff\1\143\1\145\1\156\2\uffff\2\uffff\1\uffff\2\uffff\1\145\1\164\1\uffff\1\164\1\146\1\uffff\1\uffff\1\151\1\145\1\157\1\164\3\uffff\1\144\2\uffff\1\145\1\uffff\1\172\1\uffff\1\146\1\163\2\uffff\1\145\1\uffff\2\uffff\1\144\2\uffff\1\uffff\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\14\1\16\1\17\1\uffff\1\21\1\24\1\25\1\27\1\30\1\31\1\uffff\1\35\1\36\1\uffff\1\42\2\uffff\1\57\4\uffff\1\100\1\101\1\102\1\uffff\1\105\1\106\4\uffff\1\77\2\uffff\1\3\1\26\20\uffff\1\33\7\uffff\1\67\10\uffff\1\63\1\72\1\64\1\71\1\66\2\uffff\1\104\31\uffff\1\53\2\uffff\1\52\3\uffff\1\70\13\uffff\1\103\2\uffff\1\50\3\uffff\1\74\21\uffff\1\10\10\uffff\1\34\11\uffff\1\107\3\uffff\1\2\3\uffff\1\62\1\uffff\1\5\1\uffff\1\6\2\uffff\1\46\12\uffff\1\12\3\uffff\1\54\1\60\10\uffff\1\1\1\11\1\uffff\1\73\1\uffff\1\41\2\uffff\1\43\1\22\1\uffff\1\75\1\7\2\uffff\1\61\12\uffff\1\51\13\uffff\1\45\1\65\3\uffff\1\56\1\13\2\uffff\1\40\4\uffff\1\76\2\uffff\1\4\5\uffff\1\47\1\20\1\55\4\uffff\1\44\7\uffff\1\15\3\uffff\1\32\1\23\1\uffff\1\37";
    static final String DFA12_specialS =
        "\126\uffff\1\0\54\uffff\1\1\u00a8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\26\1\42\1\uffff\1\40\2\uffff\1\45\1\17\1\20\1\33\1\35\1\16\1\34\1\23\1\43\1\36\11\41\1\30\1\12\1\uffff\1\22\3\uffff\32\40\1\3\1\uffff\1\21\1\uffff\1\40\1\uffff\1\37\1\4\1\5\1\11\1\15\1\1\2\40\1\7\2\40\1\10\1\40\1\24\1\40\1\32\1\40\1\27\1\6\1\2\2\40\1\31\3\40\1\13\1\uffff\1\14\1\25",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\46\7\40\1\51\2\40\1\47\2\40\1\50\13\40\105\uffff\uff40\40",
            "\1\54\11\uffff\1\53",
            "\1\55",
            "\1\57\2\uffff\1\61\6\uffff\1\60",
            "\1\65\6\uffff\1\62\3\uffff\1\63\2\uffff\1\64",
            "\1\66\13\uffff\1\72\1\71\1\uffff\1\70\1\uffff\1\67",
            "\1\75\6\uffff\1\74\1\73",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\16\40\1\76\13\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\101\11\40\1\100\13\40\105\uffff\uff40\40",
            "",
            "",
            "",
            "\1\40\6\uffff\1\104\1\uffff\1\105\2\uffff\12\106\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\103\13\40\1\102\2\40\105\uffff\uff40\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112\3\uffff\1\110\17\uffff\1\111",
            "",
            "",
            "\1\113",
            "",
            "\1\114",
            "\1\115\20\uffff\1\117\2\uffff\1\116",
            "",
            "\1\120",
            "\1\122",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\135\23\uffff\1\134\3\uffff\1\136",
            "\1\140\10\uffff\1\137",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\157\1\156",
            "\1\160",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\162",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\24\40\1\163\5\40\105\uffff\uff40\40",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\170",
            "\12\170",
            "\1\40\13\uffff\12\106\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080\5\uffff\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "\1\u0082",
            "\52\u0084\1\u0083\uffd5\u0084",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u008d\11\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\4\40\1\u009c\25\40\105\uffff\uff40\40",
            "\1\u009e",
            "\1\u009f\2\uffff\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\0\u0084",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00b9",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00bb",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00bd",
            "\1\u00be",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\13\40\1\u00da\16\40\105\uffff\uff40\40",
            "",
            "\1\u00dc",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00de",
            "",
            "\1\u00df",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00e2",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00e5",
            "\1\u00e6",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\1\u00fc",
            "",
            "",
            "\1\u00fd",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0105",
            "\1\u0106",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\u0108",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u010d",
            "\1\u010e",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0110",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "",
            "",
            "",
            "\1\u0121",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0125",
            "\1\u0126",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u0127",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            "\1\u012a",
            "",
            "",
            "\1\40\13\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\uff40\40",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_HEXA | RULE_EXPONENTIAL | RULE_EXPOENT_PART | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_DECIMAL_DIGITS | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_CHAR | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='*') ) {s = 131;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<=')')||(LA12_86>='+' && LA12_86<='\uFFFF')) ) {s = 132;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_131 = input.LA(1);

                        s = -1;
                        if ( ((LA12_131>='\u0000' && LA12_131<='\uFFFF')) ) {s = 132;}

                        else s = 176;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}