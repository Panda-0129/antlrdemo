package com.panda0129.controller;

import com.panda0129.gen.CalculatorBaseVisitor;
import com.panda0129.gen.CalculatorParser;

import java.util.ArrayList;

public class TranVisitor extends CalculatorBaseVisitor<String> {

    ArrayList<String> result = new ArrayList<String>();

    @Override
    public String visitProg(CalculatorParser.ProgContext ctx) {
        StringBuilder val = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            val.append(visit(ctx.stat(i)));
        }
//        System.out.println("val.toString()" + val.toString());
        result.add(val.toString());
        return val.toString();
    }

    @Override
    public String visitExprStat(CalculatorParser.ExprStatContext ctx) {
//        System.out.println(visit(ctx.expr()));
        return visit(ctx.expr()) + ";\n";
    }

    @Override
    public String visitAssignStat(CalculatorParser.AssignStatContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        return id + "=" + value + ";\n";
    }

    @Override
    public String visitAddSubExpr(CalculatorParser.AddSubExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));

        if (ctx.op.getType() == CalculatorParser.ADD)
            return left + right + "+";
        return left + right + "-";
    }

    @Override
    public String visitMulDivExpr(CalculatorParser.MulDivExprContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));

        if (ctx.op.getType() == CalculatorParser.MUL)
            return left + right + "*";
        return left + right + "/";
    }

    @Override
    public String visitParenExpr(CalculatorParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitIdExpr(CalculatorParser.IdExprContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitIntExpr(CalculatorParser.IntExprContext ctx) {
        return ctx.INT().getText();
    }
}
