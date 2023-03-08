
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;


public class Lexer {

    public static void  main (String[] args){
        /*ArrayList<String> errorList = new ArrayList<String>();
        int countError = 0;*/
        HekissaParser parser = getParser("/home/otavio/Documentos/GitHub/GCC130-Compiladores/src/codigos-teste/codigo1.txt");

        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        //listener inicio
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener,ast);

       // System.out.println(listener.gettabelasSimbolos().toString());
    }

    private static HekissaParser getParser(String filename){
        HekissaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(filename);
            HekissaLexer lexer = new HekissaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);//Passa varios tokens e nao um por um
            parser = new HekissaParser(tokens);//Parser passando por fluxo de tokens

        } catch (IOException e){
            e.printStackTrace();

        }
        return parser;
    }
}
