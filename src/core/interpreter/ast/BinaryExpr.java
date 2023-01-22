package core.interpreter.ast;

import core.interpreter.exception.TypeException;
import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser.BinaryAddContext;
import core.interpreter.parser.VisLangParser.BinaryMulContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class BinaryExpr {

    private final Evaluator eval;

    public BinaryExpr(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(BinaryAddContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));
        int op      = ctx.op.getType();

        if(left != null && right != null) {
            if(op == VisLangLexer.Add) {
                return add(left, right);
            } else if(op == VisLangLexer.Sub) {
                return sub(left, right);
            } else {
                throw new RuntimeException("Unknown operator " + ctx.op.getText());
            }
        }

        throw new RuntimeException("Incomplete expression " + ctx.getText());
    }

    public Value evaluate(BinaryMulContext ctx) {
        Value left  = eval.visit(ctx.expr(0));
        Value right = eval.visit(ctx.expr(1));
        int op      = ctx.op.getType();

        if(left != null && right != null) {
            if(op == VisLangLexer.Mul) {
                return mul(left, right);
            } else if(op == VisLangLexer.Div) {
                return div(left, right);
            } else if(op == VisLangLexer.Mod) {
                return mod(left, right);
            } else {
                throw new RuntimeException("Unknown operator " + ctx.op.getText());
            }
        }

        throw new RuntimeException("Incomplete expression " + ctx.getText());
    }

    private Value mul(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() * right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() * right.toDouble());
        } else if(left.isDouble() || right.isDouble()) {
            return new Value(left.toDouble() * right.toDouble());
        } else {
            throw new TypeException("Incompatible Type:\n" + right.getType() + "\n" + left.getType());
        }
    }

    private Value div(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() / right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() / right.toDouble());
        } else if(left.isDouble() || right.isDouble()) {
            return new Value(left.toDouble() / right.toDouble());
        } else {
            throw new TypeException("Incompatible Type:\n" + right.getType() + "\n" + left.getType());
        }
    }

    private Value mod(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() % right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() % right.toDouble());
        } else {
            throw new TypeException("Incompatible Type:\n" + right.getType() + "\n" + left.getType());
        }
    }

    private Value sub(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() - right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() - right.toDouble());
        } else if(left.isDouble() || right.isDouble()) {
            return new Value(left.toDouble() - right.toDouble());
        } else {
            throw new TypeException("Incompatible Type:\n" + right.getType() + "\n" + left.getType());
        }
    }

    private Value add(Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            return new Value(left.toInt() + right.toInt());
        } else if(left.isDouble() && right.isDouble()) {
            return new Value(left.toDouble() + right.toDouble());
        } else if(left.isString() && right.isString()) {
            return new Value(left.toStr() + right.toStr());
        } else if(left.isDouble() || right.isDouble()) {
            return new Value(left.toDouble() + right.toDouble());
        } else {
            throw new TypeException("Incompatible Type:\n" + right.getType() + "\n" + left.getType());
        }
    }
}
