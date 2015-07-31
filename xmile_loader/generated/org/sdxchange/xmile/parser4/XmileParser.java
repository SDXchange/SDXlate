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
		FNUM=2, TESTFUNC=30, LT=15, DLYFUNC=29, TIMEFUNC=31, COMMENT=39, MINUS=13, 
		DT=26, MATHFUNC=27, ELSE=24, ID=33, WS=35, IF=22, RCURLY=38, INTEGER=34, 
		STATFUNC=28, COMMA=37, MOD=11, OR=21, MISCFUNC=32, EQUAL=18, LPAREN=5, 
		SLASH=10, DOT=36, LCURLY=1, LBRACKET=3, RBRACKET=4, RPAREN=6, CARET=7, 
		GT=17, NOTEQUAL=19, OTHER=25, NOT=8, STAR=9, AND=20, GTE=16, THEN=23, 
		LTE=14, PLUS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "LCURLY", "FNUM", "'['", "']'", "'('", "')'", "'^'", "'NOT'", 
		"'*'", "'/'", "'MOD'", "'+'", "'-'", "'<='", "'<'", "'>='", "'>'", "'='", 
		"'<>'", "'AND'", "'OR'", "'IF'", "'THEN'", "'ELSE'", "OTHER", "'DT'", 
		"MATHFUNC", "STATFUNC", "DLYFUNC", "TESTFUNC", "TIMEFUNC", "MISCFUNC", 
		"ID", "INTEGER", "WS", "'.'", "','", "RCURLY", "COMMENT"
	};
	public static final int
		RULE_expr = 0, RULE_arrayRef = 1, RULE_ifExpr = 2, RULE_numLit = 3, RULE_funcRef = 4, 
		RULE_builtin = 5, RULE_macroRef = 6, RULE_exprList = 7;
	public static final String[] ruleNames = {
		"expr", "arrayRef", "ifExpr", "numLit", "funcRef", "builtin", "macroRef", 
		"exprList"
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
		public TerminalNode GTE() { return getToken(XmileParser.GTE, 0); }
		public TerminalNode STAR() { return getToken(XmileParser.STAR, 0); }
		public TerminalNode LTE() { return getToken(XmileParser.LTE, 0); }
		public TerminalNode NOT() { return getToken(XmileParser.NOT, 0); }
		public TerminalNode ID() { return getToken(XmileParser.ID, 0); }
		public FuncRefContext funcRef() {
			return getRuleContext(FuncRefContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public TerminalNode AND() { return getToken(XmileParser.AND, 0); }
		public TerminalNode NOTEQUAL() { return getToken(XmileParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(XmileParser.LT, 0); }
		public TerminalNode GT() { return getToken(XmileParser.GT, 0); }
		public TerminalNode RPAREN() { return getToken(XmileParser.RPAREN, 0); }
		public TerminalNode MOD() { return getToken(XmileParser.MOD, 0); }
		public TerminalNode OR() { return getToken(XmileParser.OR, 0); }
		public MacroRefContext macroRef() {
			return getRuleContext(MacroRefContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(XmileParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XmileParser.SLASH, 0); }
		public TerminalNode PLUS() { return getToken(XmileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(XmileParser.MINUS, 0); }
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode CARET() { return getToken(XmileParser.CARET, 0); }
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
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(17);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(18); expr(9);
				}
				break;
			case 2:
				{
				setState(19); arrayRef();
				}
				break;
			case 3:
				{
				setState(20); ifExpr();
				}
				break;
			case 4:
				{
				setState(21); funcRef();
				}
				break;
			case 5:
				{
				setState(22); macroRef();
				}
				break;
			case 6:
				{
				setState(23); match(LPAREN);
				setState(24); expr(0);
				setState(25); match(RPAREN);
				}
				break;
			case 7:
				{
				setState(27); numLit();
				}
				break;
			case 8:
				{
				setState(28); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(51);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(32); match(CARET);
						setState(33); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(35);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(36); expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(37);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(38);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(39); expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(41);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTE) | (1L << LT) | (1L << GTE) | (1L << GT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(42); expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44); match(AND);
						setState(45); expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(46);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(47); match(OR);
						setState(48); expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(49);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(50);
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
				setState(55);
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
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(ID);
				setState(57); match(LBRACKET);
				setState(58); exprList();
				setState(59); match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(ID);
				setState(62); match(LPAREN);
				setState(63); exprList();
				setState(64); match(RPAREN);
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

	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(XmileParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(XmileParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(XmileParser.THEN, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XmileParserListener ) ((XmileParserListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifExpr);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); match(IF);
				setState(70); expr(0);
				setState(71); match(THEN);
				setState(72); expr(0);
				setState(73); match(ELSE);
				setState(74); expr(0);
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
		enterRule(_localctx, 6, RULE_numLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(81);
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
		public TerminalNode TIMEFUNC() { return getToken(XmileParser.TIMEFUNC, 0); }
		public TerminalNode LPAREN() { return getToken(XmileParser.LPAREN, 0); }
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
		enterRule(_localctx, 8, RULE_funcRef);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); match(TIMEFUNC);
				setState(84); match(LPAREN);
				setState(85); match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(TIMEFUNC);
				{
				setState(87); match(LPAREN);
				setState(88); exprList();
				setState(89); match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); match(TIMEFUNC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92); builtin();
				setState(93); match(LPAREN);
				setState(94); exprList();
				setState(95); match(RPAREN);
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
		enterRule(_localctx, 10, RULE_builtin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 12, RULE_macroRef);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(ID);
				setState(103); match(LPAREN);
				setState(104); exprList();
				setState(105); match(RPAREN);
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
		enterRule(_localctx, 14, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); expr(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110); match(COMMA);
				setState(111); expr(0);
				}
				}
				setState(116);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\66\n\2\f\2\16\2"+
		"9\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\5\5R\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6d\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bn\n\b\3\t\3\t\3\t\7\ts\n\t\f\t\16\tv\13\t\3\t\2\3\2\n\2\4\6"+
		"\b\n\f\16\20\2\t\4\2\n\n\16\17\3\2\13\r\3\2\16\17\3\2\20\23\3\2\24\25"+
		"\4\2\4\4$$\4\2\35 \"\"\u0085\2\37\3\2\2\2\4D\3\2\2\2\6N\3\2\2\2\bQ\3\2"+
		"\2\2\nc\3\2\2\2\fe\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22\23\b\2\1\2\23\24"+
		"\t\2\2\2\24 \5\2\2\13\25 \5\4\3\2\26 \5\6\4\2\27 \5\n\6\2\30 \5\16\b\2"+
		"\31\32\7\7\2\2\32\33\5\2\2\2\33\34\7\b\2\2\34 \3\2\2\2\35 \5\b\5\2\36"+
		" \7#\2\2\37\22\3\2\2\2\37\25\3\2\2\2\37\26\3\2\2\2\37\27\3\2\2\2\37\30"+
		"\3\2\2\2\37\31\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \67\3\2\2\2!\"\f\f"+
		"\2\2\"#\7\t\2\2#\66\5\2\2\r$%\f\n\2\2%&\t\3\2\2&\66\5\2\2\13\'(\f\t\2"+
		"\2()\t\4\2\2)\66\5\2\2\n*+\f\b\2\2+,\t\5\2\2,\66\5\2\2\t-.\f\6\2\2./\7"+
		"\26\2\2/\66\5\2\2\7\60\61\f\5\2\2\61\62\7\27\2\2\62\66\5\2\2\6\63\64\f"+
		"\7\2\2\64\66\t\6\2\2\65!\3\2\2\2\65$\3\2\2\2\65\'\3\2\2\2\65*\3\2\2\2"+
		"\65-\3\2\2\2\65\60\3\2\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28\3\3\2\2\29\67\3\2\2\2:;\7#\2\2;<\7\5\2\2<=\5\20\t\2=>\7\6\2"+
		"\2>E\3\2\2\2?@\7#\2\2@A\7\7\2\2AB\5\20\t\2BC\7\b\2\2CE\3\2\2\2D:\3\2\2"+
		"\2D?\3\2\2\2E\5\3\2\2\2FO\3\2\2\2GH\7\30\2\2HI\5\2\2\2IJ\7\31\2\2JK\5"+
		"\2\2\2KL\7\32\2\2LM\5\2\2\2MO\3\2\2\2NF\3\2\2\2NG\3\2\2\2O\7\3\2\2\2P"+
		"R\t\4\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\t\7\2\2T\t\3\2\2\2UV\7!\2\2"+
		"VW\7\7\2\2Wd\7\b\2\2XY\7!\2\2YZ\7\7\2\2Z[\5\20\t\2[\\\7\b\2\2\\d\3\2\2"+
		"\2]d\7!\2\2^_\5\f\7\2_`\7\7\2\2`a\5\20\t\2ab\7\b\2\2bd\3\2\2\2cU\3\2\2"+
		"\2cX\3\2\2\2c]\3\2\2\2c^\3\2\2\2d\13\3\2\2\2ef\t\b\2\2f\r\3\2\2\2gn\3"+
		"\2\2\2hi\7#\2\2ij\7\7\2\2jk\5\20\t\2kl\7\b\2\2ln\3\2\2\2mg\3\2\2\2mh\3"+
		"\2\2\2n\17\3\2\2\2ot\5\2\2\2pq\7\'\2\2qs\5\2\2\2rp\3\2\2\2sv\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2\13\37\65\67DNQcmt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}