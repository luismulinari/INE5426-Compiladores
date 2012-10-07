// $ANTLR 3.4 C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g 2012-10-07 20:28:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class gramaParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "CHAR", "COMMENT", "ELSE", "EQUAL", "ESC_SEQ", "FALSE", "FLOAT", "GREATER", "GREATEREQUAL", "HEX_DIGIT", "ID", "IF", "INT", "LCURLY", "LESS", "LESSEQUAL", "LPAREN", "MAIN", "MINUS", "NOT", "NOTEQUAL", "OCTAL_ESC", "OR", "PLUS", "RCURLY", "RPAREN", "SLASH", "STAR", "STRING", "TRUE", "T_CHAR", "T_FLOAT", "T_INT", "T_STRING", "UNICODE_ESC", "WHILE", "WS", "','", "';'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int AND=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int ELSE=7;
    public static final int EQUAL=8;
    public static final int ESC_SEQ=9;
    public static final int FALSE=10;
    public static final int FLOAT=11;
    public static final int GREATER=12;
    public static final int GREATEREQUAL=13;
    public static final int HEX_DIGIT=14;
    public static final int ID=15;
    public static final int IF=16;
    public static final int INT=17;
    public static final int LCURLY=18;
    public static final int LESS=19;
    public static final int LESSEQUAL=20;
    public static final int LPAREN=21;
    public static final int MAIN=22;
    public static final int MINUS=23;
    public static final int NOT=24;
    public static final int NOTEQUAL=25;
    public static final int OCTAL_ESC=26;
    public static final int OR=27;
    public static final int PLUS=28;
    public static final int RCURLY=29;
    public static final int RPAREN=30;
    public static final int SLASH=31;
    public static final int STAR=32;
    public static final int STRING=33;
    public static final int TRUE=34;
    public static final int T_CHAR=35;
    public static final int T_FLOAT=36;
    public static final int T_INT=37;
    public static final int T_STRING=38;
    public static final int UNICODE_ESC=39;
    public static final int WHILE=40;
    public static final int WS=41;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "type", "expressao", "definicao_variavel", "operacaoBooleana", 
    "grama", "argumento", "declaracaoSimbolo", "chamadaFuncao", "atribuicaoVariavel", 
    "condicao", "definicao_if", "funcao", "definicao_while", "operacaoAritmetica", 
    "bloco"
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
    public String getGrammarFileName() { return "C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g"; }



    // $ANTLR start "grama"
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:114:1: grama : MAIN LCURLY ( bloco )* RCURLY ;
    public final void grama() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "grama");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:115:2: ( MAIN LCURLY ( bloco )* RCURLY )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:115:4: MAIN LCURLY ( bloco )* RCURLY
            {
            dbg.location(115,4);
            match(input,MAIN,FOLLOW_MAIN_in_grama312); 
            dbg.location(115,9);
            match(input,LCURLY,FOLLOW_LCURLY_in_grama314); 
            dbg.location(115,16);
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:115:16: ( bloco )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= T_CHAR && LA1_0 <= T_STRING)||LA1_0==WHILE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:115:16: bloco
            	    {
            	    dbg.location(115,16);
            	    pushFollow(FOLLOW_bloco_in_grama316);
            	    bloco();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(115,23);
            match(input,RCURLY,FOLLOW_RCURLY_in_grama319); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(116, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:118:1: bloco : ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while );
    public final void bloco() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bloco");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:119:2: ( definicao_variavel ';' | atribuicaoVariavel ';' | chamadaFuncao ';' | definicao_if | definicao_while )
            int alt2=5;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            switch ( input.LA(1) ) {
            case T_CHAR:
            case T_FLOAT:
            case T_INT:
            case T_STRING:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==44) ) {
                    alt2=2;
                }
                else if ( (LA2_2==LPAREN) ) {
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
            case IF:
                {
                alt2=4;
                }
                break;
            case WHILE:
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:119:4: definicao_variavel ';'
                    {
                    dbg.location(119,4);
                    pushFollow(FOLLOW_definicao_variavel_in_bloco330);
                    definicao_variavel();

                    state._fsp--;

                    dbg.location(119,23);
                    match(input,43,FOLLOW_43_in_bloco332); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:120:4: atribuicaoVariavel ';'
                    {
                    dbg.location(120,4);
                    pushFollow(FOLLOW_atribuicaoVariavel_in_bloco337);
                    atribuicaoVariavel();

                    state._fsp--;

                    dbg.location(120,23);
                    match(input,43,FOLLOW_43_in_bloco339); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:121:4: chamadaFuncao ';'
                    {
                    dbg.location(121,4);
                    pushFollow(FOLLOW_chamadaFuncao_in_bloco344);
                    chamadaFuncao();

                    state._fsp--;

                    dbg.location(121,18);
                    match(input,43,FOLLOW_43_in_bloco346); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:122:4: definicao_if
                    {
                    dbg.location(122,4);
                    pushFollow(FOLLOW_definicao_if_in_bloco351);
                    definicao_if();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:123:4: definicao_while
                    {
                    dbg.location(123,4);
                    pushFollow(FOLLOW_definicao_while_in_bloco356);
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
        	// do for sure before leaving
        }
        dbg.location(124, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:126:1: definicao_while : WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY ;
    public final void definicao_while() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_while");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:127:2: ( WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:127:4: WHILE LPAREN condicao RPAREN LCURLY bloco RCURLY
            {
            dbg.location(127,4);
            match(input,WHILE,FOLLOW_WHILE_in_definicao_while367); 
            dbg.location(127,10);
            match(input,LPAREN,FOLLOW_LPAREN_in_definicao_while369); 
            dbg.location(127,17);
            pushFollow(FOLLOW_condicao_in_definicao_while371);
            condicao();

            state._fsp--;

            dbg.location(127,26);
            match(input,RPAREN,FOLLOW_RPAREN_in_definicao_while373); 
            dbg.location(127,33);
            match(input,LCURLY,FOLLOW_LCURLY_in_definicao_while375); 
            dbg.location(127,40);
            pushFollow(FOLLOW_bloco_in_definicao_while377);
            bloco();

            state._fsp--;

            dbg.location(127,46);
            match(input,RCURLY,FOLLOW_RCURLY_in_definicao_while379); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(128, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:130:1: definicao_if : IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )? ;
    public final void definicao_if() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_if");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:131:3: ( IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )? )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:131:5: IF LPAREN condicao RPAREN LCURLY bloco RCURLY ( ELSE LCURLY bloco RCURLY )?
            {
            dbg.location(131,5);
            match(input,IF,FOLLOW_IF_in_definicao_if391); 
            dbg.location(131,8);
            match(input,LPAREN,FOLLOW_LPAREN_in_definicao_if393); 
            dbg.location(131,15);
            pushFollow(FOLLOW_condicao_in_definicao_if395);
            condicao();

            state._fsp--;

            dbg.location(131,24);
            match(input,RPAREN,FOLLOW_RPAREN_in_definicao_if397); 
            dbg.location(131,31);
            match(input,LCURLY,FOLLOW_LCURLY_in_definicao_if399); 
            dbg.location(131,38);
            pushFollow(FOLLOW_bloco_in_definicao_if401);
            bloco();

            state._fsp--;

            dbg.location(131,44);
            match(input,RCURLY,FOLLOW_RCURLY_in_definicao_if403); 
            dbg.location(131,51);
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:131:51: ( ELSE LCURLY bloco RCURLY )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELSE) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:131:52: ELSE LCURLY bloco RCURLY
                    {
                    dbg.location(131,52);
                    match(input,ELSE,FOLLOW_ELSE_in_definicao_if406); 
                    dbg.location(131,57);
                    match(input,LCURLY,FOLLOW_LCURLY_in_definicao_if408); 
                    dbg.location(131,64);
                    pushFollow(FOLLOW_bloco_in_definicao_if410);
                    bloco();

                    state._fsp--;

                    dbg.location(131,70);
                    match(input,RCURLY,FOLLOW_RCURLY_in_definicao_if412); 

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
        	// do for sure before leaving
        }
        dbg.location(132, 2);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:134:1: definicao_variavel : type ID ;
    public final void definicao_variavel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "definicao_variavel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:135:2: ( type ID )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:135:4: type ID
            {
            dbg.location(135,4);
            pushFollow(FOLLOW_type_in_definicao_variavel426);
            type();

            state._fsp--;

            dbg.location(135,9);
            match(input,ID,FOLLOW_ID_in_definicao_variavel428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(136, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:138:1: type : ( T_INT | T_CHAR | T_STRING | T_FLOAT );
    public final void type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:139:4: ( T_INT | T_CHAR | T_STRING | T_FLOAT )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            dbg.location(139,4);
            if ( (input.LA(1) >= T_CHAR && input.LA(1) <= T_STRING) ) {
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
        	// do for sure before leaving
        }
        dbg.location(143, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:145:1: funcao : type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY ;
    public final void funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:146:2: ( type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:146:4: type declaracaoSimbolo LPAREN declaracaoSimbolo ( ',' declaracaoSimbolo )* RPAREN LCURLY bloco RCURLY
            {
            dbg.location(146,4);
            pushFollow(FOLLOW_type_in_funcao467);
            type();

            state._fsp--;

            dbg.location(146,9);
            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao469);
            declaracaoSimbolo();

            state._fsp--;

            dbg.location(146,27);
            match(input,LPAREN,FOLLOW_LPAREN_in_funcao471); 
            dbg.location(146,34);
            pushFollow(FOLLOW_declaracaoSimbolo_in_funcao473);
            declaracaoSimbolo();

            state._fsp--;

            dbg.location(146,52);
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:146:52: ( ',' declaracaoSimbolo )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==42) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:146:53: ',' declaracaoSimbolo
            	    {
            	    dbg.location(146,53);
            	    match(input,42,FOLLOW_42_in_funcao476); 
            	    dbg.location(146,57);
            	    pushFollow(FOLLOW_declaracaoSimbolo_in_funcao478);
            	    declaracaoSimbolo();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}

            dbg.location(146,77);
            match(input,RPAREN,FOLLOW_RPAREN_in_funcao482); 
            dbg.location(146,84);
            match(input,LCURLY,FOLLOW_LCURLY_in_funcao484); 
            dbg.location(146,91);
            pushFollow(FOLLOW_bloco_in_funcao486);
            bloco();

            state._fsp--;

            dbg.location(146,97);
            match(input,RCURLY,FOLLOW_RCURLY_in_funcao488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(147, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:149:1: declaracaoSimbolo : ID ;
    public final void declaracaoSimbolo() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracaoSimbolo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:150:2: ( ID )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:150:4: ID
            {
            dbg.location(150,4);
            match(input,ID,FOLLOW_ID_in_declaracaoSimbolo499); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(151, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:153:1: condicao : ( TRUE | FALSE | LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) );
    public final void condicao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "condicao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:154:2: ( TRUE | FALSE | LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )? | ( argumento ) ( operacaoBooleana ) ( argumento ) )
            int alt6=4;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt6=1;
                }
                break;
            case FALSE:
                {
                alt6=2;
                }
                break;
            case LPAREN:
                {
                alt6=3;
                }
                break;
            case CHAR:
            case FLOAT:
            case ID:
            case INT:
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:154:4: TRUE
                    {
                    dbg.location(154,4);
                    match(input,TRUE,FOLLOW_TRUE_in_condicao510); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:155:4: FALSE
                    {
                    dbg.location(155,4);
                    match(input,FALSE,FOLLOW_FALSE_in_condicao515); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:4: LPAREN ( argumento ) ( operacaoBooleana ) ( argumento ) RPAREN ( operacaoBooleana condicao )?
                    {
                    dbg.location(156,4);
                    match(input,LPAREN,FOLLOW_LPAREN_in_condicao520); 
                    dbg.location(156,11);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:11: ( argumento )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:12: argumento
                    {
                    dbg.location(156,12);
                    pushFollow(FOLLOW_argumento_in_condicao523);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(156,23);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:23: ( operacaoBooleana )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:24: operacaoBooleana
                    {
                    dbg.location(156,24);
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao527);
                    operacaoBooleana();

                    state._fsp--;


                    }

                    dbg.location(156,42);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:42: ( argumento )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:43: argumento
                    {
                    dbg.location(156,43);
                    pushFollow(FOLLOW_argumento_in_condicao531);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(156,54);
                    match(input,RPAREN,FOLLOW_RPAREN_in_condicao534); 
                    dbg.location(156,61);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:61: ( operacaoBooleana condicao )?
                    int alt5=2;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND||LA5_0==EQUAL||(LA5_0 >= GREATER && LA5_0 <= GREATEREQUAL)||(LA5_0 >= LESS && LA5_0 <= LESSEQUAL)||(LA5_0 >= NOT && LA5_0 <= NOTEQUAL)||LA5_0==OR) ) {
                        alt5=1;
                    }
                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:156:62: operacaoBooleana condicao
                            {
                            dbg.location(156,62);
                            pushFollow(FOLLOW_operacaoBooleana_in_condicao537);
                            operacaoBooleana();

                            state._fsp--;

                            dbg.location(156,79);
                            pushFollow(FOLLOW_condicao_in_condicao539);
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:3: ( argumento ) ( operacaoBooleana ) ( argumento )
                    {
                    dbg.location(157,3);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:3: ( argumento )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:4: argumento
                    {
                    dbg.location(157,4);
                    pushFollow(FOLLOW_argumento_in_condicao546);
                    argumento();

                    state._fsp--;


                    }

                    dbg.location(157,15);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:15: ( operacaoBooleana )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:16: operacaoBooleana
                    {
                    dbg.location(157,16);
                    pushFollow(FOLLOW_operacaoBooleana_in_condicao550);
                    operacaoBooleana();

                    state._fsp--;


                    }

                    dbg.location(157,34);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:34: ( argumento )
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:157:35: argumento
                    {
                    dbg.location(157,35);
                    pushFollow(FOLLOW_argumento_in_condicao554);
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
        	// do for sure before leaving
        }
        dbg.location(158, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:161:1: operacaoBooleana : ( NOTEQUAL | EQUAL | OR | AND | NOT | LESS | GREATER | LESSEQUAL | GREATEREQUAL );
    public final void operacaoBooleana() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operacaoBooleana");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:162:2: ( NOTEQUAL | EQUAL | OR | AND | NOT | LESS | GREATER | LESSEQUAL | GREATEREQUAL )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            dbg.location(162,2);
            if ( input.LA(1)==AND||input.LA(1)==EQUAL||(input.LA(1) >= GREATER && input.LA(1) <= GREATEREQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESSEQUAL)||(input.LA(1) >= NOT && input.LA(1) <= NOTEQUAL)||input.LA(1)==OR ) {
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
        	// do for sure before leaving
        }
        dbg.location(171, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:173:1: chamadaFuncao : ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN ;
    public final void chamadaFuncao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "chamadaFuncao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:3: ( ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:5: ID LPAREN ( argumento )? ( ',' ( argumento ) )* RPAREN
            {
            dbg.location(174,5);
            match(input,ID,FOLLOW_ID_in_chamadaFuncao619); 
            dbg.location(174,8);
            match(input,LPAREN,FOLLOW_LPAREN_in_chamadaFuncao621); 
            dbg.location(174,15);
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:15: ( argumento )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==CHAR||LA7_0==FLOAT||LA7_0==ID||LA7_0==INT||LA7_0==STRING) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:16: argumento
                    {
                    dbg.location(174,16);
                    pushFollow(FOLLOW_argumento_in_chamadaFuncao624);
                    argumento();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(174,29);
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:29: ( ',' ( argumento ) )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==42) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:30: ',' ( argumento )
            	    {
            	    dbg.location(174,30);
            	    match(input,42,FOLLOW_42_in_chamadaFuncao630); 
            	    dbg.location(174,34);
            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:34: ( argumento )
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:174:35: argumento
            	    {
            	    dbg.location(174,35);
            	    pushFollow(FOLLOW_argumento_in_chamadaFuncao633);
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

            dbg.location(174,49);
            match(input,RPAREN,FOLLOW_RPAREN_in_chamadaFuncao639); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(175, 2);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:177:1: atribuicaoVariavel : ID '=' expressao ;
    public final void atribuicaoVariavel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atribuicaoVariavel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:178:3: ( ID '=' expressao )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:178:5: ID '=' expressao
            {
            dbg.location(178,5);
            match(input,ID,FOLLOW_ID_in_atribuicaoVariavel652); 
            dbg.location(178,8);
            match(input,44,FOLLOW_44_in_atribuicaoVariavel654); 
            dbg.location(178,12);
            pushFollow(FOLLOW_expressao_in_atribuicaoVariavel656);
            expressao();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(179, 2);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:182:1: expressao : (| argumento ( operacaoAritmetica expressao )? | LPAREN expressao RPAREN );
    public final void expressao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expressao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:183:2: (| argumento ( operacaoAritmetica expressao )? | LPAREN expressao RPAREN )
            int alt10=3;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case RPAREN:
            case 43:
                {
                alt10=1;
                }
                break;
            case CHAR:
            case FLOAT:
            case ID:
            case INT:
            case STRING:
                {
                alt10=2;
                }
                break;
            case LPAREN:
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:184:2: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:184:4: argumento ( operacaoAritmetica expressao )?
                    {
                    dbg.location(184,4);
                    pushFollow(FOLLOW_argumento_in_expressao672);
                    argumento();

                    state._fsp--;

                    dbg.location(184,14);
                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:184:14: ( operacaoAritmetica expressao )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==MINUS||LA9_0==PLUS||(LA9_0 >= SLASH && LA9_0 <= STAR)) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:184:15: operacaoAritmetica expressao
                            {
                            dbg.location(184,15);
                            pushFollow(FOLLOW_operacaoAritmetica_in_expressao675);
                            operacaoAritmetica();

                            state._fsp--;

                            dbg.location(184,34);
                            pushFollow(FOLLOW_expressao_in_expressao677);
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:185:4: LPAREN expressao RPAREN
                    {
                    dbg.location(185,4);
                    match(input,LPAREN,FOLLOW_LPAREN_in_expressao684); 
                    dbg.location(185,11);
                    pushFollow(FOLLOW_expressao_in_expressao686);
                    expressao();

                    state._fsp--;

                    dbg.location(185,21);
                    match(input,RPAREN,FOLLOW_RPAREN_in_expressao688); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(186, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:188:1: argumento : ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao );
    public final void argumento() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argumento");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:189:2: ( ID | INT | FLOAT | CHAR | STRING | chamadaFuncao )
            int alt11=6;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==LPAREN) ) {
                    alt11=6;
                }
                else if ( (LA11_1==AND||LA11_1==EQUAL||(LA11_1 >= GREATER && LA11_1 <= GREATEREQUAL)||(LA11_1 >= LESS && LA11_1 <= LESSEQUAL)||(LA11_1 >= MINUS && LA11_1 <= NOTEQUAL)||(LA11_1 >= OR && LA11_1 <= PLUS)||(LA11_1 >= RPAREN && LA11_1 <= STAR)||(LA11_1 >= 42 && LA11_1 <= 43)) ) {
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

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:189:4: ID
                    {
                    dbg.location(189,4);
                    match(input,ID,FOLLOW_ID_in_argumento700); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:190:4: INT
                    {
                    dbg.location(190,4);
                    match(input,INT,FOLLOW_INT_in_argumento705); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:191:4: FLOAT
                    {
                    dbg.location(191,4);
                    match(input,FLOAT,FOLLOW_FLOAT_in_argumento710); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:192:4: CHAR
                    {
                    dbg.location(192,4);
                    match(input,CHAR,FOLLOW_CHAR_in_argumento715); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:193:4: STRING
                    {
                    dbg.location(193,4);
                    match(input,STRING,FOLLOW_STRING_in_argumento720); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:194:4: chamadaFuncao
                    {
                    dbg.location(194,4);
                    pushFollow(FOLLOW_chamadaFuncao_in_argumento725);
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
        	// do for sure before leaving
        }
        dbg.location(195, 1);

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
    // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:197:1: operacaoAritmetica : ( PLUS | MINUS | STAR | SLASH );
    public final void operacaoAritmetica() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "operacaoAritmetica");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 0);

        try {
            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:198:2: ( PLUS | MINUS | STAR | SLASH )
            dbg.enterAlt(1);

            // C:\\Users\\Matheus\\workspace\\INE5426-Compiladores\\grama.g:
            {
            dbg.location(198,2);
            if ( input.LA(1)==MINUS||input.LA(1)==PLUS||(input.LA(1) >= SLASH && input.LA(1) <= STAR) ) {
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
        	// do for sure before leaving
        }
        dbg.location(202, 1);

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


 

    public static final BitSet FOLLOW_MAIN_in_grama312 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_grama314 = new BitSet(new long[]{0x0000017820018000L});
    public static final BitSet FOLLOW_bloco_in_grama316 = new BitSet(new long[]{0x0000017820018000L});
    public static final BitSet FOLLOW_RCURLY_in_grama319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_variavel_in_bloco330 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_bloco332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicaoVariavel_in_bloco337 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_bloco339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_bloco344 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_bloco346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_if_in_bloco351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicao_while_in_bloco356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_definicao_while367 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_definicao_while369 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_definicao_while371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_definicao_while373 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_while375 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_while377 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_while379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_definicao_if391 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_definicao_if393 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_definicao_if395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_definicao_if397 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_if399 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_if401 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_if403 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ELSE_in_definicao_if406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_definicao_if408 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_definicao_if410 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_definicao_if412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_definicao_variavel426 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ID_in_definicao_variavel428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcao467 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao469 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_funcao471 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao473 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_42_in_funcao476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_declaracaoSimbolo_in_funcao478 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcao482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LCURLY_in_funcao484 = new BitSet(new long[]{0x0000017800018000L});
    public static final BitSet FOLLOW_bloco_in_funcao486 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RCURLY_in_funcao488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declaracaoSimbolo499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_condicao510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_condicao515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_condicao520 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao523 = new BitSet(new long[]{0x000000000B183110L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao527 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao531 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_condicao534 = new BitSet(new long[]{0x000000000B183112L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao537 = new BitSet(new long[]{0x0000000600228C20L});
    public static final BitSet FOLLOW_condicao_in_condicao539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_condicao546 = new BitSet(new long[]{0x000000000B183110L});
    public static final BitSet FOLLOW_operacaoBooleana_in_condicao550 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_condicao554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaFuncao619 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LPAREN_in_chamadaFuncao621 = new BitSet(new long[]{0x0000040240028820L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao624 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_42_in_chamadaFuncao630 = new BitSet(new long[]{0x0000000200028820L});
    public static final BitSet FOLLOW_argumento_in_chamadaFuncao633 = new BitSet(new long[]{0x0000040040000000L});
    public static final BitSet FOLLOW_RPAREN_in_chamadaFuncao639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicaoVariavel652 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_atribuicaoVariavel654 = new BitSet(new long[]{0x0000000200228820L});
    public static final BitSet FOLLOW_expressao_in_atribuicaoVariavel656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_expressao672 = new BitSet(new long[]{0x0000000190800002L});
    public static final BitSet FOLLOW_operacaoAritmetica_in_expressao675 = new BitSet(new long[]{0x0000000200228820L});
    public static final BitSet FOLLOW_expressao_in_expressao677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_expressao684 = new BitSet(new long[]{0x0000000240228820L});
    public static final BitSet FOLLOW_expressao_in_expressao686 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RPAREN_in_expressao688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_argumento700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_argumento705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_argumento710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_argumento715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_argumento720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chamadaFuncao_in_argumento725 = new BitSet(new long[]{0x0000000000000002L});

}