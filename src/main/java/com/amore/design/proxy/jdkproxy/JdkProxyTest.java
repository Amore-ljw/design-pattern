package com.amore.design.proxy.jdkproxy;

import com.amore.design.proxy.staticproxy.ISuperParent;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 18:21
 * @since 七月
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        JdkProxyInvocation invocation = new JdkProxyInvocation();
        ISuperParent proxy = (ISuperParent)invocation.getProxyInstance();
        System.out.println(proxy.getClass());
        //字节码重组：生成的代理对象写出到本地磁盘中
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{ISuperParent.class});
            FileOutputStream stream = new FileOutputStream(new File("E:\\tools\\jad\\$Proxy0.class"));
            stream.write(bytes);
            stream.flush();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("====================");
        proxy.findLover();
        System.out.println("====================");
        proxy.chatFamily();
    }
}
