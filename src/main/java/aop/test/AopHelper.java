package aop.test;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by aobot on 2016-08-03 20:09.
 */

@Component("aopHelper")
public class AopHelper implements MethodBeforeAdvice, AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("before");
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("after");
    }
}
