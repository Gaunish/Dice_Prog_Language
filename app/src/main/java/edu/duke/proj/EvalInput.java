package edu.duke.proj;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.util.HashMap;


//refer to The Definitive ANTLR 4 Reference
public class EvalInput {
    public static void test1() throws IOException {
        ANTLRInputStream input = new ANTLRInputStream("1+1");
        inputLexer lexer = new inputLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        inputParser parser = new inputParser(tokenStream);
        inputParser.ProgContext context = parser.prog();
        ExpNode node = new BuildAstVisitor().visitProg(context);
        System.out.println(context.toStringTree(parser));

    }
    public int evalRoll(String rollStr, HashMap<String, Integer> vars, java.util.Random randNumGen){
        ANTLRInputStream input = new ANTLRInputStream(rollStr);
        inputLexer lexer = new inputLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        inputParser parser = new inputParser(tokenStream);
        inputParser.ProgContext context = parser.prog();
        ExpNode node = new BuildAstVisitor().visitProg(context);
        //int result = new EvalExpVisitor().Visit(node);
        int result =  node.eval(vars, randNumGen);
        System.out.println(result);
        return result;
    }

}