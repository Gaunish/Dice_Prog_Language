package edu.duke.proj;

public class SingleRollNode extends ExpNode {
    AstNode sides;
    public AstNode getSides() {
        return sides;
    }

    @Override
    public String getType() {
        return "SingleRoll";
    }
}
