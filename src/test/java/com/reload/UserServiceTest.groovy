package com.reload

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource

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
//        for (int i = 0; i < 10; i++) {
//            userService.add(new User(i, RandomStringUtils.random(3, true, false),
//                    new Extra('y')))
//        }
        println userService.getAll().join("\n")

    }
}
