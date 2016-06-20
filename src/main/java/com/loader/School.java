package com.loader;

/**
 * Created by @ssysong.ssy  2016-06-09 20:14
 */
public class School {
    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School   " + student.getClass().getClassLoader();
    }
}
