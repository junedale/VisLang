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

public class Interpreter {

    public void run(InputStream file) throws IOException {
        CharStream input           = CharStreams.fromStream(file);
        VisLangLexer lexer         = new VisLangLexer(input);
        CommonTokenStream tokens   = new CommonTokenStream(lexer);
        VisLangParser parser       = new VisLangParser(tokens);

        try {
            ScopeResolver scope        = new ScopeResolver();
            Evaluator evaluator        = new Evaluator(scope);
            ParseTree tree             = parser.program();
            evaluator.visit(tree);
        } catch(ParseCancellationException e) {
            if(e.getCause() instanceof InputMismatchException ex) {
                System.out.println("Error at [" + ex.getOffendingToken().getLine() + ", " + ex.getOffendingToken().getCharPositionInLine() + "]: " + "Syntax Error");
            }
        }
    }
}
