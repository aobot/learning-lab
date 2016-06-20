package com.aop

import org.springframework.beans.factory.xml.NamespaceHandlerSupport

/**
 * Created by @ssysong.ssy  2016-06-05 23:08
 */
class AopHandler extends NamespaceHandlerSupport {
    @Override
    void init() {
        registerBeanDefinitionParser('aop', new AopParser())
    }
}
