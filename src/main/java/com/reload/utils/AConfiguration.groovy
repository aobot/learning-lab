package com.reload.utils

import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.Configuration

import java.lang.reflect.Field

/**
 * Created by @ssysong.ssy  2016-07-17 15:50
 */
class AConfiguration extends Configuration {
    volatile boolean initialized = false

    AConfiguration(Configuration configuration) {
        super(configuration.environment)
        if (!initialized) {
            initOnce()
        }
    }

    AConfiguration(Environment environment) {
        super(environment)
        if (!initialized) {
            initOnce()
        }
    }

    AConfiguration() {
        super()
        if (!initialized) {
            initOnce()
        }
    }

    /**
     * change members that of type StrictMap to tyep NamedConcurrentHashMap
     *
     * !!! should run once for a specific obj !!!
     * @return
     */

    private final synchronized void initOnce() {
        if (initialized) {
            return
        }
        def fields = Configuration.class.getDeclaredFields()
        for (Field field in fields) {
            field.setAccessible(true)
            def obj = field.get(this)
            if (obj instanceof Configuration.StrictMap) {
                field.set(this, new NamedConcurrentHashMap(field.name))
            }
            field.setAccessible(false)
        }

        initialized = true
    }

}

