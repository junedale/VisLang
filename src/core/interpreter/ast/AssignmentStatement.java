package core.interpreter.ast;

import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser.IdentifierContext;
import core.interpreter.parser.VisLangParser.AssignmentContext;
import core.interpreter.parser.VisLangParser.AssignActionContext;
import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import core.interpreter.Value;
import org.antlr.v4.runtime.tree.TerminalNode;

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
        TerminalNode token = ctx.expr(0).getToken(VisLangLexer.Identifier, 0);
        if(token == null) {
            throw new RuntimeException("Variable expected in expression: " + ctx.getText());
        }

        String identifier = token.getText();
        Value left        = eval.visit(ctx.expr(0));
        Value right       = eval.visit(ctx.expr(1));


        if(!(left.isInteger() || left.isDouble() || left.isString()) && !(right.isInteger() || right.isDouble() || right.isString())) {
            throw new RuntimeException("Incompatible type: ");
        } else {
            return switch(ctx.op.getType()) {
                case VisLangLexer.Add_Assign -> addAssign(identifier, left, right);
                case VisLangLexer.Sub_Assign -> subAssign(identifier, left, right);
                case VisLangLexer.Mul_Assign -> mulAssign(identifier, left, right);
                case VisLangLexer.Div_Assign -> divAssign(identifier, left, right);
                case VisLangLexer.Mod_Assign -> modAssign(identifier, left, right);
                default -> throw new RuntimeException("Unknown operator: " + ctx.op.getText());
            };
        }
    }

    private Value mulAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() * right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() * right.toInt()));
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() * left.toDouble()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }
        return scope.resolve(identifier);
    }

    private Value addAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() + right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() + right.toInt()));
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() + left.toDouble()));
        } else {
            scope.reAssign(identifier, new Value(left.toStr() + right.toStr()));
        }
        return scope.resolve(identifier);
    }

    private Value subAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() - right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() - right.toInt()));
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() - left.toDouble()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }
        return scope.resolve(identifier);
    }

    private Value divAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() / right.toInt()));
        } else if(left.isDouble() && right.isDouble()) {
            scope.reAssign(identifier, new Value(left.toInt() / right.toInt()));
        } else if((left.isInteger() && right.isDouble()) || (left.isDouble() && right.isDouble())) {
            scope.reAssign(identifier, new Value(left.toDouble() / left.toDouble()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }
        return scope.resolve(identifier);
    }

    private Value modAssign(String identifier, Value left, Value right) {
        if(left.isInteger() && right.isInteger()) {
            scope.reAssign(identifier, new Value(left.toInt() % right.toInt()));
        } else {
            throw new RuntimeException("Incompatible type: ");
        }

        return scope.resolve(identifier);
    }


    public void setScope(ScopeResolver scope) {
        this.scope = scope;
    }

}
