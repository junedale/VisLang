package core.interpreter.ast;

import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser.ComparisonContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class ConditionalExpr {

    private final Evaluator eval;

    public ConditionalExpr(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(ComparisonContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));

        if(left == null && right == null) {
            throw  new RuntimeException("Null");
        }

        return switch (ctx.op.getType()) {
            case VisLangLexer.Langle -> lessThan(left, right);
            case VisLangLexer.Rangle -> greaterThan(left, right);
            case VisLangLexer.Leq -> lessOrEqual(left, right);
            case VisLangLexer.Req -> greaterOrEqual(left, right);
            default -> throw new RuntimeException("Unknown operator " + ctx.op.getText());
        };
    }

    private Value lessThan(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() < right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() < right.toDouble());
        } else if((left.isDouble() && right.isInteger()) || (left.isInteger() && right.isDouble())) {
            return new Value(left.toDouble() < right.toDouble());
        } else {
            throw new RuntimeException("Incompatible types: ");
        }
    }

    private Value greaterThan(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() > right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() > right.toDouble());
        } else if((left.isDouble() && right.isInteger()) || (left.isInteger() && right.isDouble())) {
            return new Value(left.toDouble() > right.toDouble());
        } else {
            throw new RuntimeException("Incompatible types: ");
        }
    }

    private Value lessOrEqual(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() <= right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() <= right.toDouble());
        } else if((left.isDouble() && right.isInteger()) || (left.isInteger() && right.isDouble())) {
            return new Value(left.toDouble() <= right.toDouble());
        } else {
            throw new RuntimeException("Incompatible types: ");
        }
    }

    private Value greaterOrEqual(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() >= right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() >= right.toDouble());
        } else if((left.isDouble() && right.isInteger()) || (left.isInteger() && right.isDouble())) {
            return new Value(left.toDouble() >= right.toDouble());
        } else {
            throw new RuntimeException("Incompatible types: ");
        }
    }
}
