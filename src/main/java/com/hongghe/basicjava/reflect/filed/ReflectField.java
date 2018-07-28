package com.hongghe.basicjava.reflect.filed;

import com.hongghe.basicjava.reflect.SuperMethodDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * The class filed.
 *
 * @author hongghe 28/07/2018
 */
public class ReflectField {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectField.class);

    public static void main(String[] args) {
    Class<?> classObject = SuperMethodDemo.class;
    Field[] fields = classObject.getDeclaredFields();
    for (int i=0; i<fields.length; i++) {
        LOGGER.info("The filed member is " + fields[i]);
    }
    }
}
