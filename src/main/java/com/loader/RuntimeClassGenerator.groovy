package com.loader

import net.sf.cglib.core.ClassGenerator
import net.sf.cglib.core.DefaultGeneratorStrategy
import net.sf.cglib.proxy.Enhancer
import net.sf.cglib.transform.TransformingClassGenerator
import net.sf.cglib.transform.impl.AddPropertyTransformer

/**
 * Created by @ssysong.ssy  2016-07-16 10:11
 */
class RuntimeClassGenerator {

    public static void main(String[] args) {
        new RuntimeClassGenerator().fun()
    }

    def fun() {
        Enhancer e = new Enhancer();
        e.setSuperclass(Student.class);
        e.setStrategy(new DefaultGeneratorStrategy() {
            protected ClassGenerator transform(ClassGenerator cg) {
                return new TransformingClassGenerator(cg,
                        new AddPropertyTransformer(['foo'], [Integer.TYPE]));
            }
        });
        Object obj = e.create();
        println 'ok'
    }
}
