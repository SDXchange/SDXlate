// Generated from XmileParser.g4 by ANTLR 4.4

package org.sdxchange.xmile.parser4;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FNUM=2, TESTFUNC=27, LT=15, DLYFUNC=26, TIMEFUNC=28, COMMENT=36, MINUS=13, 
		DT=23, MATHFUNC=24, ID=30, WS=32, RCURLY=35, INTEGER=31, STATFUNC=25, 
		COMMA=34, MOD=11, OR=21, MISCFUNC=29, EQUAL=18, LPAREN=5, SLASH=10, DOT=33, 
		LCURLY=1, LBRACKET=3, RBRACKET=4, RPAREN=6, CARET=7, GT=17, NOTEQUAL=19, 
		OTHER=22, NOT=8, STAR=9, AND=20, GTE=16, LTE=14, PLUS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "LCURLY", "FNUM", "'['", "']'", "'('", "')'", "'^'", "'NOT'", 
		"'*'", "'/'", "'MOD'", "'+'", "'-'", "'<='", "'<'", "'>='", "'>'", "'='", 
		"'<>'", "'AND'", "'OR'", "OTHER", "'DT'", "MATHFUNC", "STATFUNC", "DLYFUNC", 
		"TESTFUNC", "TIMEFUNC", "MISCFUNC", "ID", "INTEGER", "WS", "'.'", "','", 
		"RCURLY", "COMMENT"
	};
	public static final int
		RULE_expr = 0, RULE_arrayRef = 1, RULE_numLit = 2, RULE_funcRef = 3, RULE_builtin = 4, 
		RULE_macroRef = 5, RULE_exprList = 6;
	public static final String[] ruleNames = {
		"expr", "arrayRef", "numLit", "funcRef", "builtin", "macroRef", "exprList"
	};

	@Override
	public String getGrammarFileName() { return "XmileParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XmileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(XmileParser.LT, 0); }
		public TerminalNode GTE() { return getToken(XmileParser.GTE, 0); }
		public TerminalNode GT() { return getToken(XmileParser.GT, 0); }
		public TerminalNode RPAREN() { return getToken(XmileParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(XmileParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(XmileParser.MOD, 0); }
		public TerminalNode OR() { return getToken(XmileParser.OR, 0); }
		public TerminalNode LTE() { return getToken(XmileParser.LTE, 0); }
		public MacroRefContext macroRef() {
			return getRuleContext(MacroRefContext.class,0);
		}
		public TerminalNode NOT() { return getToken(XmileParser.NOT, 0); }
		public TerminalNode ID() { return getToken(XmileParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(XmileParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public FuncRefContext funcRef() {
			return getRuleContext(FuncRefContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XmileParser.SLASH, 0); }
		public TerminalNode AND() { return getToken(XmileParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(XmileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XmileParser.MINUS, 0); }
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode CARET() { return getToken(XmileParser.CARET, 0); }
		public TerminalNode NOTEQUAL() { return getToken(XmileParser.NOTEQUAL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitExpr(this);
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(15);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(16); expr(9);
				}
				break;
			case 2:
				{
				setState(17); arrayRef();
				}
				break;
			case 3:
				{
				setState(18); funcRef();
				}
				break;
			case 4:
				{
				setState(19); macroRef();
				}
				break;
			case 5:
				{
				setState(20); match(LPAREN);
				setState(21); expr(0);
				setState(22); match(RPAREN);
				}
				break;
			case 6:
				{
				setState(24); numLit();
				}
				break;
			case 7:
				{
				setState(25); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(48);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(28);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(29); match(CARET);
						setState(30); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(32);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(33); expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(35);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(36); expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(38);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTE) | (1L << LT) | (1L << GTE) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(39); expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(41); match(AND);
						setState(42); expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(44); match(OR);
						setState(45); expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(47);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ArrayRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(XmileParser.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(XmileParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(XmileParser.LBRACKET, 0); }
		public TerminalNode RPAREN() { return getToken(XmileParser.RPAREN, 0); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arrayRef);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(ID);
				setState(54); match(LBRACKET);
				setState(55); exprList();
				setState(56); match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(ID);
				setState(59); match(LPAREN);
				setState(60); exprList();
				setState(61); match(RPAREN);
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

	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode FNUM() { return getToken(XmileParser.FNUM, 0); }
		public TerminalNode INTEGER() { return getToken(XmileParser.INTEGER, 0); }
		public TerminalNode PLUS() { return getToken(XmileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XmileParser.MINUS, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitNumLit(this);
		}
	}

	public final NumLitContext numLit() throws RecognitionException {
		NumLitContext _localctx = new NumLitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(68);
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

	public static class FuncRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
		public TerminalNode DT() { return getToken(XmileParser.DT, 0); }
		public TerminalNode RPAREN() { return getToken(XmileParser.RPAREN, 0); }
		public FuncRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterFuncRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitFuncRef(this);
		}
	}

	public final FuncRefContext funcRef() throws RecognitionException {
		FuncRefContext _localctx = new FuncRefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcRef);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case MATHFUNC:
			case STATFUNC:
			case DLYFUNC:
			case TESTFUNC:
			case MISCFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); builtin();
				setState(71); match(LPAREN);
				setState(72); exprList();
				setState(73); match(RPAREN);
				}
				break;
			case DT:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(DT);
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

	public static class BuiltinContext extends ParserRuleContext {
		public TerminalNode STATFUNC() { return getToken(XmileParser.STATFUNC, 0); }
		public TerminalNode DLYFUNC() { return getToken(XmileParser.DLYFUNC, 0); }
		public TerminalNode MISCFUNC() { return getToken(XmileParser.MISCFUNC, 0); }
		public TerminalNode MATHFUNC() { return getToken(XmileParser.MATHFUNC, 0); }
		public TerminalNode TESTFUNC() { return getToken(XmileParser.TESTFUNC, 0); }
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterBuiltin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitBuiltin(this);
		}
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_builtin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATHFUNC) | (1L << STATFUNC) | (1L << DLYFUNC) | (1L << TESTFUNC) | (1L << MISCFUNC))) != 0)) ) {
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

	public static class MacroRefContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(XmileParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(XmileParser.RPAREN, 0); }
		public MacroRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterMacroRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitMacroRef(this);
		}
	}

	public final MacroRefContext macroRef() throws RecognitionException {
		MacroRefContext _localctx = new MacroRefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_macroRef);
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(ID);
				setState(82); match(LPAREN);
				setState(83); exprList();
				setState(84); match(RPAREN);
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
		public List<TerminalNode> COMMA() { return getTokens(XmileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(XmileParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); expr(0);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89); match(COMMA);
				setState(90); expr(0);
				}
				}
				setState(95);
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
		case 0: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 8);
		case 2: return precpred(_ctx, 7);
		case 3: return precpred(_ctx, 6);
		case 4: return precpred(_ctx, 4);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&c\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\63\n\2\f\2\16\2\66\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\5\4E\n\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7Y\n"+
		"\7\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b\2\3\2\t\2\4\6\b\n\f\16\2\t"+
		"\4\2\n\n\16\17\3\2\13\r\3\2\16\17\3\2\20\23\3\2\24\25\4\2\4\4!!\4\2\32"+
		"\35\37\37m\2\34\3\2\2\2\4A\3\2\2\2\6D\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\f"+
		"X\3\2\2\2\16Z\3\2\2\2\20\21\b\2\1\2\21\22\t\2\2\2\22\35\5\2\2\13\23\35"+
		"\5\4\3\2\24\35\5\b\5\2\25\35\5\f\7\2\26\27\7\7\2\2\27\30\5\2\2\2\30\31"+
		"\7\b\2\2\31\35\3\2\2\2\32\35\5\6\4\2\33\35\7 \2\2\34\20\3\2\2\2\34\23"+
		"\3\2\2\2\34\24\3\2\2\2\34\25\3\2\2\2\34\26\3\2\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\64\3\2\2\2\36\37\f\f\2\2\37 \7\t\2\2 \63\5\2\2\r!\"\f\n\2"+
		"\2\"#\t\3\2\2#\63\5\2\2\13$%\f\t\2\2%&\t\4\2\2&\63\5\2\2\n\'(\f\b\2\2"+
		"()\t\5\2\2)\63\5\2\2\t*+\f\6\2\2+,\7\26\2\2,\63\5\2\2\7-.\f\5\2\2./\7"+
		"\27\2\2/\63\5\2\2\6\60\61\f\7\2\2\61\63\t\6\2\2\62\36\3\2\2\2\62!\3\2"+
		"\2\2\62$\3\2\2\2\62\'\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\62\60\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3\3\2\2\2\66\64\3\2\2\2\67"+
		"8\7 \2\289\7\5\2\29:\5\16\b\2:;\7\6\2\2;B\3\2\2\2<=\7 \2\2=>\7\7\2\2>"+
		"?\5\16\b\2?@\7\b\2\2@B\3\2\2\2A\67\3\2\2\2A<\3\2\2\2B\5\3\2\2\2CE\t\4"+
		"\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\t\7\2\2G\7\3\2\2\2HI\5\n\6\2IJ\7"+
		"\7\2\2JK\5\16\b\2KL\7\b\2\2LO\3\2\2\2MO\7\31\2\2NH\3\2\2\2NM\3\2\2\2O"+
		"\t\3\2\2\2PQ\t\b\2\2Q\13\3\2\2\2RY\3\2\2\2ST\7 \2\2TU\7\7\2\2UV\5\16\b"+
		"\2VW\7\b\2\2WY\3\2\2\2XR\3\2\2\2XS\3\2\2\2Y\r\3\2\2\2Z_\5\2\2\2[\\\7$"+
		"\2\2\\^\5\2\2\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2a_"+
		"\3\2\2\2\n\34\62\64ADNX_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}