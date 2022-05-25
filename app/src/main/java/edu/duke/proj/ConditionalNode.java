package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public class ConditionalNode extends ExpNode{
    ExpNode condExp;
    ExpNode opt1Exp;
    ExpNode opt2Exp;

    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        return null;
    }
}
