package com.amore.design.base;

import com.amore.design.simplefactory.util.ParamValidaUtil;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 11:11
 * @since 七月
 */
public class Calculator {

    //请用一种 面向对象语言 实现一个 计算器控制台程序， 要求： 输入两个数 和 运算符号，得到结果。”
    public static void main(String[] args) {
        try {
            System.out.println("请输入第一个数:");
            Scanner scanner = new Scanner(System.in);
            String first = scanner.next();
            if (!ParamValidaUtil.validInput(first)) return;
            System.out.println("请输入计算符号:");
            String cal = scanner.next();
            System.out.println("输入第二个数:");
            String end = scanner.next();
            if (!ParamValidaUtil.validInput(end)) return;
            System.out.println(first + cal + end + "=" + calResult(first, cal, end));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String calResult(String first, String cal, String end) {
        //多重条件优先选择switch...case
        if ("+".equalsIgnoreCase(cal)) {
            return new BigDecimal(first).add(new BigDecimal(end)).toString();
        } else if ("-".equalsIgnoreCase(cal)) {
            return new BigDecimal(first).subtract(new BigDecimal(end)).toString();
        } else if ("*".equalsIgnoreCase(cal)) {
            return new BigDecimal(first).multiply(new BigDecimal(end)).toString();
        } else if ("/".equalsIgnoreCase(cal)) {
            return new BigDecimal(first).divide(new BigDecimal(end)).toString();
        }
        return "cal error";
    }
}
