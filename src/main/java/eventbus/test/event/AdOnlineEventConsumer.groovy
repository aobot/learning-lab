package eventbus.test.event

import com.google.common.eventbus.AllowConcurrentEvents
import com.google.common.eventbus.EventBus
import com.google.common.eventbus.Subscribe
import eventbus.test.IConsumer
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct
import javax.annotation.PreDestroy
import javax.annotation.Resource
import java.util.concurrent.TimeUnit

/**
 * Created by aobot on 2016-08-04 19:33.
 */
@Service('adOnlineEventConsumer')
class AdOnlineEventConsumer implements IConsumer {
    @Resource
    EventBus messageCenter

    @PostConstruct
    void init() {
        messageCenter.register(this)
    }

    @Subscribe
    @AllowConcurrentEvents
    void show(AdOnlineEvent event) {
        println Thread.currentThread().getName()
        println event
        TimeUnit.SECONDS.sleep(10)
        println Thread.currentThread().getName()
    }

    @PreDestroy
    void destroy(){
        messageCenter.unregister(this)
    }
}
