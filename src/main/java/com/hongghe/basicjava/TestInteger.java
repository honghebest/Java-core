package com.hongghe.basicjava;

/**
 * @author: hongghe @date: 2019-04-08 13:59
 */
public class TestInteger {


    public static void change(Integer i) {
        i = 2;
    }

    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.hashCode());
        change(i);
        System.out.println(i.hashCode());
    }
}
