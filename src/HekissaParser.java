// Generated from Hekissa.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HekissaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALG=1, TIP=2, LER=3, IMP=4, SE=5, SEN=6, ENT=7, ENQ=8, IGU=9, COM=10, 
		TER=11, AP=12, FP=13, DELIM=14, VAR=15, NUMI=16, NUMR=17, CAD=18, OPARIT=19, 
		OPREL=20, OPBOOL=21, WS=22, ErrorChar=23;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracao = 2, RULE_corpo = 3, 
		RULE_comando = 4, RULE_leitura = 5, RULE_escrita = 6, RULE_opcoes = 7, 
		RULE_condicional = 8, RULE_iterativo = 9, RULE_atribuicao = 10, RULE_expressao = 11, 
		RULE_fator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracao", "corpo", "comando", "leitura", 
			"escrita", "opcoes", "condicional", "iterativo", "atribuicao", "expressao", 
			"fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ALGORITMO'", null, "'LER'", "'IMPRIMIR'", "'SE'", "'SENAO'", 
			"'ENTAO'", "'ENQUANTO'", "'IGUAL'", "'COMECA'", "'TERMINA'", "'('", "')'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALG", "TIP", "LER", "IMP", "SE", "SEN", "ENT", "ENQ", "IGU", "COM", 
			"TER", "AP", "FP", "DELIM", "VAR", "NUMI", "NUMR", "CAD", "OPARIT", "OPREL", 
			"OPBOOL", "WS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hekissa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HekissaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode DELIM() { return getToken(HekissaParser.DELIM, 0); }
		public TerminalNode ALG() { return getToken(HekissaParser.ALG, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(DELIM);
			setState(27);
			match(ALG);
			setState(28);
			declaracoes();
			setState(29);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIP) {
				{
				{
				setState(31);
				declaracao();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIP() { return getToken(HekissaParser.TIP, 0); }
		public TerminalNode VAR() { return getToken(HekissaParser.VAR, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TIP);
			setState(38);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_corpo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					comando();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public IterativoContext iterativo() {
			return getRuleContext(IterativoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LER:
				{
				setState(45);
				leitura();
				}
				break;
			case IMP:
				{
				setState(46);
				escrita();
				}
				break;
			case SE:
				{
				setState(47);
				condicional();
				}
				break;
			case ENQ:
				{
				setState(48);
				iterativo();
				}
				break;
			case VAR:
				{
				setState(49);
				atribuicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(HekissaParser.LER, 0); }
		public TerminalNode VAR() { return getToken(HekissaParser.VAR, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LER);
			setState(53);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode IMP() { return getToken(HekissaParser.IMP, 0); }
		public OpcoesContext opcoes() {
			return getRuleContext(OpcoesContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IMP);
			setState(56);
			opcoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcoesContext extends ParserRuleContext {
		public TerminalNode CAD() { return getToken(HekissaParser.CAD, 0); }
		public TerminalNode VAR() { return getToken(HekissaParser.VAR, 0); }
		public OpcoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterOpcoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitOpcoes(this);
		}
	}

	public final OpcoesContext opcoes() throws RecognitionException {
		OpcoesContext _localctx = new OpcoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==CAD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(HekissaParser.SE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(HekissaParser.OPREL, 0); }
		public TerminalNode ENT() { return getToken(HekissaParser.ENT, 0); }
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public TerminalNode SEN() { return getToken(HekissaParser.SEN, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(SE);
			setState(61);
			expressao();
			setState(62);
			match(OPREL);
			setState(63);
			expressao();
			setState(64);
			match(ENT);
			setState(65);
			corpo();
			setState(66);
			match(SEN);
			setState(67);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterativoContext extends ParserRuleContext {
		public TerminalNode ENQ() { return getToken(HekissaParser.ENQ, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(HekissaParser.OPREL, 0); }
		public TerminalNode COM() { return getToken(HekissaParser.COM, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode TER() { return getToken(HekissaParser.TER, 0); }
		public IterativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterIterativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitIterativo(this);
		}
	}

	public final IterativoContext iterativo() throws RecognitionException {
		IterativoContext _localctx = new IterativoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_iterativo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ENQ);
			setState(70);
			expressao();
			setState(71);
			match(OPREL);
			setState(72);
			expressao();
			setState(73);
			match(COM);
			setState(74);
			corpo();
			setState(75);
			match(TER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HekissaParser.VAR, 0); }
		public TerminalNode IGU() { return getToken(HekissaParser.IGU, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(VAR);
			setState(78);
			match(IGU);
			setState(79);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TerminalNode OPARIT() { return getToken(HekissaParser.OPARIT, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				fator();
				setState(82);
				match(OPARIT);
				setState(83);
				fator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				fator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HekissaParser.VAR, 0); }
		public TerminalNode NUMI() { return getToken(HekissaParser.NUMI, 0); }
		public TerminalNode NUMR() { return getToken(HekissaParser.NUMR, 0); }
		public TerminalNode OPBOOL() { return getToken(HekissaParser.OPBOOL, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HekissaListener ) ((HekissaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2326528L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003*\b\u0003\u000b\u0003"+
		"\f\u0003+\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00043\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"W\b\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0002\u0000\u000f"+
		"\u000f\u0012\u0012\u0002\u0000\u000f\u0011\u0015\u0015T\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004%\u0001\u0000"+
		"\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000"+
		"\n4\u0001\u0000\u0000\u0000\f7\u0001\u0000\u0000\u0000\u000e:\u0001\u0000"+
		"\u0000\u0000\u0010<\u0001\u0000\u0000\u0000\u0012E\u0001\u0000\u0000\u0000"+
		"\u0014M\u0001\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018X"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u000e\u0000\u0000\u001b\u001c"+
		"\u0005\u0001\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e"+
		"\u0003\u0006\u0003\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f!\u0003"+
		"\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0003\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0002\u0000\u0000"+
		"&\'\u0005\u000f\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000(*\u0003\b"+
		"\u0004\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0007\u0001\u0000\u0000"+
		"\u0000-3\u0003\n\u0005\u0000.3\u0003\f\u0006\u0000/3\u0003\u0010\b\u0000"+
		"03\u0003\u0012\t\u000013\u0003\u0014\n\u00002-\u0001\u0000\u0000\u0000"+
		"2.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000\u000045\u0005\u0003"+
		"\u0000\u000056\u0005\u000f\u0000\u00006\u000b\u0001\u0000\u0000\u0000"+
		"78\u0005\u0004\u0000\u000089\u0003\u000e\u0007\u00009\r\u0001\u0000\u0000"+
		"\u0000:;\u0007\u0000\u0000\u0000;\u000f\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0005\u0000\u0000=>\u0003\u0016\u000b\u0000>?\u0005\u0014\u0000\u0000"+
		"?@\u0003\u0016\u000b\u0000@A\u0005\u0007\u0000\u0000AB\u0003\u0006\u0003"+
		"\u0000BC\u0005\u0006\u0000\u0000CD\u0003\u0006\u0003\u0000D\u0011\u0001"+
		"\u0000\u0000\u0000EF\u0005\b\u0000\u0000FG\u0003\u0016\u000b\u0000GH\u0005"+
		"\u0014\u0000\u0000HI\u0003\u0016\u000b\u0000IJ\u0005\n\u0000\u0000JK\u0003"+
		"\u0006\u0003\u0000KL\u0005\u000b\u0000\u0000L\u0013\u0001\u0000\u0000"+
		"\u0000MN\u0005\u000f\u0000\u0000NO\u0005\t\u0000\u0000OP\u0003\u0016\u000b"+
		"\u0000P\u0015\u0001\u0000\u0000\u0000QR\u0003\u0018\f\u0000RS\u0005\u0013"+
		"\u0000\u0000ST\u0003\u0018\f\u0000TW\u0001\u0000\u0000\u0000UW\u0003\u0018"+
		"\f\u0000VQ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000W\u0017\u0001"+
		"\u0000\u0000\u0000XY\u0007\u0001\u0000\u0000Y\u0019\u0001\u0000\u0000"+
		"\u0000\u0004\"+2V";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}