package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public class SubNode extends ArithmeticNode {
    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        return this.leftExp.eval(vars, randNumGen) - this.rightExp.eval(vars, randNumGen);
    }
}
