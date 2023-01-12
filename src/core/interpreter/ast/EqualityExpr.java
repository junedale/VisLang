package core.interpreter.ast;

import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser.EqualityContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class EqualityExpr {

    private final Evaluator eval;

    public EqualityExpr(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(EqualityContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));

        if(left == null || right == null) {
            throw new RuntimeException("Incomplete expression: " + ctx.getText());
        }

        return switch(ctx.op.getType()) {
            case VisLangLexer.Eqeq -> isEqual(left, right);
            case VisLangLexer.Neq -> notEqual(left, right);
            default -> throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        };
    }

    private Value isEqual(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt().equals(right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble().equals(right.toDouble()));
        } else if((left.isInteger() || left.isDouble()) && (right.isInteger() || right.isDouble())) {
            return new Value(left.toDouble().equals(right.toDouble()));
        } else if(left.isString() && right.isString()) {
            return new Value(left.toString().equals(right.toString()));
        } else if(left.isBoolean() && right.isBoolean()) {
            return new Value(left.toBool().equals(right.toBool()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }
    }

    private Value notEqual(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(!left.toInt().equals(right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(!left.toDouble().equals(right.toDouble()));
        } else if((left.isInteger() || left.isDouble()) && (right.isInteger() || right.isDouble())) {
            return new Value(!left.toDouble().equals(right.toDouble()));
        } else if(left.isString() && right.isString()) {
            return new Value(!left.toString().equals(right.toString()));
        } else if(left.isBoolean() && right.isBoolean()) {
            return new Value(!left.toBool().equals(right.toBool()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }
    }




}
