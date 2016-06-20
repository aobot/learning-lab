package com.bus.event

/**
 * Created by @ssysong.ssy  2016-06-16 15:21
 */
class Passenger {
    String name
    int age


    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "} " + super.toString();
    }
}
