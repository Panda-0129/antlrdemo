package com.panda0129.controller;

import com.panda0129.gen.CalculatorLexer;
import com.panda0129.gen.CalculatorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    @RequestMapping(value = "/addStudent.html")
    public ModelAndView addStudent(MainContent content) throws Exception {
        ModelAndView modelAndView = new ModelAndView("result");
        InputStream is = new ByteArrayInputStream(content.getLanguage().getBytes("UTF-8"));
        ANTLRInputStream inputStream = new ANTLRInputStream(is);
        CalculatorLexer lexer = new CalculatorLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.prog();
        CalVisitor cal =  new CalVisitor();
        TranVisitor tran = new TranVisitor();


        cal.visit(tree);
        tran.visit(tree);

        StringBuilder resultMsg = new StringBuilder();
        for (int i : cal.result) {
            resultMsg.append(String.valueOf(i)).append("\n");
        }

        List<Token> tokenArrayList = tokens.get(0, tokens.size());
        StringBuilder tokenMsg = new StringBuilder();
        for (Token token : tokenArrayList) {
            if (!getTypeStr(token.getType()).equals("WS"))
                tokenMsg.append("[").append(token.getLine()).append(", ").append(token.getText()).append(", ")
                        .append(getTypeStr(token.getType())).append("]").append("\n");

        }

        StringBuilder prefixMsg = new StringBuilder();
        for (String i : tran.result) {
            prefixMsg.append(i).append("\n");
        }


        modelAndView.addObject("token", tokenMsg.toString());
        modelAndView.addObject("result", resultMsg.toString());
        modelAndView.addObject("prefix", prefixMsg.toString());
        modelAndView.addObject("language", content.getLanguage());
        return modelAndView;
    }

    public String getTypeStr (int type) {
        return CalculatorLexer.ruleNames[type - 1];
    }
}
