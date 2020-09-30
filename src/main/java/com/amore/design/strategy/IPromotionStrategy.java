package com.amore.design.strategy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 09:33
 * @since 七月
 */
public interface IPromotionStrategy<T> {
    T getResult(T t);
}
