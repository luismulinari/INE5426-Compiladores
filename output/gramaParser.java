// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g 2012-10-03 09:48:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class gramaParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "FLOAT", "CHAR", "STRING", "COMMENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'main '", "'{'", "'}'", "';'", "'while'", "'('", "')'", "'if'", "'else'", "'int'", "'char'", "'string'", "'float'", "','", "'true'", "'false'", "'!='", "'=='", "'||'", "'&&'", "'~'", "'>'", "'<'", "'>='", "'<='", "'='", "'+'", "'-'", "'*'", "'/'"
    };
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "expressao", "condicao", "funcao", "declaracaoSimbolo", 
        "chamadaFuncao", "operacaoBooleana", "type", "definicao_while", 
        "argumento", "operacaoAritmetica", "bloco", "atribuicaoVariavel", 
        "grama", "definicao_if", "definicao_variavel"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, false, 
            false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public gramaParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public gramaParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public gramaParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return gramaParser.tokenNames; }
    public String getGrammarFileName() { return "/home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g"; }



    // $ANTLR start "grama"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:3:1: grama : 'main ' '{' ( bloco )* '}' ;
    public final void grama() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "grama");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:2: ( 'main ' '{' ( bloco )* '}' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:4: 'main ' '{' ( bloco )* '}'
            {
            dbg.location(4,4);
            match(input,14,FOLLOW_14_in_grama11); 
            dbg.location(4,12);
            match(input,15,FOLLOW_15_in_grama13); 
            dbg.location(4,16);
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:16: ( bloco )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==18||LA1_0==21||(LA1_0>=23 && LA1_0<=26)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:4:16: bloco
            	    {
            	    dbg.location(4,16);
            	    pushFollow(FOLLOW_bloco_in_grama15);
            	    bloco();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,23);
            match(input,16,FOLLOW_16_in_grama18); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(5, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grama");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grama"


    // $ANTLR start "bloco"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:7:1: bloco : ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while );
    public final void bloco() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bloco");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:8:2: ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while )
            int alt2=5;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            switch ( input.LA(1) ) {
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==39) ) {
                    alt2=2;
                }
                else if ( (LA2_2==19) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:8:4: definicao_variavel ';'
                    {
                    dbg.location(8,4);
                    pushFollow(FOLLOW_definicao_variavel_in_bloco29);
                    definicao_variavel();

                    state._fsp--;

                    dbg.location(8,23);
                    match(input,17,FOLLOW_17_in_bloco31); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:9:4: atribuicaoVariavel ';'
                    {
                    dbg.location(9,4);
                    pushFollow(FOLLOW_atribuicaoVariavel_in_bloco36);
                    atribuicaoVariavel();

                    state._fsp--;

                    dbg.location(9,23);
                    match(input,17,FOLLOW_17_in_bloco38); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:10:4: chamadaFuncao ';'
                    {
                    dbg.location(10,4);
                    pushFollow(FOLLOW_chamadaFuncao_in_bloco43);
                    chamadaFuncao();

                    state._fsp--;

                    dbg.location(10,18);
                    match(input,17,FOLLOW_17_in_bloco45); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:11:4: definicao_if
                    {
                    dbg.location(11,4);
                    pushFollow(FOLLOW_definicao_if_in_bloco50);
                    definicao_if();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:12:4: definicao_while
                    {
                    dbg.location(12,4);
                    pushFollow(FOLLOW_definicao_while_in_bloco55);
                    definicao_while();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(13, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bloco");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bloco"


    // $ANTLR start "definicao_while"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:15:1: definicao_while : 'while' '(' condicao ')' '{' bloco '}' ;
    public final void definicao_while() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_while");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:16:2: ( 'while' '(' condicao ')' '{' bloco '}' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:16:4: 'while' '(' condicao ')' '{' bloco '}'
            {
            dbg.location(16,4);
            match(input,18,FOLLOW_18_in_definicao_while66); 
            dbg.location(16,12);
            match(input,19,FOLLOW_19_in_definicao_while68); 
            dbg.location(16,16);
            pushFollow(FOLLOW_condicao_in_definicao_while70);
            condicao();

            state._fsp--;

            dbg.location(16,25);
            match(input,20,FOLLOW_20_in_definicao_while72); 
            dbg.location(16,29);
            match(input,15,FOLLOW_15_in_definicao_while74); 
            dbg.location(16,33);
            pushFollow(FOLLOW_bloco_in_definicao_while76);
            bloco();

            state._fsp--;

            dbg.location(16,39);
            match(input,16,FOLLOW_16_in_definicao_while78); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(17, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definicao_while");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definicao_while"


    // $ANTLR start "definicao_if"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:19:1: definicao_if : 'if' '(' condicao ')' '{' bloco '}' ( 'else' '{' bloco '}' )? ;
    public final void definicao_if() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_if");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:3: ( 'if' '(' condicao ')' '{' bloco '}' ( 'else' '{' bloco '}' )? )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:5: 'if' '(' condicao ')' '{' bloco '}' ( 'else' '{' bloco '}' )?
            {
            dbg.location(20,5);
            match(input,21,FOLLOW_21_in_definicao_if90); 
            dbg.location(20,10);
            match(input,19,FOLLOW_19_in_definicao_if92); 
            dbg.location(20,14);
            pushFollow(FOLLOW_condicao_in_definicao_if94);
            condicao();

            state._fsp--;

            dbg.location(20,23);
            match(input,20,FOLLOW_20_in_definicao_if96); 
            dbg.location(20,27);
            match(input,15,FOLLOW_15_in_definicao_if98); 
            dbg.location(20,31);
            pushFollow(FOLLOW_bloco_in_definicao_if100);
            bloco();

            state._fsp--;

            dbg.location(20,37);
            match(input,16,FOLLOW_16_in_definicao_if102); 
            dbg.location(20,41);
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:41: ( 'else' '{' bloco '}' )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:20:42: 'else' '{' bloco '}'
                    {
                    dbg.location(20,42);
                    match(input,22,FOLLOW_22_in_definicao_if105); 
                    dbg.location(20,49);
                    match(input,15,FOLLOW_15_in_definicao_if107); 
                    dbg.location(20,53);
                    pushFollow(FOLLOW_bloco_in_definicao_if109);
                    bloco();

                    state._fsp--;

                    dbg.location(20,59);
                    match(input,16,FOLLOW_16_in_definicao_if111); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(21, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definicao_if");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definicao_if"


    // $ANTLR start "definicao_variavel"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:23:1: definicao_variavel : type ID ;
    public final void definicao_variavel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_variavel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:24:2: ( type ID )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:24:4: type ID
            {
            dbg.location(24,4);
            pushFollow(FOLLOW_type_in_definicao_variavel125);
            type();

            state._fsp--;

            dbg.location(24,9);
            match(input,ID,FOLLOW_ID_in_definicao_variavel127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(25, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "definicao_variavel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "definicao_variavel"


    // $ANTLR start "type"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:27:1: type : ( 'int' | 'char' | 'string' | 'float' );
    public final void type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:28:4: ( 'int' | 'char' | 'string' | 'float' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:
            {
            dbg.location(28,4);
            if ( (input.LA(1)>=23 && input.LA(1)<=26) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(32, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "funcao"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:34:1: funcao : type declaracaoSimbolo '(' declaracaoSimbolo ( ',' declaracaoSimbolo )* ')' '{' bloco '}' ;
    public final void funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:35:2: ( type declaracaoSimbolo '(' declaracaoSimbolo ( ',' declaracaoSimbolo )* ')' '{' bloco '}' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:35:4: type declaracaoSimbolo '(' declaracaoSimbolo ( ',' declaracaoSimbolo )* ')' '{' bloco '}'
            {
            dbg.location(35,4);
            pushFollow(FOLLOW_type_in_funcao166);
            type();

            state._fsp--;

            dbg.location(35,9);
            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao168);
            declaracaoSimbolo();

            state._fsp--;

            dbg.location(35,27);
            match(input,19,FOLLOW_19_in_funcao170); 
            dbg.location(35,31);
            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao172);
            declaracaoSimbolo();

            state._fsp--;

            dbg.location(35,49);
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:35:49: ( ',' declaracaoSimbolo )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:35:50: ',' declaracaoSimbolo
            	    {
            	    dbg.location(35,50);
            	    match(input,27,FOLLOW_27_in_funcao175); 
            	    dbg.location(35,54);
            	    pushFollow(FOLLOW_declaracaoSimbolo_in_funcao177);
            	    declaracaoSimbolo();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(35,74);
            match(input,20,FOLLOW_20_in_funcao181); 
            dbg.location(35,78);
            match(input,15,FOLLOW_15_in_funcao183); 
            dbg.location(35,82);
            pushFollow(FOLLOW_bloco_in_funcao185);
            bloco();

            state._fsp--;

            dbg.location(35,88);
            match(input,16,FOLLOW_16_in_funcao187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(36, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcao"


    // $ANTLR start "declaracaoSimbolo"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:38:1: declaracaoSimbolo : ID ;
    public final void declaracaoSimbolo() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracaoSimbolo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:39:2: ( ID )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:39:4: ID
            {
            dbg.location(39,4);
            match(input,ID,FOLLOW_ID_in_declaracaoSimbolo198); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(40, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaracaoSimbolo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaracaoSimbolo"


    // $ANTLR start "condicao"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:42:1: condicao : ( 'true' | 'false' | '(' ( argumento ) ( operacaoBooleana ) ( argumento ) ')' ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) );
    public final void condicao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "condicao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:43:2: ( 'true' | 'false' | '(' ( argumento ) ( operacaoBooleana ) ( argumento ) ')' ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) )
            int alt6=4;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case STRING:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:43:4: 'true'
                    {
                    dbg.location(43,4);
                    match(input,28,FOLLOW_28_in_condicao209); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:44:4: 'false'
                    {
                    dbg.location(44,4);
                    match(input,29,FOLLOW_29_in_condicao214); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:4: '(' ( argumento ) ( operacaoBooleana ) ( argumento ) ')' ( operacaoBooleana condicao )?
                    {
                    dbg.location(45,4);
                    match(input,19,FOLLOW_19_in_condicao219); 
                    dbg.location(45,8);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:8: ( argumento )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:9: argumento
                    {
                    dbg.location(45,9);
                    pushFollow(FOLLOW_argumento_in_condicao222);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(45,20);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:20: ( operacaoBooleana )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:21: operacaoBooleana
                    {
                    dbg.location(45,21);
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao226);
                    operacaoBooleana();

                    state._fsp--;


                    }

                    dbg.location(45,39);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:39: ( argumento )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:40: argumento
                    {
                    dbg.location(45,40);
                    pushFollow(FOLLOW_argumento_in_condicao230);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(45,51);
                    match(input,20,FOLLOW_20_in_condicao233); 
                    dbg.location(45,55);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:55: ( operacaoBooleana condicao )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=30 && LA5_0<=38)) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:45:56: operacaoBooleana condicao
                            {
                            dbg.location(45,56);
                            pushFollow(FOLLOW_operacaoBooleana_in_condicao236);
                            operacaoBooleana();

                            state._fsp--;

                            dbg.location(45,73);
                            pushFollow(FOLLOW_condicao_in_condicao238);
                            condicao();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:3: ( argumento ) ( operacaoBooleana ) ( argumento )
                    {
                    dbg.location(46,3);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:3: ( argumento )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:4: argumento
                    {
                    dbg.location(46,4);
                    pushFollow(FOLLOW_argumento_in_condicao245);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(46,15);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:15: ( operacaoBooleana )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:16: operacaoBooleana
                    {
                    dbg.location(46,16);
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao249);
                    operacaoBooleana();

                    state._fsp--;


                    }

                    dbg.location(46,34);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:34: ( argumento )
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:46:35: argumento
                    {
                    dbg.location(46,35);
                    pushFollow(FOLLOW_argumento_in_condicao253);
                    argumento();

                    state._fsp--;


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
        }
        dbg.location(47, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condicao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "condicao"


    // $ANTLR start "operacaoBooleana"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:50:1: operacaoBooleana : ( '!=' | '==' | '||' | '&&' | '~' | '>' | '<' | '>=' | '<=' );
    public final void operacaoBooleana() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operacaoBooleana");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:51:2: ( '!=' | '==' | '||' | '&&' | '~' | '>' | '<' | '>=' | '<=' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:
            {
            dbg.location(51,2);
            if ( (input.LA(1)>=30 && input.LA(1)<=38) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(60, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operacaoBooleana");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operacaoBooleana"


    // $ANTLR start "chamadaFuncao"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:62:1: chamadaFuncao : ID '(' ( argumento )? ( ',' ( argumento ) )* ')' ;
    public final void chamadaFuncao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "chamadaFuncao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:3: ( ID '(' ( argumento )? ( ',' ( argumento ) )* ')' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:5: ID '(' ( argumento )? ( ',' ( argumento ) )* ')'
            {
            dbg.location(63,5);
            match(input,ID,FOLLOW_ID_in_chamadaFuncao318); 
            dbg.location(63,8);
            match(input,19,FOLLOW_19_in_chamadaFuncao320); 
            dbg.location(63,12);
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:12: ( argumento )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=ID && LA7_0<=STRING)) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:13: argumento
                    {
                    dbg.location(63,13);
                    pushFollow(FOLLOW_argumento_in_chamadaFuncao323);
                    argumento();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(63,26);
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:26: ( ',' ( argumento ) )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:27: ',' ( argumento )
            	    {
            	    dbg.location(63,27);
            	    match(input,27,FOLLOW_27_in_chamadaFuncao329); 
            	    dbg.location(63,31);
            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:31: ( argumento )
            	    dbg.enterAlt(1);

            	    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:63:32: argumento
            	    {
            	    dbg.location(63,32);
            	    pushFollow(FOLLOW_argumento_in_chamadaFuncao332);
            	    argumento();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(63,46);
            match(input,20,FOLLOW_20_in_chamadaFuncao338); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(64, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "chamadaFuncao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "chamadaFuncao"


    // $ANTLR start "atribuicaoVariavel"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:66:1: atribuicaoVariavel : ID '=' expressao ;
    public final void atribuicaoVariavel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atribuicaoVariavel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:67:3: ( ID '=' expressao )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:67:5: ID '=' expressao
            {
            dbg.location(67,5);
            match(input,ID,FOLLOW_ID_in_atribuicaoVariavel351); 
            dbg.location(67,8);
            match(input,39,FOLLOW_39_in_atribuicaoVariavel353); 
            dbg.location(67,12);
            pushFollow(FOLLOW_expressao_in_atribuicaoVariavel355);
            expressao();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(68, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atribuicaoVariavel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atribuicaoVariavel"


    // $ANTLR start "expressao"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:71:1: expressao : ( | argumento ( operacaoAritmetica expressao )? | '(' expressao ')' );
    public final void expressao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expressao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:72:2: ( | argumento ( operacaoAritmetica expressao )? | '(' expressao ')' )
            int alt10=3;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case 17:
            case 20:
                {
                alt10=1;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case STRING:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:73:2: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:73:4: argumento ( operacaoAritmetica expressao )?
                    {
                    dbg.location(73,4);
                    pushFollow(FOLLOW_argumento_in_expressao371);
                    argumento();

                    state._fsp--;

                    dbg.location(73,14);
                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:73:14: ( operacaoAritmetica expressao )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=40 && LA9_0<=43)) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:73:15: operacaoAritmetica expressao
                            {
                            dbg.location(73,15);
                            pushFollow(FOLLOW_operacaoAritmetica_in_expressao374);
                            operacaoAritmetica();

                            state._fsp--;

                            dbg.location(73,34);
                            pushFollow(FOLLOW_expressao_in_expressao376);
                            expressao();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:74:4: '(' expressao ')'
                    {
                    dbg.location(74,4);
                    match(input,19,FOLLOW_19_in_expressao383); 
                    dbg.location(74,8);
                    pushFollow(FOLLOW_expressao_in_expressao385);
                    expressao();

                    state._fsp--;

                    dbg.location(74,18);
                    match(input,20,FOLLOW_20_in_expressao387); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(75, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expressao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expressao"


    // $ANTLR start "argumento"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:77:1: argumento : ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao );
    public final void argumento() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argumento");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:78:2: ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao )
            int alt11=6;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==19) ) {
                    alt11=6;
                }
                else if ( (LA11_1==17||LA11_1==20||LA11_1==27||(LA11_1>=30 && LA11_1<=38)||(LA11_1>=40 && LA11_1<=43)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case INT:
                {
                alt11=2;
                }
                break;
            case FLOAT:
                {
                alt11=3;
                }
                break;
            case CHAR:
                {
                alt11=4;
                }
                break;
            case STRING:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:78:4: ID
                    {
                    dbg.location(78,4);
                    match(input,ID,FOLLOW_ID_in_argumento399); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:79:4: INT
                    {
                    dbg.location(79,4);
                    match(input,INT,FOLLOW_INT_in_argumento404); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:80:4: FLOAT
                    {
                    dbg.location(80,4);
                    match(input,FLOAT,FOLLOW_FLOAT_in_argumento409); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:81:4: CHAR
                    {
                    dbg.location(81,4);
                    match(input,CHAR,FOLLOW_CHAR_in_argumento414); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:82:4: STRING
                    {
                    dbg.location(82,4);
                    match(input,STRING,FOLLOW_STRING_in_argumento419); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:83:4: chamadaFuncao
                    {
                    dbg.location(83,4);
                    pushFollow(FOLLOW_chamadaFuncao_in_argumento424);
                    chamadaFuncao();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(84, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argumento");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argumento"


    // $ANTLR start "operacaoAritmetica"
    // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:86:1: operacaoAritmetica : ( '+' | '-' | '*' | '/' );
    public final void operacaoAritmetica() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operacaoAritmetica");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 1);

        try {
            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:87:2: ( '+' | '-' | '*' | '/' )
            dbg.enterAlt(1);

            // /home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/grama.g:
            {
            dbg.location(87,2);
            if ( (input.LA(1)>=40 && input.LA(1)<=43) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(91, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "operacaoAritmetica");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "operacaoAritmetica"

    // Delegated rules


 

    public static final BitSet FOLLOW_14_in_grama11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_grama13 = new BitSet(new long[]{0x0000000007A50010L});
    public static final BitSet FOLLOW_bloco_in_grama15 = new BitSet(new long[]{0x0000000007A50010L});
    public static final BitSet FOLLOW_16_in_grama18 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_variavel_in_bloco29 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bloco31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicaoVariavel_in_bloco36 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bloco38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_bloco43 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_bloco45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_if_in_bloco50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_while_in_bloco55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_definicao_while66 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_definicao_while68 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_condicao_in_definicao_while70 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_definicao_while72 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_definicao_while74 = new BitSet(new long[]{0x0000000007A40010L});
    public static final BitSet FOLLOW_bloco_in_definicao_while76 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_definicao_while78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_definicao_if90 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_definicao_if92 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_condicao_in_definicao_if94 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_definicao_if96 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_definicao_if98 = new BitSet(new long[]{0x0000000007A40010L});
    public static final BitSet FOLLOW_bloco_in_definicao_if100 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_definicao_if102 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_definicao_if105 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_definicao_if107 = new BitSet(new long[]{0x0000000007A40010L});
    public static final BitSet FOLLOW_bloco_in_definicao_if109 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_definicao_if111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_definicao_variavel125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_definicao_variavel127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcao166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao168 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_funcao170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao172 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_27_in_funcao175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao177 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_20_in_funcao181 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_funcao183 = new BitSet(new long[]{0x0000000007A40010L});
    public static final BitSet FOLLOW_bloco_in_funcao185 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_funcao187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declaracaoSimbolo198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_condicao209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_condicao214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_condicao219 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_argumento_in_condicao222 = new BitSet(new long[]{0x0000007FC0000000L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao226 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_argumento_in_condicao230 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_condicao233 = new BitSet(new long[]{0x0000007FC0000002L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao236 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_condicao_in_condicao238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_condicao245 = new BitSet(new long[]{0x0000007FC0000000L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao249 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_argumento_in_condicao253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operacaoBooleana0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaFuncao318 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_chamadaFuncao320 = new BitSet(new long[]{0x00000000381801F0L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao323 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_27_in_chamadaFuncao329 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao332 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_20_in_chamadaFuncao338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicaoVariavel351 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_atribuicaoVariavel353 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_expressao_in_atribuicaoVariavel355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_expressao371 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_operacaoAritmetica_in_expressao374 = new BitSet(new long[]{0x00000000300801F0L});
    public static final BitSet FOLLOW_expressao_in_expressao376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expressao383 = new BitSet(new long[]{0x00000000301801F0L});
    public static final BitSet FOLLOW_expressao_in_expressao385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expressao387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_argumento399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_argumento404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_argumento409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_argumento414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argumento419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_argumento424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operacaoAritmetica0 = new BitSet(new long[]{0x0000000000000002L});

}