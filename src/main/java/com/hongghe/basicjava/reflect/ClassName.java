package com.hongghe.basicjava.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class ClassName {

    private static final Logger logger = LoggerFactory.getLogger(ClassName.class);

    public static void getClkassName(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        while (true) {
            for (Field field:fields) {

            }
        }
    }
}
