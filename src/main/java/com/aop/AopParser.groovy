package com.aop

import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser
import org.w3c.dom.Element
/**
 * Created by @ssysong.ssy  2016-06-05 23:04
 */
class AopParser extends AbstractSingleBeanDefinitionParser{
    @Override
    protected Class<?> getBeanClass(Element element) {
        return Aop.class
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {

    }
}
