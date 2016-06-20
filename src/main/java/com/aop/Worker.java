package com.aop;

import org.springframework.stereotype.Component;

/**
 * Created by @ssysong.ssy  2016-06-01 21:57
 */


@Component("worker")
class Worker {

    public void work(String words) {
        System.out.println("work," + words);
    }

    public void work(GName gname) {
        System.out.println(gname.getName());
    }

    public void work(Object work,int x){
        System.out.println("work in Woker");
    }
}
