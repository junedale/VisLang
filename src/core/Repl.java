package core;

import core.interpreter.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Repl {

    public static void main(String[] args) {
        try {
            if(args.length == 0) {
                System.out.println("Usage: VisLang <Path to file><Filename>.vis");
                System.exit(-1);
            }

            InputStream file = new FileInputStream(args[0]);
            Interpreter interpreter = new Interpreter();
            interpreter.run(file);
        } catch(IOException e) {
            System.out.println("Error running program: " + e.getMessage());
            System.exit(-1);
        } finally {
            System.exit(0);
        }
    }
}
