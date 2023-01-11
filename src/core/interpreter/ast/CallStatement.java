package core.interpreter.ast;

import core.antlr4.VisLangParser.PrintContext;
import core.antlr4.VisLangParser.PrintlnContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

public class CallStatement {

    private final Evaluator eval;

    public CallStatement(Evaluator eval) {
        this.eval = eval;
    }

    public Value evaluate(PrintContext ctx) {
        Value val = eval.visit(ctx.expr());
        if(val == null) {
            throw new RuntimeException("Cannot resolve " + ctx.getText());
        } else {
            System.out.print(eval.visit(ctx.expr()).toString());
        }
        return Value.VOID;
    }

    public Value evaluate(PrintlnContext ctx) {
        Value val = eval.visit(ctx.expr());
        if(val == null) {
            System.out.println();
        } else {
            System.out.println(eval.visit(ctx.expr()).toString());
        }
        return Value.VOID;
    }
}
