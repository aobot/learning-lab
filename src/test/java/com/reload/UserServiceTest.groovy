package com.reload

import com.reload.model.User
import org.apache.commons.lang3.RandomStringUtils
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource
import java.util.concurrent.Executors
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit

/**
 * Created by @ssysong.ssy  2016-06-03 16:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:reload/reload.xml")
class UserServiceTest {
    @Resource
    UserService userService

    @Test
    void testGetUserDao() {

        TimeUnit.SECONDS.sleep(2)
        def executors = Executors.newFixedThreadPool(10)
        for (int j = 0; j < 10 ; j++) {
            def runnable = new Runnable() {
                @Override
                void run() {
                    for (int i = 0; i < 100000; i++) {
                        String name = RandomStringUtils.random(3, true, false)
                        def age = ThreadLocalRandom.current().nextInt(50)
                        userService.add(new User(name: name, age: age))
                    }
                }
            }

            executors.submit(runnable)
        }

        TimeUnit.MINUTES.sleep(3)
        println 'done'

    }
}
