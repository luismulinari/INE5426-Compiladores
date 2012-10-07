import java.text.CharacterIterator;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;


public class Grama {

		public static void main(String[] args) {
			try{
				System.out.println("Grama Compiler");
				String entry ="__Test___input.txt";
				CharStream input = new ANTLRFileStream(entry);
				System.out.println(input.substring(0, 5));
				gramaLexer lexer =  new gramaLexer(input);
				CommonTokenStream list = new CommonTokenStream(lexer);
				//list.discardTokenType(gramaLexer.WS);
				List<Token> tklist = list.getTokens();
				System.out.println(tklist.size());
				for(int i=0; i< tklist.size(); i++){
					System.out.println(tklist.get(i));
				}
			}
			catch(Exception e){
				System.err.println("Error: "+e);
			}
		}

	}
