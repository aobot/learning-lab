package com.invoke;

/**
 * Created by @ssysong.ssy  2016-06-08 20:54
 */
public class StaticDispatch {

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        StaticDispatch dispatch = new StaticDispatch() ;
        dispatch.say(man);
        dispatch.say(women);
    }

    static abstract class Human {
    }

    static class Women extends Human {
    }

    static class Man extends Human {
    }

    public void say(Man man) {
        System.out.println("man");
    }

    public void say(Women women) {
        System.out.println("women");
    }

    public void say(Human human) {
        System.out.println("human");
    }
}
