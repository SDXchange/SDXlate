// Generated from DynamoLexer.g4 by ANTLR 4.4

package org.sdxchange.dynamo.parser4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DynamoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, CONTINUATION=2, AUXCARD=3, CONSTCARD=4, LVLCARD=5, RATECARD=6, 
		INITCARD=7, TBLCARD=8, INDEXCARD=9, FORCARD=10, SPECCARD=11, NOTECARD=12, 
		RUNCARD=13, PLOTCARD=14, PRINTCARD=15, MACROCARD=16, MENDCARD=17, INTRNCARD=18, 
		STARCARD=19, CONTINUATION2=20, ENDCARD=21, ENDEQN=22, FNUM=23, LPAREN=24, 
		RPAREN=25, LBRACKET=26, RBRACKET=27, STAR=28, CARET=29, PLUS=30, MINUS=31, 
		SLASH=32, EQUAL=33, LT=34, GT=35, OTHER=36, DT=37, LENGTH=38, PLTPER=39, 
		PRTPER=40, MAXLEN=41, BUILTIN=42, TABFUNC=43, JKL=44, ID=45, INTEGER=46, 
		WS=47, DOT=48, COMMA=49, COMMENT=50, ENDCMT=51;
	public static final int EQNMODE = 1;
	public static final int CMTMODE = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "EQNMODE", "CMTMODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'"
	};
	public static final String[] ruleNames = {
		"NEWLINE", "CONTINUATION", "AUXCARD", "CONSTCARD", "LVLCARD", "RATECARD", 
		"INITCARD", "TBLCARD", "INDEXCARD", "FORCARD", "SPECCARD", "NOTECARD", 
		"RUNCARD", "PLOTCARD", "PRINTCARD", "MACROCARD", "MENDCARD", "INTRNCARD", 
		"STARCARD", "CONTINUATION2", "ENDCARD", "ENDEQN", "FNUM", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "STAR", "CARET", "PLUS", "MINUS", "SLASH", "EQUAL", 
		"LT", "GT", "OTHER", "DT", "LENGTH", "PLTPER", "PRTPER", "MAXLEN", "BUILTIN", 
		"TABFUNC", "JKL", "ID", "INTEGER", "WS", "DOT", "COMMA", "COMMENT", "ENDCMT"
	};


	public DynamoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DynamoLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0237\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\3\2\5\2m\n\2\3\2\6\2p\n\2\r\2\16\2q\3\3\5\3u\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\177\n\4\r\4\16\4\u0080\3\4\3\4\3\5\3\5"+
		"\6\5\u0087\n\5\r\5\16\5\u0088\3\5\3\5\3\6\3\6\6\6\u008f\n\6\r\6\16\6\u0090"+
		"\3\6\3\6\3\7\3\7\6\7\u0097\n\7\r\7\16\7\u0098\3\7\3\7\3\b\3\b\6\b\u009f"+
		"\n\b\r\b\16\b\u00a0\3\b\3\b\3\t\3\t\6\t\u00a7\n\t\r\t\16\t\u00a8\3\t\3"+
		"\t\3\n\3\n\6\n\u00af\n\n\r\n\16\n\u00b0\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\6\13\u00ba\n\13\r\13\16\13\u00bb\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\6\f\u00c6\n\f\r\f\16\f\u00c7\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00db\n\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\6\17\u00e5\n\17\r\17\16\17\u00e6\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00f2\n\20\r\20\16\20\u00f3\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00ff\n\21\r\21\16\21\u0100"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010b\n\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0116\n\23\r\23\16\23\u0117\3\23\3"+
		"\23\3\24\3\24\5\24\u011e\n\24\3\24\3\24\3\25\5\25\u0123\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\5\26\u012c\n\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\7\30\u0137\n\30\f\30\16\30\u013a\13\30\3\30\5\30\u013d"+
		"\n\30\3\30\6\30\u0140\n\30\r\30\16\30\u0141\3\30\3\30\5\30\u0146\n\30"+
		"\3\30\6\30\u0149\n\30\r\30\16\30\u014a\3\30\7\30\u014e\n\30\f\30\16\30"+
		"\u0151\13\30\3\30\3\30\3\30\6\30\u0156\n\30\r\30\16\30\u0157\5\30\u015a"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\5+\u01f5\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u020b\n,\3-\3-\5-\u020f\n-\3-\3-\5-\u0213\n-\5"+
		"-\u0215\n-\3.\3.\7.\u0219\n.\f.\16.\u021c\13.\3/\6/\u021f\n/\r/\16/\u0220"+
		"\3\60\6\60\u0224\n\60\r\60\16\60\u0225\3\61\3\61\3\62\3\62\3\63\6\63\u022d"+
		"\n\63\r\63\16\63\u022e\3\64\5\64\u0232\n\64\3\64\3\64\3\64\3\64\2\2\65"+
		"\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65\5\2\3\4\t\4"+
		"\2GGgg\4\2--//\6\2##%%\'\'<<\4\2C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\u0270\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3"+
		"\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2"+
		"\3;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2\3A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G"+
		"\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2"+
		"\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2"+
		"\3a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\5o\3\2\2\2\7t"+
		"\3\2\2\2\t|\3\2\2\2\13\u0084\3\2\2\2\r\u008c\3\2\2\2\17\u0094\3\2\2\2"+
		"\21\u009c\3\2\2\2\23\u00a4\3\2\2\2\25\u00ac\3\2\2\2\27\u00b4\3\2\2\2\31"+
		"\u00bf\3\2\2\2\33\u00cb\3\2\2\2\35\u00d5\3\2\2\2\37\u00de\3\2\2\2!\u00ea"+
		"\3\2\2\2#\u00f7\3\2\2\2%\u0104\3\2\2\2\'\u010e\3\2\2\2)\u011b\3\2\2\2"+
		"+\u0122\3\2\2\2-\u012b\3\2\2\2/\u0131\3\2\2\2\61\u0159\3\2\2\2\63\u015b"+
		"\3\2\2\2\65\u015d\3\2\2\2\67\u015f\3\2\2\29\u0161\3\2\2\2;\u0163\3\2\2"+
		"\2=\u0165\3\2\2\2?\u0167\3\2\2\2A\u0169\3\2\2\2C\u016b\3\2\2\2E\u016d"+
		"\3\2\2\2G\u016f\3\2\2\2I\u0171\3\2\2\2K\u0173\3\2\2\2M\u0175\3\2\2\2O"+
		"\u0178\3\2\2\2Q\u017f\3\2\2\2S\u0186\3\2\2\2U\u018d\3\2\2\2W\u01f4\3\2"+
		"\2\2Y\u020a\3\2\2\2[\u0214\3\2\2\2]\u0216\3\2\2\2_\u021e\3\2\2\2a\u0223"+
		"\3\2\2\2c\u0227\3\2\2\2e\u0229\3\2\2\2g\u022c\3\2\2\2i\u0231\3\2\2\2k"+
		"m\7\17\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\f\2\2ol\3\2\2\2pq\3\2\2\2"+
		"qo\3\2\2\2qr\3\2\2\2r\6\3\2\2\2su\5a\60\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2"+
		"\2vw\5\5\2\2wx\7Z\2\2xy\5a\60\2yz\3\2\2\2z{\b\3\2\2{\b\3\2\2\2|~\7C\2"+
		"\2}\177\5a\60\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\4\3\2\u0083\n\3\2\2\2\u0084"+
		"\u0086\7E\2\2\u0085\u0087\5a\60\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\5\3\2\u008b\f\3\2\2\2\u008c\u008e\7N\2\2\u008d\u008f\5a\60\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\6\3\2\u0093\16\3\2\2\2\u0094"+
		"\u0096\7T\2\2\u0095\u0097\5a\60\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\7\3\2\u009b\20\3\2\2\2\u009c\u009e\7P\2\2\u009d\u009f\5a\60\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\b\3\2\u00a3\22\3\2\2\2\u00a4"+
		"\u00a6\7V\2\2\u00a5\u00a7\5a\60\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\t\3\2\u00ab\24\3\2\2\2\u00ac\u00ae\7K\2\2\u00ad\u00af\5a\60\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\n\3\2\u00b3\26\3\2\2\2\u00b4"+
		"\u00b5\7H\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b9\3\2\2"+
		"\2\u00b8\u00ba\5a\60\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\13\3\2"+
		"\u00be\30\3\2\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7"+
		"G\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\5a\60\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\f\3\2\u00ca\32\3\2\2\2\u00cb\u00cc"+
		"\7P\2\2\u00cc\u00cd\7Q\2\2\u00cd\u00ce\7V\2\2\u00ce\u00cf\7G\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00d2\5a\60\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\r\4\2\u00d4\34\3\2\2\2\u00d5\u00d6"+
		"\7T\2\2\u00d6\u00d7\7W\2\2\u00d7\u00d8\7P\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00db\5a\60\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\16\4\2\u00dd\36\3\2\2\2\u00de\u00df\7R\2\2\u00df\u00e0"+
		"\7N\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7V\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e5\5a\60\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\17\3\2\u00e9"+
		" \3\2\2\2\u00ea\u00eb\7R\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7K\2\2\u00ed"+
		"\u00ee\7P\2\2\u00ee\u00ef\7V\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5a\60"+
		"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\20\3\2\u00f6\"\3\2\2\2\u00f7"+
		"\u00f8\7O\2\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7T\2\2"+
		"\u00fb\u00fc\7Q\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5a\60\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\b\21\3\2\u0103$\3\2\2\2\u0104\u0105\7O\2\2"+
		"\u0105\u0106\7G\2\2\u0106\u0107\7P\2\2\u0107\u0108\7F\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u010b\5a\60\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\b\22\4\2\u010d&\3\2\2\2\u010e\u010f\7K\2\2"+
		"\u010f\u0110\7P\2\2\u0110\u0111\7V\2\2\u0111\u0112\7T\2\2\u0112\u0113"+
		"\7P\2\2\u0113\u0115\3\2\2\2\u0114\u0116\5a\60\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\b\23\3\2\u011a(\3\2\2\2\u011b\u011d\7,\2\2\u011c\u011e"+
		"\5a\60\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\b\24\4\2\u0120*\3\2\2\2\u0121\u0123\5a\60\2\u0122\u0121\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5\5\2\2\u0125\u0126"+
		"\7Z\2\2\u0126\u0127\5a\60\2\u0127\u0128\3\2\2\2\u0128\u0129\b\25\2\2\u0129"+
		",\3\2\2\2\u012a\u012c\5a\60\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\5\5\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\b\26\5\2\u0130.\3\2\2\2\u0131\u0132\5a\60\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b\27\4\2\u0134\60\3\2\2\2\u0135\u0137\4\62;\2\u0136\u0135\3\2\2"+
		"\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\60\2\2\u013c\u0138\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\4\62;\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\t\2\2\2\u0144\u0146\t\3\2\2\u0145\u0144\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\4\62;\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u015a\3\2\2\2\u014c\u014e\4\62;\2\u014d\u014c\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\60\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0156\4\62;\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u013c\3\2\2\2\u0159"+
		"\u014f\3\2\2\2\u015a\62\3\2\2\2\u015b\u015c\7*\2\2\u015c\64\3\2\2\2\u015d"+
		"\u015e\7+\2\2\u015e\66\3\2\2\2\u015f\u0160\7]\2\2\u01608\3\2\2\2\u0161"+
		"\u0162\7_\2\2\u0162:\3\2\2\2\u0163\u0164\7,\2\2\u0164<\3\2\2\2\u0165\u0166"+
		"\7`\2\2\u0166>\3\2\2\2\u0167\u0168\7-\2\2\u0168@\3\2\2\2\u0169\u016a\7"+
		"/\2\2\u016aB\3\2\2\2\u016b\u016c\7\61\2\2\u016cD\3\2\2\2\u016d\u016e\7"+
		"?\2\2\u016eF\3\2\2\2\u016f\u0170\7>\2\2\u0170H\3\2\2\2\u0171\u0172\7@"+
		"\2\2\u0172J\3\2\2\2\u0173\u0174\t\4\2\2\u0174L\3\2\2\2\u0175\u0176\7F"+
		"\2\2\u0176\u0177\7V\2\2\u0177N\3\2\2\2\u0178\u0179\7N\2\2\u0179\u017a"+
		"\7G\2\2\u017a\u017b\7P\2\2\u017b\u017c\7I\2\2\u017c\u017d\7V\2\2\u017d"+
		"\u017e\7J\2\2\u017eP\3\2\2\2\u017f\u0180\7R\2\2\u0180\u0181\7N\2\2\u0181"+
		"\u0182\7V\2\2\u0182\u0183\7R\2\2\u0183\u0184\7G\2\2\u0184\u0185\7T\2\2"+
		"\u0185R\3\2\2\2\u0186\u0187\7R\2\2\u0187\u0188\7T\2\2\u0188\u0189\7V\2"+
		"\2\u0189\u018a\7R\2\2\u018a\u018b\7G\2\2\u018b\u018c\7T\2\2\u018cT\3\2"+
		"\2\2\u018d\u018e\7O\2\2\u018e\u018f\7C\2\2\u018f\u0190\7Z\2\2\u0190\u0191"+
		"\7N\2\2\u0191\u0192\7G\2\2\u0192\u0193\7P\2\2\u0193V\3\2\2\2\u0194\u0195"+
		"\7U\2\2\u0195\u0196\7S\2\2\u0196\u0197\7T\2\2\u0197\u01f5\7V\2\2\u0198"+
		"\u0199\7F\2\2\u0199\u019a\7G\2\2\u019a\u019b\7N\2\2\u019b\u019c\7C\2\2"+
		"\u019c\u019d\7[\2\2\u019d\u01f5\7\63\2\2\u019e\u019f\7F\2\2\u019f\u01a0"+
		"\7G\2\2\u01a0\u01a1\7N\2\2\u01a1\u01a2\7C\2\2\u01a2\u01a3\7[\2\2\u01a3"+
		"\u01f5\7\65\2\2\u01a4\u01a5\7U\2\2\u01a5\u01a6\7K\2\2\u01a6\u01f5\7P\2"+
		"\2\u01a7\u01a8\7E\2\2\u01a8\u01a9\7Q\2\2\u01a9\u01f5\7U\2\2\u01aa\u01ab"+
		"\7G\2\2\u01ab\u01ac\7Z\2\2\u01ac\u01f5\7R\2\2\u01ad\u01ae\7O\2\2\u01ae"+
		"\u01af\7C\2\2\u01af\u01f5\7Z\2\2\u01b0\u01b1\7O\2\2\u01b1\u01b2\7K\2\2"+
		"\u01b2\u01f5\7P\2\2\u01b3\u01b4\7U\2\2\u01b4\u01b5\7V\2\2\u01b5\u01b6"+
		"\7G\2\2\u01b6\u01f5\7R\2\2\u01b7\u01b8\7T\2\2\u01b8\u01b9\7C\2\2\u01b9"+
		"\u01ba\7O\2\2\u01ba\u01f5\7R\2\2\u01bb\u01bc\7R\2\2\u01bc\u01bd\7W\2\2"+
		"\u01bd\u01be\7N\2\2\u01be\u01bf\7U\2\2\u01bf\u01f5\7G\2\2\u01c0\u01c1"+
		"\7U\2\2\u01c1\u01c2\7O\2\2\u01c2\u01c3\7Q\2\2\u01c3\u01c4\7Q\2\2\u01c4"+
		"\u01c5\7V\2\2\u01c5\u01f5\7J\2\2\u01c6\u01c7\7N\2\2\u01c7\u01c8\7Q\2\2"+
		"\u01c8\u01c9\7I\2\2\u01c9\u01f5\7P\2\2\u01ca\u01cb\7E\2\2\u01cb\u01cc"+
		"\7N\2\2\u01cc\u01cd\7K\2\2\u01cd\u01f5\7R\2\2\u01ce\u01cf\7U\2\2\u01cf"+
		"\u01d0\7Y\2\2\u01d0\u01d1\7K\2\2\u01d1\u01d2\7V\2\2\u01d2\u01d3\7E\2\2"+
		"\u01d3\u01f5\7J\2\2\u01d4\u01d5\7P\2\2\u01d5\u01d6\7Q\2\2\u01d6\u01d7"+
		"\7K\2\2\u01d7\u01d8\7U\2\2\u01d8\u01f5\7G\2\2\u01d9\u01da\7F\2\2\u01da"+
		"\u01db\7G\2\2\u01db\u01dc\7N\2\2\u01dc\u01dd\7C\2\2\u01dd\u01de\7[\2\2"+
		"\u01de\u01f5\7R\2\2\u01df\u01e0\7F\2\2\u01e0\u01e1\7N\2\2\u01e1\u01e2"+
		"\7K\2\2\u01e2\u01e3\7P\2\2\u01e3\u01e4\7H\2\2\u01e4\u01f5\7\65\2\2\u01e5"+
		"\u01e6\7K\2\2\u01e6\u01e7\7H\2\2\u01e7\u01e8\7a\2\2\u01e8\u01e9\7V\2\2"+
		"\u01e9\u01ea\7J\2\2\u01ea\u01eb\7G\2\2\u01eb\u01ec\7P\2\2\u01ec\u01ed"+
		"\7a\2\2\u01ed\u01ee\7G\2\2\u01ee\u01ef\7N\2\2\u01ef\u01f0\7U\2\2\u01f0"+
		"\u01f5\7G\2\2\u01f1\u01f2\7U\2\2\u01f2\u01f3\7W\2\2\u01f3\u01f5\7O\2\2"+
		"\u01f4\u0194\3\2\2\2\u01f4\u0198\3\2\2\2\u01f4\u019e\3\2\2\2\u01f4\u01a4"+
		"\3\2\2\2\u01f4\u01a7\3\2\2\2\u01f4\u01aa\3\2\2\2\u01f4\u01ad\3\2\2\2\u01f4"+
		"\u01b0\3\2\2\2\u01f4\u01b3\3\2\2\2\u01f4\u01b7\3\2\2\2\u01f4\u01bb\3\2"+
		"\2\2\u01f4\u01c0\3\2\2\2\u01f4\u01c6\3\2\2\2\u01f4\u01ca\3\2\2\2\u01f4"+
		"\u01ce\3\2\2\2\u01f4\u01d4\3\2\2\2\u01f4\u01d9\3\2\2\2\u01f4\u01df\3\2"+
		"\2\2\u01f4\u01e5\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5X\3\2\2\2\u01f6\u01f7"+
		"\7V\2\2\u01f7\u01f8\7C\2\2\u01f8\u01f9\7D\2\2\u01f9\u01fa\7N\2\2\u01fa"+
		"\u020b\7G\2\2\u01fb\u01fc\7V\2\2\u01fc\u01fd\7C\2\2\u01fd\u01fe\7D\2\2"+
		"\u01fe\u01ff\7J\2\2\u01ff\u020b\7N\2\2\u0200\u0201\7V\2\2\u0201\u0202"+
		"\7C\2\2\u0202\u0203\7D\2\2\u0203\u0204\7Z\2\2\u0204\u020b\7V\2\2\u0205"+
		"\u0206\7V\2\2\u0206\u0207\7C\2\2\u0207\u0208\7D\2\2\u0208\u0209\7R\2\2"+
		"\u0209\u020b\7N\2\2\u020a\u01f6\3\2\2\2\u020a\u01fb\3\2\2\2\u020a\u0200"+
		"\3\2\2\2\u020a\u0205\3\2\2\2\u020bZ\3\2\2\2\u020c\u020e\7M\2\2\u020d\u020f"+
		"\7N\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0215\3\2\2\2\u0210"+
		"\u0212\7L\2\2\u0211\u0213\7M\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2"+
		"\2\u0213\u0215\3\2\2\2\u0214\u020c\3\2\2\2\u0214\u0210\3\2\2\2\u0215\\"+
		"\3\2\2\2\u0216\u021a\t\5\2\2\u0217\u0219\t\6\2\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b^\3\2\2\2"+
		"\u021c\u021a\3\2\2\2\u021d\u021f\4\62;\2\u021e\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221`\3\2\2\2\u0222"+
		"\u0224\t\7\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226b\3\2\2\2\u0227\u0228\7\60\2\2\u0228d\3"+
		"\2\2\2\u0229\u022a\7.\2\2\u022af\3\2\2\2\u022b\u022d\n\b\2\2\u022c\u022b"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"h\3\2\2\2\u0230\u0232\5a\60\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2"+
		"\u0232\u0233\3\2\2\2\u0233\u0234\5\5\2\2\u0234\u0235\3\2\2\2\u0235\u0236"+
		"\b\64\5\2\u0236j\3\2\2\2-\2\3\4lqt\u0080\u0088\u0090\u0098\u00a0\u00a8"+
		"\u00b0\u00bb\u00c7\u00d1\u00da\u00e6\u00f3\u0100\u010a\u0117\u011d\u0122"+
		"\u012b\u0138\u013c\u0141\u0145\u014a\u014f\u0157\u0159\u01f4\u020a\u020e"+
		"\u0212\u0214\u021a\u0220\u0225\u022e\u0231\6\b\2\2\4\3\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}