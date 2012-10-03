// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g 2012-10-03 09:48:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gramaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int ID=4;
    public static final int INT=5;
    public static final int FLOAT=6;
    public static final int CHAR=7;
    public static final int STRING=8;
    public static final int COMMENT=9;
    public static final int ESC_SEQ=10;
    public static final int HEX_DIGIT=11;
    public static final int UNICODE_ESC=12;
    public static final int OCTAL_ESC=13;

    // delegates
    // delegators

    public gramaLexer() {;} 
    public gramaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public gramaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:3:7: ( 'main ' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:3:9: 'main '
            {
            match("main "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:7: ( '{' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:5:7: ( '}' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:5:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:6:7: ( ';' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:6:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:7:7: ( 'while' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:7:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:8:7: ( '(' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:9:7: ( ')' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:9:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:10:7: ( 'if' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:10:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:11:7: ( 'else' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:11:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:12:7: ( 'int' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:12:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:13:7: ( 'char' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:13:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:14:7: ( 'string' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:14:9: 'string'
            {
            match("string"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:15:7: ( 'float' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:15:9: 'float'
            {
            match("float"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:16:7: ( ',' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:16:9: ','
            {
            match(','); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:17:7: ( 'true' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:17:9: 'true'
            {
            match("true"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:18:7: ( 'false' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:18:9: 'false'
            {
            match("false"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:19:7: ( '!=' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:19:9: '!='
            {
            match("!="); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:7: ( '==' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:9: '=='
            {
            match("=="); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:21:7: ( '||' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:21:9: '||'
            {
            match("||"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:22:7: ( '&&' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:22:9: '&&'
            {
            match("&&"); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:23:7: ( '~' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:23:9: '~'
            {
            match('~'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:24:7: ( '>' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:24:9: '>'
            {
            match('>'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:25:7: ( '<' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:25:9: '<'
            {
            match('<'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:26:7: ( '>=' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:26:9: '>='
            {
            match(">="); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:27:7: ( '<=' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:27:9: '<='
            {
            match("<="); 


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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:28:7: ( '=' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:28:9: '='
            {
            match('='); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:29:7: ( '+' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:29:9: '+'
            {
            match('+'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:30:7: ( '-' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:30:9: '-'
            {
            match('-'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:31:7: ( '*' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:31:9: '*'
            {
            match('*'); 

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
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:32:7: ( '/' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:94:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:94:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:94:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:97:5: ( ( '0' .. '9' )+ )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:97:7: ( '0' .. '9' )+
            {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:97:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:97:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:3: ( ( INT )+ '.' ( INT )+ )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:5: ( INT )+ '.' ( INT )+
            {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:5: ( INT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:5: INT
            	    {
            	    mINT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:14: ( INT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:101:14: INT
            	    {
            	    mINT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='/') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='/') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='*') ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:14: (~ ( '\\n' | '\\r' ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop5;
                        }
                    } while (true);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:28: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:105:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:106:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:106:14: ( options {greedy=false; } : . )*
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
                    	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:106:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:110:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:110:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:110:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:110:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:110:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:113:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:113:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:113:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\\') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:113:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:113:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:117:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:117:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:121:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt11=1;
                    }
                    break;
                case 'u':
                    {
                    alt11=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt11=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:121:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:122:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:123:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2>='0' && LA12_2<='7')) ) {
                        int LA12_4 = input.LA(4);

                        if ( ((LA12_4>='0' && LA12_4<='7')) ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=3;}
                }
                else if ( ((LA12_1>='4' && LA12_1<='7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3>='0' && LA12_3<='7')) ) {
                        alt12=2;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:14: ( '0' .. '3' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:25: ( '0' .. '7' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:36: ( '0' .. '7' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:128:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:129:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:129:14: ( '0' .. '7' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:129:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:129:25: ( '0' .. '7' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:129:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:130:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:130:14: ( '0' .. '7' )
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:130:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:135:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:135:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | INT | FLOAT | COMMENT | STRING | CHAR )
        int alt13=36;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:190: ID
                {
                mID(); 

                }
                break;
            case 32 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:193: INT
                {
                mINT(); 

                }
                break;
            case 33 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:197: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 34 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:203: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 35 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:211: STRING
                {
                mSTRING(); 

                }
                break;
            case 36 :
                // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:1:218: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\32\3\uffff\1\32\2\uffff\5\32\1\uffff\1\32\1\uffff\1\51"+
        "\3\uffff\1\53\1\55\3\uffff\1\57\1\uffff\1\60\2\uffff\2\32\1\64\7"+
        "\32\12\uffff\2\32\1\uffff\1\76\10\32\1\uffff\1\107\1\110\3\32\1"+
        "\114\1\uffff\1\115\2\uffff\1\32\1\117\1\120\2\uffff\1\121\3\uffff";
    static final String DFA13_eofS =
        "\122\uffff";
    static final String DFA13_minS =
        "\1\41\1\141\3\uffff\1\150\2\uffff\1\146\1\154\1\150\1\164\1\141"+
        "\1\uffff\1\162\1\uffff\1\75\3\uffff\2\75\3\uffff\1\52\1\uffff\1"+
        "\56\2\uffff\2\151\1\60\1\164\1\163\1\141\1\162\1\157\1\154\1\165"+
        "\12\uffff\1\156\1\154\1\uffff\1\60\1\145\1\162\1\151\1\141\1\163"+
        "\1\145\1\40\1\145\1\uffff\2\60\1\156\1\164\1\145\1\60\1\uffff\1"+
        "\60\2\uffff\1\147\2\60\2\uffff\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\176\1\141\3\uffff\1\150\2\uffff\1\156\1\154\1\150\1\164\1\154"+
        "\1\uffff\1\162\1\uffff\1\75\3\uffff\2\75\3\uffff\1\57\1\uffff\1"+
        "\71\2\uffff\2\151\1\172\1\164\1\163\1\141\1\162\1\157\1\154\1\165"+
        "\12\uffff\1\156\1\154\1\uffff\1\172\1\145\1\162\1\151\1\141\1\163"+
        "\1\145\1\40\1\145\1\uffff\2\172\1\156\1\164\1\145\1\172\1\uffff"+
        "\1\172\2\uffff\1\147\2\172\2\uffff\1\172\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\5\uffff\1\16\1\uffff\1\21\1"+
        "\uffff\1\23\1\24\1\25\2\uffff\1\33\1\34\1\35\1\uffff\1\37\1\uffff"+
        "\1\43\1\44\12\uffff\1\22\1\32\1\30\1\26\1\31\1\27\1\42\1\36\1\40"+
        "\1\41\2\uffff\1\10\11\uffff\1\12\6\uffff\1\1\1\uffff\1\11\1\13\3"+
        "\uffff\1\17\1\5\1\uffff\1\15\1\20\1\14";
    static final String DFA13_specialS =
        "\122\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\17\1\34\3\uffff\1\22\1\35\1\6\1\7\1\30\1\26\1\15\1\27\1\uffff"+
            "\1\31\12\33\1\uffff\1\4\1\25\1\20\1\24\2\uffff\32\32\4\uffff"+
            "\1\32\1\uffff\2\32\1\12\1\32\1\11\1\14\2\32\1\10\3\32\1\1\5"+
            "\32\1\13\1\16\2\32\1\5\3\32\1\2\1\21\1\3\1\23",
            "\1\36",
            "",
            "",
            "",
            "\1\37",
            "",
            "",
            "\1\40\7\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\46\12\uffff\1\45",
            "",
            "\1\47",
            "",
            "\1\50",
            "",
            "",
            "",
            "\1\52",
            "\1\54",
            "",
            "",
            "",
            "\1\56\4\uffff\1\56",
            "",
            "\1\61\1\uffff\12\33",
            "",
            "",
            "\1\62",
            "\1\63",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
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
            "\1\74",
            "\1\75",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\116",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | ID | INT | FLOAT | COMMENT | STRING | CHAR );";
        }
    }
 

}