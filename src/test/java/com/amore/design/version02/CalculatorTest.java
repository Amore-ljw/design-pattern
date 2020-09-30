package com.amore.design.version02;

import com.amore.design.simplefactory.util.ParamValidaUtil;

import java.util.Scanner;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 15:40
 * @since 七月
 */
public class CalculatorTest {
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
        CalculatorDeleget instance = CalculatorDeleget.getInstance();
        System.out.println(instance.calResult(first, cal, end).toString());
    }
}
