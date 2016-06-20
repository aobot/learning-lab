package com.bus.event

import com.bus.listener.Listener
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import java.util.concurrent.TimeUnit

/**
 * Created by @ssysong.ssy  2016-06-16 15:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:bus.xml")
class BusTest implements Listener {

    @Test
    void testGetName() {
        bus.post(new Passenger(name: 'abc', age: 123))

        TimeUnit.SECONDS.sleep(1000)
    }
}
