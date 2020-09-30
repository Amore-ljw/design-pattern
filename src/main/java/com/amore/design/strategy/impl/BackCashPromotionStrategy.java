package com.amore.design.strategy.impl;

import com.amore.design.strategy.IPromotionStrategy;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 09:44
 * @since 七月
 */
public class BackCashPromotionStrategy implements IPromotionStrategy<Double> {
    @Override
    public Double getResult(Double aDouble) {
        if(aDouble == null || aDouble.compareTo(300.00) < 0) return aDouble;
        return new BigDecimal(aDouble.toString()).subtract(new BigDecimal("100")).doubleValue();
    }
}
