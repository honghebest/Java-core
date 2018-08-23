package com.hongghe.basicjava.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class Demo {

    private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        String o1 = "123";
        String o2 = new String("123");
        System.out.println(o1 == o2);
    }
}
