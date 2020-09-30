package com.amore.design.proxy.cglibproxy;

import com.amore.design.proxy.staticproxy.impl.Son;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 19:19
 * @since 七月
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E:/tools/jad/");
        CglibProxyIntercepter intercepter = new CglibProxyIntercepter();
        Son proxyInstance = (Son)intercepter.getProxyInstance();
        //Son$$EnhancerByCGLIB$$18bbf4ed
        System.out.println(proxyInstance.getClass().getSimpleName());
        //将cglib生成的字节码生成到磁盘中
        System.out.println("=============================");
        proxyInstance.findLover();
        System.out.println("=============================");
        proxyInstance.chatFamily();
        System.out.println("=============================");
    }
}
