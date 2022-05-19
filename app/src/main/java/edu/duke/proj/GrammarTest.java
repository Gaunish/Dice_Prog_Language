package edu.duke.proj;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;


//refer to The Definitive ANTLR 4 Reference
public class GrammarTest {
    public static void test() throws IOException {
        ANTLRInputStream input = new ANTLRInputStream("1+d40+dd+3d3+dd3+33d3");
        inputLexer lexer = new inputLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        inputParser parser = new inputParser(tokenStream);
        inputParser.ProgContext context = parser.prog();
        ExpNode node = new BuildAstVisitor().visitProg(context);
        String str = new AstTreeInfo().Visit(node);
        System.out.println(context.toStringTree(parser));

    }
}