
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;


public class Lexer {

    public static void  main (String[] args){
        /*ArrayList<String> errorList = new ArrayList<String>();
        int countError = 0;*/
        String filename = "/home/otavio/Documentos/GitHub/GCC130-Compiladores/src/codigos-teste/codigo1.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            HekissaLexer lexer = new HekissaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);//Passa varios tokens e nao um por um
            HekissaParser parser = new HekissaParser(tokens);//Parser passando por fluxo de tokens

            ParseTree ast = parser.programa();

            System.out.println(ast.toStringTree());

        } catch (IOException e){
            e.printStackTrace();

        }

        /*for(int i =0; i < errorList.size();i++){
            System.out.println("\n\nERRO NA LINHA: " + errorList.get(i));
        }

        if(errorList.isEmpty()){
            System.out.println("\nGG!!");
            System.out.println("Codigo compilado com sucesso ");
        }*/
    }
}
