package com.amore.design.simplefactory.impl;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-15 17:39
 * @since 七月
 */
public enum CalculatorStrategy {
    CALADD("+"), CALSUBTRACT("-"), CALMULTIPLY("*"), CALDIVIDE("/");

    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    CalculatorStrategy(String symbol) {
        this.symbol = symbol;
    }

    public static CalculatorStrategy getCalculator(String symbol) {
        if (symbol == null || symbol.isEmpty()) return null;
        CalculatorStrategy[] lists = CalculatorStrategy.values();
        for (CalculatorStrategy instance : lists) {
            if (symbol.equalsIgnoreCase(instance.getSymbol())) {
                return instance;
            }
        }
        return null;
    }
}
