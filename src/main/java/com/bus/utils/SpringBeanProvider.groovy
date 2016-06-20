package com.bus.utils

import org.springframework.beans.BeansException
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Service

/**
 * Created by @ssysong.ssy  2016-06-16 15:33
 */

@Service('springBeanProvider')
class SpringBeanProvider implements ApplicationContextAware {

    static ApplicationContext CONTEXT

    @Override
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext
    }

    def getBean(String name) {
        return CONTEXT.getBean(name)
    }
}
