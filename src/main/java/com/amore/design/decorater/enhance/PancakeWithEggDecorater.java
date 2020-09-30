package com.amore.design.decorater.enhance;

import com.amore.design.decorater.IPancake;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 16:22
 * @since 七月
 */
public class PancakeWithEggDecorater extends PancakeDecorater{

    public PancakeWithEggDecorater(IPancake pancake) {
        super(pancake);
    }

    @Override
    public String basicFunction() {
       return super.basicFunction() + "加一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
