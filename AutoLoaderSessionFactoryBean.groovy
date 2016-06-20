package com.plugin.utils

import org.apache.ibatis.session.SqlSessionFactory
import org.springframework.beans.factory.FactoryBean

public class AutoLoaderSessionFactoryBean implements FactoryBean<SqlSessionFactory>{


    @Override
    SqlSessionFactory getObject() throws Exception {
        return null
    }

    @Override
    Class<?> getObjectType() {
        return AutoLoaderSessionFactoryBean.class
    }

    @Override
    boolean isSingleton() {
        return true
    }
}
