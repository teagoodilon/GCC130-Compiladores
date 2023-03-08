import java.util.HashMap;
import java.util.Map;

public class MyListener extends HekissaBaseListener{
    private Map<String,String> tabelasSimbolos = new HashMap<String, String>();
    public Map gettabelasSimbolos(){
        return tabelasSimbolos;
    }
    @Override
    public void enterNDeclaracao(HekissaParser.NDeclaracaoContext ctx){
        System.out.println("In declaracao" + ctx.getText());
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

    @Override
    //verificar se a variavel foi declarada //fazer em todos pontos que tem variavel
    public void enterNLeitura(HekissaParser.NLeituraContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){
            System.out.println("Variavel não declarada: " +  var);
        }
    }

    @Override
    public void enterOpcoes(HekissaParser.OpcoesContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){
            System.out.println("Variavel não declarada: " +  var);
        }
    }

    @Override
    public void enterNAtribuicao(HekissaParser.NAtribuicaoContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){
            System.out.println("Variavel não declarada: " +  var);
        }
    }

    @Override
    public void enterFator(HekissaParser.FatorContext ctx) {
        String var = ctx.VAR().getText();

        if(!tabelasSimbolos.containsKey(var)){
            System.out.println("Variavel não declarada: " +  var);
        }
    }
}
