package com.amore.design.factorymethod;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:32
 * @since 七月
 */
public interface IOperationFactory<T> {

    T createObject();
}
