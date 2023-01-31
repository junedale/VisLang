package core.interpreter;

import core.interpreter.parser.VisLangLexer;
import core.interpreter.parser.VisLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public class Interpreter {

    public void run(InputStream file) throws IOException {
        CharStream input           = CharStreams.fromStream(file);
        VisLangLexer lexer         = new VisLangLexer(input);
        CommonTokenStream tokens   = new CommonTokenStream(lexer);
        VisLangParser parser       = new VisLangParser(tokens);

        try {
            Map<String, Function> fun  = Collections.emptyMap();
            ScopeResolver scope        = new ScopeResolver();
            Evaluator evaluator        = new Evaluator(scope, fun);
            ParseTree tree             = parser.program();
            if(parser.getNumberOfSyntaxErrors() > 0) {
                System.exit(-1);
            }
            evaluator.visit(tree);
        } catch(ParseCancellationException e) {
            if(e.getCause() instanceof InputMismatchException ex) {
                System.out.println("Error at [" + ex.getOffendingToken().getLine() + ", " + ex.getOffendingToken().getCharPositionInLine() + "]: " + "Syntax Error");
            }
        }
    }
}
