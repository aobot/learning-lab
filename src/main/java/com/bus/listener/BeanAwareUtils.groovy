package com.bus.listener
import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.stereotype.Component
/**
 * Created by @ssysong.ssy  2016-06-17 05:48
 */
@Component('beanAwareUtils')
class BeanAwareUtils implements BeanDefinitionRegistryPostProcessor {
    @Override
    void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        println registry
    }

    @Override
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        println beanFactory
    }
}
