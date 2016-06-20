package groovy

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource
import java.util.concurrent.TimeUnit

/**
 * Created by @ssysong.ssy  2016-06-17 10:49
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:groovy.xml")
class GroovyHelloTest  {

    @Resource
    IHello hello

    @Test
    void testSay() {
        for (int i = 0; i < 1000; i++) {
            hello.say()
            TimeUnit.SECONDS.sleep(1)
        }
    }
}
