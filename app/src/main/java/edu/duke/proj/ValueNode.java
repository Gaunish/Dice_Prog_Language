package edu.duke.proj;

public class ValueNode extends ExpNode {
    private int value;
    public ValueNode(int input){
        this.value = input;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String getType() {
        return "Value";
    }
}
