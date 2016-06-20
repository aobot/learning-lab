package com.invoke;

/**
 * Created by @ssysong.ssy  2016-06-08 20:54
 */
public class StaticDispatch2 {

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        StaticDispatch2 dispatch = new StaticDispatch2();
        dispatch.say(man);
        dispatch.say(women);
    }



    static class Women implements Human {
    }

    static class Man implements Human {
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
