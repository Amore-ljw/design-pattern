package com.amore.design.factorymethod.impl;

import com.amore.design.factorymethod.IOperationFactory;
import com.amore.design.simplefactory.ICalculator;
import com.amore.design.simplefactory.impl.CalculatorAdd;
import com.amore.design.simplefactory.impl.CalculatorMultiply;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-18 15:37
 * @since 七月
 */
public class MulOperationFactory implements IOperationFactory<ICalculator> {
    @Override
    public ICalculator createObject() {
        return new CalculatorMultiply();
    }
}
