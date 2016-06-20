package com.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut

/**
 * Created by @ssysong.ssy  2016-06-16 17:34
 */

@Aspect
class WorkAdvice {

    @Pointcut(value = "execution (void com.aspect.GWork*)")
    void work(){}

    @Before(value = 'work()')
    def before(){
        println 'before'
    }
}
