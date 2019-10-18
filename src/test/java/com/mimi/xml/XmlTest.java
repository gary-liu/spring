package com.mimi.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    ClassPathXmlApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
    }


    @Test
    public void test1() {

        XmlService xmlService = (XmlService) applicationContext.getBean("service");
        xmlService.test();

    }

    @Test
    public void test2() {
        XmlService xmlService = applicationContext.getBean(XmlService.class);
        xmlService.test();

    }


}
