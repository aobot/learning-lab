package com.handler;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * Created by @ssysong.ssy  2016-06-10 21:39
 */
public class JHandle {
    public void fun() {
        System.out.println("hello");
    }

    public static void main(String[] args) throws Throwable {
        new JHandle().fun2();
    }

    public void fun2() throws NoSuchMethodException, IllegalAccessException {
        MethodHandle handle = MethodHandles.lookup().findVirtual(JHandle.class, "fun", MethodType.methodType(void.class));
        System.out.println();
    }
}
