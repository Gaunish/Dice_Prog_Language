package edu.duke.proj;

import java.util.HashMap;
import java.util.Random;

public class TypeNode<T> extends ExpNode{
    public T val;
    
    public TypeNode(T val){
        this.val = val;
    }

    @Override
    public Integer eval(HashMap<String, Integer> vars, Random randNumGen) {
        System.out.println("Type");
        return 0;
    }
}
