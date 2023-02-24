


package src;

import antlr.HekissaBaseListener;
import antlr.HekissaParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
public class Listener extends HekissaBaseListener {
    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println("Erro sintatico: " + node.getText() );
    }

}
