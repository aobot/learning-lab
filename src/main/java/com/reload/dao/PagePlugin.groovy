package com.reload.dao

import com.reload.dao.dao.UserDao
import org.apache.ibatis.executor.CachingExecutor
import org.apache.ibatis.plugin.Interceptor
import org.apache.ibatis.plugin.Invocation
/**
 * Created by @ssysong.ssy  2016-06-03 16:06
 */

class PagePlugin implements Interceptor {
    String dialect

    @Override
    Object intercept(Invocation invocation) throws Throwable {
        println invocation
        return invocation.proceed()
    }

    @Override
    Object plugin(Object target) {
        if (target instanceof CachingExecutor){
            target.delegate.configuration.mapperRegistry.knownMappers.remove(UserDao.class)
            def map = target.delegate.configuration.mapperRegistry.knownMappers as Map
            println 'a'
            println map
        }
        return target
    }

    @Override
    void setProperties(Properties properties) {
        println properties
    }
}
