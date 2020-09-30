package com.amore.design.proxy.staticproxy;

import com.amore.design.proxy.staticproxy.impl.ProxySon;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 17:53
 * @since 七月
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //获取代理对象
        ProxySon proxy = new ProxySon();
        proxy.findLover();
        System.out.println();
        proxy.chatFamily();
    }
}
