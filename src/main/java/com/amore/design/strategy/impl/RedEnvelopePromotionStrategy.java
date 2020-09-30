package com.amore.design.strategy.impl;

import com.amore.design.strategy.IPromotionStrategy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 09:52
 * @since 七月
 */
public class RedEnvelopePromotionStrategy implements IPromotionStrategy<Double> {
    @Override
    public Double getResult(Double aDouble) {
        if(aDouble == null) return aDouble;
        return 88.0;
    }
}
