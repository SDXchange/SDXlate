// $ANTLR 3.5.2 ./Expr.g 2015-01-24 12:45:34
package examples;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int C_MARK=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int NEWLINE=7;
	public static final int P_MARK=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "./Expr.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:4:7: ( '(' )
			// ./Expr.g:4:9: '('
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:5:7: ( ')' )
			// ./Expr.g:5:9: ')'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:6:7: ( '*' )
			// ./Expr.g:6:9: '*'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:7:7: ( '+' )
			// ./Expr.g:7:9: '+'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:8:7: ( '-' )
			// ./Expr.g:8:9: '-'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:9:7: ( '=' )
			// ./Expr.g:9:9: '='
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
	// $ANTLR end "T__15"

	// $ANTLR start "P_MARK"
	public final void mP_MARK() throws RecognitionException {
		try {
			int _type = P_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:40:8: ( 'P' )
			// ./Expr.g:40:11: 'P'
			{
			match('P'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P_MARK"

	// $ANTLR start "C_MARK"
	public final void mC_MARK() throws RecognitionException {
		try {
			int _type = C_MARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:41:8: ( 'C' )
			// ./Expr.g:41:11: 'C'
			{
			match('C'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C_MARK"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:44:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// ./Expr.g:44:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// ./Expr.g:44:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./Expr.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// ./Expr.g:46:5: ( ( '0' .. '9' )+ )
			// ./Expr.g:46:9: ( '0' .. '9' )+
			{
			// ./Expr.g:46:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ./Expr.g:
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
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./Expr.g:47:8: ( ( '\\r' )? '\\n' )
			// ./Expr.g:47:9: ( '\\r' )? '\\n'
			{
			// ./Expr.g:47:9: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ./Expr.g:47:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
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
			// ./Expr.g:48:5: ( ( ' ' | '\\t' )+ )
			// ./Expr.g:48:9: ( ' ' | '\\t' )+
			{
			// ./Expr.g:48:9: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./Expr.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// ./Expr.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | P_MARK | C_MARK | ID | INT | NEWLINE | WS )
		int alt5=12;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt5=1;
			}
			break;
		case ')':
			{
			alt5=2;
			}
			break;
		case '*':
			{
			alt5=3;
			}
			break;
		case '+':
			{
			alt5=4;
			}
			break;
		case '-':
			{
			alt5=5;
			}
			break;
		case '=':
			{
			alt5=6;
			}
			break;
		case 'P':
			{
			int LA5_7 = input.LA(2);
			if ( ((LA5_7 >= 'A' && LA5_7 <= 'Z')||(LA5_7 >= 'a' && LA5_7 <= 'z')) ) {
				alt5=9;
			}

			else {
				alt5=7;
			}

			}
			break;
		case 'C':
			{
			int LA5_8 = input.LA(2);
			if ( ((LA5_8 >= 'A' && LA5_8 <= 'Z')||(LA5_8 >= 'a' && LA5_8 <= 'z')) ) {
				alt5=9;
			}

			else {
				alt5=8;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=9;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=10;
			}
			break;
		case '\n':
		case '\r':
			{
			alt5=11;
			}
			break;
		case '\t':
		case ' ':
			{
			alt5=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// ./Expr.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// ./Expr.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// ./Expr.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// ./Expr.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// ./Expr.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// ./Expr.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// ./Expr.g:1:46: P_MARK
				{
				mP_MARK(); 

				}
				break;
			case 8 :
				// ./Expr.g:1:53: C_MARK
				{
				mC_MARK(); 

				}
				break;
			case 9 :
				// ./Expr.g:1:60: ID
				{
				mID(); 

				}
				break;
			case 10 :
				// ./Expr.g:1:63: INT
				{
				mINT(); 

				}
				break;
			case 11 :
				// ./Expr.g:1:67: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 12 :
				// ./Expr.g:1:75: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
