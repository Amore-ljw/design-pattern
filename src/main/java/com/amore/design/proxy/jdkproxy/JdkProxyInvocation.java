package com.amore.design.proxy.jdkproxy;

import com.amore.design.proxy.staticproxy.impl.Son;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 17:56
 * @since 七月
 */
public class JdkProxyInvocation implements InvocationHandler {

    private Son son;

    public JdkProxyInvocation() {
        this.son = new Son();
    }

    public Object getProxyInstance() {
        //获取目标类的代理对象
        Class clazz = son.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        //调用目标方法
        method.invoke(son, args);
        System.out.println("后置通知");
        return null;
    }
}
