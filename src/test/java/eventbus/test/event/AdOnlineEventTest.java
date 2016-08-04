package eventbus.test.event;

import eventbus.test.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by aobot on 2016-08-04 19:36.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:bus.xml")
public class AdOnlineEventTest {
    @Resource
    Producer producer;

    @Test
    public void getMessage() throws Exception {
        for (int i = 0; i < 10; i++) {
            producer.send(new AdOnlineEvent());
        }
        System.out.println("send done");
        TimeUnit.SECONDS.sleep(100);
    }

}