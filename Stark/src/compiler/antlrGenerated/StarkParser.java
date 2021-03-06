package compiler.antlrGenerated;// Generated from D:/SER502 Project/SER502-Spring2018-Team8/Stark/doc\Stark.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StarkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, BOOLVALUES=30, IDENTIFIER=31, 
		NUMBER=32, WS=33, MULTICOMMENT=34, SINGLECOMMENT=35;
	public static final int
		RULE_program = 0, RULE_statementList = 1, RULE_statement = 2, RULE_initializationStmt = 3, 
		RULE_declarationStmt = 4, RULE_assignmentStmt = 5, RULE_ifStatement = 6, 
		RULE_condition = 7, RULE_elseStmt = 8, RULE_whileStatement = 9, RULE_whileCondition = 10, 
		RULE_displayStatement = 11, RULE_relationalExpression = 12, RULE_logicalExpression = 13, 
		RULE_boolExpression = 14, RULE_expression = 15, RULE_term = 16, RULE_factor = 17, 
		RULE_functionDefnList = 18, RULE_functionDefn = 19, RULE_functionName = 20, 
		RULE_parameters = 21, RULE_returnStatement = 22, RULE_functionCall = 23, 
		RULE_arguments = 24, RULE_openBrace = 25, RULE_closeBrace = 26;
	public static final String[] ruleNames = {
		"program", "statementList", "statement", "initializationStmt", "declarationStmt", 
		"assignmentStmt", "ifStatement", "condition", "elseStmt", "whileStatement", 
		"whileCondition", "displayStatement", "relationalExpression", "logicalExpression", 
		"boolExpression", "expression", "term", "factor", "functionDefnList", 
		"functionDefn", "functionName", "parameters", "returnStatement", "functionCall", 
		"arguments", "openBrace", "closeBrace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'='", "'bool'", "'if'", "'('", "')'", "'{'", "'}'", 
		"'else'", "'while'", "'display'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='", "'&&'", "'||'", "'!'", "'+'", "'-'", "'*'", "'/'", "'%'", "'func'", 
		"','", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BOOLVALUES", "IDENTIFIER", "NUMBER", 
		"WS", "MULTICOMMENT", "SINGLECOMMENT"
	};
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
	public String getGrammarFileName() { return "Stark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StarkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public FunctionDefnListContext functionDefnList() {
			return getRuleContext(FunctionDefnListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			statementList();
			setState(55);
			functionDefnList();
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

	public static class StatementListContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementList);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				statement();
				setState(58);
				statementList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				statement();
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public InitializationStmtContext initializationStmt() {
			return getRuleContext(InitializationStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				declarationStmt();
				setState(64);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				initializationStmt();
				setState(67);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				assignmentStmt();
				setState(70);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				displayStatement();
				setState(75);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				functionCall();
				setState(78);
				match(T__0);
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

	public static class InitializationStmtContext extends ParserRuleContext {
		public InitializationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationStmt; }
	 
		public InitializationStmtContext() { }
		public void copyFrom(InitializationStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitIntExpressionContext extends InitializationStmtContext {
		public Token varName;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public InitIntExpressionContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitBoolExpressionContext extends InitializationStmtContext {
		public Token varName;
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public InitBoolExpressionContext(InitializationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterInitBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitInitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitInitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationStmtContext initializationStmt() throws RecognitionException {
		InitializationStmtContext _localctx = new InitializationStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initializationStmt);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new InitIntExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__1);
				setState(83);
				((InitIntExpressionContext)_localctx).varName = match(IDENTIFIER);
				setState(84);
				match(T__2);
				setState(85);
				expression();
				}
				break;
			case T__3:
				_localctx = new InitBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__3);
				setState(87);
				((InitBoolExpressionContext)_localctx).varName = match(IDENTIFIER);
				setState(88);
				match(T__2);
				setState(89);
				boolExpression();
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

	public static class DeclarationStmtContext extends ParserRuleContext {
		public DeclarationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStmt; }
	 
		public DeclarationStmtContext() { }
		public void copyFrom(DeclarationStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolDeclarationContext extends DeclarationStmtContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public BoolDeclarationContext(DeclarationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclarationContext extends DeclarationStmtContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public IntDeclarationContext(DeclarationStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStmtContext declarationStmt() throws RecognitionException {
		DeclarationStmtContext _localctx = new DeclarationStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationStmt);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new IntDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__1);
				setState(93);
				((IntDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case T__3:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__3);
				setState(95);
				((BoolDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public Token varName;
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentStmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((AssignmentStmtContext)_localctx).varName = match(IDENTIFIER);
				setState(99);
				match(T__2);
				setState(100);
				boolExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((AssignmentStmtContext)_localctx).varName = match(IDENTIFIER);
				setState(102);
				match(T__2);
				setState(103);
				expression();
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public IfStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends IfStatementContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CloseBraceContext closeBrace() {
			return getRuleContext(CloseBraceContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseStmtContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__4);
				setState(107);
				match(T__5);
				setState(108);
				condition();
				setState(109);
				match(T__6);
				setState(110);
				match(T__7);
				setState(111);
				statementList();
				setState(112);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__4);
				setState(115);
				match(T__5);
				setState(116);
				condition();
				setState(117);
				match(T__6);
				setState(118);
				openBrace();
				setState(119);
				statementList();
				setState(120);
				closeBrace();
				setState(121);
				elseStmt();
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

	public static class ConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			boolExpression();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__9);
			setState(128);
			match(T__7);
			setState(129);
			statementList();
			setState(130);
			match(T__8);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__10);
			setState(133);
			match(T__5);
			setState(134);
			whileCondition();
			setState(135);
			match(T__6);
			setState(136);
			match(T__7);
			setState(137);
			statementList();
			setState(138);
			match(T__8);
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

	public static class WhileConditionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			boolExpression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
	 
		public DisplayStatementContext() { }
		public void copyFrom(DisplayStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DispExprContext extends DisplayStatementContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DispExprContext(DisplayStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDispExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDispExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDispExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispFuncContext extends DisplayStatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public DispFuncContext(DisplayStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDispFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDispFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDispFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_displayStatement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DispExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__11);
				setState(143);
				((DispExprContext)_localctx).argument = expression();
				}
				break;
			case 2:
				_localctx = new DispFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__11);
				setState(145);
				functionCall();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNotEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNotEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNotEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterGreaterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitGreaterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitGreaterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsBooValueContext extends RelationalExpressionContext {
		public Token boolVal;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public EqualsBooValueContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterEqualsBooValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitEqualsBooValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitEqualsBooValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsValueContext extends RelationalExpressionContext {
		public Token boolVal;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public NotEqualsValueContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNotEqualsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNotEqualsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNotEqualsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterGreaterEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitGreaterEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitGreaterEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualsExpressionContext extends RelationalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessEqualsExpressionContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLessEqualsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLessEqualsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLessEqualsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationalExpression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new EqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				expression();
				setState(149);
				match(T__12);
				setState(150);
				expression();
				}
				break;
			case 2:
				_localctx = new NotEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				expression();
				setState(153);
				match(T__13);
				setState(154);
				expression();
				}
				break;
			case 3:
				_localctx = new LessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				expression();
				setState(157);
				match(T__14);
				setState(158);
				expression();
				}
				break;
			case 4:
				_localctx = new LessEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				expression();
				setState(161);
				match(T__15);
				setState(162);
				expression();
				}
				break;
			case 5:
				_localctx = new GreaterExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				expression();
				setState(165);
				match(T__16);
				setState(166);
				expression();
				}
				break;
			case 6:
				_localctx = new GreaterEqualsExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				expression();
				setState(169);
				match(T__17);
				setState(170);
				expression();
				}
				break;
			case 7:
				_localctx = new EqualsBooValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(IDENTIFIER);
				setState(173);
				match(T__12);
				setState(174);
				((EqualsBooValueContext)_localctx).boolVal = match(BOOLVALUES);
				}
				break;
			case 8:
				_localctx = new NotEqualsValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				match(IDENTIFIER);
				setState(176);
				match(T__13);
				setState(177);
				((NotEqualsValueContext)_localctx).boolVal = match(BOOLVALUES);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalNotContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotContext extends LogicalExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalOrContext extends LogicalExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public RelationalOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalAndContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrContext extends LogicalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalAndContext extends LogicalExpressionContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public RelationalAndContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicalExpression);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new RelationalAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				relationalExpression();
				setState(181);
				match(T__18);
				setState(182);
				relationalExpression();
				}
				break;
			case 2:
				_localctx = new RelationalOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				relationalExpression();
				setState(185);
				match(T__19);
				setState(186);
				relationalExpression();
				}
				break;
			case 3:
				_localctx = new LogicalAndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				relationalExpression();
				setState(189);
				match(T__18);
				setState(190);
				logicalExpression();
				}
				break;
			case 4:
				_localctx = new LogicalOrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				relationalExpression();
				setState(193);
				match(T__19);
				setState(194);
				logicalExpression();
				}
				break;
			case 5:
				_localctx = new RelationalNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__20);
				setState(197);
				relationalExpression();
				}
				break;
			case 6:
				_localctx = new LogicalNotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(T__20);
				setState(199);
				logicalExpression();
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

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	 
		public BoolExpressionContext() { }
		public void copyFrom(BoolExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalStmtContext extends BoolExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalStmtContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterRelationalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitRelationalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitRelationalStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends BoolExpressionContext {
		public TerminalNode BOOLVALUES() { return getToken(StarkParser.BOOLVALUES, 0); }
		public BoolValueContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalStmtContext extends BoolExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalStmtContext(BoolExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterLogicalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitLogicalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitLogicalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolExpression);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new RelationalStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				relationalExpression();
				}
				break;
			case 2:
				_localctx = new LogicalStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				logicalExpression();
				}
				break;
			case 3:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(BOOLVALUES);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrmContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TrmContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterTrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitTrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitTrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				term();
				setState(208);
				match(T__21);
				setState(209);
				expression();
				}
				break;
			case 2:
				_localctx = new SubExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				term();
				setState(212);
				match(T__22);
				setState(213);
				expression();
				}
				break;
			case 3:
				_localctx = new TrmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ModExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DivExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpresisonContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MulExpresisonContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterMulExpresison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitMulExpresison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitMulExpresison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new MulExpresisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				factor();
				setState(219);
				match(T__23);
				setState(220);
				term();
				}
				break;
			case 2:
				_localctx = new DivExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				factor();
				setState(223);
				match(T__24);
				setState(224);
				term();
				}
				break;
			case 3:
				_localctx = new ModExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				factor();
				setState(227);
				match(T__25);
				setState(228);
				term();
				}
				break;
			case 4:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends FactorContext {
		public Token num;
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public NumberContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends FactorContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public IdentifierContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceExpressionContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BraceExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterBraceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitBraceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitBraceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new BraceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__5);
				setState(234);
				expression();
				setState(235);
				match(T__6);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((IdentifierContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				((NumberContext)_localctx).num = match(NUMBER);
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

	public static class FunctionDefnListContext extends ParserRuleContext {
		public FunctionDefnContext functionDefn() {
			return getRuleContext(FunctionDefnContext.class,0);
		}
		public FunctionDefnListContext functionDefnList() {
			return getRuleContext(FunctionDefnListContext.class,0);
		}
		public FunctionDefnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFunctionDefnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFunctionDefnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFunctionDefnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefnListContext functionDefnList() throws RecognitionException {
		FunctionDefnListContext _localctx = new FunctionDefnListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDefnList);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				functionDefn();
				setState(242);
				functionDefnList();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionDefnContext extends ParserRuleContext {
		public FunctionDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefn; }
	 
		public FunctionDefnContext() { }
		public void copyFrom(FunctionDefnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncWithStmtsContext extends FunctionDefnContext {
		public FunctionNameContext name;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FuncWithStmtsContext(FunctionDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFuncWithStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFuncWithStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFuncWithStmts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncWithoutStmtsContext extends FunctionDefnContext {
		public FunctionNameContext name;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FuncWithoutStmtsContext(FunctionDefnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFuncWithoutStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFuncWithoutStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFuncWithoutStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefnContext functionDefn() throws RecognitionException {
		FunctionDefnContext _localctx = new FunctionDefnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDefn);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new FuncWithStmtsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__26);
				setState(248);
				((FuncWithStmtsContext)_localctx).name = functionName();
				setState(249);
				match(T__5);
				setState(250);
				parameters();
				setState(251);
				match(T__6);
				setState(252);
				match(T__7);
				setState(253);
				statementList();
				setState(254);
				returnStatement();
				setState(255);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new FuncWithoutStmtsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__26);
				setState(258);
				((FuncWithoutStmtsContext)_localctx).name = functionName();
				setState(259);
				match(T__5);
				setState(260);
				parameters();
				setState(261);
				match(T__6);
				setState(262);
				match(T__7);
				setState(263);
				returnStatement();
				setState(264);
				match(T__8);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	 
		public FunctionNameContext() { }
		public void copyFrom(FunctionNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunNameContext extends FunctionNameContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunNameContext(FunctionNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterFunName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitFunName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitFunName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionName);
		try {
			_localctx = new FunNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoParamContext extends ParametersContext {
		public NoParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultParamContext extends ParametersContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MultParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterMultParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitMultParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitMultParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleParamContext extends ParametersContext {
		public DeclarationStmtContext declarationStmt() {
			return getRuleContext(DeclarationStmtContext.class,0);
		}
		public SingleParamContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterSingleParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitSingleParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitSingleParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameters);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new MultParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				declarationStmt();
				setState(271);
				match(T__27);
				setState(272);
				parameters();
				}
				break;
			case 2:
				_localctx = new SingleParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				declarationStmt();
				}
				break;
			case 3:
				_localctx = new NoParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnBoolContext extends ReturnStatementContext {
		public BoolExpressionContext varname;
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ReturnBoolContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterReturnBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitReturnBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitReturnBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoReturnContext extends ReturnStatementContext {
		public NoReturnContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnIntContext extends ReturnStatementContext {
		public ExpressionContext varname;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnIntContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterReturnInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitReturnInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitReturnInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__28);
				setState(279);
				((ReturnIntContext)_localctx).varname = expression();
				setState(280);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ReturnBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__28);
				setState(283);
				((ReturnBoolContext)_localctx).varname = boolExpression();
				setState(284);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new NoReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignFunctionCallContext extends FunctionCallContext {
		public Token varname;
		public FunctionNameContext name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public AssignFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterAssignFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitAssignFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitAssignFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoAssignFunctionCallContext extends FunctionCallContext {
		public FunctionNameContext name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public NoAssignFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterNoAssignFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitNoAssignFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitNoAssignFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AssignFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((AssignFunctionCallContext)_localctx).varname = match(IDENTIFIER);
				setState(290);
				match(T__2);
				setState(291);
				((AssignFunctionCallContext)_localctx).name = functionName();
				setState(292);
				match(T__5);
				setState(293);
				arguments();
				setState(294);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new NoAssignFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((NoAssignFunctionCallContext)_localctx).name = functionName();
				setState(297);
				match(T__5);
				setState(298);
				arguments();
				setState(299);
				match(T__6);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgIdentifierContext extends ArgumentsContext {
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public ArgIdentifierContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterArgIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitArgIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitArgIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyIdentifierContext extends ArgumentsContext {
		public Token name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(StarkParser.IDENTIFIER, 0); }
		public DummyIdentifierContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyNumberContext extends ArgumentsContext {
		public Token name;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public DummyNumberContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgNumberContext extends ArgumentsContext {
		public TerminalNode NUMBER() { return getToken(StarkParser.NUMBER, 0); }
		public ArgNumberContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterArgNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitArgNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitArgNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DummyblankContext extends ArgumentsContext {
		public DummyblankContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterDummyblank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitDummyblank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitDummyblank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new DummyIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				((DummyIdentifierContext)_localctx).name = match(IDENTIFIER);
				setState(304);
				match(T__27);
				setState(305);
				arguments();
				}
				break;
			case 2:
				_localctx = new DummyNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				((DummyNumberContext)_localctx).name = match(NUMBER);
				setState(307);
				match(T__27);
				setState(308);
				arguments();
				}
				break;
			case 3:
				_localctx = new ArgNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ArgIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(IDENTIFIER);
				}
				break;
			case 5:
				_localctx = new DummyblankContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
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

	public static class OpenBraceContext extends ParserRuleContext {
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
	 
		public OpenBraceContext() { }
		public void copyFrom(OpenBraceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpenBracketContext extends OpenBraceContext {
		public OpenBracketContext(OpenBraceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_openBrace);
		try {
			_localctx = new OpenBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__7);
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

	public static class CloseBraceContext extends ParserRuleContext {
		public CloseBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBrace; }
	 
		public CloseBraceContext() { }
		public void copyFrom(CloseBraceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CloseBracketContext extends CloseBraceContext {
		public CloseBracketContext(CloseBraceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StarkListener ) ((StarkListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StarkVisitor ) return ((StarkVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBraceContext closeBrace() throws RecognitionException {
		CloseBraceContext _localctx = new CloseBraceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_closeBrace);
		try {
			_localctx = new CloseBracketContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0141\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\5\6c\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r"+
		"\u0095\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00cb\n\17\3\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00db\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00f2\n\23\3\24\3\24\3\24\3\24\5\24\u00f8\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u010d\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0117\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0122"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0130\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013b\n"+
		"\32\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\2\2\u0151\28\3\2\2\2\4?\3\2\2\2\6R\3\2\2\2"+
		"\b\\\3\2\2\2\nb\3\2\2\2\fj\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u0086\3\2\2\2\26\u008e\3\2\2\2\30\u0094\3\2\2\2\32\u00b4\3"+
		"\2\2\2\34\u00ca\3\2\2\2\36\u00cf\3\2\2\2 \u00da\3\2\2\2\"\u00e9\3\2\2"+
		"\2$\u00f1\3\2\2\2&\u00f7\3\2\2\2(\u010c\3\2\2\2*\u010e\3\2\2\2,\u0116"+
		"\3\2\2\2.\u0121\3\2\2\2\60\u012f\3\2\2\2\62\u013a\3\2\2\2\64\u013c\3\2"+
		"\2\2\66\u013e\3\2\2\289\5\4\3\29:\5&\24\2:\3\3\2\2\2;<\5\6\4\2<=\5\4\3"+
		"\2=@\3\2\2\2>@\5\6\4\2?;\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\5\n\6\2BC\7\3"+
		"\2\2CS\3\2\2\2DE\5\b\5\2EF\7\3\2\2FS\3\2\2\2GH\5\f\7\2HI\7\3\2\2IS\3\2"+
		"\2\2JS\5\16\b\2KS\5\24\13\2LM\5\30\r\2MN\7\3\2\2NS\3\2\2\2OP\5\60\31\2"+
		"PQ\7\3\2\2QS\3\2\2\2RA\3\2\2\2RD\3\2\2\2RG\3\2\2\2RJ\3\2\2\2RK\3\2\2\2"+
		"RL\3\2\2\2RO\3\2\2\2S\7\3\2\2\2TU\7\4\2\2UV\7!\2\2VW\7\5\2\2W]\5 \21\2"+
		"XY\7\6\2\2YZ\7!\2\2Z[\7\5\2\2[]\5\36\20\2\\T\3\2\2\2\\X\3\2\2\2]\t\3\2"+
		"\2\2^_\7\4\2\2_c\7!\2\2`a\7\6\2\2ac\7!\2\2b^\3\2\2\2b`\3\2\2\2c\13\3\2"+
		"\2\2de\7!\2\2ef\7\5\2\2fk\5\36\20\2gh\7!\2\2hi\7\5\2\2ik\5 \21\2jd\3\2"+
		"\2\2jg\3\2\2\2k\r\3\2\2\2lm\7\7\2\2mn\7\b\2\2no\5\20\t\2op\7\t\2\2pq\7"+
		"\n\2\2qr\5\4\3\2rs\7\13\2\2s~\3\2\2\2tu\7\7\2\2uv\7\b\2\2vw\5\20\t\2w"+
		"x\7\t\2\2xy\5\64\33\2yz\5\4\3\2z{\5\66\34\2{|\5\22\n\2|~\3\2\2\2}l\3\2"+
		"\2\2}t\3\2\2\2~\17\3\2\2\2\177\u0080\5\36\20\2\u0080\21\3\2\2\2\u0081"+
		"\u0082\7\f\2\2\u0082\u0083\7\n\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\13"+
		"\2\2\u0085\23\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\b\2\2\u0088\u0089"+
		"\5\26\f\2\u0089\u008a\7\t\2\2\u008a\u008b\7\n\2\2\u008b\u008c\5\4\3\2"+
		"\u008c\u008d\7\13\2\2\u008d\25\3\2\2\2\u008e\u008f\5\36\20\2\u008f\27"+
		"\3\2\2\2\u0090\u0091\7\16\2\2\u0091\u0095\5 \21\2\u0092\u0093\7\16\2\2"+
		"\u0093\u0095\5\60\31\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095\31"+
		"\3\2\2\2\u0096\u0097\5 \21\2\u0097\u0098\7\17\2\2\u0098\u0099\5 \21\2"+
		"\u0099\u00b5\3\2\2\2\u009a\u009b\5 \21\2\u009b\u009c\7\20\2\2\u009c\u009d"+
		"\5 \21\2\u009d\u00b5\3\2\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\21\2\2"+
		"\u00a0\u00a1\5 \21\2\u00a1\u00b5\3\2\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4"+
		"\7\22\2\2\u00a4\u00a5\5 \21\2\u00a5\u00b5\3\2\2\2\u00a6\u00a7\5 \21\2"+
		"\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5 \21\2\u00a9\u00b5\3\2\2\2\u00aa\u00ab"+
		"\5 \21\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\5 \21\2\u00ad\u00b5\3\2\2\2"+
		"\u00ae\u00af\7!\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b5\7 \2\2\u00b1\u00b2"+
		"\7!\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b5\7 \2\2\u00b4\u0096\3\2\2\2\u00b4"+
		"\u009a\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a6\3\2"+
		"\2\2\u00b4\u00aa\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\33\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\5\32"+
		"\16\2\u00b9\u00cb\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\7\26\2\2\u00bc"+
		"\u00bd\5\32\16\2\u00bd\u00cb\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0"+
		"\7\25\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00cb\3\2\2\2\u00c2\u00c3\5\32\16"+
		"\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00cb\3\2\2\2\u00c6"+
		"\u00c7\7\27\2\2\u00c7\u00cb\5\32\16\2\u00c8\u00c9\7\27\2\2\u00c9\u00cb"+
		"\5\34\17\2\u00ca\u00b6\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00be\3\2\2\2"+
		"\u00ca\u00c2\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\35"+
		"\3\2\2\2\u00cc\u00d0\5\32\16\2\u00cd\u00d0\5\34\17\2\u00ce\u00d0\7 \2"+
		"\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\37"+
		"\3\2\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7\30\2\2\u00d3\u00d4\5 \21\2"+
		"\u00d4\u00db\3\2\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8"+
		"\5 \21\2\u00d8\u00db\3\2\2\2\u00d9\u00db\5\"\22\2\u00da\u00d1\3\2\2\2"+
		"\u00da\u00d5\3\2\2\2\u00da\u00d9\3\2\2\2\u00db!\3\2\2\2\u00dc\u00dd\5"+
		"$\23\2\u00dd\u00de\7\32\2\2\u00de\u00df\5\"\22\2\u00df\u00ea\3\2\2\2\u00e0"+
		"\u00e1\5$\23\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5\"\22\2\u00e3\u00ea\3"+
		"\2\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\5\"\22\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00ea\5$\23\2\u00e9\u00dc\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb\u00ec"+
		"\7\b\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7\t\2\2\u00ee\u00f2\3\2\2\2\u00ef"+
		"\u00f2\7!\2\2\u00f0\u00f2\7\"\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2%\3\2\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5"+
		"\5&\24\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7\35\2\2\u00fa\u00fb\5*\26"+
		"\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\t\2\2\u00fe\u00ff"+
		"\7\n\2\2\u00ff\u0100\5\4\3\2\u0100\u0101\5.\30\2\u0101\u0102\7\13\2\2"+
		"\u0102\u010d\3\2\2\2\u0103\u0104\7\35\2\2\u0104\u0105\5*\26\2\u0105\u0106"+
		"\7\b\2\2\u0106\u0107\5,\27\2\u0107\u0108\7\t\2\2\u0108\u0109\7\n\2\2\u0109"+
		"\u010a\5.\30\2\u010a\u010b\7\13\2\2\u010b\u010d\3\2\2\2\u010c\u00f9\3"+
		"\2\2\2\u010c\u0103\3\2\2\2\u010d)\3\2\2\2\u010e\u010f\7!\2\2\u010f+\3"+
		"\2\2\2\u0110\u0111\5\n\6\2\u0111\u0112\7\36\2\2\u0112\u0113\5,\27\2\u0113"+
		"\u0117\3\2\2\2\u0114\u0117\5\n\6\2\u0115\u0117\3\2\2\2\u0116\u0110\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117-\3\2\2\2\u0118\u0119"+
		"\7\37\2\2\u0119\u011a\5 \21\2\u011a\u011b\7\3\2\2\u011b\u0122\3\2\2\2"+
		"\u011c\u011d\7\37\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7\3\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u011c\3\2"+
		"\2\2\u0121\u0120\3\2\2\2\u0122/\3\2\2\2\u0123\u0124\7!\2\2\u0124\u0125"+
		"\7\5\2\2\u0125\u0126\5*\26\2\u0126\u0127\7\b\2\2\u0127\u0128\5\62\32\2"+
		"\u0128\u0129\7\t\2\2\u0129\u0130\3\2\2\2\u012a\u012b\5*\26\2\u012b\u012c"+
		"\7\b\2\2\u012c\u012d\5\62\32\2\u012d\u012e\7\t\2\2\u012e\u0130\3\2\2\2"+
		"\u012f\u0123\3\2\2\2\u012f\u012a\3\2\2\2\u0130\61\3\2\2\2\u0131\u0132"+
		"\7!\2\2\u0132\u0133\7\36\2\2\u0133\u013b\5\62\32\2\u0134\u0135\7\"\2\2"+
		"\u0135\u0136\7\36\2\2\u0136\u013b\5\62\32\2\u0137\u013b\7\"\2\2\u0138"+
		"\u013b\7!\2\2\u0139\u013b\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\63\3\2\2\2\u013c\u013d\7\n\2\2\u013d\65\3\2\2\2\u013e\u013f\7\13\2\2"+
		"\u013f\67\3\2\2\2\25?R\\bj}\u0094\u00b4\u00ca\u00cf\u00da\u00e9\u00f1"+
		"\u00f7\u010c\u0116\u0121\u012f\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}