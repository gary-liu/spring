package com.mimi.aop;


import org.springframework.stereotype.Repository;

@Repository
public class AopDaoImpl implements AopDao {


    public void querySql() {
        System.out.println("querySql");

    }
}
