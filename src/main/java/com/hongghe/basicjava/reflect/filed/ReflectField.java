package com.hongghe.basicjava.reflect.filed;

import com.hongghe.basicjava.reflect.SuperMethodDemo;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

/**
 * The class filed.
 *
 * @author hongghe 28/07/2018
 */
@Slf4j
public class ReflectField {

    public static void main(String[] args) {
    Class<?> classObject = SuperMethodDemo.class;
    Field[] fields = classObject.getDeclaredFields();
    for (int i=0; i<fields.length; i++) {
        log.info("The filed member is " + fields[i]);
    }
    }
}
