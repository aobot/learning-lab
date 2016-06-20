package com.cglib

import net.sf.cglib.proxy.MethodInterceptor
import net.sf.cglib.proxy.MethodProxy

import java.lang.reflect.Method

/**
 * Created by @ssysong.ssy  2016-06-06 12:58
 */
class MyInterceptor implements MethodInterceptor {
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (!method.getName().equals('work')) {
            return null
        }
        System.out.println("start");
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println("end");
        return result;
    }
}
