package com.amore.design.factorymethod.impl;

import com.amore.design.factorymethod.IOperationFactory;
import com.amore.design.simplefactory.ICalculator;
import com.amore.design.simplefactory.impl.CalculatorAdd;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:37
 * @since 七月
 */
public class AddOperationFactory implements IOperationFactory<ICalculator> {
    @Override
    public ICalculator createObject() {
        return new CalculatorAdd();
    }
}
