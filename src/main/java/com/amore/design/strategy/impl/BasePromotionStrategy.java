package com.amore.design.strategy.impl;

import com.amore.design.strategy.IPromotionStrategy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 10:04
 * @since 七月
 */
public class BasePromotionStrategy implements IPromotionStrategy<Double> {
    @Override
    public Double getResult(Double aDouble) {
        return aDouble;
    }
}
