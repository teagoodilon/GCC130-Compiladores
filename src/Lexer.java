package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;


public class Lexer {

    public static void  main (String[] args){
        ArrayList<String> errorList = new ArrayList<String>();
        int countError = 0;
        String filename = "/home/otavio/Documentos/GitHub/GCC130-Compiladores/src/codigos-teste/codigo1.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            HekissaLexer lexer = new HekissaLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));

                if(lexer.getVocabulary().getDisplayName(token.getType()) == "ErrorChar"){
                    int a = lexer.getLine();

                    errorList.add(String.valueOf(a) + "  Lexema: "+ token.getText());
                }

            }

        } catch (IOException e){
            e.printStackTrace();
        }

        for(int i =0; i < errorList.size();i++){
            System.out.println("\n\nERRO NA LINHA: " + errorList.get(i));
        }

        if(errorList.isEmpty()){
            System.out.println("\nGG!!");
            System.out.println("Codigo compilado com sucesso ");
        }
    }
}
