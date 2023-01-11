package core.interpreter.ast;

import core.antlr4.VisLangLexer;
import core.antlr4.VisLangParser.IdentifierContext;
import core.antlr4.VisLangParser.AssignmentContext;
import core.antlr4.VisLangParser.AssignActionContext;
import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import core.interpreter.Value;

public class AssignmentStatement {

    private final Evaluator eval;
    private ScopeResolver scope;

    public AssignmentStatement(Evaluator eval, ScopeResolver scope) {
        this.eval = eval;
        this.scope = scope;
    }

    public Value evaluate(IdentifierContext ctx) {
        return scope.resolve(ctx.Identifier().getText());
    }

    public Value evaluate(AssignmentContext ctx) {
        String identifier = ctx.Identifier().getText();
        scope.assign(identifier, eval.visit(ctx.expr()));
        return Value.VOID;
    }

    public Value evaluate(AssignActionContext ctx) {
        String identifier  = ctx.Identifier().getText();
        Value left         = eval.visit(ctx.Identifier());
        Value right        = eval.visit(ctx.expr());

        if(left == null || right == null) {
            throw new RuntimeException("Incomplete expression: " + ctx.getText());
        }

        if((left.isInteger() || left.isDouble()) && (right.isInteger() || right.isDouble())) {
            return switch(ctx.op.getType()) {
                case VisLangLexer.Add_Assign -> addAssign(identifier, left, right);
                case VisLangLexer.Sub_Assign -> subAssign(identifier, left, right);
                case VisLangLexer.Mul_Assign -> mulAssign(identifier, left, right);
                case VisLangLexer.Div_Assign -> divAssign(identifier, left, right);
                case VisLangLexer.Mod_Assign -> modAssign(identifier, left, right);
                default -> throw new RuntimeException("Unknown operator: " + ctx.op.getText());
            };
        } else {
            throw new RuntimeException("cannot use " + ctx.op.getText() + " in non number type");
        }
    }

    private Value modAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() % right.toInt()));
            return Value.VOID;
        } else {
            throw  new RuntimeException("Incompatible type: ");
        }
    }

    private Value divAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() / right.toInt()));
            return Value.VOID;
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() / right.toInt()));
            return Value.VOID;
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() / left.toDouble()));
        }
        return Value.VOID;
    }

    private Value mulAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() * right.toInt()));
            return Value.VOID;
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() * right.toInt()));
            return Value.VOID;
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() * left.toDouble()));
        }
        return Value.VOID;
    }

    private Value subAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() - right.toInt()));
            return Value.VOID;
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() - right.toInt()));
            return Value.VOID;
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() - left.toDouble()));
        } else {
            throw new RuntimeException("Incompatible type ");
        }
        return Value.VOID;
    }

    private Value addAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() + right.toInt()));
            return Value.VOID;
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() + right.toInt()));
            return Value.VOID;
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() + left.toDouble()));
        } else {
            throw new RuntimeException("Incompatible type ");
        }
        return Value.VOID;
    }

    public void setScope(ScopeResolver scope) {
        this.scope = scope;
    }

}
