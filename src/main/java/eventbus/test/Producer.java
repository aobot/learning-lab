package eventbus.test ;

import com.google.common.eventbus.EventBus;
import eventbus.test.event.AdOnlineEvent;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aobot on 2016-08-04 19:26.
 */
@Service("producer")
public class Producer {
    @Resource
    EventBus messageCenter ;

    public Producer() {
    }

    public void send(AdOnlineEvent event){
        messageCenter.post(event);
    }
}
