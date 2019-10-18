package com.mimi.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

    @Pointcut("execution(* com.mimi.aop.*.*(..))")
    public void postCutExcution() {

    }

    /*@Pointcut("within(com.mimi.aop.*)")
    public void postCutWhin() {

    }*/

    @Before("postCutExcution()")
    public void before() {
        System.out.println("advice before");

    }


}
