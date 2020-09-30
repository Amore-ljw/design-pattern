package com.amore.design.decorater.enhance;

import com.amore.design.decorater.IPancake;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 16:14
 * @since 七月
 */
//装饰器抽象类
public abstract class PancakeDecorater implements IPancake {

    //静态代理
    private IPancake pancake;

    public PancakeDecorater(IPancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String basicFunction() {
        return pancake.basicFunction();
    }

    @Override
    public int getPrice() {
        return pancake.getPrice();
    }

}
