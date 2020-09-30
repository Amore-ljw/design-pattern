package com.amore.design.version01;

import com.amore.design.simplefactory.impl.CalculatorAdd;
import com.amore.design.simplefactory.impl.CalculatorDivide;
import com.amore.design.simplefactory.impl.CalculatorMultiply;
import com.amore.design.simplefactory.impl.CalculatorSubtract;
import com.amore.design.simplefactory.util.ParamValidaUtil;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 14:48
 * @since 七月
 */
public class CalculatorOOP {
    public static void main(String[] args) {
        System.out.println("请输入第一个数:");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        if (!ParamValidaUtil.validInput(first)) return;
        System.out.println("请输入计算符号:");
        String cal = scanner.next();
        System.out.println("输入第二个数:");
        String end = scanner.next();
        if (!ParamValidaUtil.validInput(end)) return;
        System.out.println(calResult(first, cal, end));
    }

    //选择计算类型
    public static BigDecimal calResult(String first, String cal, String end) {
        BigDecimal result = new BigDecimal("0");
        //比较if...else与switch...case
        switch (cal) {
            case "+":
                result = new CalculatorAdd().calResult(first, end);
                break;
            case "-":
                result = new CalculatorSubtract().calResult(first, end);
                break;
            case "*":
                result = new CalculatorMultiply().calResult(first, end);
                break;
            case "/":
                result = new CalculatorDivide().calResult(first, end);
                break;
        }
        return result;
    }
}
