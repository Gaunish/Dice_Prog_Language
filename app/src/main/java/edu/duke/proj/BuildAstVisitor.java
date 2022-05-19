package edu.duke.proj;

public class BuildAstVisitor extends inputBaseVisitor<ExpNode>{
    @Override
    public ExpNode visitProg(inputParser.ProgContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public ExpNode visitValueExp(inputParser.ValueExpContext ctx) {
        return visit(ctx.INT());
    }

    @Override
    public ExpNode visitParensExp(inputParser.ParensExpContext ctx){
        return visit(ctx.exp());
    }

    @Override
    public ExpNode visitArithmeticExp(inputParser.ArithmeticExpContext ctx){
        ArithmeticNode node;
        switch (ctx.op.getType()){
            case inputLexer.ADD:
                node = new AddNode();
                break;
            case inputLexer.SUB:
                node = new SubNode();
                break;
            case inputLexer.MUL:
                node = new MulNode();
                break;
            case inputLexer.DIV:
                node = new DivNode();
                break;
            default:
                throw new IllegalArgumentException("the operation is not supported");
        }
        node.leftExp = visit(ctx.leftExp);
        node.rightExp = visit(ctx.rightExp);

        return node;
    }

}
