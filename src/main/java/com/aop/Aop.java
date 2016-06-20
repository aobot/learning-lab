package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by @ssysong.ssy  2016-06-01 21:45
 */

@Component("aop")
@Aspect
public class Aop {

//    @Pointcut(value = "execution(* com.aop.Worker.work(java.lang.Object,int)) && args(name,x)", argNames = "name,x")
//    public void pointCut(GName name, int x) {
//    }
//
//    @Before(value = "pointCut(java.lang.Object,int) && args(name,x))", argNames = "name,x")
//    public void before(GName name, int x) {
//        name.setName("b");
//        System.out.println("x : " + x);
//        System.out.println("before," + name);
//    }

}
