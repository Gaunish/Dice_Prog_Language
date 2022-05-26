package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public abstract class ExpNode {
    public abstract Integer eval(HashMap<String, Integer> vars, Random randNumGen);

}
