package com.loader;

/**
 * Created by @ssysong.ssy  2016-06-09 20:14
 */
public class Student {
    @Override
    public String toString() {
        return "Student{}" + this.getClass().getClassLoader();
    }
}
