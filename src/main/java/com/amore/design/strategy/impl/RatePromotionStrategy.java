package com.amore.design.strategy.impl;

import com.amore.design.strategy.IPromotionStrategy;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 09:36
 * @description 折扣促销策略
 * @since 七月
 */
public class RatePromotionStrategy implements IPromotionStrategy<Double> {

    @Override
    public Double getResult(Double money) {
        if (money == null) return null;
        return new BigDecimal(money.toString()).multiply(new BigDecimal("0.8")).doubleValue();
    }
}
