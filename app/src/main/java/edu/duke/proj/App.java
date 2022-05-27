package edu.duke.proj;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        HashMap vars = new HashMap<String, Integer>();
        vars.put("invisible", 0);
        new EvalInput().evalRoll("d3 + (invisible?(1 + 3d30):(2*2d3))", vars, new Random());
    }
}
