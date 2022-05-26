package edu.duke.proj;

//build AST tree
public class BuildAstVisitor extends inputBaseVisitor<ExpNode>{
    @Override
    public ExpNode visitProg(inputParser.ProgContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public ExpNode visitValueExp(inputParser.ValueExpContext ctx) {
        return new ValueNode(Integer.valueOf(ctx.INT().getText()));
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

    @Override
    public ExpNode visitConditionalExp(inputParser.ConditionalExpContext ctx) {
        ConditionalNode node = new ConditionalNode();
        node.condExp = visit(ctx.cond);
        node.opt1Exp = visit(ctx.opt1);
        node.opt2Exp = visit(ctx.opt2);
        return node;
    }

    @Override
    public ExpNode visitVarExp(inputParser.VarExpContext ctx) {
        return new VarNode(String.valueOf(ctx.ID().getText()));
    }

    @Override
    public ExpNode visitSingleRollExp(inputParser.SingleRollExpContext ctx) {
        return new SingleRollNode(String.valueOf(ctx.SINGLEROLL().getText()));
    }

    @Override
    public ExpNode visitRollExp(inputParser.RollExpContext ctx) {
        return new RollNode(String.valueOf(ctx.ROLL().getText()));
    }
}
