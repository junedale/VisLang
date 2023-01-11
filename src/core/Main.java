package core;

import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser;
import core.interpreter.Evaluator;
import core.interpreter.ScopeResolver;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
        CharStream input           = CharStreams.fromString("num  = 0; do { num = num + 1; println(num); } while(num < 10);");
        VisLangLexer lexer         = new VisLangLexer(input);
        CommonTokenStream tokens   = new CommonTokenStream(lexer);
        VisLangParser parser       = new VisLangParser(tokens);
        ScopeResolver scope        = new ScopeResolver();
        Evaluator evaluator        = new Evaluator(scope);
        ParseTree tree             = parser.program();
        evaluator.visit(tree);

    }
}
