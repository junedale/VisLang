package core.interpreter;

import core.antlr4.VisLangBaseVisitor;
import core.antlr4.VisLangParser;
import core.ast.*;

public class Evaluator extends VisLangBaseVisitor<Value> {

    private final Literals literal;
    private final ConditionalExpr comparison;
    private final LogicalExpr logic;
    private final UnaryExpr unary;
    private final BinaryExpr binary;

    public Evaluator() {
        literal    = new Literals();
        comparison = new ConditionalExpr(this);
        logic      = new LogicalExpr(this);
        unary      = new UnaryExpr(this);
        binary     = new BinaryExpr(this);
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
}