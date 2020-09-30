package com.amore.design.strategy;

import com.amore.design.strategy.impl.BasePromotionStrategy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 09:54
 * @since 七月
 */
//管理所有的策略，使用客户端屏蔽具体实现
public class PromotionStrategyContext {

    private IPromotionStrategy<Double> promotionStrategy;
    //简单工厂+策略
    public PromotionStrategyContext(String strategy) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(strategy);
        promotionStrategy = (IPromotionStrategy)clazz.newInstance();
    }

    public Double calPromotionPrice(Double money) {
        if (promotionStrategy == null) { return money; }
        return promotionStrategy.getResult(money);
    }

}
