// Generated from java-escape by ANTLR 4.11.1
package core.interpreter.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VisLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Lparen=1, Rparen=2, Lbrace=3, Rbrace=4, Comma=5, Colon=6, Semicolon=7, 
		Not=8, Mul=9, Div=10, Mod=11, Add=12, Sub=13, Langle=14, Rangle=15, Leq=16, 
		Req=17, Eqeq=18, Neq=19, Assign=20, Add_Assign=21, Sub_Assign=22, Mul_Assign=23, 
		Div_Assign=24, Mod_Assign=25, Fun=26, If=27, Else=28, For=29, Do=30, While=31, 
		Print=32, Println=33, Return=34, In=35, And=36, Or=37, Null=38, Boolean=39, 
		String=40, Integer=41, Double=42, Comment=43, Identifier=44, Whitespace=45;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_declaration = 2, RULE_funDecl = 3, 
		RULE_params = 4, RULE_statement = 5, RULE_ifStat = 6, RULE_simpleIf = 7, 
		RULE_complexIf = 8, RULE_doWhileStat = 9, RULE_whileStat = 10, RULE_forStat = 11, 
		RULE_callStat = 12, RULE_printCall = 13, RULE_funCall = 14, RULE_block = 15, 
		RULE_expr = 16, RULE_assignment = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "declaration", "funDecl", "params", "statement", "ifStat", 
			"simpleIf", "complexIf", "doWhileStat", "whileStat", "forStat", "callStat", 
			"printCall", "funCall", "block", "expr", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "':'", "';'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'fun'", "'if'", "'else'", 
			"'for'", "'do'", "'while'", "'print'", "'println'", "'return'", "'in'", 
			"'and'", "'or'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Lparen", "Rparen", "Lbrace", "Rbrace", "Comma", "Colon", "Semicolon", 
			"Not", "Mul", "Div", "Mod", "Add", "Sub", "Langle", "Rangle", "Leq", 
			"Req", "Eqeq", "Neq", "Assign", "Add_Assign", "Sub_Assign", "Mul_Assign", 
			"Div_Assign", "Mod_Assign", "Fun", "If", "Else", "For", "Do", "While", 
			"Print", "Println", "Return", "In", "And", "Or", "Null", "Boolean", "String", 
			"Integer", "Double", "Comment", "Identifier", "Whitespace"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VisLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(VisLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			body();
			setState(37);
			match(EOF);
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
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(VisLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(VisLangParser.Semicolon, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(39);
					statement();
					}
					break;
				case 2:
					{
					setState(40);
					declaration();
					}
					break;
				case 3:
					{
					setState(41);
					expr(0);
					setState(42);
					match(Semicolon);
					}
					break;
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 26147425362178L) != 0 );
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
	public static class DeclarationContext extends ParserRuleContext {
		public FunDeclContext funDecl() {
			return getRuleContext(FunDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			funDecl();
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
	public static class FunDeclContext extends ParserRuleContext {
		public TerminalNode Fun() { return getToken(VisLangParser.Fun, 0); }
		public TerminalNode Identifier() { return getToken(VisLangParser.Identifier, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public TerminalNode Lbrace() { return getToken(VisLangParser.Lbrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(VisLangParser.Rbrace, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitFunDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclContext funDecl() throws RecognitionException {
		FunDeclContext _localctx = new FunDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Fun);
			setState(51);
			match(Identifier);
			setState(52);
			match(Lparen);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 26130581037314L) != 0) {
				{
				setState(53);
				params();
				}
			}

			setState(56);
			match(Rparen);
			setState(57);
			match(Lbrace);
			setState(58);
			block();
			setState(59);
			match(Rbrace);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(VisLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VisLangParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(VisLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(VisLangParser.Comma, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		try {
			int _alt;
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(Identifier);
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(62);
						match(Comma);
						setState(63);
						match(Identifier);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				expr(0);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(70);
						match(Comma);
						setState(71);
						expr(0);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(VisLangParser.Semicolon, 0); }
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public DoWhileStatContext doWhileStat() {
			return getRuleContext(DoWhileStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public CallStatContext callStat() {
			return getRuleContext(CallStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				assignment();
				setState(80);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				ifStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				doWhileStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				whileStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				forStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				callStat();
				setState(87);
				match(Semicolon);
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
	public static class IfStatContext extends ParserRuleContext {
		public SimpleIfContext simpleIf() {
			return getRuleContext(SimpleIfContext.class,0);
		}
		public ComplexIfContext complexIf() {
			return getRuleContext(ComplexIfContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStat);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				simpleIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				complexIf();
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
	public static class SimpleIfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(VisLangParser.If, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public List<TerminalNode> Lbrace() { return getTokens(VisLangParser.Lbrace); }
		public TerminalNode Lbrace(int i) {
			return getToken(VisLangParser.Lbrace, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Rbrace() { return getTokens(VisLangParser.Rbrace); }
		public TerminalNode Rbrace(int i) {
			return getToken(VisLangParser.Rbrace, i);
		}
		public TerminalNode Else() { return getToken(VisLangParser.Else, 0); }
		public SimpleIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitSimpleIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleIfContext simpleIf() throws RecognitionException {
		SimpleIfContext _localctx = new SimpleIfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(If);
			setState(96);
			match(Lparen);
			setState(97);
			expr(0);
			setState(98);
			match(Rparen);
			setState(99);
			match(Lbrace);
			setState(100);
			block();
			setState(101);
			match(Rbrace);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(102);
				match(Else);
				setState(103);
				match(Lbrace);
				setState(104);
				block();
				setState(105);
				match(Rbrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexIfContext extends ParserRuleContext {
		public List<TerminalNode> If() { return getTokens(VisLangParser.If); }
		public TerminalNode If(int i) {
			return getToken(VisLangParser.If, i);
		}
		public List<TerminalNode> Lparen() { return getTokens(VisLangParser.Lparen); }
		public TerminalNode Lparen(int i) {
			return getToken(VisLangParser.Lparen, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Rparen() { return getTokens(VisLangParser.Rparen); }
		public TerminalNode Rparen(int i) {
			return getToken(VisLangParser.Rparen, i);
		}
		public List<TerminalNode> Lbrace() { return getTokens(VisLangParser.Lbrace); }
		public TerminalNode Lbrace(int i) {
			return getToken(VisLangParser.Lbrace, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Rbrace() { return getTokens(VisLangParser.Rbrace); }
		public TerminalNode Rbrace(int i) {
			return getToken(VisLangParser.Rbrace, i);
		}
		public List<TerminalNode> Else() { return getTokens(VisLangParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(VisLangParser.Else, i);
		}
		public ComplexIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexIf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitComplexIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexIfContext complexIf() throws RecognitionException {
		ComplexIfContext _localctx = new ComplexIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_complexIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(If);
			setState(110);
			match(Lparen);
			setState(111);
			expr(0);
			setState(112);
			match(Rparen);
			setState(113);
			match(Lbrace);
			setState(114);
			block();
			setState(115);
			match(Rbrace);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(116);
					match(Else);
					setState(117);
					match(If);
					setState(118);
					match(Lparen);
					setState(119);
					expr(0);
					setState(120);
					match(Rparen);
					setState(121);
					match(Lbrace);
					setState(122);
					block();
					setState(123);
					match(Rbrace);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(130);
				match(Else);
				setState(131);
				match(Lbrace);
				setState(132);
				block();
				setState(133);
				match(Rbrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(VisLangParser.Do, 0); }
		public TerminalNode Lbrace() { return getToken(VisLangParser.Lbrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(VisLangParser.Rbrace, 0); }
		public TerminalNode While() { return getToken(VisLangParser.While, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public TerminalNode Semicolon() { return getToken(VisLangParser.Semicolon, 0); }
		public DoWhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitDoWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatContext doWhileStat() throws RecognitionException {
		DoWhileStatContext _localctx = new DoWhileStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doWhileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Do);
			setState(138);
			match(Lbrace);
			setState(139);
			block();
			setState(140);
			match(Rbrace);
			setState(141);
			match(While);
			setState(142);
			match(Lparen);
			setState(143);
			expr(0);
			setState(144);
			match(Rparen);
			setState(145);
			match(Semicolon);
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
	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(VisLangParser.While, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public TerminalNode Lbrace() { return getToken(VisLangParser.Lbrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(VisLangParser.Rbrace, 0); }
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(While);
			setState(148);
			match(Lparen);
			setState(149);
			expr(0);
			setState(150);
			match(Rparen);
			setState(151);
			match(Lbrace);
			setState(152);
			block();
			setState(153);
			match(Rbrace);
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
	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(VisLangParser.For, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public TerminalNode In() { return getToken(VisLangParser.In, 0); }
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public TerminalNode Lbrace() { return getToken(VisLangParser.Lbrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Rbrace() { return getToken(VisLangParser.Rbrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(VisLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VisLangParser.Identifier, i);
		}
		public List<TerminalNode> Integer() { return getTokens(VisLangParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(VisLangParser.Integer, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(For);
			setState(156);
			match(Lparen);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(157);
				assignment();
				}
				break;
			case 2:
				{
				setState(158);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(159);
				match(Integer);
				}
				break;
			}
			setState(162);
			match(In);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			match(Rparen);
			setState(165);
			match(Lbrace);
			setState(166);
			block();
			setState(167);
			match(Rbrace);
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
	public static class CallStatContext extends ParserRuleContext {
		public PrintCallContext printCall() {
			return getRuleContext(PrintCallContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public CallStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitCallStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatContext callStat() throws RecognitionException {
		CallStatContext _localctx = new CallStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callStat);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Print:
			case Println:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				printCall();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				funCall();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintCallContext extends ParserRuleContext {
		public PrintCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCall; }
	 
		public PrintCallContext() { }
		public void copyFrom(PrintCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends PrintCallContext {
		public TerminalNode Print() { return getToken(VisLangParser.Print, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(PrintCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintlnContext extends PrintCallContext {
		public TerminalNode Println() { return getToken(VisLangParser.Println, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnContext(PrintCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCallContext printCall() throws RecognitionException {
		PrintCallContext _localctx = new PrintCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printCall);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Print:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(Print);
				setState(174);
				match(Lparen);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 26130581037314L) != 0) {
					{
					setState(175);
					expr(0);
					}
				}

				setState(178);
				match(Rparen);
				}
				break;
			case Println:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(Println);
				setState(180);
				match(Lparen);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 26130581037314L) != 0) {
					{
					setState(181);
					expr(0);
					}
				}

				setState(184);
				match(Rparen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VisLangParser.Identifier, 0); }
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Identifier);
			setState(188);
			match(Lparen);
			setState(189);
			params();
			setState(190);
			match(Rparen);
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
	public static class BlockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(VisLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(VisLangParser.Semicolon, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(192);
					expr(0);
					setState(193);
					match(Semicolon);
					}
					break;
				case 2:
					{
					setState(195);
					statement();
					}
					break;
				}
				}
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 26147358253314L) != 0 );
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(VisLangParser.Identifier, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryMulContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Mul() { return getToken(VisLangParser.Mul, 0); }
		public TerminalNode Div() { return getToken(VisLangParser.Div, 0); }
		public TerminalNode Mod() { return getToken(VisLangParser.Mod, 0); }
		public BinaryMulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitBinaryMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Langle() { return getToken(VisLangParser.Langle, 0); }
		public TerminalNode Rangle() { return getToken(VisLangParser.Rangle, 0); }
		public TerminalNode Leq() { return getToken(VisLangParser.Leq, 0); }
		public TerminalNode Req() { return getToken(VisLangParser.Req, 0); }
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode Integer() { return getToken(VisLangParser.Integer, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode And() { return getToken(VisLangParser.And, 0); }
		public LogicalAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignActionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Add_Assign() { return getToken(VisLangParser.Add_Assign, 0); }
		public TerminalNode Sub_Assign() { return getToken(VisLangParser.Sub_Assign, 0); }
		public TerminalNode Mul_Assign() { return getToken(VisLangParser.Mul_Assign, 0); }
		public TerminalNode Div_Assign() { return getToken(VisLangParser.Div_Assign, 0); }
		public TerminalNode Mod_Assign() { return getToken(VisLangParser.Mod_Assign, 0); }
		public AssignActionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitAssignAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ExprContext {
		public TerminalNode Null() { return getToken(VisLangParser.Null, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExprContext {
		public TerminalNode String() { return getToken(VisLangParser.String, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupingsContext extends ExprContext {
		public TerminalNode Lparen() { return getToken(VisLangParser.Lparen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(VisLangParser.Rparen, 0); }
		public GroupingsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitGroupings(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinContext extends ExprContext {
		public TerminalNode Sub() { return getToken(VisLangParser.Sub, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitUnaryMin(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleLiteralContext extends ExprContext {
		public TerminalNode Double() { return getToken(VisLangParser.Double, 0); }
		public DoubleLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(VisLangParser.Or, 0); }
		public LogicalOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ExprContext {
		public TerminalNode Boolean() { return getToken(VisLangParser.Boolean, 0); }
		public BooleanLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Eqeq() { return getToken(VisLangParser.Eqeq, 0); }
		public TerminalNode Neq() { return getToken(VisLangParser.Neq, 0); }
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ExprContext {
		public TerminalNode Return() { return getToken(VisLangParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryNotContext extends ExprContext {
		public TerminalNode Not() { return getToken(VisLangParser.Not, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryAddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Add() { return getToken(VisLangParser.Add, 0); }
		public TerminalNode Sub() { return getToken(VisLangParser.Sub, 0); }
		public BinaryAddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitBinaryAdd(this);
			else return visitor.visitChildren(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
				match(Not);
				setState(202);
				expr(17);
				}
				break;
			case Sub:
				{
				_localctx = new UnaryMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(Sub);
				setState(204);
				expr(16);
				}
				break;
			case Integer:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(Integer);
				}
				break;
			case Double:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(Double);
				}
				break;
			case String:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(String);
				}
				break;
			case Boolean:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(Boolean);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(Identifier);
				}
				break;
			case Null:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(Null);
				}
				break;
			case Return:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(Return);
				setState(212);
				expr(2);
				}
				break;
			case Lparen:
				{
				_localctx = new GroupingsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(Lparen);
				setState(214);
				expr(0);
				setState(215);
				match(Rparen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryMulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(220);
						((BinaryMulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0) ) {
							((BinaryMulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryAddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(223);
						((BinaryAddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
							((BinaryAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(226);
						((ComparisonContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0) ) {
							((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(229);
						((EqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Eqeq || _la==Neq) ) {
							((EqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new AssignActionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(232);
						((AssignActionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0) ) {
							((AssignActionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new LogicalAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(235);
						match(And);
						setState(236);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(238);
						match(Or);
						setState(239);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VisLangParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(VisLangParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisLangVisitor ) return ((VisLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Identifier);
			setState(246);
			match(Assign);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(247);
				expr(0);
				}
				break;
			case 2:
				{
				setState(248);
				funCall();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t"+
		"\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005Z\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006^\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007l\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b~\b\b\n\b\f\b\u0081\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0088\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00ac\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b1\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00b7\b\r\u0001\r\u0003\r\u00ba\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00c5\b\u000f\u000b\u000f\f\u000f"+
		"\u00c6\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00da\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00f1"+
		"\b\u0010\n\u0010\f\u0010\u00f4\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00fa\b\u0011\u0001\u0011\u0003BJ\u007f\u0001"+
		" \u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0006\u0002\u0000)),,\u0001\u0000\t\u000b"+
		"\u0001\u0000\f\r\u0001\u0000\u000e\u0011\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0015\u0019\u0112\u0000$\u0001\u0000\u0000\u0000\u0002,\u0001\u0000"+
		"\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000"+
		"\bM\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\f]\u0001\u0000"+
		"\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000"+
		"\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000"+
		"\u0016\u009b\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000"+
		"\u001a\u00b9\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000\u0000"+
		"\u001e\u00c4\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\""+
		"\u00f5\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000"+
		"\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'-\u0003\n\u0005\u0000(-\u0003"+
		"\u0004\u0002\u0000)*\u0003 \u0010\u0000*+\u0005\u0007\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0003"+
		"\u0006\u0003\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u001a\u0000"+
		"\u000034\u0005,\u0000\u000046\u0005\u0001\u0000\u000057\u0003\b\u0004"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0005\u0002\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003"+
		"\u001e\u000f\u0000;<\u0005\u0004\u0000\u0000<\u0007\u0001\u0000\u0000"+
		"\u0000=B\u0005,\u0000\u0000>?\u0005\u0005\u0000\u0000?A\u0005,\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CN\u0001\u0000\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000EJ\u0003 \u0010\u0000FG\u0005\u0005\u0000\u0000GI\u0003 \u0010"+
		"\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000M=\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"N\t\u0001\u0000\u0000\u0000OP\u0003\"\u0011\u0000PQ\u0005\u0007\u0000"+
		"\u0000QZ\u0001\u0000\u0000\u0000RZ\u0003\f\u0006\u0000SZ\u0003\u0012\t"+
		"\u0000TZ\u0003\u0014\n\u0000UZ\u0003\u0016\u000b\u0000VW\u0003\u0018\f"+
		"\u0000WX\u0005\u0007\u0000\u0000XZ\u0001\u0000\u0000\u0000YO\u0001\u0000"+
		"\u0000\u0000YR\u0001\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YT\u0001"+
		"\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000"+
		"Z\u000b\u0001\u0000\u0000\u0000[^\u0003\u000e\u0007\u0000\\^\u0003\u0010"+
		"\b\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\r\u0001"+
		"\u0000\u0000\u0000_`\u0005\u001b\u0000\u0000`a\u0005\u0001\u0000\u0000"+
		"ab\u0003 \u0010\u0000bc\u0005\u0002\u0000\u0000cd\u0005\u0003\u0000\u0000"+
		"de\u0003\u001e\u000f\u0000ek\u0005\u0004\u0000\u0000fg\u0005\u001c\u0000"+
		"\u0000gh\u0005\u0003\u0000\u0000hi\u0003\u001e\u000f\u0000ij\u0005\u0004"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\u000f\u0001\u0000\u0000\u0000mn\u0005\u001b\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000op\u0003 \u0010\u0000pq\u0005\u0002\u0000"+
		"\u0000qr\u0005\u0003\u0000\u0000rs\u0003\u001e\u000f\u0000s\u007f\u0005"+
		"\u0004\u0000\u0000tu\u0005\u001c\u0000\u0000uv\u0005\u001b\u0000\u0000"+
		"vw\u0005\u0001\u0000\u0000wx\u0003 \u0010\u0000xy\u0005\u0002\u0000\u0000"+
		"yz\u0005\u0003\u0000\u0000z{\u0003\u001e\u000f\u0000{|\u0005\u0004\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}t\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0087\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u001c\u0000\u0000\u0083\u0084\u0005\u0003"+
		"\u0000\u0000\u0084\u0085\u0003\u001e\u000f\u0000\u0085\u0086\u0005\u0004"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0082\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0011\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u001e\u0000\u0000\u008a\u008b\u0005\u0003"+
		"\u0000\u0000\u008b\u008c\u0003\u001e\u000f\u0000\u008c\u008d\u0005\u0004"+
		"\u0000\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u008f\u0005\u0001"+
		"\u0000\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0091\u0005\u0002\u0000"+
		"\u0000\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0013\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u001f\u0000\u0000\u0094\u0095\u0005\u0001\u0000"+
		"\u0000\u0095\u0096\u0003 \u0010\u0000\u0096\u0097\u0005\u0002\u0000\u0000"+
		"\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0003\u001e\u000f\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u0015\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u001d\u0000\u0000\u009c\u00a0\u0005\u0001\u0000\u0000"+
		"\u009d\u00a1\u0003\"\u0011\u0000\u009e\u00a1\u0005,\u0000\u0000\u009f"+
		"\u00a1\u0005)\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005#\u0000\u0000\u00a3\u00a4\u0007"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0003\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000\u00a7\u00a8\u0005"+
		"\u0004\u0000\u0000\u00a8\u0017\u0001\u0000\u0000\u0000\u00a9\u00ac\u0003"+
		"\u001a\r\u0000\u00aa\u00ac\u0003\u001c\u000e\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0019\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005 \u0000\u0000\u00ae\u00b0\u0005\u0001\u0000"+
		"\u0000\u00af\u00b1\u0003 \u0010\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00ba\u0005\u0002\u0000\u0000\u00b3\u00b4\u0005!\u0000\u0000\u00b4"+
		"\u00b6\u0005\u0001\u0000\u0000\u00b5\u00b7\u0003 \u0010\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005\u0002\u0000\u0000\u00b9\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00ba\u001b"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005,\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0001\u0000\u0000\u00bd\u00be\u0003\b\u0004\u0000\u00be\u00bf\u0005\u0002"+
		"\u0000\u0000\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003 \u0010"+
		"\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c5\u0003\n\u0005\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0010\uffff\uffff"+
		"\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca\u00da\u0003 \u0010\u0011"+
		"\u00cb\u00cc\u0005\r\u0000\u0000\u00cc\u00da\u0003 \u0010\u0010\u00cd"+
		"\u00da\u0005)\u0000\u0000\u00ce\u00da\u0005*\u0000\u0000\u00cf\u00da\u0005"+
		"(\u0000\u0000\u00d0\u00da\u0005\'\u0000\u0000\u00d1\u00da\u0005,\u0000"+
		"\u0000\u00d2\u00da\u0005&\u0000\u0000\u00d3\u00d4\u0005\"\u0000\u0000"+
		"\u00d4\u00da\u0003 \u0010\u0002\u00d5\u00d6\u0005\u0001\u0000\u0000\u00d6"+
		"\u00d7\u0003 \u0010\u0000\u00d7\u00d8\u0005\u0002\u0000\u0000\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00c8\u0001\u0000\u0000\u0000\u00d9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d9\u00cd\u0001\u0000\u0000\u0000\u00d9\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d9\u00cf\u0001\u0000\u0000\u0000\u00d9\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d1\u0001\u0000\u0000\u0000\u00d9\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d5"+
		"\u0001\u0000\u0000\u0000\u00da\u00f2\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\n\u000f\u0000\u0000\u00dc\u00dd\u0007\u0001\u0000\u0000\u00dd\u00f1\u0003"+
		" \u0010\u0010\u00de\u00df\n\u000e\u0000\u0000\u00df\u00e0\u0007\u0002"+
		"\u0000\u0000\u00e0\u00f1\u0003 \u0010\u000f\u00e1\u00e2\n\r\u0000\u0000"+
		"\u00e2\u00e3\u0007\u0003\u0000\u0000\u00e3\u00f1\u0003 \u0010\u000e\u00e4"+
		"\u00e5\n\f\u0000\u0000\u00e5\u00e6\u0007\u0004\u0000\u0000\u00e6\u00f1"+
		"\u0003 \u0010\r\u00e7\u00e8\n\u000b\u0000\u0000\u00e8\u00e9\u0007\u0005"+
		"\u0000\u0000\u00e9\u00f1\u0003 \u0010\f\u00ea\u00eb\n\n\u0000\u0000\u00eb"+
		"\u00ec\u0005$\u0000\u0000\u00ec\u00f1\u0003 \u0010\u000b\u00ed\u00ee\n"+
		"\t\u0000\u0000\u00ee\u00ef\u0005%\u0000\u0000\u00ef\u00f1\u0003 \u0010"+
		"\n\u00f0\u00db\u0001\u0000\u0000\u0000\u00f0\u00de\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f0\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3!\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005,\u0000\u0000\u00f6\u00f9\u0005\u0014\u0000\u0000\u00f7\u00fa"+
		"\u0003 \u0010\u0000\u00f8\u00fa\u0003\u001c\u000e\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa#\u0001\u0000"+
		"\u0000\u0000\u0016,.6BJMY]k\u007f\u0087\u00a0\u00ab\u00b0\u00b6\u00b9"+
		"\u00c4\u00c6\u00d9\u00f0\u00f2\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}