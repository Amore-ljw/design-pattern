package com.amore.design.simplefactory.impl;


import com.amore.design.simplefactory.ICalculator;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 14:51
 * @since 七月
 */
public class CalculatorSubtract implements ICalculator {
    @Override
    public BigDecimal calResult(String first, String end) {
        return new BigDecimal(first).subtract(new BigDecimal(end));
    }
}
