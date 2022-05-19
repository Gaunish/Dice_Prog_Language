package edu.duke.proj;

public abstract class ArithmeticNode extends ExpNode {
    AstNode leftExp;
    AstNode rightExp;

    public AstNode getRight() {
        return rightExp;
    }

    public AstNode getLeft() {
        return leftExp;
    }
}
