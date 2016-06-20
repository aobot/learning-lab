package com.bus

import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut

/**
 * Created by @ssysong.ssy  2016-06-16 17:31
 */
@Aspect
class MessageConverter {

    @Pointcut("")
    void post(){

    }
    @After("post()")
    def convert(){

    }
}
