/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.duke.proj;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class Evaluation {
    public static void main(String[] args) throws IOException {
        HashMap vars = new HashMap<String, Integer>();
        vars.put("invisible", 0);
        new EvalInput().evalRoll("(1 + 23d3 + 2)", vars, new Random());
    }
}
