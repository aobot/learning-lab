package com.loader;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;

/**
 * Created by @ssysong.ssy  2016-06-09 20:13
 */
public class HotSwapClassLoaderTest {

    @Test
    public void testLoadClass() throws Exception {
        School school = new School();
        Student student = new Student();
        school.setStudent(student);
        System.out.println(school);

        HotSwapClassLoader loader = new HotSwapClassLoader(new URL[]{new URL("file:///Users/ssysong/git/learning/target/classes/")},
                school.getClass().getClassLoader());
        Class clazz = loader.load("com.loader.Student");
        Object stu2 = clazz.newInstance() ;
        Method method = clazz.getMethod("setStudent",School.class) ;

        System.out.println(school);
    }
}