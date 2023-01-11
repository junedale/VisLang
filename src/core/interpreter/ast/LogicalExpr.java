package core.interpreter.ast;

import core.antlr4.VisLangParser.LogicalAndContext;
import core.antlr4.VisLangParser.LogicalOrContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class LogicalExpr {

    private final Evaluator eval;

    public LogicalExpr(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(LogicalAndContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));

        if(left == null || right == null) {
            throw new RuntimeException("Expression contains null value");
        } else if(left.isBoolean() && right.isBoolean()) {
            return new Value(left.toBool() && right.toBool());
        } else {
            throw new RuntimeException("");
        }

    }

    public Value evaluate(LogicalOrContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));

        if(left == null || right == null) {
            throw new RuntimeException("Expression contains null value");
        } else if(left.isBoolean() || right.isBoolean()) {
            return new Value(left.toBool() && right.toBool());
        } else {
            throw new RuntimeException("");
        }

    }
}
