package com.amore.design.strategy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 10:26
 * @since 七月
 */
//客户端
public class PromotionStrategyTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //屏蔽了具体的算法实现
        PromotionStrategyContext strategyContext = new PromotionStrategyContext("com.amore.design.strategy.impl.RatePromotionStrategy");
        Double price = strategyContext.calPromotionPrice(389.00);
        System.out.println("实际支付：" + price);
    }
}
