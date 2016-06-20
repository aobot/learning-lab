package com.aop

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import javax.annotation.Resource

/**
 * Created by @ssysong.ssy  2016-06-04 11:45
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:aop.xml")
class WorkerTest {

    @Resource
    Worker worker

    @Test
    void testWork() {
        worker.work(new GName(name: "abc"), 1)
    }
}
