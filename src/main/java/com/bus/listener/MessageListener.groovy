package com.bus.listener

import com.bus.event.AnotherEvent
import com.bus.event.Passenger
import com.google.common.eventbus.AllowConcurrentEvents
import com.google.common.eventbus.DeadEvent
import com.google.common.eventbus.Subscribe
import org.springframework.stereotype.Component

/**
 * Created by @ssysong.ssy  2016-06-16 15:19
 */
@Component('messageListener')
class MessageListener implements Listener {

    @Subscribe
    @AllowConcurrentEvents
    void listen(Passenger passenger) {
        println passenger
        logger.info("${passenger}")
    }


    @Subscribe
    void listen(Object obj) {
        try {
            def registryField = bus.class.getDeclaredField('subscribers')
            registryField.setAccessible(true)
            def registry = registryField.get(bus)
            def field2 = registry.class.getDeclaredField('subscribers')
            field2.setAccessible(true)
            def map = field2.get(registry)
            println registry
        } catch (e) {
            println e
        }
        if (obj.class == Object.class) {
            println 'listen(Object obj)' + obj
        } else {
            println 'listen(Object obj) -> 其他 ' + obj
        }
    }

    @Subscribe
    void listen(AnotherEvent event) {
        println 'another event' + event
    }

    @Subscribe
    void defaultListen(DeadEvent event) {
        println "dead event : ${event}"
        logger.info("dead event : ${event}")
        this.class.getInterfaces()
    }


}
