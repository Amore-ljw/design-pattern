package com.amore.design.decorater.impl;

import com.amore.design.decorater.IPancake;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 16:12
 * @since 七月
 */
public class BasePancakeImpl implements IPancake {
    @Override
    public String basicFunction() {
        return "基础煎饼";
    }

    @Override
    public int getPrice() {
        return 5;//基础价格5元
    }

}
