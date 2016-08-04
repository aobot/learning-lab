package aop.test.impl;

import aop.test.Showable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by aobot on 2016-08-03 20:14.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop.test/aop-test.xml")
public class HumanTest {
    @Resource
    private Showable humanProxy;

    @Test
    public void show() throws Exception {
        humanProxy.show();
    }

}