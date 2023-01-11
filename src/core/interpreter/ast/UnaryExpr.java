package core.interpreter.ast;

import core.interpreter.parser.VisLangParser.UnaryNotContext;
import core.interpreter.parser.VisLangParser.UnaryMinContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class UnaryExpr {

    private final Evaluator eval;

    public UnaryExpr(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(UnaryNotContext ctx) {
        Value right = eval.visit(ctx.expr());

        if(right.isBoolean())
            return new Value(!right.toBool());
        throw new RuntimeException(ctx.Not().getText() + " cannot be applied to non boolean type");
    }

    public Value evaluate(UnaryMinContext ctx) {
        Value right = eval.visit(ctx);

        if(right.isInteger())
            return new Value(-right.toInt());
        else if(right.isDouble())
            return new Value(-right.toDouble());
        else
            throw new RuntimeException(ctx.Sub().getText() + " cannot be applied to non number type");
    }
}
