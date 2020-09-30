package com.amore.design.factorymethod;

import com.amore.design.factorymethod.impl.AddOperationFactory;
import com.amore.design.simplefactory.ICalculator;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:41
 * @since 七月
 */
public class OperationFactoryTest {

    public static void main(String[] args) {
        IOperationFactory<ICalculator> factory = new AddOperationFactory();
        ICalculator object = factory.createObject();
        System.out.println(object.calResult("1.8","3.7").toString());
    }
}
