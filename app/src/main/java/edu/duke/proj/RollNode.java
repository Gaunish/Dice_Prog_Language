package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public class RollNode extends ExpNode {
    ExpNode times;
    ExpNode sides;

    public ExpNode getSides() {
        return sides;
    }
    public ExpNode getTimes() {
        return times;
    }


    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        return null;
    }
}
