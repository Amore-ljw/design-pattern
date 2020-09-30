package com.amore.design.simplefactory;

import com.amore.design.simplefactory.impl.CalculatorStrategy;
import com.amore.design.simplefactory.util.ParamValidaUtil;

import java.util.Scanner;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 18:14
 * @since 七月
 */
public class CalculatorFactoryTest {

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
        //获取策略
        CalculatorStrategy instance = CalculatorStrategy.getCalculator(cal);
        //工厂获取计算器
        ICalculator calculator = CalculatorFactory.create(instance);
        System.out.println(calculator.calResult(first,end));
    }
}
