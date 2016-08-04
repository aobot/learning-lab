package aop.test.impl;

import aop.test.Showable;
import org.springframework.stereotype.Component;

/**
 * Created by aobot on 8/3/16.
 */
@Component("human")
public class Human implements Showable {
    public void show() {
        System.out.println("show");
    }
}
