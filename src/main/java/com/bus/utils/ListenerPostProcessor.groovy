package com.bus.utils

import com.bus.listener.Listener
import com.google.common.eventbus.EventBus
import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created by @ssysong.ssy  2016-06-16 15:31
 */

@Service
class ListenerPostProcessor implements BeanPostProcessor {
    @Resource
    SpringBeanProvider springBeanProvider
    @Resource
    EventBus bus

    @Override
    Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        if (bean instanceof Listener) {
            bean.metaClass."bus" = bus
        }
        return bean
    }

    @Override
    Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        if (bean instanceof Listener) {
            bus.register(bean)
        }
        return bean
    }
}
