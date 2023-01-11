package core.interpreter.ast;

import core.interpreter.parser.VisLangParser.IntLiteralContext;
import core.interpreter.parser.VisLangParser.DoubleLiteralContext;
import core.interpreter.parser.VisLangParser.StringLiteralContext;
import core.interpreter.parser.VisLangParser.BooleanLiteralContext;
import core.interpreter.Value;

public class Literals {

    public Value evaluate(IntLiteralContext ctx) {
        return new Value(Integer.parseInt(ctx.Integer().getText()));
    }

    public Value evaluate(DoubleLiteralContext ctx) {
        return new Value(Double.parseDouble(ctx.Double().getText()));
    }

    public Value evaluate(StringLiteralContext ctx) {
        String value = ctx.String().getText();
        return new Value(value.substring(1, value.length() - 1));
    }

    public Value evaluate(BooleanLiteralContext ctx) {
        return new Value(Boolean.valueOf(ctx.Boolean().getText()));
    }

    public Value evaluate() {
        return Value.NULL;
    }
}
