package core.interpreter.ast;

import core.interpreter.Function;
import core.interpreter.parser.VisLangParser.PrintContext;
import core.interpreter.parser.VisLangParser.PrintlnContext;
import core.interpreter.parser.VisLangParser.FunCallContext;
import core.interpreter.parser.VisLangParser.ExprContext;
import core.interpreter.parser.VisLangParser.FunCallExprContext;
import core.interpreter.Evaluator;
import core.interpreter.Value;

import java.util.ArrayList;
import java.util.List;

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
            System.out.print(val);
        }
        return Value.VOID;
    }

    public Value evaluate(PrintlnContext ctx) {
        Value val = eval.visit(ctx.expr());
        if(val == null) {
            System.out.println();
        } else {
            System.out.println(val);
        }
        return Value.VOID;
    }

    public Value evaluate(FunCallContext ctx) {
        List<ExprContext> parameters = ctx.params() != null ?
                ctx.params().expr() : new ArrayList<>();
        String identifier = ctx.Identifier().getText() + parameters.size();

        Function function = eval.getFun().get(identifier);
        if(function != null) {
            List<Value> arguments = new ArrayList<>(parameters.size());

            for(ExprContext param : parameters) {
                arguments.add(eval.visit(param));
            }

            return function.invoke(arguments, eval.getFun());
        }

        throw new RuntimeException(ctx.getText());
    }

    public Value evaluate(FunCallExprContext ctx) {
        return eval.visit(ctx.funCall());
    }
}
