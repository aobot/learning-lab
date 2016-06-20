package com.drools;

import org.junit.Test;

import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by @ssysong.ssy  2016-06-07 17:03
 */
public class DMessageTest {

    @Test
    public void testGetInfo() throws Exception {

    }

    public void fun() {
        Reader reader = new InputStreamReader(DMessageTest.class.getResourceAsStream("com/drools/msgRule.drl"));
    }
}