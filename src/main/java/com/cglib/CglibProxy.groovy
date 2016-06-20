package com.cglib

import net.sf.cglib.proxy.Enhancer
/**
 * Created by @ssysong.ssy  2016-06-06 12:52
 */
public class CglibProxy  {
    private Enhancer enhancer = new Enhancer();



    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MyInterceptor());
        enhancer.setInterfaces(([NONE.class] as Class[]))
        return enhancer.create();
    }
}
