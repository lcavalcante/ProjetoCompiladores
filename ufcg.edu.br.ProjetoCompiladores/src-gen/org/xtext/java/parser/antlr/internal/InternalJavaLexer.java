package org.xtext.java.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaLexer extends Lexer {
    public static final int RULE_EXP_EQUAL=43;
    public static final int RULE_DIFFERENT=39;
    public static final int RULE_ID=7;
    public static final int RULE_ANY_OTHER=82;
    public static final int RULE_HEXA=54;
    public static final int RULE_INSTANCEOF=21;
    public static final int RULE_OR=40;
    public static final int RULE_MODULE=32;
    public static final int RULE_OR_EQUAL=41;
    public static final int EOF=-1;
    public static final int RULE_STATIC=64;
    public static final int T__93=93;
    public static final int RULE_MOD=63;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int RULE_PACKAGE=76;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_EXCLAMATION=60;
    public static final int RULE_EXTENDS=8;
    public static final int RULE_MULTIPLY_EQUAL=29;
    public static final int RULE_WAT=45;
    public static final int RULE_CHAR=57;
    public static final int RULE_LEFT_PARENTHESIS=13;
    public static final int RULE_RIGHT_PARENTHESIS=12;
    public static final int RULE_R_ABS=14;
    public static final int RULE_AMPERSAND=51;
    public static final int RULE_INTERFACE=6;
    public static final int T__95=95;
    public static final int RULE_DIVIDE_EQUAL=31;
    public static final int RULE_INCREMENT=22;
    public static final int RULE_SUPER=19;
    public static final int T__83=83;
    public static final int RULE_EXPONENTIAL=78;
    public static final int RULE_BE=36;
    public static final int RULE_COMMA=9;
    public static final int RULE_TRY=73;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=79;
    public static final int RULE_BT=34;
    public static final int RULE_MINUS=26;
    public static final int RULE_STRING=56;
    public static final int RULE_DECIMAL_DIGITS=52;
    public static final int RULE_MULTIPLY=28;
    public static final int RULE_IMPORT=77;
    public static final int RULE_L_ABS=15;
    public static final int RULE_ABS=16;
    public static final int RULE_THIS=20;
    public static final int RULE_SE=37;
    public static final int RULE_IF=71;
    public static final int RULE_EXP=42;
    public static final int RULE_DOC_COMMENT=4;
    public static final int RULE_ST=35;
    public static final int RULE_SWITCH=65;
    public static final int RULE_DO=70;
    public static final int RULE_FOR=68;
    public static final int RULE_EOL=5;
    public static final int RULE_MODULE_EQUAL=33;
    public static final int RULE_DIVIDE=30;
    public static final int RULE_NOT=59;
    public static final int RULE_FALSE=62;
    public static final int RULE_WHILE=69;
    public static final int RULE_L_SHIFT=48;
    public static final int RULE_PLUS_EQUAL=25;
    public static final int RULE_DECREMENT=23;
    public static final int RULE_R_SHIFT=49;
    public static final int RULE_FLOAT_TYPE_SUFIX=53;
    public static final int RULE_SUPER_SHIFT=50;
    public static final int RULE_R_CURLY_BRACE=10;
    public static final int RULE_DOUBLE_OR_EQUAL=44;
    public static final int RULE_LONG=55;
    public static final int RULE_PLUS=24;
    public static final int RULE_CASE=66;
    public static final int RULE_CATCH=74;
    public static final int RULE_EQUAL=17;
    public static final int RULE_R_SHIFT_EQUAL=47;
    public static final int RULE_SL_COMMENT=80;
    public static final int RULE_NULL=18;
    public static final int RULE_L_CURLY_BRACE=11;
    public static final int RULE_DEFAULT=67;
    public static final int RULE_TRUE=61;
    public static final int RULE_COLON=46;
    public static final int RULE_NEW=58;
    public static final int RULE_DOUBLE_EQUAL=38;
    public static final int RULE_MINUS_EQUAL=27;
    public static final int RULE_WS=81;
    public static final int RULE_ELSE=72;
    public static final int RULE_FINALLY=75;

    // delegates
    // delegators

    public InternalJavaLexer() {;} 
    public InternalJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g"; }

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:11:7: ( 'class' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:11:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:12:7: ( 'implements' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:12:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:13:7: ( '.' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:14:7: ( 'boolean' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:14:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:15:7: ( 'byte' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:15:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:16:7: ( 'char' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:16:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:17:7: ( 'short' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:17:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:18:7: ( 'int' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:18:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:19:7: ( 'float' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:19:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:20:7: ( 'long' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:20:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:21:7: ( 'double' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:21:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:22:7: ( 'break' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:22:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:23:7: ( 'continue' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:23:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_INTERFACE"
    public final void mRULE_INTERFACE() throws RecognitionException {
        try {
            int _type = RULE_INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5281:16: ( 'interface' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5281:18: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERFACE"

    // $ANTLR start "RULE_EXTENDS"
    public final void mRULE_EXTENDS() throws RecognitionException {
        try {
            int _type = RULE_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5283:14: ( 'extends' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5283:16: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDS"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5285:12: ( ',' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5285:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_R_CURLY_BRACE"
    public final void mRULE_R_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_R_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5287:20: ( '{' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5287:22: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_CURLY_BRACE"

    // $ANTLR start "RULE_L_CURLY_BRACE"
    public final void mRULE_L_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = RULE_L_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5289:20: ( '}' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5289:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_CURLY_BRACE"

    // $ANTLR start "RULE_ABS"
    public final void mRULE_ABS() throws RecognitionException {
        try {
            int _type = RULE_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5291:10: ( '[]' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5291:12: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABS"

    // $ANTLR start "RULE_R_ABS"
    public final void mRULE_R_ABS() throws RecognitionException {
        try {
            int _type = RULE_R_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5293:12: ( '[' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5293:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_ABS"

    // $ANTLR start "RULE_L_ABS"
    public final void mRULE_L_ABS() throws RecognitionException {
        try {
            int _type = RULE_L_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5295:12: ( ']' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5295:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_ABS"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5297:12: ( '=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5297:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5299:11: ( 'NULL' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5299:13: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_THIS"
    public final void mRULE_THIS() throws RecognitionException {
        try {
            int _type = RULE_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5301:11: ( 'this' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5301:13: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THIS"

    // $ANTLR start "RULE_SUPER"
    public final void mRULE_SUPER() throws RecognitionException {
        try {
            int _type = RULE_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5303:12: ( 'super' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5303:14: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER"

    // $ANTLR start "RULE_INSTANCEOF"
    public final void mRULE_INSTANCEOF() throws RecognitionException {
        try {
            int _type = RULE_INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5305:17: ( 'instanceof' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5305:19: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANCEOF"

    // $ANTLR start "RULE_L_SHIFT"
    public final void mRULE_L_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_L_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5307:14: ( '<<' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5307:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L_SHIFT"

    // $ANTLR start "RULE_R_SHIFT"
    public final void mRULE_R_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5309:14: ( '>>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5309:16: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT"

    // $ANTLR start "RULE_SUPER_SHIFT"
    public final void mRULE_SUPER_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_SUPER_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5311:18: ( '>>>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5311:20: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER_SHIFT"

    // $ANTLR start "RULE_R_SHIFT_EQUAL"
    public final void mRULE_R_SHIFT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_R_SHIFT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5313:20: ( '>>=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5313:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_R_SHIFT_EQUAL"

    // $ANTLR start "RULE_DOUBLE_OR_EQUAL"
    public final void mRULE_DOUBLE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5315:22: ( '||=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5315:24: '||='
            {
            match("||="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_OR_EQUAL"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5317:9: ( '|' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5317:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_OR_EQUAL"
    public final void mRULE_OR_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_OR_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5319:15: ( '|=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5319:17: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_EQUAL"

    // $ANTLR start "RULE_EXP"
    public final void mRULE_EXP() throws RecognitionException {
        try {
            int _type = RULE_EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5321:10: ( '^' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5321:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP"

    // $ANTLR start "RULE_EXP_EQUAL"
    public final void mRULE_EXP_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EXP_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5323:16: ( '^=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5323:18: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXP_EQUAL"

    // $ANTLR start "RULE_DOUBLE_EQUAL"
    public final void mRULE_DOUBLE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5325:19: ( '==' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5325:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_EQUAL"

    // $ANTLR start "RULE_DIFFERENT"
    public final void mRULE_DIFFERENT() throws RecognitionException {
        try {
            int _type = RULE_DIFFERENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5327:16: ( '!=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5327:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFFERENT"

    // $ANTLR start "RULE_BT"
    public final void mRULE_BT() throws RecognitionException {
        try {
            int _type = RULE_BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5329:9: ( '>' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5329:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BT"

    // $ANTLR start "RULE_ST"
    public final void mRULE_ST() throws RecognitionException {
        try {
            int _type = RULE_ST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5331:9: ( '<' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5331:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ST"

    // $ANTLR start "RULE_BE"
    public final void mRULE_BE() throws RecognitionException {
        try {
            int _type = RULE_BE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5333:9: ( '>=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5333:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BE"

    // $ANTLR start "RULE_SE"
    public final void mRULE_SE() throws RecognitionException {
        try {
            int _type = RULE_SE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5335:9: ( '<=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5335:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SE"

    // $ANTLR start "RULE_DIVIDE"
    public final void mRULE_DIVIDE() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5337:13: ( '/' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5337:15: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE"

    // $ANTLR start "RULE_DIVIDE_EQUAL"
    public final void mRULE_DIVIDE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_DIVIDE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5339:19: ( '/=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5339:21: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVIDE_EQUAL"

    // $ANTLR start "RULE_MODULE"
    public final void mRULE_MODULE() throws RecognitionException {
        try {
            int _type = RULE_MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5341:13: ( '%' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5341:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE"

    // $ANTLR start "RULE_MODULE_EQUAL"
    public final void mRULE_MODULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MODULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5343:19: ( '%=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5343:21: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE_EQUAL"

    // $ANTLR start "RULE_PLUS_EQUAL"
    public final void mRULE_PLUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_PLUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5345:17: ( '+=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5345:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_EQUAL"

    // $ANTLR start "RULE_MINUS_EQUAL"
    public final void mRULE_MINUS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MINUS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5347:18: ( '-=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5347:20: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_EQUAL"

    // $ANTLR start "RULE_MULTIPLY"
    public final void mRULE_MULTIPLY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5349:15: ( '*' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5349:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY"

    // $ANTLR start "RULE_MULTIPLY_EQUAL"
    public final void mRULE_MULTIPLY_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5351:21: ( '*=' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5351:23: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY_EQUAL"

    // $ANTLR start "RULE_WAT"
    public final void mRULE_WAT() throws RecognitionException {
        try {
            int _type = RULE_WAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5353:10: ( '?' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5353:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WAT"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5355:16: ( 'ampersand' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5355:18: 'ampersand'
            {
            match("ampersand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_EXPONENTIAL"
    public final void mRULE_EXPONENTIAL() throws RecognitionException {
        try {
            int _type = RULE_EXPONENTIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:18: ( ( 'e' | 'e+' | 'e-' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:20: ( 'e' | 'e+' | 'e-' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:20: ( 'e' | 'e+' | 'e-' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='e') ) {
                switch ( input.LA(2) ) {
                case '+':
                    {
                    alt1=2;
                    }
                    break;
                case '-':
                    {
                    alt1=3;
                    }
                    break;
                default:
                    alt1=1;}

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:21: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:25: 'e+'
                    {
                    match("e+"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5357:30: 'e-'
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

    // $ANTLR start "RULE_LONG"
    public final void mRULE_LONG() throws RecognitionException {
        try {
            int _type = RULE_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5359:11: ( 'l' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5359:13: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONG"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5361:13: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5361:15: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5361:19: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5361:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5363:12: ( ':' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5363:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5365:10: ( 'new' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5365:12: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5367:10: ( '~' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5367:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_EXCLAMATION"
    public final void mRULE_EXCLAMATION() throws RecognitionException {
        try {
            int _type = RULE_EXCLAMATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5369:18: ( '!' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5369:20: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLAMATION"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5371:12: ( 'false' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5371:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5373:11: ( 'true' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5373:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_DECREMENT"
    public final void mRULE_DECREMENT() throws RecognitionException {
        try {
            int _type = RULE_DECREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5375:16: ( '--' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5375:18: '--'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5377:16: ( '++' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5377:18: '++'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5379:13: ( 'static' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5379:15: 'static'
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

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5381:14: ( 'default' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5381:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5383:11: ( 'case' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5383:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5385:13: ( 'switch' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5385:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5387:10: ( 'for' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5387:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_RIGHT_PARENTHESIS"
    public final void mRULE_RIGHT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5389:24: ( '(' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5389:26: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PARENTHESIS"

    // $ANTLR start "RULE_LEFT_PARENTHESIS"
    public final void mRULE_LEFT_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5391:23: ( ')' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5391:25: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PARENTHESIS"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5393:10: ( ';' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5393:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5395:9: ( 'if' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5395:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5397:11: ( 'else' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5397:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5399:9: ( 'do' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5399:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5401:12: ( 'while' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5401:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_PACKAGE"
    public final void mRULE_PACKAGE() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5403:14: ( 'package' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5403:16: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKAGE"

    // $ANTLR start "RULE_IMPORT"
    public final void mRULE_IMPORT() throws RecognitionException {
        try {
            int _type = RULE_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5405:13: ( 'import' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5405:15: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORT"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5407:11: ( '\\'' . '\\'' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5407:13: '\\'' . '\\''
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

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5409:11: ( '+' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5409:13: '+'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5411:12: ( '-' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5411:14: '-'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:10: ( ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:13: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 2 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:22: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 3 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:32: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 4 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:44: 'final'
                    {
                    match("final"); 


                    }
                    break;
                case 5 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:52: 'native'
                    {
                    match("native"); 


                    }
                    break;
                case 6 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:61: 'synchronized'
                    {
                    match("synchronized"); 


                    }
                    break;
                case 7 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:76: 'abstract'
                    {
                    match("abstract"); 


                    }
                    break;
                case 8 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:87: 'threadsafe'
                    {
                    match("threadsafe"); 


                    }
                    break;
                case 9 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5413:100: 'transient'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5415:10: ( 'try' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5415:12: 'try'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5417:12: ( 'catch' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5417:14: 'catch'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5419:14: ( 'finally' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5419:16: 'finally'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5421:23: ( ( 'f' | 'd' ) )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5421:25: ( 'f' | 'd' )
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5423:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5423:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5423:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '$' | '\\u00C0' .. '\\uFFFF' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='$'||(LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:
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

    // $ANTLR start "RULE_HEXA"
    public final void mRULE_HEXA() throws RecognitionException {
        try {
            int _type = RULE_HEXA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5425:11: ( '0' 'x' ( '0' .. '9' 'a' .. 'f' )* )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5425:13: '0' 'x' ( '0' .. '9' 'a' .. 'f' )*
            {
            match('0'); 
            match('x'); 
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5425:21: ( '0' .. '9' 'a' .. 'f' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5425:22: '0' .. '9' 'a' .. 'f'
            	    {
            	    matchRange('0','9'); 
            	    matchRange('a','f'); 

            	    }
            	    break;

            	default :
            	    break loop5;
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

    // $ANTLR start "RULE_DECIMAL_DIGITS"
    public final void mRULE_DECIMAL_DIGITS() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_DIGITS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5427:21: ( ( '0' .. '9' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5427:23: ( '0' .. '9' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5427:23: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5427:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_DIGITS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5429:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5429:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5429:24: ( options {greedy=false; } : . )*
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
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5429:52: .
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:41: ( '\\r' )? '\\n'
                    {
                    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5431:41: '\\r'
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
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5433:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5433:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5433:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5435:16: ( . )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5435:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    // $ANTLR start "RULE_DOC_COMMENT"
    public final void mRULE_DOC_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5437:18: ( '/**' )
            // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:5437:20: '/**'
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
        // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:8: ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_INTERFACE | RULE_EXTENDS | RULE_COMMA | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_ABS | RULE_R_ABS | RULE_L_ABS | RULE_EQUAL | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_DEFAULT | RULE_CASE | RULE_SWITCH | RULE_FOR | RULE_RIGHT_PARENTHESIS | RULE_LEFT_PARENTHESIS | RULE_EOL | RULE_IF | RULE_ELSE | RULE_DO | RULE_WHILE | RULE_PACKAGE | RULE_IMPORT | RULE_CHAR | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT )
        int alt12=92;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:10: T__83
                {
                mT__83(); 

                }
                break;
            case 2 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:16: T__84
                {
                mT__84(); 

                }
                break;
            case 3 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:22: T__85
                {
                mT__85(); 

                }
                break;
            case 4 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:28: T__86
                {
                mT__86(); 

                }
                break;
            case 5 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:34: T__87
                {
                mT__87(); 

                }
                break;
            case 6 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:40: T__88
                {
                mT__88(); 

                }
                break;
            case 7 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:46: T__89
                {
                mT__89(); 

                }
                break;
            case 8 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:52: T__90
                {
                mT__90(); 

                }
                break;
            case 9 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:58: T__91
                {
                mT__91(); 

                }
                break;
            case 10 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:64: T__92
                {
                mT__92(); 

                }
                break;
            case 11 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:70: T__93
                {
                mT__93(); 

                }
                break;
            case 12 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:76: T__94
                {
                mT__94(); 

                }
                break;
            case 13 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:82: T__95
                {
                mT__95(); 

                }
                break;
            case 14 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:88: RULE_INTERFACE
                {
                mRULE_INTERFACE(); 

                }
                break;
            case 15 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:103: RULE_EXTENDS
                {
                mRULE_EXTENDS(); 

                }
                break;
            case 16 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:116: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 17 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:127: RULE_R_CURLY_BRACE
                {
                mRULE_R_CURLY_BRACE(); 

                }
                break;
            case 18 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:146: RULE_L_CURLY_BRACE
                {
                mRULE_L_CURLY_BRACE(); 

                }
                break;
            case 19 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:165: RULE_ABS
                {
                mRULE_ABS(); 

                }
                break;
            case 20 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:174: RULE_R_ABS
                {
                mRULE_R_ABS(); 

                }
                break;
            case 21 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:185: RULE_L_ABS
                {
                mRULE_L_ABS(); 

                }
                break;
            case 22 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:196: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 23 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:207: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 24 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:217: RULE_THIS
                {
                mRULE_THIS(); 

                }
                break;
            case 25 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:227: RULE_SUPER
                {
                mRULE_SUPER(); 

                }
                break;
            case 26 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:238: RULE_INSTANCEOF
                {
                mRULE_INSTANCEOF(); 

                }
                break;
            case 27 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:254: RULE_L_SHIFT
                {
                mRULE_L_SHIFT(); 

                }
                break;
            case 28 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:267: RULE_R_SHIFT
                {
                mRULE_R_SHIFT(); 

                }
                break;
            case 29 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:280: RULE_SUPER_SHIFT
                {
                mRULE_SUPER_SHIFT(); 

                }
                break;
            case 30 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:297: RULE_R_SHIFT_EQUAL
                {
                mRULE_R_SHIFT_EQUAL(); 

                }
                break;
            case 31 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:316: RULE_DOUBLE_OR_EQUAL
                {
                mRULE_DOUBLE_OR_EQUAL(); 

                }
                break;
            case 32 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:337: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 33 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:345: RULE_OR_EQUAL
                {
                mRULE_OR_EQUAL(); 

                }
                break;
            case 34 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:359: RULE_EXP
                {
                mRULE_EXP(); 

                }
                break;
            case 35 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:368: RULE_EXP_EQUAL
                {
                mRULE_EXP_EQUAL(); 

                }
                break;
            case 36 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:383: RULE_DOUBLE_EQUAL
                {
                mRULE_DOUBLE_EQUAL(); 

                }
                break;
            case 37 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:401: RULE_DIFFERENT
                {
                mRULE_DIFFERENT(); 

                }
                break;
            case 38 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:416: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 39 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:424: RULE_ST
                {
                mRULE_ST(); 

                }
                break;
            case 40 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:432: RULE_BE
                {
                mRULE_BE(); 

                }
                break;
            case 41 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:440: RULE_SE
                {
                mRULE_SE(); 

                }
                break;
            case 42 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:448: RULE_DIVIDE
                {
                mRULE_DIVIDE(); 

                }
                break;
            case 43 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:460: RULE_DIVIDE_EQUAL
                {
                mRULE_DIVIDE_EQUAL(); 

                }
                break;
            case 44 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:478: RULE_MODULE
                {
                mRULE_MODULE(); 

                }
                break;
            case 45 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:490: RULE_MODULE_EQUAL
                {
                mRULE_MODULE_EQUAL(); 

                }
                break;
            case 46 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:508: RULE_PLUS_EQUAL
                {
                mRULE_PLUS_EQUAL(); 

                }
                break;
            case 47 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:524: RULE_MINUS_EQUAL
                {
                mRULE_MINUS_EQUAL(); 

                }
                break;
            case 48 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:541: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 49 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:555: RULE_MULTIPLY_EQUAL
                {
                mRULE_MULTIPLY_EQUAL(); 

                }
                break;
            case 50 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:575: RULE_WAT
                {
                mRULE_WAT(); 

                }
                break;
            case 51 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:584: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 52 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:599: RULE_EXPONENTIAL
                {
                mRULE_EXPONENTIAL(); 

                }
                break;
            case 53 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:616: RULE_LONG
                {
                mRULE_LONG(); 

                }
                break;
            case 54 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:626: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:638: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 56 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:649: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 57 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:658: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 58 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:667: RULE_EXCLAMATION
                {
                mRULE_EXCLAMATION(); 

                }
                break;
            case 59 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:684: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 60 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:695: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 61 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:705: RULE_DECREMENT
                {
                mRULE_DECREMENT(); 

                }
                break;
            case 62 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:720: RULE_INCREMENT
                {
                mRULE_INCREMENT(); 

                }
                break;
            case 63 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:735: RULE_STATIC
                {
                mRULE_STATIC(); 

                }
                break;
            case 64 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:747: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 65 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:760: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 66 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:770: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 67 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:782: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 68 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:791: RULE_RIGHT_PARENTHESIS
                {
                mRULE_RIGHT_PARENTHESIS(); 

                }
                break;
            case 69 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:814: RULE_LEFT_PARENTHESIS
                {
                mRULE_LEFT_PARENTHESIS(); 

                }
                break;
            case 70 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:836: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 71 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:845: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 72 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:853: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 73 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:863: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 74 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:871: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 75 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:882: RULE_PACKAGE
                {
                mRULE_PACKAGE(); 

                }
                break;
            case 76 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:895: RULE_IMPORT
                {
                mRULE_IMPORT(); 

                }
                break;
            case 77 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:907: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 78 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:917: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 79 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:927: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 80 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:938: RULE_MOD
                {
                mRULE_MOD(); 

                }
                break;
            case 81 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:947: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 82 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:956: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 83 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:967: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 84 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:980: RULE_FLOAT_TYPE_SUFIX
                {
                mRULE_FLOAT_TYPE_SUFIX(); 

                }
                break;
            case 85 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1002: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 86 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1010: RULE_HEXA
                {
                mRULE_HEXA(); 

                }
                break;
            case 87 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1020: RULE_DECIMAL_DIGITS
                {
                mRULE_DECIMAL_DIGITS(); 

                }
                break;
            case 88 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1040: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 89 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1056: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1072: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 91 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1080: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 92 :
                // ../ufcg.edu.br.ProjetoCompiladores/src-gen/org/xtext/java/parser/antlr/internal/InternalJava.g:1:1095: RULE_DOC_COMMENT
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
            return "5413:12: ( 'public' | 'private' | 'protected' | 'final' | 'native' | 'synchronized' | 'abstract' | 'threadsafe' | 'transient' )";
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\2\61\1\uffff\2\61\1\102\1\104\1\102\1\110\3\uffff\1\116"+
        "\1\uffff\1\121\2\61\1\127\1\132\1\135\1\137\1\141\1\145\1\147\1"+
        "\152\1\155\1\157\1\uffff\1\61\1\54\1\uffff\1\61\4\uffff\2\61\1\54"+
        "\1\uffff\1\u0081\3\uffff\4\61\1\uffff\2\61\1\u008b\1\uffff\14\61"+
        "\1\uffff\1\61\1\uffff\1\u009a\2\61\1\uffff\1\61\10\uffff\3\61\3"+
        "\uffff\1\u00a6\30\uffff\2\61\2\uffff\2\61\4\uffff\4\61\4\uffff\6"+
        "\61\1\u00ba\1\61\1\uffff\12\61\1\u00c6\3\61\1\uffff\10\61\1\u00d2"+
        "\3\uffff\1\u00d3\1\uffff\2\61\1\u00d6\7\61\1\u00de\1\61\1\u00e0"+
        "\4\61\1\uffff\2\61\1\u00e7\10\61\1\uffff\1\61\1\u00f1\3\61\1\u00f5"+
        "\1\u00f6\1\u00f7\1\61\1\u00f9\1\61\2\uffff\2\61\1\uffff\6\61\1\u0103"+
        "\1\uffff\1\61\1\uffff\1\u0105\5\61\1\uffff\1\u010b\1\u010c\1\u010d"+
        "\3\61\1\u0111\1\u0112\1\u0114\1\uffff\3\61\3\uffff\1\61\1\uffff"+
        "\4\61\1\u011d\4\61\1\uffff\1\61\1\uffff\1\61\1\u0124\3\61\3\uffff"+
        "\1\u0128\1\u0129\1\61\2\uffff\1\61\1\uffff\1\u012c\6\61\1\u0114"+
        "\1\uffff\1\61\1\u0114\4\61\1\uffff\2\61\1\u013a\2\uffff\1\61\1\u013c"+
        "\1\uffff\1\u013d\1\u013e\4\61\1\u0143\1\u0114\1\61\1\u0145\3\61"+
        "\1\uffff\1\61\3\uffff\3\61\1\u0114\1\uffff\1\61\1\uffff\1\61\1\u014f"+
        "\3\61\1\u0114\1\u0153\1\u0114\1\u0154\1\uffff\1\u0155\1\61\1\u0114"+
        "\3\uffff\1\61\1\u0114";
    static final String DFA12_eofS =
        "\u0158\uffff";
    static final String DFA12_minS =
        "\1\0\1\141\1\146\1\uffff\1\157\1\150\4\44\3\uffff\1\135\1\uffff"+
        "\1\75\1\125\1\150\1\74\4\75\1\52\1\75\1\53\1\55\1\75\1\uffff\1\142"+
        "\1\0\1\uffff\1\141\4\uffff\1\150\1\141\1\0\1\uffff\1\170\3\uffff"+
        "\2\141\1\156\1\163\1\uffff\1\160\1\163\1\44\1\uffff\1\157\1\164"+
        "\1\145\1\157\1\160\1\141\1\151\1\156\1\157\1\154\1\162\1\156\1\uffff"+
        "\1\156\1\uffff\1\44\1\146\1\164\1\uffff\1\163\10\uffff\1\114\1\151"+
        "\1\141\3\uffff\1\75\12\uffff\1\0\15\uffff\1\160\1\163\2\uffff\1"+
        "\167\1\164\4\uffff\1\151\1\143\1\142\1\151\4\uffff\1\163\1\162\1"+
        "\164\1\145\1\143\1\154\1\44\1\164\1\uffff\1\154\1\145\1\141\1\162"+
        "\1\145\2\164\1\143\1\141\1\163\1\44\1\141\1\147\1\142\1\uffff\1"+
        "\141\2\145\1\114\1\163\2\145\1\156\1\44\3\uffff\1\0\1\uffff\1\145"+
        "\1\164\1\44\1\151\1\154\1\153\1\154\1\166\1\164\1\163\1\44\1\151"+
        "\1\44\1\150\1\145\2\162\1\uffff\1\141\1\145\1\44\1\153\1\164\1\162"+
        "\1\151\1\143\1\150\1\164\1\145\1\uffff\1\154\1\44\1\154\1\165\1"+
        "\156\3\44\1\141\1\44\1\163\2\uffff\2\162\1\uffff\1\166\1\145\1\141"+
        "\1\151\1\141\1\145\1\44\1\uffff\1\156\1\uffff\1\44\1\155\1\164\1"+
        "\146\1\156\1\141\1\uffff\3\44\1\143\1\150\1\162\3\44\1\uffff\1\145"+
        "\1\154\1\144\3\uffff\1\144\1\uffff\1\151\1\163\1\141\1\145\1\44"+
        "\1\147\1\143\1\164\1\143\1\uffff\1\165\1\uffff\1\145\1\44\1\141"+
        "\1\143\1\156\3\uffff\2\44\1\157\2\uffff\1\171\1\uffff\1\44\1\164"+
        "\2\163\1\145\1\141\1\143\1\44\1\uffff\1\145\1\44\1\145\1\164\1\145"+
        "\1\156\1\uffff\1\143\1\145\1\44\2\uffff\1\156\1\44\1\uffff\2\44"+
        "\1\141\2\156\1\164\2\44\1\145\1\44\1\164\1\145\1\157\1\uffff\1\151"+
        "\3\uffff\1\146\1\164\1\144\1\44\1\uffff\1\144\1\uffff\1\163\1\44"+
        "\1\146\1\172\1\145\4\44\1\uffff\1\44\1\145\1\44\3\uffff\1\144\1"+
        "\44";
    static final String DFA12_maxS =
        "\1\uffff\1\157\1\156\1\uffff\2\171\4\uffff\3\uffff\1\135\1\uffff"+
        "\1\75\1\125\1\162\1\75\1\76\1\174\7\75\1\uffff\1\155\1\uffff\1\uffff"+
        "\1\145\4\uffff\1\150\1\165\1\uffff\1\uffff\1\170\3\uffff\2\141\1"+
        "\156\1\164\1\uffff\1\160\1\164\1\uffff\1\uffff\1\157\1\164\1\145"+
        "\1\157\1\160\1\141\1\151\1\156\1\157\1\154\1\162\1\156\1\uffff\1"+
        "\156\1\uffff\1\uffff\1\146\1\164\1\uffff\1\163\10\uffff\1\114\1"+
        "\162\1\171\3\uffff\1\76\12\uffff\1\uffff\15\uffff\1\160\1\163\2"+
        "\uffff\1\167\1\164\4\uffff\1\151\1\143\1\142\1\157\4\uffff\1\163"+
        "\1\162\1\164\1\145\1\143\1\157\1\uffff\1\164\1\uffff\1\154\1\145"+
        "\1\141\1\162\1\145\2\164\1\143\1\141\1\163\1\uffff\1\141\1\147\1"+
        "\142\1\uffff\1\141\2\145\1\114\1\163\2\145\1\156\1\uffff\3\uffff"+
        "\1\uffff\1\uffff\1\145\1\164\1\uffff\1\151\1\154\1\153\1\154\1\166"+
        "\1\164\1\163\1\uffff\1\151\1\uffff\1\150\1\145\2\162\1\uffff\1\141"+
        "\1\145\1\uffff\1\153\1\164\1\162\1\151\1\143\1\150\1\164\1\145\1"+
        "\uffff\1\154\1\uffff\1\154\1\165\1\156\3\uffff\1\141\1\uffff\1\163"+
        "\2\uffff\2\162\1\uffff\1\166\1\145\1\141\1\151\1\141\1\145\1\uffff"+
        "\1\uffff\1\156\1\uffff\1\uffff\1\155\1\164\1\146\1\156\1\141\1\uffff"+
        "\3\uffff\1\143\1\150\1\162\3\uffff\1\uffff\1\145\1\154\1\144\3\uffff"+
        "\1\144\1\uffff\1\151\1\163\1\141\1\145\1\uffff\1\147\1\143\1\164"+
        "\1\143\1\uffff\1\165\1\uffff\1\145\1\uffff\1\141\1\143\1\156\3\uffff"+
        "\2\uffff\1\157\2\uffff\1\171\1\uffff\1\uffff\1\164\2\163\1\145\1"+
        "\141\1\143\1\uffff\1\uffff\1\145\1\uffff\1\145\1\164\1\145\1\156"+
        "\1\uffff\1\143\1\145\1\uffff\2\uffff\1\156\1\uffff\1\uffff\2\uffff"+
        "\1\141\2\156\1\164\2\uffff\1\145\1\uffff\1\164\1\145\1\157\1\uffff"+
        "\1\151\3\uffff\1\146\1\164\1\144\1\uffff\1\uffff\1\144\1\uffff\1"+
        "\163\1\uffff\1\146\1\172\1\145\4\uffff\1\uffff\1\uffff\1\145\1\uffff"+
        "\3\uffff\1\144\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\6\uffff\1\20\1\21\1\22\1\uffff\1\25\15\uffff\1\62"+
        "\2\uffff\1\67\1\uffff\1\71\1\104\1\105\1\106\3\uffff\1\125\1\uffff"+
        "\1\127\1\132\1\133\4\uffff\1\125\3\uffff\1\3\14\uffff\1\124\1\uffff"+
        "\1\65\3\uffff\1\64\1\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\44\1"+
        "\26\3\uffff\1\33\1\51\1\47\1\uffff\1\50\1\46\1\37\1\41\1\40\1\43"+
        "\1\42\1\45\1\72\1\53\1\uffff\1\131\1\52\1\55\1\54\1\56\1\76\1\116"+
        "\1\57\1\75\1\117\1\61\1\60\1\62\2\uffff\1\66\1\67\2\uffff\1\71\1"+
        "\104\1\105\1\106\4\uffff\1\115\1\126\1\127\1\132\10\uffff\1\107"+
        "\16\uffff\1\111\11\uffff\1\35\1\36\1\34\1\uffff\1\130\21\uffff\1"+
        "\10\13\uffff\1\103\13\uffff\1\121\1\134\2\uffff\1\70\7\uffff\1\6"+
        "\1\uffff\1\101\6\uffff\1\5\11\uffff\1\12\3\uffff\1\110\1\27\1\30"+
        "\1\uffff\1\74\11\uffff\1\1\1\uffff\1\122\5\uffff\1\14\1\7\1\31\3"+
        "\uffff\1\11\1\73\1\uffff\1\120\10\uffff\1\112\6\uffff\1\114\3\uffff"+
        "\1\77\1\102\2\uffff\1\13\15\uffff\1\4\1\uffff\1\123\1\100\1\17\4"+
        "\uffff\1\113\1\uffff\1\15\11\uffff\1\16\3\uffff\1\63\1\2\1\32\2"+
        "\uffff";
    static final String DFA12_specialS =
        "\1\3\35\uffff\1\4\10\uffff\1\2\73\uffff\1\0\103\uffff\1\1\u00b0"+
        "\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\26\1\36\1\54\1\50\1\30\1"+
            "\54\1\47\1\42\1\43\1\33\1\31\1\12\1\32\1\3\1\27\1\51\11\52\1"+
            "\37\1\44\1\22\1\17\1\23\1\34\1\54\15\50\1\20\14\50\1\15\1\54"+
            "\1\16\1\25\1\50\1\54\1\35\1\4\1\1\1\10\1\11\1\6\2\50\1\2\2\50"+
            "\1\7\1\50\1\40\1\50\1\46\2\50\1\5\1\21\2\50\1\45\3\50\1\13\1"+
            "\24\1\14\1\41\uff81\54",
            "\1\60\6\uffff\1\56\3\uffff\1\55\2\uffff\1\57",
            "\1\64\6\uffff\1\62\1\63",
            "",
            "\1\66\2\uffff\1\70\6\uffff\1\67",
            "\1\71\13\uffff\1\73\1\72\1\uffff\1\74\1\uffff\1\75",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\1"+
            "\77\7\61\1\101\2\61\1\76\2\61\1\100\13\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\16"+
            "\61\1\103\13\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4"+
            "\61\1\106\11\61\1\105\13\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13"+
            "\61\1\111\13\61\1\107\2\61\105\uffff\uff40\61",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\120",
            "\1\122",
            "\1\123\11\uffff\1\124",
            "\1\125\1\126",
            "\1\131\1\130",
            "\1\134\76\uffff\1\133",
            "\1\136",
            "\1\140",
            "\1\143\4\uffff\1\144\15\uffff\1\142",
            "\1\146",
            "\1\151\21\uffff\1\150",
            "\1\154\17\uffff\1\153",
            "\1\156",
            "",
            "\1\162\12\uffff\1\161",
            "\0\163",
            "",
            "\1\166\3\uffff\1\165",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174\20\uffff\1\176\2\uffff\1\175",
            "\0\177",
            "",
            "\1\u0080",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\1\u0087",
            "",
            "\1\u0088",
            "\1\u008a\1\u0089",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\u008c",
            "\1\u008d",
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
            "",
            "\1\u0098",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24"+
            "\61\1\u0099\5\61\105\uffff\uff40\61",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f\10\uffff\1\u00a0",
            "\1\u00a2\23\uffff\1\u00a1\3\uffff\1\u00a3",
            "",
            "",
            "",
            "\1\u00a5\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\u00a8\1\u00a7\uffd5\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0\5\uffff\1\u00b1",
            "",
            "",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\2\uffff\1\u00b8",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4"+
            "\61\1\u00b9\25\61\105\uffff\uff40\61",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "",
            "",
            "\0\u00a8",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00df",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00f8",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u00fa",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\u0104",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13"+
            "\61\1\u0113\16\61\105\uffff\uff40\61",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u012a",
            "",
            "",
            "\1\u012b",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\u0133",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "",
            "\1\u013b",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0144",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\1\u0149",
            "",
            "",
            "",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "\1\u0156",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61",
            "",
            "",
            "",
            "\1\u0157",
            "\1\61\13\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61\105\uffff\uff40\61"
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
            return "1:1: Tokens : ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_INTERFACE | RULE_EXTENDS | RULE_COMMA | RULE_R_CURLY_BRACE | RULE_L_CURLY_BRACE | RULE_ABS | RULE_R_ABS | RULE_L_ABS | RULE_EQUAL | RULE_NULL | RULE_THIS | RULE_SUPER | RULE_INSTANCEOF | RULE_L_SHIFT | RULE_R_SHIFT | RULE_SUPER_SHIFT | RULE_R_SHIFT_EQUAL | RULE_DOUBLE_OR_EQUAL | RULE_OR | RULE_OR_EQUAL | RULE_EXP | RULE_EXP_EQUAL | RULE_DOUBLE_EQUAL | RULE_DIFFERENT | RULE_BT | RULE_ST | RULE_BE | RULE_SE | RULE_DIVIDE | RULE_DIVIDE_EQUAL | RULE_MODULE | RULE_MODULE_EQUAL | RULE_PLUS_EQUAL | RULE_MINUS_EQUAL | RULE_MULTIPLY | RULE_MULTIPLY_EQUAL | RULE_WAT | RULE_AMPERSAND | RULE_EXPONENTIAL | RULE_LONG | RULE_STRING | RULE_COLON | RULE_NEW | RULE_NOT | RULE_EXCLAMATION | RULE_FALSE | RULE_TRUE | RULE_DECREMENT | RULE_INCREMENT | RULE_STATIC | RULE_DEFAULT | RULE_CASE | RULE_SWITCH | RULE_FOR | RULE_RIGHT_PARENTHESIS | RULE_LEFT_PARENTHESIS | RULE_EOL | RULE_IF | RULE_ELSE | RULE_DO | RULE_WHILE | RULE_PACKAGE | RULE_IMPORT | RULE_CHAR | RULE_PLUS | RULE_MINUS | RULE_MOD | RULE_TRY | RULE_CATCH | RULE_FINALLY | RULE_FLOAT_TYPE_SUFIX | RULE_ID | RULE_HEXA | RULE_DECIMAL_DIGITS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_DOC_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='*') ) {s = 167;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<=')')||(LA12_99>='+' && LA12_99<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( ((LA12_167>='\u0000' && LA12_167<='\uFFFF')) ) {s = 168;}

                        else s = 211;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( ((LA12_39>='\u0000' && LA12_39<='\uFFFF')) ) {s = 127;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='c') ) {s = 1;}

                        else if ( (LA12_0=='i') ) {s = 2;}

                        else if ( (LA12_0=='.') ) {s = 3;}

                        else if ( (LA12_0=='b') ) {s = 4;}

                        else if ( (LA12_0=='s') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='l') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='e') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='{') ) {s = 11;}

                        else if ( (LA12_0=='}') ) {s = 12;}

                        else if ( (LA12_0=='[') ) {s = 13;}

                        else if ( (LA12_0==']') ) {s = 14;}

                        else if ( (LA12_0=='=') ) {s = 15;}

                        else if ( (LA12_0=='N') ) {s = 16;}

                        else if ( (LA12_0=='t') ) {s = 17;}

                        else if ( (LA12_0=='<') ) {s = 18;}

                        else if ( (LA12_0=='>') ) {s = 19;}

                        else if ( (LA12_0=='|') ) {s = 20;}

                        else if ( (LA12_0=='^') ) {s = 21;}

                        else if ( (LA12_0=='!') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( (LA12_0=='%') ) {s = 24;}

                        else if ( (LA12_0=='+') ) {s = 25;}

                        else if ( (LA12_0=='-') ) {s = 26;}

                        else if ( (LA12_0=='*') ) {s = 27;}

                        else if ( (LA12_0=='?') ) {s = 28;}

                        else if ( (LA12_0=='a') ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0==':') ) {s = 31;}

                        else if ( (LA12_0=='n') ) {s = 32;}

                        else if ( (LA12_0=='~') ) {s = 33;}

                        else if ( (LA12_0=='(') ) {s = 34;}

                        else if ( (LA12_0==')') ) {s = 35;}

                        else if ( (LA12_0==';') ) {s = 36;}

                        else if ( (LA12_0=='w') ) {s = 37;}

                        else if ( (LA12_0=='p') ) {s = 38;}

                        else if ( (LA12_0=='\'') ) {s = 39;}

                        else if ( (LA12_0=='$'||(LA12_0>='A' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||LA12_0=='m'||LA12_0=='o'||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 40;}

                        else if ( (LA12_0=='0') ) {s = 41;}

                        else if ( ((LA12_0>='1' && LA12_0<='9')) ) {s = 42;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 43;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='#'||LA12_0=='&'||LA12_0=='@'||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='\u007F' && LA12_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 115;}

                        else s = 44;

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