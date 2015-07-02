// Generated from DynamoParser.g4 by ANTLR 4.4

package org.sdxchange.dynamo.parser4;



import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DynamoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABFUNC=43, PRTPER=40, LT=34, INITCARD=7, BUILTIN=42, MINUS=31, DT=37, 
		MAXLEN=41, ID=45, PRINTCARD=15, MENDCARD=17, INTEGER=46, NEWLINE=1, ENDCMT=51, 
		RATECARD=6, LPAREN=24, DOT=48, JKL=44, RPAREN=25, CARET=29, ENDEQN=22, 
		PLOTCARD=14, CONTINUATION=2, CONSTCARD=4, INDEXCARD=9, PLUS=30, FNUM=23, 
		LENGTH=38, SPECCARD=11, AUXCARD=3, RUNCARD=13, ENDCARD=21, COMMENT=50, 
		MACROCARD=16, TBLCARD=8, INTRNCARD=18, WS=47, FORCARD=10, COMMA=49, EQUAL=33, 
		NOTECARD=12, SLASH=32, LBRACKET=26, RBRACKET=27, GT=35, OTHER=36, STAR=28, 
		STARCARD=19, CONTINUATION2=20, LVLCARD=5, PLTPER=39;
	public static final String[] tokenNames = {
		"<INVALID>", "NEWLINE", "CONTINUATION", "AUXCARD", "CONSTCARD", "LVLCARD", 
		"RATECARD", "INITCARD", "TBLCARD", "INDEXCARD", "FORCARD", "SPECCARD", 
		"NOTECARD", "RUNCARD", "PLOTCARD", "PRINTCARD", "MACROCARD", "MENDCARD", 
		"INTRNCARD", "STARCARD", "CONTINUATION2", "ENDCARD", "ENDEQN", "FNUM", 
		"'('", "')'", "'['", "']'", "'*'", "'^'", "'+'", "'-'", "'/'", "'='", 
		"'<'", "'>'", "OTHER", "'DT'", "'LENGTH'", "'PLTPER'", "'PRTPER'", "'MAXLEN'", 
		"BUILTIN", "TABFUNC", "JKL", "ID", "INTEGER", "WS", "'.'", "','", "COMMENT", 
		"ENDCMT"
	};
	public static final int
		RULE_t = 0, RULE_model = 1, RULE_modelCard = 2, RULE_eqnCard = 3, RULE_expCard = 4, 
		RULE_arrayDecl = 5, RULE_indexDecl = 6, RULE_aryBounds = 7, RULE_aliasList = 8, 
		RULE_endCard = 9, RULE_starCard = 10, RULE_commentCard = 11, RULE_specCard = 12, 
		RULE_specAssign = 13, RULE_specId = 14, RULE_plotCard = 15, RULE_printCard = 16, 
		RULE_rptList = 17, RULE_plotList = 18, RULE_rptSpec = 19, RULE_columnNum = 20, 
		RULE_plotSpec = 21, RULE_plotChar = 22, RULE_bounds = 23, RULE_runCard = 24, 
		RULE_separator = 25, RULE_numLit = 26, RULE_macro = 27, RULE_macroDef = 28, 
		RULE_internDef = 29, RULE_localList = 30, RULE_dummyList = 31, RULE_auxDef = 32, 
		RULE_constDef = 33, RULE_initDef = 34, RULE_rateDef = 35, RULE_stockDef = 36, 
		RULE_tableDef = 37, RULE_yValues = 38, RULE_comment = 39, RULE_eqn = 40, 
		RULE_varRef = 41, RULE_expr = 42, RULE_tabRef = 43, RULE_arrayRef = 44, 
		RULE_indexList = 45, RULE_predefinedVar = 46, RULE_implicitMultExpr = 47, 
		RULE_powerOp = 48, RULE_timeScript = 49, RULE_funcRef = 50, RULE_macroRef = 51, 
		RULE_exprList = 52;
	public static final String[] ruleNames = {
		"t", "model", "modelCard", "eqnCard", "expCard", "arrayDecl", "indexDecl", 
		"aryBounds", "aliasList", "endCard", "starCard", "commentCard", "specCard", 
		"specAssign", "specId", "plotCard", "printCard", "rptList", "plotList", 
		"rptSpec", "columnNum", "plotSpec", "plotChar", "bounds", "runCard", "separator", 
		"numLit", "macro", "macroDef", "internDef", "localList", "dummyList", 
		"auxDef", "constDef", "initDef", "rateDef", "stockDef", "tableDef", "yValues", 
		"comment", "eqn", "varRef", "expr", "tabRef", "arrayRef", "indexList", 
		"predefinedVar", "implicitMultExpr", "powerOp", "timeScript", "funcRef", 
		"macroRef", "exprList"
	};

	@Override
	public String getGrammarFileName() { return "DynamoParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DynamoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TContext extends ParserRuleContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public StarCardContext starCard() {
			return getRuleContext(StarCardContext.class,0);
		}
		public EndCardContext endCard() {
			return getRuleContext(EndCardContext.class,0);
		}
		public List<MacroContext> macro() {
			return getRuleContexts(MacroContext.class);
		}
		public MacroContext macro(int i) {
			return getRuleContext(MacroContext.class,i);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if (_la==STARCARD) {
				{
				setState(106); starCard();
				setState(107); endCard();
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MACROCARD) {
				{
				{
				setState(111); macro();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); model();
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

	public static class ModelContext extends ParserRuleContext {
		public ModelCardContext modelCard(int i) {
			return getRuleContext(ModelCardContext.class,i);
		}
		public List<ExpCardContext> expCard() {
			return getRuleContexts(ExpCardContext.class);
		}
		public EndCardContext endCard(int i) {
			return getRuleContext(EndCardContext.class,i);
		}
		public List<ModelCardContext> modelCard() {
			return getRuleContexts(ModelCardContext.class);
		}
		public ExpCardContext expCard(int i) {
			return getRuleContext(ExpCardContext.class,i);
		}
		public List<EndCardContext> endCard() {
			return getRuleContexts(EndCardContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUXCARD) | (1L << CONSTCARD) | (1L << LVLCARD) | (1L << RATECARD) | (1L << INITCARD) | (1L << TBLCARD) | (1L << INDEXCARD) | (1L << FORCARD) | (1L << SPECCARD) | (1L << NOTECARD) | (1L << RUNCARD) | (1L << PLOTCARD) | (1L << PRINTCARD))) != 0)) {
				{
				{
				setState(121);
				switch (_input.LA(1)) {
				case AUXCARD:
				case CONSTCARD:
				case LVLCARD:
				case RATECARD:
				case INITCARD:
				case TBLCARD:
				case INDEXCARD:
				case FORCARD:
				case NOTECARD:
					{
					setState(119); modelCard();
					}
					break;
				case SPECCARD:
				case RUNCARD:
				case PLOTCARD:
				case PRINTCARD:
					{
					setState(120); expCard();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(123); endCard();
				}
				}
				setState(129);
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

	public static class ModelCardContext extends ParserRuleContext {
		public CommentCardContext commentCard() {
			return getRuleContext(CommentCardContext.class,0);
		}
		public EqnCardContext eqnCard() {
			return getRuleContext(EqnCardContext.class,0);
		}
		public ModelCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterModelCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitModelCard(this);
		}
	}

	public final ModelCardContext modelCard() throws RecognitionException {
		ModelCardContext _localctx = new ModelCardContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelCard);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case AUXCARD:
			case CONSTCARD:
			case LVLCARD:
			case RATECARD:
			case INITCARD:
			case TBLCARD:
			case INDEXCARD:
			case FORCARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); eqnCard();
				}
				break;
			case NOTECARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); commentCard();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EqnCardContext extends ParserRuleContext {
		public EqnCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnCard; }
	 
		public EqnCardContext() { }
		public void copyFrom(EqnCardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LVL_EQNContext extends EqnCardContext {
		public StockDefContext stockDef() {
			return getRuleContext(StockDefContext.class,0);
		}
		public LVL_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterLVL_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitLVL_EQN(this);
		}
	}
	public static class AUX_EQNContext extends EqnCardContext {
		public AuxDefContext auxDef() {
			return getRuleContext(AuxDefContext.class,0);
		}
		public AUX_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterAUX_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitAUX_EQN(this);
		}
	}
	public static class IDX_DECContext extends EqnCardContext {
		public IndexDeclContext indexDecl() {
			return getRuleContext(IndexDeclContext.class,0);
		}
		public IDX_DECContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterIDX_DEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitIDX_DEC(this);
		}
	}
	public static class RATE_EQNContext extends EqnCardContext {
		public RateDefContext rateDef() {
			return getRuleContext(RateDefContext.class,0);
		}
		public RATE_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterRATE_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitRATE_EQN(this);
		}
	}
	public static class TBL_EQNContext extends EqnCardContext {
		public TableDefContext tableDef() {
			return getRuleContext(TableDefContext.class,0);
		}
		public TBL_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterTBL_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitTBL_EQN(this);
		}
	}
	public static class INIT_EQNContext extends EqnCardContext {
		public InitDefContext initDef() {
			return getRuleContext(InitDefContext.class,0);
		}
		public INIT_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterINIT_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitINIT_EQN(this);
		}
	}
	public static class CONST_EQNContext extends EqnCardContext {
		public ConstDefContext constDef() {
			return getRuleContext(ConstDefContext.class,0);
		}
		public CONST_EQNContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterCONST_EQN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitCONST_EQN(this);
		}
	}
	public static class ARY_DECContext extends EqnCardContext {
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public ARY_DECContext(EqnCardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterARY_DEC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitARY_DEC(this);
		}
	}

	public final EqnCardContext eqnCard() throws RecognitionException {
		EqnCardContext _localctx = new EqnCardContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eqnCard);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case AUXCARD:
				_localctx = new AUX_EQNContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134); auxDef();
				}
				break;
			case CONSTCARD:
				_localctx = new CONST_EQNContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135); constDef();
				}
				break;
			case INITCARD:
				_localctx = new INIT_EQNContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136); initDef();
				}
				break;
			case RATECARD:
				_localctx = new RATE_EQNContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137); rateDef();
				}
				break;
			case LVLCARD:
				_localctx = new LVL_EQNContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(138); stockDef();
				}
				break;
			case TBLCARD:
				_localctx = new TBL_EQNContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139); tableDef();
				}
				break;
			case INDEXCARD:
				_localctx = new IDX_DECContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(140); indexDecl();
				}
				break;
			case FORCARD:
				_localctx = new ARY_DECContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(141); arrayDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpCardContext extends ParserRuleContext {
		public SpecCardContext specCard() {
			return getRuleContext(SpecCardContext.class,0);
		}
		public PrintCardContext printCard() {
			return getRuleContext(PrintCardContext.class,0);
		}
		public RunCardContext runCard() {
			return getRuleContext(RunCardContext.class,0);
		}
		public PlotCardContext plotCard() {
			return getRuleContext(PlotCardContext.class,0);
		}
		public ExpCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterExpCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitExpCard(this);
		}
	}

	public final ExpCardContext expCard() throws RecognitionException {
		ExpCardContext _localctx = new ExpCardContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expCard);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case SPECCARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); specCard();
				}
				break;
			case RUNCARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); runCard();
				}
				break;
			case PRINTCARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); printCard();
				}
				break;
			case PLOTCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); plotCard();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public AliasListContext aliasList() {
			return getRuleContext(AliasListContext.class,0);
		}
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(DynamoParser.EQUAL); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode EQUAL(int i) {
			return getToken(DynamoParser.EQUAL, i);
		}
		public AryBoundsContext aryBounds() {
			return getRuleContext(AryBoundsContext.class,0);
		}
		public TerminalNode FORCARD() { return getToken(DynamoParser.FORCARD, 0); }
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitArrayDecl(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(FORCARD);
			setState(151); match(ID);
			setState(152); match(EQUAL);
			setState(153); aryBounds();
			setState(156);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(154); match(EQUAL);
				setState(155); aliasList();
				}
			}

			setState(159);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(158); comment();
				}
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

	public static class IndexDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(DynamoParser.EQUAL, 0); }
		public TerminalNode INTEGER() { return getToken(DynamoParser.INTEGER, 0); }
		public TerminalNode INDEXCARD() { return getToken(DynamoParser.INDEXCARD, 0); }
		public IndexDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterIndexDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitIndexDecl(this);
		}
	}

	public final IndexDeclContext indexDecl() throws RecognitionException {
		IndexDeclContext _localctx = new IndexDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_indexDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(INDEXCARD);
			setState(162); match(ID);
			setState(163); match(EQUAL);
			setState(164); match(INTEGER);
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

	public static class AryBoundsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(DynamoParser.INTEGER); }
		public TerminalNode COMMA() { return getToken(DynamoParser.COMMA, 0); }
		public TerminalNode INTEGER(int i) {
			return getToken(DynamoParser.INTEGER, i);
		}
		public AryBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aryBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterAryBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitAryBounds(this);
		}
	}

	public final AryBoundsContext aryBounds() throws RecognitionException {
		AryBoundsContext _localctx = new AryBoundsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_aryBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(INTEGER);
			setState(167); match(COMMA);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AliasListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DynamoParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(DynamoParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DynamoParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DynamoParser.COMMA, i);
		}
		public AliasListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterAliasList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitAliasList(this);
		}
	}

	public final AliasListContext aliasList() throws RecognitionException {
		AliasListContext _localctx = new AliasListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aliasList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(ID);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171); match(COMMA);
				setState(172); match(ID);
				}
				}
				setState(177);
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

	public static class EndCardContext extends ParserRuleContext {
		public TerminalNode ENDCMT() { return getToken(DynamoParser.ENDCMT, 0); }
		public TerminalNode ENDCARD() { return getToken(DynamoParser.ENDCARD, 0); }
		public EndCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterEndCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitEndCard(this);
		}
	}

	public final EndCardContext endCard() throws RecognitionException {
		EndCardContext _localctx = new EndCardContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_endCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==ENDCARD || _la==ENDCMT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StarCardContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode STARCARD() { return getToken(DynamoParser.STARCARD, 0); }
		public StarCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterStarCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitStarCard(this);
		}
	}

	public final StarCardContext starCard() throws RecognitionException {
		StarCardContext _localctx = new StarCardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_starCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(STARCARD);
			setState(182);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(181); comment();
				}
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

	public static class CommentCardContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NOTECARD() { return getToken(DynamoParser.NOTECARD, 0); }
		public CommentCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterCommentCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitCommentCard(this);
		}
	}

	public final CommentCardContext commentCard() throws RecognitionException {
		CommentCardContext _localctx = new CommentCardContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_commentCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(NOTECARD);
			setState(186);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(185); comment();
				}
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

	public static class SpecCardContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DynamoParser.COMMA); }
		public List<TerminalNode> SLASH() { return getTokens(DynamoParser.SLASH); }
		public List<SpecAssignContext> specAssign() {
			return getRuleContexts(SpecAssignContext.class);
		}
		public SpecAssignContext specAssign(int i) {
			return getRuleContext(SpecAssignContext.class,i);
		}
		public TerminalNode SPECCARD() { return getToken(DynamoParser.SPECCARD, 0); }
		public TerminalNode SLASH(int i) {
			return getToken(DynamoParser.SLASH, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DynamoParser.COMMA, i);
		}
		public SpecCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterSpecCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitSpecCard(this);
		}
	}

	public final SpecCardContext specCard() throws RecognitionException {
		SpecCardContext _localctx = new SpecCardContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_specCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(SPECCARD);
			setState(189); specAssign();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH || _la==COMMA) {
				{
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==SLASH || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(191); specAssign();
				}
				}
				setState(196);
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

	public static class SpecAssignContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(DynamoParser.EQUAL, 0); }
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public SpecIdContext specId() {
			return getRuleContext(SpecIdContext.class,0);
		}
		public SpecAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterSpecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitSpecAssign(this);
		}
	}

	public final SpecAssignContext specAssign() throws RecognitionException {
		SpecAssignContext _localctx = new SpecAssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_specAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); specId();
			setState(198); match(EQUAL);
			setState(199); numLit();
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

	public static class SpecIdContext extends ParserRuleContext {
		public TerminalNode DT() { return getToken(DynamoParser.DT, 0); }
		public TerminalNode PRTPER() { return getToken(DynamoParser.PRTPER, 0); }
		public TerminalNode PLTPER() { return getToken(DynamoParser.PLTPER, 0); }
		public TerminalNode LENGTH() { return getToken(DynamoParser.LENGTH, 0); }
		public TerminalNode MAXLEN() { return getToken(DynamoParser.MAXLEN, 0); }
		public SpecIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterSpecId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitSpecId(this);
		}
	}

	public final SpecIdContext specId() throws RecognitionException {
		SpecIdContext _localctx = new SpecIdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT) | (1L << LENGTH) | (1L << PLTPER) | (1L << PRTPER) | (1L << MAXLEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PlotCardContext extends ParserRuleContext {
		public PlotListContext plotList() {
			return getRuleContext(PlotListContext.class,0);
		}
		public TerminalNode PLOTCARD() { return getToken(DynamoParser.PLOTCARD, 0); }
		public PlotCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPlotCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPlotCard(this);
		}
	}

	public final PlotCardContext plotCard() throws RecognitionException {
		PlotCardContext _localctx = new PlotCardContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plotCard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(PLOTCARD);
			setState(204); plotList();
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

	public static class PrintCardContext extends ParserRuleContext {
		public TerminalNode PRINTCARD() { return getToken(DynamoParser.PRINTCARD, 0); }
		public RptListContext rptList() {
			return getRuleContext(RptListContext.class,0);
		}
		public PrintCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPrintCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPrintCard(this);
		}
	}

	public final PrintCardContext printCard() throws RecognitionException {
		PrintCardContext _localctx = new PrintCardContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printCard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(PRINTCARD);
			setState(207); rptList();
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

	public static class RptListContext extends ParserRuleContext {
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public List<RptSpecContext> rptSpec() {
			return getRuleContexts(RptSpecContext.class);
		}
		public RptSpecContext rptSpec(int i) {
			return getRuleContext(RptSpecContext.class,i);
		}
		public RptListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rptList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterRptList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitRptList(this);
		}
	}

	public final RptListContext rptList() throws RecognitionException {
		RptListContext _localctx = new RptListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rptList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); rptSpec();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH || _la==COMMA) {
				{
				{
				setState(210); separator();
				setState(211); rptSpec();
				}
				}
				setState(217);
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

	public static class PlotListContext extends ParserRuleContext {
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public List<PlotSpecContext> plotSpec() {
			return getRuleContexts(PlotSpecContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public PlotSpecContext plotSpec(int i) {
			return getRuleContext(PlotSpecContext.class,i);
		}
		public PlotListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPlotList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPlotList(this);
		}
	}

	public final PlotListContext plotList() throws RecognitionException {
		PlotListContext _localctx = new PlotListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_plotList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); plotSpec();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH || _la==COMMA) {
				{
				{
				setState(219); separator();
				setState(220); plotSpec();
				}
				}
				setState(226);
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

	public static class RptSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public ColumnNumContext columnNum() {
			return getRuleContext(ColumnNumContext.class,0);
		}
		public RptSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rptSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterRptSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitRptSpec(this);
		}
	}

	public final RptSpecContext rptSpec() throws RecognitionException {
		RptSpecContext _localctx = new RptSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rptSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(227); columnNum();
				setState(228); match(RPAREN);
				}
			}

			setState(232); match(ID);
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

	public static class ColumnNumContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(DynamoParser.INTEGER, 0); }
		public ColumnNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterColumnNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitColumnNum(this);
		}
	}

	public final ColumnNumContext columnNum() throws RecognitionException {
		ColumnNumContext _localctx = new ColumnNumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_columnNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(INTEGER);
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

	public static class PlotSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(DynamoParser.EQUAL, 0); }
		public PlotCharContext plotChar() {
			return getRuleContext(PlotCharContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public PlotSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPlotSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPlotSpec(this);
		}
	}

	public final PlotSpecContext plotSpec() throws RecognitionException {
		PlotSpecContext _localctx = new PlotSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_plotSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(236); match(ID);
				}
				break;
			case 2:
				{
				setState(237); arrayRef();
				}
				break;
			}
			setState(245);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(240); match(EQUAL);
				setState(241); plotChar();
				setState(243);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(242); bounds();
					}
				}

				}
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

	public static class PlotCharContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(DynamoParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(DynamoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DynamoParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(DynamoParser.STAR, 0); }
		public PlotCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plotChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPlotChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPlotChar(this);
		}
	}

	public final PlotCharContext plotChar() throws RecognitionException {
		PlotCharContext _localctx = new PlotCharContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plotChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(247);
				matchWildcard();
				}
				break;
			case 2:
				{
				setState(248); match(PLUS);
				}
				break;
			case 3:
				{
				setState(249); match(MINUS);
				}
				break;
			case 4:
				{
				setState(250); match(STAR);
				}
				break;
			case 5:
				{
				setState(251); match(SLASH);
				}
				break;
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

	public static class BoundsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public List<NumLitContext> numLit() {
			return getRuleContexts(NumLitContext.class);
		}
		public TerminalNode COMMA() { return getToken(DynamoParser.COMMA, 0); }
		public NumLitContext numLit(int i) {
			return getRuleContext(NumLitContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitBounds(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bounds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(LPAREN);
			setState(255); numLit();
			setState(256); match(COMMA);
			setState(257); numLit();
			setState(258); match(RPAREN);
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

	public static class RunCardContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode RUNCARD() { return getToken(DynamoParser.RUNCARD, 0); }
		public RunCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterRunCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitRunCard(this);
		}
	}

	public final RunCardContext runCard() throws RecognitionException {
		RunCardContext _localctx = new RunCardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_runCard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(RUNCARD);
			setState(261); comment();
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DynamoParser.COMMA, 0); }
		public TerminalNode SLASH() { return getToken(DynamoParser.SLASH, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==SLASH || _la==COMMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode FNUM() { return getToken(DynamoParser.FNUM, 0); }
		public TerminalNode INTEGER() { return getToken(DynamoParser.INTEGER, 0); }
		public TerminalNode PLUS() { return getToken(DynamoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DynamoParser.MINUS, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitNumLit(this);
		}
	}

	public final NumLitContext numLit() throws RecognitionException {
		NumLitContext _localctx = new NumLitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(268);
			_la = _input.LA(1);
			if ( !(_la==FNUM || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MacroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public EndCardContext endCard(int i) {
			return getRuleContext(EndCardContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public TerminalNode MENDCARD() { return getToken(DynamoParser.MENDCARD, 0); }
		public TerminalNode MACROCARD() { return getToken(DynamoParser.MACROCARD, 0); }
		public DummyListContext dummyList() {
			return getRuleContext(DummyListContext.class,0);
		}
		public List<EndCardContext> endCard() {
			return getRuleContexts(EndCardContext.class);
		}
		public MacroDefContext macroDef() {
			return getRuleContext(MacroDefContext.class,0);
		}
		public MacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitMacro(this);
		}
	}

	public final MacroContext macro() throws RecognitionException {
		MacroContext _localctx = new MacroContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(MACROCARD);
			setState(271); match(ID);
			setState(272); match(LPAREN);
			setState(273); dummyList();
			setState(274); match(RPAREN);
			setState(275); endCard();
			setState(276); macroDef();
			setState(277); match(MENDCARD);
			setState(278); endCard();
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

	public static class MacroDefContext extends ParserRuleContext {
		public InternDefContext internDef(int i) {
			return getRuleContext(InternDefContext.class,i);
		}
		public List<InternDefContext> internDef() {
			return getRuleContexts(InternDefContext.class);
		}
		public ModelCardContext modelCard(int i) {
			return getRuleContext(ModelCardContext.class,i);
		}
		public EndCardContext endCard(int i) {
			return getRuleContext(EndCardContext.class,i);
		}
		public List<ModelCardContext> modelCard() {
			return getRuleContexts(ModelCardContext.class);
		}
		public List<EndCardContext> endCard() {
			return getRuleContexts(EndCardContext.class);
		}
		public MacroDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterMacroDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitMacroDef(this);
		}
	}

	public final MacroDefContext macroDef() throws RecognitionException {
		MacroDefContext _localctx = new MacroDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_macroDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTRNCARD) {
				{
				{
				setState(280); internDef();
				setState(281); endCard();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUXCARD) | (1L << CONSTCARD) | (1L << LVLCARD) | (1L << RATECARD) | (1L << INITCARD) | (1L << TBLCARD) | (1L << INDEXCARD) | (1L << FORCARD) | (1L << NOTECARD))) != 0)) {
				{
				{
				setState(288); modelCard();
				setState(289); endCard();
				}
				}
				setState(295);
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

	public static class InternDefContext extends ParserRuleContext {
		public TerminalNode INTRNCARD() { return getToken(DynamoParser.INTRNCARD, 0); }
		public LocalListContext localList() {
			return getRuleContext(LocalListContext.class,0);
		}
		public InternDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterInternDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitInternDef(this);
		}
	}

	public final InternDefContext internDef() throws RecognitionException {
		InternDefContext _localctx = new InternDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_internDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(INTRNCARD);
			setState(297); localList();
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

	public static class LocalListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DynamoParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(DynamoParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DynamoParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DynamoParser.COMMA, i);
		}
		public LocalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterLocalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitLocalList(this);
		}
	}

	public final LocalListContext localList() throws RecognitionException {
		LocalListContext _localctx = new LocalListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_localList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(ID);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300); match(COMMA);
				setState(301); match(ID);
				}
				}
				setState(306);
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

	public static class DummyListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DynamoParser.ID); }
		public List<TerminalNode> COMMA() { return getTokens(DynamoParser.COMMA); }
		public TerminalNode ID(int i) {
			return getToken(DynamoParser.ID, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DynamoParser.COMMA, i);
		}
		public DummyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dummyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterDummyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitDummyList(this);
		}
	}

	public final DummyListContext dummyList() throws RecognitionException {
		DummyListContext _localctx = new DummyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dummyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(ID);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308); match(COMMA);
				setState(309); match(ID);
				}
				}
				setState(314);
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

	public static class AuxDefContext extends ParserRuleContext {
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EqnContext eqn() {
			return getRuleContext(EqnContext.class,0);
		}
		public TerminalNode AUXCARD() { return getToken(DynamoParser.AUXCARD, 0); }
		public AuxDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterAuxDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitAuxDef(this);
		}
	}

	public final AuxDefContext auxDef() throws RecognitionException {
		AuxDefContext _localctx = new AuxDefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_auxDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(AUXCARD);
			setState(316); eqn();
			setState(321);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(317); match(ENDEQN);
				setState(319);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(318); comment();
					}
				}

				}
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

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EqnContext eqn() {
			return getRuleContext(EqnContext.class,0);
		}
		public TerminalNode CONSTCARD() { return getToken(DynamoParser.CONSTCARD, 0); }
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitConstDef(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); match(CONSTCARD);
			setState(324); eqn();
			setState(329);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(325); match(ENDEQN);
				setState(327);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(326); comment();
					}
				}

				}
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

	public static class InitDefContext extends ParserRuleContext {
		public TerminalNode INITCARD() { return getToken(DynamoParser.INITCARD, 0); }
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EqnContext eqn() {
			return getRuleContext(EqnContext.class,0);
		}
		public InitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterInitDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitInitDef(this);
		}
	}

	public final InitDefContext initDef() throws RecognitionException {
		InitDefContext _localctx = new InitDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_initDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(INITCARD);
			setState(332); eqn();
			setState(337);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(333); match(ENDEQN);
				setState(335);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(334); comment();
					}
				}

				}
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

	public static class RateDefContext extends ParserRuleContext {
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode RATECARD() { return getToken(DynamoParser.RATECARD, 0); }
		public EqnContext eqn() {
			return getRuleContext(EqnContext.class,0);
		}
		public RateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rateDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterRateDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitRateDef(this);
		}
	}

	public final RateDefContext rateDef() throws RecognitionException {
		RateDefContext _localctx = new RateDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rateDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(RATECARD);
			setState(340); eqn();
			setState(345);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(341); match(ENDEQN);
				setState(343);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(342); comment();
					}
				}

				}
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

	public static class StockDefContext extends ParserRuleContext {
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EqnContext eqn() {
			return getRuleContext(EqnContext.class,0);
		}
		public TerminalNode LVLCARD() { return getToken(DynamoParser.LVLCARD, 0); }
		public StockDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stockDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterStockDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitStockDef(this);
		}
	}

	public final StockDefContext stockDef() throws RecognitionException {
		StockDefContext _localctx = new StockDefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stockDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(LVLCARD);
			setState(348); eqn();
			setState(353);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(349); match(ENDEQN);
				setState(351);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(350); comment();
					}
				}

				}
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

	public static class TableDefContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(DynamoParser.EQUAL, 0); }
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode ENDEQN() { return getToken(DynamoParser.ENDEQN, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public YValuesContext yValues() {
			return getRuleContext(YValuesContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode TBLCARD() { return getToken(DynamoParser.TBLCARD, 0); }
		public TableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterTableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitTableDef(this);
		}
	}

	public final TableDefContext tableDef() throws RecognitionException {
		TableDefContext _localctx = new TableDefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(TBLCARD);
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(356); match(ID);
				}
				break;
			case 2:
				{
				setState(357); arrayRef();
				}
				break;
			}
			setState(360); match(EQUAL);
			setState(361); yValues();
			setState(366);
			_la = _input.LA(1);
			if (_la==ENDEQN) {
				{
				setState(362); match(ENDEQN);
				setState(364);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(363); comment();
					}
				}

				}
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

	public static class YValuesContext extends ParserRuleContext {
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public List<NumLitContext> numLit() {
			return getRuleContexts(NumLitContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public NumLitContext numLit(int i) {
			return getRuleContext(NumLitContext.class,i);
		}
		public YValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterYValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitYValues(this);
		}
	}

	public final YValuesContext yValues() throws RecognitionException {
		YValuesContext _localctx = new YValuesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_yValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); numLit();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH || _la==COMMA) {
				{
				{
				setState(369); separator();
				setState(370); numLit();
				}
				}
				setState(376);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DynamoParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(COMMENT);
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

	public static class EqnContext extends ParserRuleContext {
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(DynamoParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EqnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterEqn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitEqn(this);
		}
	}

	public final EqnContext eqn() throws RecognitionException {
		EqnContext _localctx = new EqnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_eqn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); varRef();
			setState(380); match(EQUAL);
			setState(381); expr(0);
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

	public static class VarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TimeScriptContext timeScript() {
			return getRuleContext(TimeScriptContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public PredefinedVarContext predefinedVar() {
			return getRuleContext(PredefinedVarContext.class,0);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitVarRef(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_varRef);
		int _la;
		try {
			setState(389);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(383); match(ID);
				setState(385);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(384); timeScript();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); arrayRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388); predefinedVar();
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

	public static class ExprContext extends ParserRuleContext {
		public ImplicitMultExprContext implicitMultExpr() {
			return getRuleContext(ImplicitMultExprContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(DynamoParser.LT, 0); }
		public TerminalNode GT() { return getToken(DynamoParser.GT, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(DynamoParser.STAR, 0); }
		public MacroRefContext macroRef() {
			return getRuleContext(MacroRefContext.class,0);
		}
		public TabRefContext tabRef() {
			return getRuleContext(TabRefContext.class,0);
		}
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TimeScriptContext timeScript() {
			return getRuleContext(TimeScriptContext.class,0);
		}
		public PowerOpContext powerOp() {
			return getRuleContext(PowerOpContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public FuncRefContext funcRef() {
			return getRuleContext(FuncRefContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(DynamoParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(DynamoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DynamoParser.MINUS, 0); }
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public PredefinedVarContext predefinedVar() {
			return getRuleContext(PredefinedVarContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(393); expr(9);
				}
				break;
			case 2:
				{
				setState(394); match(LPAREN);
				setState(395); expr(0);
				setState(396); match(RPAREN);
				}
				break;
			case 3:
				{
				setState(398); implicitMultExpr();
				}
				break;
			case 4:
				{
				setState(399); numLit();
				}
				break;
			case 5:
				{
				setState(400); tabRef();
				}
				break;
			case 6:
				{
				setState(401); funcRef();
				}
				break;
			case 7:
				{
				setState(402); macroRef();
				}
				break;
			case 8:
				{
				setState(403); arrayRef();
				}
				break;
			case 9:
				{
				setState(404); predefinedVar();
				}
				break;
			case 10:
				{
				setState(405); match(ID);
				setState(407);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(406); timeScript();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(424);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(411);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(412); powerOp();
						setState(413); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(415);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(416);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==SLASH) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(417); expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(418);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(419);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(420); expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(421);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(422);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(423); expr(9);
						}
						break;
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TabRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode TABFUNC() { return getToken(DynamoParser.TABFUNC, 0); }
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public TabRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterTabRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitTabRef(this);
		}
	}

	public final TabRefContext tabRef() throws RecognitionException {
		TabRefContext _localctx = new TabRefContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tabRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); match(TABFUNC);
			setState(430); match(LPAREN);
			setState(431); exprList();
			setState(432); match(RPAREN);
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

	public static class ArrayRefContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(DynamoParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TimeScriptContext timeScript() {
			return getRuleContext(TimeScriptContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(DynamoParser.LBRACKET, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayRef);
		int _la;
		try {
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434); match(ID);
				setState(436);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(435); timeScript();
					}
				}

				setState(438); match(LBRACKET);
				setState(439); indexList();
				setState(440); match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); match(ID);
				setState(444);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(443); timeScript();
					}
				}

				setState(446); match(LPAREN);
				setState(447); indexList();
				setState(448); match(RPAREN);
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

	public static class IndexListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode STAR() { return getToken(DynamoParser.STAR, 0); }
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterIndexList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitIndexList(this);
		}
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexList);
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); exprList();
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

	public static class PredefinedVarContext extends ParserRuleContext {
		public TimeScriptContext timeScript() {
			return getRuleContext(TimeScriptContext.class,0);
		}
		public TerminalNode PRTPER() { return getToken(DynamoParser.PRTPER, 0); }
		public TerminalNode MAXLEN() { return getToken(DynamoParser.MAXLEN, 0); }
		public TerminalNode LENGTH() { return getToken(DynamoParser.LENGTH, 0); }
		public PredefinedVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefinedVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPredefinedVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPredefinedVar(this);
		}
	}

	public final PredefinedVarContext predefinedVar() throws RecognitionException {
		PredefinedVarContext _localctx = new PredefinedVarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_predefinedVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LENGTH) | (1L << PRTPER) | (1L << MAXLEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(457); timeScript();
				}
				break;
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

	public static class ImplicitMultExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(DynamoParser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DynamoParser.LPAREN); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DynamoParser.RPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DynamoParser.LPAREN, i);
		}
		public ImplicitMultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitMultExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterImplicitMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitImplicitMultExpr(this);
		}
	}

	public final ImplicitMultExprContext implicitMultExpr() throws RecognitionException {
		ImplicitMultExprContext _localctx = new ImplicitMultExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_implicitMultExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); match(LPAREN);
			setState(461); expr(0);
			setState(462); match(RPAREN);
			setState(463); match(LPAREN);
			setState(464); expr(0);
			setState(465); match(RPAREN);
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

	public static class PowerOpContext extends ParserRuleContext {
		public TerminalNode STAR(int i) {
			return getToken(DynamoParser.STAR, i);
		}
		public TerminalNode CARET() { return getToken(DynamoParser.CARET, 0); }
		public List<TerminalNode> STAR() { return getTokens(DynamoParser.STAR); }
		public PowerOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterPowerOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitPowerOp(this);
		}
	}

	public final PowerOpContext powerOp() throws RecognitionException {
		PowerOpContext _localctx = new PowerOpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_powerOp);
		try {
			setState(470);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(467); match(STAR);
				setState(468); match(STAR);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); match(CARET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TimeScriptContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DynamoParser.DOT, 0); }
		public TerminalNode JKL() { return getToken(DynamoParser.JKL, 0); }
		public TimeScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterTimeScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitTimeScript(this);
		}
	}

	public final TimeScriptContext timeScript() throws RecognitionException {
		TimeScriptContext _localctx = new TimeScriptContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_timeScript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472); match(DOT);
			setState(473); match(JKL);
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

	public static class FuncRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public TerminalNode DT() { return getToken(DynamoParser.DT, 0); }
		public TerminalNode BUILTIN() { return getToken(DynamoParser.BUILTIN, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public FuncRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterFuncRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitFuncRef(this);
		}
	}

	public final FuncRefContext funcRef() throws RecognitionException {
		FuncRefContext _localctx = new FuncRefContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_funcRef);
		try {
			setState(481);
			switch (_input.LA(1)) {
			case BUILTIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(475); match(BUILTIN);
				setState(476); match(LPAREN);
				setState(477); exprList();
				setState(478); match(RPAREN);
				}
				break;
			case DT:
				enterOuterAlt(_localctx, 2);
				{
				setState(480); match(DT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MacroRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(DynamoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DynamoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DynamoParser.RPAREN, 0); }
		public MacroRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterMacroRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitMacroRef(this);
		}
	}

	public final MacroRefContext macroRef() throws RecognitionException {
		MacroRefContext _localctx = new MacroRefContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_macroRef);
		try {
			setState(489);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484); match(ID);
				setState(485); match(LPAREN);
				setState(486); exprList();
				setState(487); match(RPAREN);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamoParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoParserListener ) ((DynamoParserListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491); expr(0);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492); match(COMMA);
				setState(493); expr(0);
				}
				}
				setState(498);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 10);
		case 3: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u01f6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\5\2p\n\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\3\2\3\2\3\3\3\3\5\3|\n\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3"+
		"\3\4\3\4\5\4\u0087\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3"+
		"\6\3\6\3\6\3\6\5\6\u0097\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\7"+
		"\5\7\u00a2\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00b0"+
		"\n\n\f\n\16\n\u00b3\13\n\3\13\3\13\3\f\3\f\5\f\u00b9\n\f\3\r\3\r\5\r\u00bd"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16\16\u00c6\13\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\7\23\u00d8\n\23\f\23\16\23\u00db\13\23\3\24\3\24\3\24\3\24\7\24\u00e1"+
		"\n\24\f\24\16\24\u00e4\13\24\3\25\3\25\3\25\5\25\u00e9\n\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\5\27\u00f1\n\27\3\27\3\27\3\27\5\27\u00f6\n\27\5"+
		"\27\u00f8\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00ff\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\5\34\u010d\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36"+
		"\u011e\n\36\f\36\16\36\u0121\13\36\3\36\3\36\3\36\7\36\u0126\n\36\f\36"+
		"\16\36\u0129\13\36\3\37\3\37\3\37\3 \3 \3 \7 \u0131\n \f \16 \u0134\13"+
		" \3!\3!\3!\7!\u0139\n!\f!\16!\u013c\13!\3\"\3\"\3\"\3\"\5\"\u0142\n\""+
		"\5\"\u0144\n\"\3#\3#\3#\3#\5#\u014a\n#\5#\u014c\n#\3$\3$\3$\3$\5$\u0152"+
		"\n$\5$\u0154\n$\3%\3%\3%\3%\5%\u015a\n%\5%\u015c\n%\3&\3&\3&\3&\5&\u0162"+
		"\n&\5&\u0164\n&\3\'\3\'\3\'\5\'\u0169\n\'\3\'\3\'\3\'\3\'\5\'\u016f\n"+
		"\'\5\'\u0171\n\'\3(\3(\3(\3(\7(\u0177\n(\f(\16(\u017a\13(\3)\3)\3*\3*"+
		"\3*\3*\3+\3+\5+\u0184\n+\3+\3+\5+\u0188\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\5,\u019a\n,\5,\u019c\n,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\7,\u01ab\n,\f,\16,\u01ae\13,\3-\3-\3-\3-\3-\3.\3.\5.\u01b7"+
		"\n.\3.\3.\3.\3.\3.\3.\5.\u01bf\n.\3.\3.\3.\3.\5.\u01c5\n.\3/\3/\5/\u01c9"+
		"\n/\3\60\3\60\5\60\u01cd\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\5\62\u01d9\n\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u01e4\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u01ec\n\65\3\66\3"+
		"\66\3\66\7\66\u01f1\n\66\f\66\16\66\u01f4\13\66\3\66\2\3V\67\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhj\2\13\3\2/\60\4\2\27\27\65\65\4\2\"\"\63\63\3\2\'+\3\2 !\4\2\31"+
		"\31\60\60\4\2\36\36\"\"\3\2$%\4\2((*+\u020c\2o\3\2\2\2\4\u0081\3\2\2\2"+
		"\6\u0086\3\2\2\2\b\u0090\3\2\2\2\n\u0096\3\2\2\2\f\u0098\3\2\2\2\16\u00a3"+
		"\3\2\2\2\20\u00a8\3\2\2\2\22\u00ac\3\2\2\2\24\u00b4\3\2\2\2\26\u00b6\3"+
		"\2\2\2\30\u00ba\3\2\2\2\32\u00be\3\2\2\2\34\u00c7\3\2\2\2\36\u00cb\3\2"+
		"\2\2 \u00cd\3\2\2\2\"\u00d0\3\2\2\2$\u00d3\3\2\2\2&\u00dc\3\2\2\2(\u00e8"+
		"\3\2\2\2*\u00ec\3\2\2\2,\u00f0\3\2\2\2.\u00fe\3\2\2\2\60\u0100\3\2\2\2"+
		"\62\u0106\3\2\2\2\64\u0109\3\2\2\2\66\u010c\3\2\2\28\u0110\3\2\2\2:\u011f"+
		"\3\2\2\2<\u012a\3\2\2\2>\u012d\3\2\2\2@\u0135\3\2\2\2B\u013d\3\2\2\2D"+
		"\u0145\3\2\2\2F\u014d\3\2\2\2H\u0155\3\2\2\2J\u015d\3\2\2\2L\u0165\3\2"+
		"\2\2N\u0172\3\2\2\2P\u017b\3\2\2\2R\u017d\3\2\2\2T\u0187\3\2\2\2V\u019b"+
		"\3\2\2\2X\u01af\3\2\2\2Z\u01c4\3\2\2\2\\\u01c8\3\2\2\2^\u01ca\3\2\2\2"+
		"`\u01ce\3\2\2\2b\u01d8\3\2\2\2d\u01da\3\2\2\2f\u01e3\3\2\2\2h\u01eb\3"+
		"\2\2\2j\u01ed\3\2\2\2lm\5\26\f\2mn\5\24\13\2np\3\2\2\2ol\3\2\2\2op\3\2"+
		"\2\2pt\3\2\2\2qs\58\35\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2"+
		"\2\2vt\3\2\2\2wx\5\4\3\2x\3\3\2\2\2y|\5\6\4\2z|\5\n\6\2{y\3\2\2\2{z\3"+
		"\2\2\2|}\3\2\2\2}~\5\24\13\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\5\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0087\5\b\5\2\u0085\u0087\5\30\r\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\7\3\2\2\2\u0088\u0091\5B\"\2\u0089\u0091\5"+
		"D#\2\u008a\u0091\5F$\2\u008b\u0091\5H%\2\u008c\u0091\5J&\2\u008d\u0091"+
		"\5L\'\2\u008e\u0091\5\16\b\2\u008f\u0091\5\f\7\2\u0090\u0088\3\2\2\2\u0090"+
		"\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2"+
		"\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\t\3\2\2\2\u0092\u0097\5\32\16\2\u0093\u0097\5\62\32\2\u0094\u0097\5\""+
		"\22\2\u0095\u0097\5 \21\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\13\3\2\2\2\u0098\u0099\7\f\2"+
		"\2\u0099\u009a\7/\2\2\u009a\u009b\7#\2\2\u009b\u009e\5\20\t\2\u009c\u009d"+
		"\7#\2\2\u009d\u009f\5\22\n\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u00a2\5P)\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\r\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a6"+
		"\7#\2\2\u00a6\u00a7\7\60\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\60\2\2\u00a9"+
		"\u00aa\7\63\2\2\u00aa\u00ab\t\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b1\7/\2"+
		"\2\u00ad\u00ae\7\63\2\2\u00ae\u00b0\7/\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\25\3\2\2\2\u00b6\u00b8\7\25\2"+
		"\2\u00b7\u00b9\5P)\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\27"+
		"\3\2\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00bd\5P)\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\u00c4\5\34\17"+
		"\2\u00c0\u00c1\t\4\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\33\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\5\36\20\2\u00c8\u00c9\7#\2\2\u00c9"+
		"\u00ca\5\66\34\2\u00ca\35\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc\37\3\2\2\2"+
		"\u00cd\u00ce\7\20\2\2\u00ce\u00cf\5&\24\2\u00cf!\3\2\2\2\u00d0\u00d1\7"+
		"\21\2\2\u00d1\u00d2\5$\23\2\u00d2#\3\2\2\2\u00d3\u00d9\5(\25\2\u00d4\u00d5"+
		"\5\64\33\2\u00d5\u00d6\5(\25\2\u00d6\u00d8\3\2\2\2\u00d7\u00d4\3\2\2\2"+
		"\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da%\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e2\5,\27\2\u00dd\u00de\5\64\33\2\u00de"+
		"\u00df\5,\27\2\u00df\u00e1\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\'\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\33\2\2\u00e7\u00e9\3\2\2\2"+
		"\u00e8\u00e5\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\7/\2\2\u00eb)\3\2\2\2\u00ec\u00ed\7\60\2\2\u00ed+\3\2\2\2\u00ee\u00f1"+
		"\7/\2\2\u00ef\u00f1\5Z.\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f7\3\2\2\2\u00f2\u00f3\7#\2\2\u00f3\u00f5\5.\30\2\u00f4\u00f6\5\60"+
		"\31\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f2\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8-\3\2\2\2\u00f9\u00ff\13\2\2\2"+
		"\u00fa\u00ff\7 \2\2\u00fb\u00ff\7!\2\2\u00fc\u00ff\7\36\2\2\u00fd\u00ff"+
		"\7\"\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff/\3\2\2\2\u0100\u0101\7\32\2\2"+
		"\u0101\u0102\5\66\34\2\u0102\u0103\7\63\2\2\u0103\u0104\5\66\34\2\u0104"+
		"\u0105\7\33\2\2\u0105\61\3\2\2\2\u0106\u0107\7\17\2\2\u0107\u0108\5P)"+
		"\2\u0108\63\3\2\2\2\u0109\u010a\t\4\2\2\u010a\65\3\2\2\2\u010b\u010d\t"+
		"\6\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\t\7\2\2\u010f\67\3\2\2\2\u0110\u0111\7\22\2\2\u0111\u0112\7/\2"+
		"\2\u0112\u0113\7\32\2\2\u0113\u0114\5@!\2\u0114\u0115\7\33\2\2\u0115\u0116"+
		"\5\24\13\2\u0116\u0117\5:\36\2\u0117\u0118\7\23\2\2\u0118\u0119\5\24\13"+
		"\2\u01199\3\2\2\2\u011a\u011b\5<\37\2\u011b\u011c\5\24\13\2\u011c\u011e"+
		"\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\5\6"+
		"\4\2\u0123\u0124\5\24\13\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128;\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012b\7\24\2\2\u012b\u012c\5> \2\u012c=\3\2"+
		"\2\2\u012d\u0132\7/\2\2\u012e\u012f\7\63\2\2\u012f\u0131\7/\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133?\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013a\7/\2\2\u0136\u0137"+
		"\7\63\2\2\u0137\u0139\7/\2\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bA\3\2\2\2\u013c\u013a\3\2\2\2"+
		"\u013d\u013e\7\5\2\2\u013e\u0143\5R*\2\u013f\u0141\7\30\2\2\u0140\u0142"+
		"\5P)\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0144\3\2\2\2\u0144C\3\2\2\2\u0145\u0146\7\6\2\2"+
		"\u0146\u014b\5R*\2\u0147\u0149\7\30\2\2\u0148\u014a\5P)\2\u0149\u0148"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0147\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014cE\3\2\2\2\u014d\u014e\7\t\2\2\u014e\u0153\5R*\2\u014f"+
		"\u0151\7\30\2\2\u0150\u0152\5P)\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"G\3\2\2\2\u0155\u0156\7\b\2\2\u0156\u015b\5R*\2\u0157\u0159\7\30\2\2\u0158"+
		"\u015a\5P)\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2"+
		"\2\u015b\u0157\3\2\2\2\u015b\u015c\3\2\2\2\u015cI\3\2\2\2\u015d\u015e"+
		"\7\7\2\2\u015e\u0163\5R*\2\u015f\u0161\7\30\2\2\u0160\u0162\5P)\2\u0161"+
		"\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u015f\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164K\3\2\2\2\u0165\u0168\7\n\2\2\u0166\u0169"+
		"\7/\2\2\u0167\u0169\5Z.\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\7#\2\2\u016b\u0170\5N(\2\u016c\u016e\7\30\2"+
		"\2\u016d\u016f\5P)\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171"+
		"\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u0171\3\2\2\2\u0171M\3\2\2\2\u0172"+
		"\u0178\5\66\34\2\u0173\u0174\5\64\33\2\u0174\u0175\5\66\34\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179O\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7\64\2\2"+
		"\u017cQ\3\2\2\2\u017d\u017e\5T+\2\u017e\u017f\7#\2\2\u017f\u0180\5V,\2"+
		"\u0180S\3\2\2\2\u0181\u0183\7/\2\2\u0182\u0184\5d\63\2\u0183\u0182\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0188\3\2\2\2\u0185\u0188\5Z.\2\u0186\u0188"+
		"\5^\60\2\u0187\u0181\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"U\3\2\2\2\u0189\u018a\b,\1\2\u018a\u018b\t\6\2\2\u018b\u019c\5V,\13\u018c"+
		"\u018d\7\32\2\2\u018d\u018e\5V,\2\u018e\u018f\7\33\2\2\u018f\u019c\3\2"+
		"\2\2\u0190\u019c\5`\61\2\u0191\u019c\5\66\34\2\u0192\u019c\5X-\2\u0193"+
		"\u019c\5f\64\2\u0194\u019c\5h\65\2\u0195\u019c\5Z.\2\u0196\u019c\5^\60"+
		"\2\u0197\u0199\7/\2\2\u0198\u019a\5d\63\2\u0199\u0198\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0189\3\2\2\2\u019b\u018c\3\2\2\2\u019b"+
		"\u0190\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0192\3\2\2\2\u019b\u0193\3\2"+
		"\2\2\u019b\u0194\3\2\2\2\u019b\u0195\3\2\2\2\u019b\u0196\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019c\u01ac\3\2\2\2\u019d\u019e\f\17\2\2\u019e\u019f\5"+
		"b\62\2\u019f\u01a0\5V,\20\u01a0\u01ab\3\2\2\2\u01a1\u01a2\f\16\2\2\u01a2"+
		"\u01a3\t\b\2\2\u01a3\u01ab\5V,\17\u01a4\u01a5\f\f\2\2\u01a5\u01a6\t\6"+
		"\2\2\u01a6\u01ab\5V,\r\u01a7\u01a8\f\n\2\2\u01a8\u01a9\t\t\2\2\u01a9\u01ab"+
		"\5V,\13\u01aa\u019d\3\2\2\2\u01aa\u01a1\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa"+
		"\u01a7\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01adW\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7-\2\2\u01b0\u01b1"+
		"\7\32\2\2\u01b1\u01b2\5j\66\2\u01b2\u01b3\7\33\2\2\u01b3Y\3\2\2\2\u01b4"+
		"\u01b6\7/\2\2\u01b5\u01b7\5d\63\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7\34\2\2\u01b9\u01ba\5\\/\2\u01ba"+
		"\u01bb\7\35\2\2\u01bb\u01c5\3\2\2\2\u01bc\u01be\7/\2\2\u01bd\u01bf\5d"+
		"\63\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\7\32\2\2\u01c1\u01c2\5\\/\2\u01c2\u01c3\7\33\2\2\u01c3\u01c5\3"+
		"\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c5[\3\2\2\2\u01c6\u01c9"+
		"\7\36\2\2\u01c7\u01c9\5j\66\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2"+
		"\u01c9]\3\2\2\2\u01ca\u01cc\t\n\2\2\u01cb\u01cd\5d\63\2\u01cc\u01cb\3"+
		"\2\2\2\u01cc\u01cd\3\2\2\2\u01cd_\3\2\2\2\u01ce\u01cf\7\32\2\2\u01cf\u01d0"+
		"\5V,\2\u01d0\u01d1\7\33\2\2\u01d1\u01d2\7\32\2\2\u01d2\u01d3\5V,\2\u01d3"+
		"\u01d4\7\33\2\2\u01d4a\3\2\2\2\u01d5\u01d6\7\36\2\2\u01d6\u01d9\7\36\2"+
		"\2\u01d7\u01d9\7\37\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"c\3\2\2\2\u01da\u01db\7\62\2\2\u01db\u01dc\7.\2\2\u01dce\3\2\2\2\u01dd"+
		"\u01de\7,\2\2\u01de\u01df\7\32\2\2\u01df\u01e0\5j\66\2\u01e0\u01e1\7\33"+
		"\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e4\7\'\2\2\u01e3\u01dd\3\2\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4g\3\2\2\2\u01e5\u01ec\3\2\2\2\u01e6\u01e7\7/\2\2\u01e7"+
		"\u01e8\7\32\2\2\u01e8\u01e9\5j\66\2\u01e9\u01ea\7\33\2\2\u01ea\u01ec\3"+
		"\2\2\2\u01eb\u01e5\3\2\2\2\u01eb\u01e6\3\2\2\2\u01eci\3\2\2\2\u01ed\u01f2"+
		"\5V,\2\u01ee\u01ef\7\63\2\2\u01ef\u01f1\5V,\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3k\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\28ot{\u0081\u0086\u0090\u0096\u009e\u00a1\u00b1\u00b8"+
		"\u00bc\u00c4\u00d9\u00e2\u00e8\u00f0\u00f5\u00f7\u00fe\u010c\u011f\u0127"+
		"\u0132\u013a\u0141\u0143\u0149\u014b\u0151\u0153\u0159\u015b\u0161\u0163"+
		"\u0168\u016e\u0170\u0178\u0183\u0187\u0199\u019b\u01aa\u01ac\u01b6\u01be"+
		"\u01c4\u01c8\u01cc\u01d8\u01e3\u01eb\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}