package com.reload.model;

/**
 * Created by aobot on 2016-08-11 10:19.
 */
public class Bird implements IFly {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name=" + name +
                '}';
    }
}
