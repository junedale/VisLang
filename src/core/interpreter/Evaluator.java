package core.interpreter;

import core.antlr4.VisLangBaseVisitor;
import core.antlr4.VisLangParser;
import core.ast.Literals;

public class Evaluator extends VisLangBaseVisitor<Value> {

    private final Literals literal;

    public Evaluator() {
        literal = new Literals();
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
}
