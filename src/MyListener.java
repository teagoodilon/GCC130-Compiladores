import java.util.HashMap;
import java.util.Map;

public class MyListener extends HekissaBaseListener{
    private Map<String,String> tabelasSimbolos = new HashMap<String, String>();
    public Map gettabelasSimbolos(){
        return tabelasSimbolos;
    }

    @Override
    public void exitNDeclaracao(HekissaParser.NDeclaracaoContext ctx){
        String tipo = ctx.TIP().getText();
        String var = ctx.VAR().getText();

        if(tabelasSimbolos.containsKey(var)){


            System.out.println("Declaracao duplicada! Variavel " + var + " tipo " + tipo + " ja declarada");
        }else{
            tabelasSimbolos.put(var,tipo);
        }

    }


    //verificar se a variavel foi declarada //fazer em todos pontos que tem variavel
    @Override
    public void exitNLeitura(HekissaParser.NLeituraContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){

            System.out.println("Variavel não declarada: " +  var);
        }
    }

    @Override
    public void exitOpcoes(HekissaParser.OpcoesContext ctx) {
        if(ctx.VAR()!= null){
            String var = ctx.VAR().getText();
            if(!tabelasSimbolos.containsKey(var)){

                System.out.println("Variavel não declarada: " +  var);
            }
        }
    }

    @Override
    public void exitNAtribuicao(HekissaParser.NAtribuicaoContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){

            System.out.println("Variavel não declarada: " +  var);
        }


    }
    @Override
    public void exitFator(HekissaParser.FatorContext ctx) {
        if(ctx.VAR()!= null){
            String var = ctx.VAR().getText();
            if(!tabelasSimbolos.containsKey(var)){

                System.out.println("Variavel não declarada: " +  var);
            }
        }
    }

    @Override
    public void enterNExpressao(HekissaParser.NExpressaoContext ctx) {
        String var1, var2;
        String tipo1,tipo2;

        var1 =  ctx.fator(0).getText();
        var2 = ctx.fator(1).getText();

        tipo1 = tabelasSimbolos.get(var1);
        tipo2 = tabelasSimbolos.get(var2);
        if(var1 !=null && var2!=null){
            if(!tipo1.equals(tipo2)){
                System.out.println("Não é possível realizar operações entre " + tipo1 + " e " + tipo2);
            }
        }

    }

}
