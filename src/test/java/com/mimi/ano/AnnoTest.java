package com.mimi.ano;

import org.junit.Test;

public class AnnoTest {

    @Test
    public void test() {
        AnnoService annoService = new AnnoService();
        City city = new City();

        Class<? extends City> aClass = city.getClass();

        if (aClass.isAnnotationPresent(Entry.class)) {
            Entry entry = aClass.getAnnotation(Entry.class);
            System.out.println(entry.value());

        }


    }
}
