package core;

import core.antlr4.VisLangLexer;
import core.antlr4.VisLangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) {
        CharStream input           = CharStreams.fromString("num = 0;");
        VisLangLexer lexer         = new VisLangLexer(input);
        CommonTokenStream tokens   = new CommonTokenStream(lexer);
        VisLangParser parser       = new VisLangParser(tokens);
        ParseTree tree             = parser.program();
    }
}
