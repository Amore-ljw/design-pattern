package com.amore.design.proxy.staticproxy.impl;

import com.amore.design.proxy.staticproxy.ISuperParent;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 17:47
 * @since 七月
 */
public class ProxySon implements ISuperParent {

    private Son son;

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    @Override
    public void findLover() {
        //功能增强
        System.out.println("找目标对象");
        if (son == null) son = new Son();
        son.findLover();
        System.out.println("约定见面");
    }

    @Override
    public void chatFamily() {
        //功能增强
        System.out.println("约见地点");
        if (son == null) son = new Son();
        son.chatFamily();
        System.out.println("完成");
    }
}
