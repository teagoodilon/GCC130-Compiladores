// Generated from Hekissa.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HekissaParser}.
 */
public interface HekissaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link HekissaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterNPrograma(HekissaParser.NProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrograma}
	 * labeled alternative in {@link HekissaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitNPrograma(HekissaParser.NProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracoes}
	 * labeled alternative in {@link HekissaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracoes(HekissaParser.NDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracoes}
	 * labeled alternative in {@link HekissaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracoes(HekissaParser.NDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link HekissaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(HekissaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link HekissaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(HekissaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCorpo}
	 * labeled alternative in {@link HekissaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterNCorpo(HekissaParser.NCorpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCorpo}
	 * labeled alternative in {@link HekissaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitNCorpo(HekissaParser.NCorpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link HekissaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterNComando(HekissaParser.NComandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link HekissaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitNComando(HekissaParser.NComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link HekissaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterNLeitura(HekissaParser.NLeituraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NLeitura}
	 * labeled alternative in {@link HekissaParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitNLeitura(HekissaParser.NLeituraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link HekissaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterNEscrita(HekissaParser.NEscritaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEscrita}
	 * labeled alternative in {@link HekissaParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitNEscrita(HekissaParser.NEscritaContext ctx);
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
	 * Enter a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link HekissaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterNCondicional(HekissaParser.NCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCondicional}
	 * labeled alternative in {@link HekissaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitNCondicional(HekissaParser.NCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIterativo}
	 * labeled alternative in {@link HekissaParser#iterativo}.
	 * @param ctx the parse tree
	 */
	void enterNIterativo(HekissaParser.NIterativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIterativo}
	 * labeled alternative in {@link HekissaParser#iterativo}.
	 * @param ctx the parse tree
	 */
	void exitNIterativo(HekissaParser.NIterativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link HekissaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(HekissaParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link HekissaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(HekissaParser.NAtribuicaoContext ctx);
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