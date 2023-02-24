// Generated from Hekissa.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HekissaParser}.
 */
public interface HekissaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HekissaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(HekissaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(HekissaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(HekissaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(HekissaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(HekissaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(HekissaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(HekissaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(HekissaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(HekissaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(HekissaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(HekissaParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(HekissaParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(HekissaParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(HekissaParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#opcoes}.
	 * @param ctx the parse tree
	 */
	void enterOpcoes(HekissaParser.OpcoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#opcoes}.
	 * @param ctx the parse tree
	 */
	void exitOpcoes(HekissaParser.OpcoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(HekissaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(HekissaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#iterativo}.
	 * @param ctx the parse tree
	 */
	void enterIterativo(HekissaParser.IterativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#iterativo}.
	 * @param ctx the parse tree
	 */
	void exitIterativo(HekissaParser.IterativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(HekissaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(HekissaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(HekissaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(HekissaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HekissaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(HekissaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HekissaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(HekissaParser.FatorContext ctx);
}