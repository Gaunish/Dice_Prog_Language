package edu.duke.proj;

public abstract class AstVisitor<T> {
    public abstract T Visit(AddNode node);
    public abstract T Visit(SubNode node);
    public abstract T Visit(MulNode node);
    public abstract T Visit(DivNode node);
    public abstract T Visit(ValueNode node);
    public abstract T Visit(RollNode node);
    public abstract T Visit(SingleRollNode node);

    public T Visit(ExpNode node)
    {
        switch (node.getType()){
            case "Add":
                return Visit((AddNode)node);
            case "Div":
                return Visit((DivNode)node);
            case "Mul":
                return Visit((MulNode)node);
            case "Roll":
                return Visit((RollNode)node);
            case "SingleRoll":
                return Visit((SingleRollNode)node);
            case "Sub":
                return Visit((SubNode)node);
            case "Value":
                return Visit((ValueNode)node);
            default:
                throw new IllegalArgumentException("the operation is not supported");
        }
    }

}
