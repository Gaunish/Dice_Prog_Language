package edu.duke.proj;

import java.util.Random;

public class EvalExpVisitor extends AstVisitor<Integer> {
    @Override
    public Integer Visit(AddNode node) {
        return Visit(node.leftExp) + Visit(node.rightExp);
    }

    @Override
    public Integer Visit(SubNode node) {
        return Visit(node.leftExp) - Visit(node.rightExp);
    }

    @Override
    public Integer Visit(MulNode node) {
        return Visit(node.leftExp) * Visit(node.rightExp);
    }

    @Override
    public Integer Visit(DivNode node) {
        return Visit(node.leftExp) / Visit(node.rightExp);
    }

    @Override
    public Integer Visit(ValueNode node) {
        return node.getValue();
    }

    @Override
    public Integer Visit(RollNode node, Random randNumGen) {
        String str = "rollExp(" + node.getSides() + "," + node.getTimes() + ")";
        System.out.println(str);
        return 1;
    }

    @Override
    public Integer Visit(SingleRollNode node, Random randNumGen) {
        String str = "singleRollExp(" + node.getSides() + "," + "1" + ")";
        System.out.println(str);
        return 1;
    }

    @Override
    public Integer Visit(ConditionalNode node) {
        return null;
    }

    @Override
    public Integer Visit(VarNode node) {
        return null;
    }
}
