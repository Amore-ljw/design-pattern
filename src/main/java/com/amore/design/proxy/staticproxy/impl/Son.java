package com.amore.design.proxy.staticproxy.impl;

import com.amore.design.proxy.staticproxy.ISuperParent;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 17:45
 * @since 七月
 */
public class Son implements ISuperParent {
    @Override
    public void findLover() {
        System.out.println("目标对象需求");
        System.out.println("180");
        System.out.println("腿长腰细");
    }

    @Override
    public void chatFamily() {
        System.out.println("目标对象家庭情况");
        System.out.println("没有兄弟");
    }
}
