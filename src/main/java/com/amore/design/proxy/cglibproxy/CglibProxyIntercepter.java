package com.amore.design.proxy.cglibproxy;

import com.amore.design.proxy.staticproxy.impl.Son;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Administrator
 * @site www.baidu.com
 * @create 2020-07-17 19:11
 * @since 七月
 */
public class CglibProxyIntercepter implements MethodInterceptor {

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        //设置需要被代理的对象，继承它
        enhancer.setSuperclass(Son.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("后置通知");
        return obj;
    }
}
