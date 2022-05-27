package edu.duke.proj;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Random;

public class TypeDefNode extends ExpNode {
    List<ExpNode> types;
    
    public TypeDefNode(){
        types = new ArrayList<ExpNode>();
    }

    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        System.out.println("TypeNode");
        return 0;
    }
}
