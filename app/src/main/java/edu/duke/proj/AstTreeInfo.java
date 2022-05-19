package edu.duke.proj;

public class AstTreeInfo extends AstVisitor<String> {
    @Override
    public String Visit(AddNode node) {
        String str = "addExp(" + node.getLeft() + "," + node.getRight() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(SubNode node) {
        String str = "subExp(" + node.getLeft() + "," + node.getRight() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(MulNode node) {
        String str = "mulExp(" + node.getLeft() + "," + node.getRight() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(DivNode node) {
        String str = "divExp(" + node.getLeft() + "," + node.getRight() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(ValueNode node) {
        String str = "valueExp(" + node.getValue() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(RollNode node) {
        String str = "rollExp(" + node.getSides() + "," + node.getTimes() + ")";
        System.out.println(str);
        return str;
    }

    @Override
    public String Visit(SingleRollNode node) {
        String str = "singleRollExp(" + node.getSides() + "," + "1" + ")";
        System.out.println(str);
        return str;
    }
}
