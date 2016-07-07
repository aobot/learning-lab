package com.reload.dao

import org.apache.ibatis.cache.Cache

import java.util.concurrent.locks.ReadWriteLock

/**
 * Created by @ssysong.ssy  2016-06-21 14:53
 */
class RedisCache implements Cache{
    @Override
    String getId() {
        return null
    }

    @Override
    void putObject(Object key, Object value) {

    }

    @Override
    Object getObject(Object key) {
        return null
    }

    @Override
    Object removeObject(Object key) {
        return null
    }

    @Override
    void clear() {

    }

    @Override
    int getSize() {
        return 0
    }

    @Override
    ReadWriteLock getReadWriteLock() {
        return null
    }
}
