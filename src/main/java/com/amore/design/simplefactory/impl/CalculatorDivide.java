package com.amore.design.simplefactory.impl;


import com.amore.design.simplefactory.ICalculator;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 14:51
 * @since 七月
 */
public class CalculatorDivide implements ICalculator {
    @Override
    public BigDecimal calResult(String first, String end) {
        if (new BigDecimal("0").compareTo(new BigDecimal(end)) == 0) throw new RuntimeException("Division by zero");
        return new BigDecimal(first).divide(new BigDecimal(end));
    }
}
