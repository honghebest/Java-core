package com.hongghe.basicjava.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字符串的操作和使用
 *
 * @author hongghe 02/08/2018
 */
public class StringDemo {

    private final static Logger LOGGER = LoggerFactory.getLogger(StringDemo.class);

    public static void main(String[] args) {
        String a, b;
        a = "123";
        b = "123";
        System.out.println(a==b);//true
        a = "123";
        b = new String("123");
        System.out.println(a==b);//false
        a = new String("123");
        b = new String("123");
        System.out.println(a==b);//false
        a = "123";
        b = new String(a);
        System.out.println(a==b);//false
        a = new String("123");
        b = a;
        System.out.println(a==b);//true
    }
}
