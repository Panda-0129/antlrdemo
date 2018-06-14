package com.panda0129.controller;


import com.panda0129.gen.CalculatorBaseVisitor;
import com.panda0129.gen.CalculatorParser;

import java.util.ArrayList;
import java.util.HashMap;

public class CalVisitor extends CalculatorBaseVisitor<Integer> {

    private HashMap<String, Integer> memory = new HashMap<String, Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    /**
     * ID EQ expr SEMI
     */
    @Override
    public Integer visitAssignStat(CalculatorParser.AssignStatContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        result.add(value);
        memory.put(id, value);
        return value;
    }

    /**
     * expr SEMI
     */
    @Override
    public Integer visitExprStat(CalculatorParser.ExprStatContext ctx) {
        Integer value = visit(ctx.expr());
        result.add(value);
        return 0;
    }

    /**
     * expr op = (MUL | DIV ) expr
     */
    @Override
    public Integer visitMulDivExpr(CalculatorParser.MulDivExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.MUL)
            return left * right;
        return left / right;
    }

    /**
     * expr op = ( ADD | SUB ) expr
     */
    @Override
    public Integer visitAddSubExpr(CalculatorParser.AddSubExprContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == CalculatorParser.ADD)
            return left + right;
        return left - right;
    }

    /**
     * INT
     */
    @Override
    public Integer visitIntExpr(CalculatorParser.IntExprContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * ID
     */
    @Override
    public Integer visitIdExpr(CalculatorParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id))
            return memory.get(id);
        return 0;
    }

    /**
     * LPAREN expr RPAREN
     */
    @Override
    public Integer visitParenExpr(CalculatorParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }
}
