package com.mimi.aop;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    AnnotationConfigApplicationContext applicationContext;

    @Before
    public void init() {

        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void test() {
        AopService aopService = applicationContext.getBean(AopService.class);

        aopService.testService();

    }


    @Test
    public void test2() {
        AopService aopService = (AopService) applicationContext.getBean("aopSerice");

        aopService.testService();

    }


}
