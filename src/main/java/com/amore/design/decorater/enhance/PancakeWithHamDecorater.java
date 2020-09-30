package com.amore.design.decorater.enhance;

import com.amore.design.decorater.IPancake;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 16:28
 * @since 七月
 */
public class PancakeWithHamDecorater extends PancakeDecorater {

    public PancakeWithHamDecorater(IPancake pancake) {
        super(pancake);
    }

    @Override
    public String basicFunction() {
        return super.basicFunction() + "加火腿";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }

}
