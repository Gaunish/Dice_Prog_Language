package edu.duke.proj;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;


//refer to The Definitive ANTLR 4 Reference
public class grammarTest {
    public static void test() throws IOException {
        ANTLRInputStream input = new ANTLRInputStream("1+d30*4d5");
        inputLexer lexer = new inputLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        edu.duke.proj.inputParser parser = new inputParser(tokenStream);
        inputParser.ProgContext context = parser.prog();
        System.out.println(context.toStringTree(parser));

    }
}