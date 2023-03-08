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
        System.out.println("Out declaracao" + ctx.getText());
        String tipo = ctx.TIP().getText();
        String var = ctx.VAR().getText();

        if(tabelasSimbolos.containsKey(var)){
            System.out.println("Declaracao duplicada! Variavel " + var + " tipo " + tipo + " ja declarada");
        }else{
            tabelasSimbolos.put(var,tipo);
        }
    }

}
