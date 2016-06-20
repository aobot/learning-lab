package com.cglib;

import org.junit.Test;

/**
 * Created by @ssysong.ssy  2016-06-06 12:54
 */
public class CglibProxyTest {

    @Test
    public void testA() {
        CglibProxy proxy = new CglibProxy();
        Worker worker = (Worker) proxy.getProxy(Worker.class);
        worker.work();
    }

}