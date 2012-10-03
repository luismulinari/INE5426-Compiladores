import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        gramaLexer lex = new gramaLexer(new ANTLRFileStream("/home/luis/Dropbox/UFSC/20122/INE5426-Compiladores/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        gramaParser g = new gramaParser(tokens, 49100, null);
        try {
            g.grama();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}