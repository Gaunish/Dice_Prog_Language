package edu.duke.proj;

public class RollNode extends ExpNode {
    AstNode times;
    AstNode sides;

    public AstNode getSides() {
        return sides;
    }
    public AstNode getTimes() {
        return times;
    }

    @Override
    public String getType() {
        return "Roll";
    }
}
