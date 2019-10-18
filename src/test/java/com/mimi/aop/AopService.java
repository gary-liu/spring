package com.mimi.aop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("aopSerice")
public class AopService {

    @Autowired
    private AopDao aopDao;

    public void testService() {
        aopDao.querySql();

    }

    public void setAopDao(AopDao aopDao) {
        this.aopDao = aopDao;
    }
}
