package com.handler;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class Test {

    class GrandFather {
        public void thinking() throws Throwable {
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather {
        public void thinking() throws Throwable {
            System.out.println("i am father");
        }
    }

    class Son extends Father {
        public void thinking() throws Throwable {
            MethodType mt = MethodType.methodType(void.class);
            MethodHandle mh = lookup().findSpecial(GrandFather.class,
                    "thinking", mt, getClass());
            mh.invoke(this);
        }
    }

    public static void main(String[] args) throws Throwable {
        (new Test().new Son()).thinking();
    }
}