package com.amore.design.simplefactory;

import com.amore.design.simplefactory.impl.*;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 17:36
 * @since 七月
 */
public class CalculatorFactory {

    //简单工厂
    public static ICalculator create(CalculatorStrategy cal){
        ICalculator calculator = null;
        switch (cal) {
            case CALADD:
                calculator = new CalculatorAdd();
                break;
            case CALSUBTRACT:
                calculator = new CalculatorSubtract();
                break;
            case CALMULTIPLY:
                calculator = new CalculatorMultiply();
                break;
            case CALDIVIDE:
                calculator = new CalculatorDivide();
                break;
            default:
                break;
        }
        return calculator;
    }

}
