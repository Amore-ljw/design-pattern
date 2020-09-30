package com.amore.design.decorater;

import com.amore.design.decorater.enhance.PancakeWithEggDecorater;
import com.amore.design.decorater.enhance.PancakeWithHamDecorater;
import com.amore.design.decorater.impl.BasePancakeImpl;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 16:30
 * @since 七月
 */
public class PancakeDecoraterTest {

    public static void main(String[] args) {
        //装饰前后满足is-a的关系
        IPancake pancakewithegg = new PancakeWithEggDecorater(new BasePancakeImpl());
        System.out.println(pancakewithegg.basicFunction() + ":" + pancakewithegg.getPrice());

        //==================================================================
        IPancake pancakewith2egg = new PancakeWithEggDecorater(new PancakeWithEggDecorater(new BasePancakeImpl()));
        System.out.println(pancakewith2egg.basicFunction() + ":" + pancakewith2egg.getPrice());

        //==================================================================
        IPancake pancakewitheggham = new PancakeWithHamDecorater(new PancakeWithEggDecorater(new BasePancakeImpl()));
        System.out.println(pancakewitheggham.basicFunction() + ":" + pancakewitheggham.getPrice());

    }

}
