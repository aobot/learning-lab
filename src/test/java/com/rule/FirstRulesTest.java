package com.rule;

import org.easyrules.api.RulesEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by @ssysong.ssy  2016-06-07 21:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:rules.xml")
public class FirstRulesTest {

    @Resource
    RulesEngine rulesEngine;

    @Test
    public void testWhen() throws Exception {
        rulesEngine.fireRules();
    }

    @Test
    public void testThen() throws Exception {

    }
}