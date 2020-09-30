package com.amore.design.version02;


import com.amore.design.simplefactory.ICalculator;
import com.amore.design.simplefactory.impl.CalculatorAdd;
import com.amore.design.simplefactory.impl.CalculatorDivide;
import com.amore.design.simplefactory.impl.CalculatorMultiply;
import com.amore.design.simplefactory.impl.CalculatorSubtract;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 15:24
 * @since 七月
 */

public class CalculatorDeleget {

    private static CalculatorDeleget instance = new CalculatorDeleget();

    private Map<String, ICalculator> map = null;

    //委派+策略
    private CalculatorDeleget() {
        map = new HashMap<>();
        map.put("+", new CalculatorAdd());
        map.put("-", new CalculatorSubtract());
        map.put("*", new CalculatorMultiply());
        map.put("/", new CalculatorDivide());
    }

    public static CalculatorDeleget getInstance(){
        return instance;
    }

    public BigDecimal calResult(String first, String cal, String end) {
        ICalculator calculator = map.get(cal);
        return calculator == null ? null : calculator.calResult(first, end);
    }
}
