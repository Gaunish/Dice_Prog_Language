package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public class SingleRollNode extends ExpNode {
    ExpNode sides;

    public ExpNode getSides() {
        return sides;
    }

    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        return null;
    }
}
