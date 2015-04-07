// $ANTLR 3.5.2 ./Pred.g 2015-01-24 15:50:31

	package examples;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PredLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int COMMENT=4;
	public static final int C_MARK=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int MARK=8;
	public static final int NEWLINE=9;
	public static final int P_MARK=10;
	public static final int WS=11;

		public int lexField = 0;

		

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PredLexer() {} 
	public PredLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PredLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "./Pred.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:11:7: ( '(' )
			// ./Pred.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:12:7: ( ')' )
			// ./Pred.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:13:7: ( '*' )
			// ./Pred.g:13:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:14:7: ( '+' )
			// ./Pred.g:14:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:15:7: ( '-' )
			// ./Pred.g:15:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:16:7: ( '=' )
			// ./Pred.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "MARK"
	public final void mMARK() throws RecognitionException {
		try {
			int _type = MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:55:6: ({...}? 'C' |{...}? 'P' |{...}? 'MEMO' )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 'C':
				{
				alt1=1;
				}
				break;
			case 'P':
				{
				alt1=2;
				}
				break;
			case 'M':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// ./Pred.g:55:8: {...}? 'C'
					{
					if ( !((getCharPositionInLine() == 0)) ) {
						throw new FailedPredicateException(input, "MARK", "getCharPositionInLine() == 0");
					}
					match('C'); 
					}
					break;
				case 2 :
					// ./Pred.g:56:4: {...}? 'P'
					{
					if ( !((getCharPositionInLine() == 0)) ) {
						throw new FailedPredicateException(input, "MARK", "getCharPositionInLine() == 0");
					}
					match('P'); 
					}
					break;
				case 3 :
					// ./Pred.g:57:4: {...}? 'MEMO'
					{
					if ( !((getCharPositionInLine() == 0)) ) {
						throw new FailedPredicateException(input, "MARK", "getCharPositionInLine() == 0");
					}
					match("MEMO"); 

					lexField = 2; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARK"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:60:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// ./Pred.g:60:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// ./Pred.g:60:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ./Pred.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:62:5: ( ( '0' .. '9' )+ )
			// ./Pred.g:62:9: ( '0' .. '9' )+
			{
			// ./Pred.g:62:9: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./Pred.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:63:8: ( ( '\\r' )? '\\n' )
			// ./Pred.g:63:9: ( '\\r' )? '\\n'
			{
			// ./Pred.g:63:9: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ./Pred.g:63:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			lexField = 0; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:64:5: ( ( ' ' | '\\t' )+ )
			// ./Pred.g:64:9: ( ' ' | '\\t' )+
			{
			// ./Pred.g:64:9: ( ' ' | '\\t' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\t'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./Pred.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 lexField +=1 ; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Pred.g:65:8: ({...}? => (~ '\\n' )* )
			// ./Pred.g:65:10: {...}? => (~ '\\n' )*
			{
			if ( !((lexField >= 2)) ) {
				throw new FailedPredicateException(input, "COMMENT", "lexField >= 2");
			}
			// ./Pred.g:65:29: (~ '\\n' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ./Pred.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// ./Pred.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | MARK | ID | INT | NEWLINE | WS | COMMENT )
		int alt7=12;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// ./Pred.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// ./Pred.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// ./Pred.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// ./Pred.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// ./Pred.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// ./Pred.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// ./Pred.g:1:46: MARK
				{
				mMARK(); 

				}
				break;
			case 8 :
				// ./Pred.g:1:51: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// ./Pred.g:1:54: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// ./Pred.g:1:58: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 11 :
				// ./Pred.g:1:66: WS
				{
				mWS(); 

				}
				break;
			case 12 :
				// ./Pred.g:1:69: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\31\1\32\1\33\1\17\1\uffff"+
		"\1\34\11\uffff\1\46\14\uffff\1\52\3\uffff\1\53\2\uffff";
	static final String DFA7_eofS =
		"\54\uffff";
	static final String DFA7_minS =
		"\1\11\13\0\1\12\1\uffff\1\0\1\uffff\15\0\10\uffff\2\0\2\uffff\3\0";
	static final String DFA7_maxS =
		"\1\172\13\uffff\1\12\1\uffff\1\uffff\1\uffff\10\0\1\uffff\4\0\10\uffff"+
		"\1\uffff\1\0\2\uffff\1\uffff\2\0";
	static final String DFA7_acceptS =
		"\15\uffff\1\12\1\uffff\1\14\15\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
		"\2\uffff\1\11\1\13\3\uffff";
	static final String DFA7_specialS =
		"\1\26\1\32\1\1\1\22\1\25\1\24\1\31\1\3\1\2\1\14\1\17\1\34\1\33\1\uffff"+
		"\1\0\1\uffff\1\27\1\20\1\21\1\15\1\16\1\12\1\36\1\37\1\13\1\7\1\6\1\10"+
		"\1\23\10\uffff\1\11\1\5\2\uffff\1\30\1\4\1\35}>";
	static final String[] DFA7_transitionS = {
			"\1\16\1\15\2\uffff\1\14\22\uffff\1\16\7\uffff\1\1\1\2\1\3\1\4\1\uffff"+
			"\1\5\2\uffff\12\13\3\uffff\1\6\3\uffff\2\12\1\7\11\12\1\11\2\12\1\10"+
			"\12\12\6\uffff\32\12",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\ufff5\17",
			"\12\17\1\uffff\66\17\32\12\6\17\32\12\uff85\17",
			"\12\17\1\uffff\66\17\32\12\6\17\32\12\uff85\17",
			"\12\17\1\uffff\66\17\4\12\1\30\25\12\6\17\32\12\uff85\17",
			"\12\17\1\uffff\66\17\32\12\6\17\32\12\uff85\17",
			"\12\17\1\uffff\45\17\12\13\uffc6\17",
			"\1\15",
			"",
			"\11\17\1\16\1\uffff\25\17\1\16\uffdf\17",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\12\17\1\uffff\66\17\14\12\1\45\15\12\6\17\32\12\uff85\17",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\17\1\uffff\66\17\16\12\1\51\13\12\6\17\32\12\uff85\17",
			"\1\uffff",
			"",
			"",
			"\12\17\1\uffff\66\17\32\12\6\17\32\12\uff85\17",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | MARK | ID | INT | NEWLINE | WS | COMMENT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_14 = input.LA(1);
						 
						int index7_14 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_14=='\t'||LA7_14==' ') ) {s = 14;}
						else if ( ((LA7_14 >= '\u0000' && LA7_14 <= '\b')||(LA7_14 >= '\u000B' && LA7_14 <= '\u001F')||(LA7_14 >= '!' && LA7_14 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 28;
						 
						input.seek(index7_14);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_2 = input.LA(1);
						 
						int index7_2 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_2 >= '\u0000' && LA7_2 <= '\t')||(LA7_2 >= '\u000B' && LA7_2 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 17;
						 
						input.seek(index7_2);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA7_8 = input.LA(1);
						 
						int index7_8 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_8 >= 'A' && LA7_8 <= 'Z')||(LA7_8 >= 'a' && LA7_8 <= 'z')) ) {s = 10;}
						else if ( ((LA7_8 >= '\u0000' && LA7_8 <= '\t')||(LA7_8 >= '\u000B' && LA7_8 <= '@')||(LA7_8 >= '[' && LA7_8 <= '`')||(LA7_8 >= '{' && LA7_8 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 23;
						 
						input.seek(index7_8);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA7_7 = input.LA(1);
						 
						int index7_7 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_7 >= 'A' && LA7_7 <= 'Z')||(LA7_7 >= 'a' && LA7_7 <= 'z')) ) {s = 10;}
						else if ( ((LA7_7 >= '\u0000' && LA7_7 <= '\t')||(LA7_7 >= '\u000B' && LA7_7 <= '@')||(LA7_7 >= '[' && LA7_7 <= '`')||(LA7_7 >= '{' && LA7_7 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 22;
						 
						input.seek(index7_7);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA7_42 = input.LA(1);
						 
						int index7_42 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_42);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA7_38 = input.LA(1);
						 
						int index7_38 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_38);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA7_26 = input.LA(1);
						 
						int index7_26 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_26);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA7_25 = input.LA(1);
						 
						int index7_25 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_25);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA7_27 = input.LA(1);
						 
						int index7_27 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 39;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_27);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA7_37 = input.LA(1);
						 
						int index7_37 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_37=='O') ) {s = 41;}
						else if ( ((LA7_37 >= 'A' && LA7_37 <= 'N')||(LA7_37 >= 'P' && LA7_37 <= 'Z')||(LA7_37 >= 'a' && LA7_37 <= 'z')) ) {s = 10;}
						else if ( ((LA7_37 >= '\u0000' && LA7_37 <= '\t')||(LA7_37 >= '\u000B' && LA7_37 <= '@')||(LA7_37 >= '[' && LA7_37 <= '`')||(LA7_37 >= '{' && LA7_37 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 42;
						 
						input.seek(index7_37);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA7_21 = input.LA(1);
						 
						int index7_21 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 34;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_21);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA7_24 = input.LA(1);
						 
						int index7_24 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_24=='M') ) {s = 37;}
						else if ( ((LA7_24 >= 'A' && LA7_24 <= 'L')||(LA7_24 >= 'N' && LA7_24 <= 'Z')||(LA7_24 >= 'a' && LA7_24 <= 'z')) ) {s = 10;}
						else if ( ((LA7_24 >= '\u0000' && LA7_24 <= '\t')||(LA7_24 >= '\u000B' && LA7_24 <= '@')||(LA7_24 >= '[' && LA7_24 <= '`')||(LA7_24 >= '{' && LA7_24 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 38;
						 
						input.seek(index7_24);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA7_9 = input.LA(1);
						 
						int index7_9 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_9=='E') ) {s = 24;}
						else if ( ((LA7_9 >= 'A' && LA7_9 <= 'D')||(LA7_9 >= 'F' && LA7_9 <= 'Z')||(LA7_9 >= 'a' && LA7_9 <= 'z')) ) {s = 10;}
						else if ( ((LA7_9 >= '\u0000' && LA7_9 <= '\t')||(LA7_9 >= '\u000B' && LA7_9 <= '@')||(LA7_9 >= '[' && LA7_9 <= '`')||(LA7_9 >= '{' && LA7_9 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 25;
						 
						input.seek(index7_9);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA7_19 = input.LA(1);
						 
						int index7_19 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 32;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_19);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA7_20 = input.LA(1);
						 
						int index7_20 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 33;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_20);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA7_10 = input.LA(1);
						 
						int index7_10 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_10 >= 'A' && LA7_10 <= 'Z')||(LA7_10 >= 'a' && LA7_10 <= 'z')) ) {s = 10;}
						else if ( ((LA7_10 >= '\u0000' && LA7_10 <= '\t')||(LA7_10 >= '\u000B' && LA7_10 <= '@')||(LA7_10 >= '[' && LA7_10 <= '`')||(LA7_10 >= '{' && LA7_10 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 26;
						 
						input.seek(index7_10);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA7_17 = input.LA(1);
						 
						int index7_17 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 30;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_17);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA7_18 = input.LA(1);
						 
						int index7_18 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 31;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_18);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA7_3 = input.LA(1);
						 
						int index7_3 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_3 >= '\u0000' && LA7_3 <= '\t')||(LA7_3 >= '\u000B' && LA7_3 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 18;
						 
						input.seek(index7_3);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA7_28 = input.LA(1);
						 
						int index7_28 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 40;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_28);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA7_5 = input.LA(1);
						 
						int index7_5 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_5 >= '\u0000' && LA7_5 <= '\t')||(LA7_5 >= '\u000B' && LA7_5 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 20;
						 
						input.seek(index7_5);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA7_4 = input.LA(1);
						 
						int index7_4 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_4 >= '\u0000' && LA7_4 <= '\t')||(LA7_4 >= '\u000B' && LA7_4 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 19;
						 
						input.seek(index7_4);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA7_0 = input.LA(1);
						 
						int index7_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_0=='(') ) {s = 1;}
						else if ( (LA7_0==')') ) {s = 2;}
						else if ( (LA7_0=='*') ) {s = 3;}
						else if ( (LA7_0=='+') ) {s = 4;}
						else if ( (LA7_0=='-') ) {s = 5;}
						else if ( (LA7_0=='=') ) {s = 6;}
						else if ( (LA7_0=='C') ) {s = 7;}
						else if ( (LA7_0=='P') ) {s = 8;}
						else if ( (LA7_0=='M') ) {s = 9;}
						else if ( ((LA7_0 >= 'A' && LA7_0 <= 'B')||(LA7_0 >= 'D' && LA7_0 <= 'L')||(LA7_0 >= 'N' && LA7_0 <= 'O')||(LA7_0 >= 'Q' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {s = 10;}
						else if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {s = 11;}
						else if ( (LA7_0=='\r') ) {s = 12;}
						else if ( (LA7_0=='\n') ) {s = 13;}
						else if ( (LA7_0=='\t'||LA7_0==' ') ) {s = 14;}
						else s = 15;
						 
						input.seek(index7_0);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA7_16 = input.LA(1);
						 
						int index7_16 = input.index();
						input.rewind();
						s = -1;
						if ( (!(((lexField >= 2)))) ) {s = 29;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_16);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA7_41 = input.LA(1);
						 
						int index7_41 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_41 >= 'A' && LA7_41 <= 'Z')||(LA7_41 >= 'a' && LA7_41 <= 'z')) ) {s = 10;}
						else if ( ((LA7_41 >= '\u0000' && LA7_41 <= '\t')||(LA7_41 >= '\u000B' && LA7_41 <= '@')||(LA7_41 >= '[' && LA7_41 <= '`')||(LA7_41 >= '{' && LA7_41 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 43;
						 
						input.seek(index7_41);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA7_6 = input.LA(1);
						 
						int index7_6 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_6 >= '\u0000' && LA7_6 <= '\t')||(LA7_6 >= '\u000B' && LA7_6 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 21;
						 
						input.seek(index7_6);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA7_1 = input.LA(1);
						 
						int index7_1 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_1 >= '\u0000' && LA7_1 <= '\t')||(LA7_1 >= '\u000B' && LA7_1 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 16;
						 
						input.seek(index7_1);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA7_12 = input.LA(1);
						 
						int index7_12 = input.index();
						input.rewind();
						s = -1;
						if ( (LA7_12=='\n') ) {s = 13;}
						else s = 15;
						 
						input.seek(index7_12);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA7_11 = input.LA(1);
						 
						int index7_11 = input.index();
						input.rewind();
						s = -1;
						if ( ((LA7_11 >= '0' && LA7_11 <= '9')) ) {s = 11;}
						else if ( ((LA7_11 >= '\u0000' && LA7_11 <= '\t')||(LA7_11 >= '\u000B' && LA7_11 <= '/')||(LA7_11 >= ':' && LA7_11 <= '\uFFFF')) && ((lexField >= 2))) {s = 15;}
						else s = 27;
						 
						input.seek(index7_11);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA7_43 = input.LA(1);
						 
						int index7_43 = input.index();
						input.rewind();
						s = -1;
						if ( ((getCharPositionInLine() == 0)) ) {s = 35;}
						else if ( (!((((getCharPositionInLine() == 0)||(lexField >= 2))))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_43);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA7_22 = input.LA(1);
						 
						int index7_22 = input.index();
						input.rewind();
						s = -1;
						if ( ((getCharPositionInLine() == 0)) ) {s = 35;}
						else if ( (!((((getCharPositionInLine() == 0)||(lexField >= 2))))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_22);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA7_23 = input.LA(1);
						 
						int index7_23 = input.index();
						input.rewind();
						s = -1;
						if ( ((getCharPositionInLine() == 0)) ) {s = 35;}
						else if ( (!((((getCharPositionInLine() == 0)||(lexField >= 2))))) ) {s = 36;}
						else if ( ((lexField >= 2)) ) {s = 15;}
						 
						input.seek(index7_23);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
