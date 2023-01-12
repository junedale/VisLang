package core.interpreter;

import core.interpreter.parser.VisLangBaseVisitor;
import core.interpreter.parser.VisLangParser;
import core.interpreter.ast.*;

public class Evaluator extends VisLangBaseVisitor<Value> {

    private ScopeResolver scope;
    private final Literals literal;
    private final ConditionalExpr comparison;
    private final LogicalExpr logic;
    private final UnaryExpr unary;
    private final BinaryExpr binary;
    private final AssignmentStatement assign;
    private final CallStatement call;
    private final Block block;
    private final LoopStatement loop;
    private final DecisionStatement decision;
    private final EqualityExpr equality;

    public Evaluator(ScopeResolver scope) {
        this.scope = scope;
        literal    = new Literals();
        comparison = new ConditionalExpr(this);
        logic      = new LogicalExpr(this);
        unary      = new UnaryExpr(this);
        binary     = new BinaryExpr(this);
        assign     = new AssignmentStatement(this, scope);
        call       = new CallStatement(this);
        block      = new Block(this, scope);
        loop       = new LoopStatement(this);
        decision   = new DecisionStatement(this);
        equality   = new EqualityExpr(this);
    }

    @Override
    public Value visitIntLiteral(VisLangParser.IntLiteralContext ctx) {
        return literal.evaluate(ctx);
    }

    @Override
    public Value visitStringLiteral(VisLangParser.StringLiteralContext ctx) {
        return literal.evaluate(ctx);
    }

    @Override
    public Value visitDoubleLiteral(VisLangParser.DoubleLiteralContext ctx) {
        return literal.evaluate(ctx);
    }

    @Override
    public Value visitBooleanLiteral(VisLangParser.BooleanLiteralContext ctx) {
        return literal.evaluate(ctx);
    }

    @Override
    public Value visitNull(VisLangParser.NullContext ctx) {
        return literal.evaluate();
    }

    @Override
    public Value visitUnaryMin(VisLangParser.UnaryMinContext ctx) {
        return unary.evaluate(ctx);
    }

    @Override
    public Value visitUnaryNot(VisLangParser.UnaryNotContext ctx) {
        return unary.evaluate(ctx);
    }

    @Override
    public Value visitBinaryMul(VisLangParser.BinaryMulContext ctx) {
        return binary.evaluate(ctx);
    }

    @Override
    public Value visitBinaryAdd(VisLangParser.BinaryAddContext ctx) {
        return binary.evaluate(ctx);
    }

    @Override
    public Value visitComparison(VisLangParser.ComparisonContext ctx) {
        return comparison.evaluate(ctx);
    }

    @Override
    public Value visitLogicalAnd(VisLangParser.LogicalAndContext ctx) {
        return logic.evaluate(ctx);
    }

    @Override
    public Value visitLogicalOr(VisLangParser.LogicalOrContext ctx) {
        return logic.evaluate(ctx);
    }

    @Override
    public Value visitAssignment(VisLangParser.AssignmentContext ctx) {
        return assign.evaluate(ctx);
    }

    @Override
    public Value visitPrint(VisLangParser.PrintContext ctx) {
        return call.evaluate(ctx);
    }

    @Override
    public Value visitPrintln(VisLangParser.PrintlnContext ctx) {
        return call.evaluate(ctx);
    }

    @Override
    public Value visitIdentifier(VisLangParser.IdentifierContext ctx) {
        return assign.evaluate(ctx);
    }

    @Override
    public Value visitBlock(VisLangParser.BlockContext ctx) {
        return block.evaluate(ctx);
    }

    @Override
    public Value visitWhileStat(VisLangParser.WhileStatContext ctx) {
        return loop.evaluate(ctx);
    }

    @Override
    public Value visitDoWhileStat(VisLangParser.DoWhileStatContext ctx) {
        return loop.evaluate(ctx);
    }

    @Override
    public Value visitAssignAction(VisLangParser.AssignActionContext ctx) {
        return assign.evaluate(ctx);
    }


    @Override
    public Value visitEquality(VisLangParser.EqualityContext ctx) {
        return equality.evaluate(ctx);
    }

    @Override
    public Value visitIfStatement(VisLangParser.IfStatementContext ctx) {
        return decision.evaluate(ctx);
    }

    public void setScope(ScopeResolver scope) {
        this.scope = scope;
        assign.setScope(scope);
        block.setScope(scope);
    }
}
