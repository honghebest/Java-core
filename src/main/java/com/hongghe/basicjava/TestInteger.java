package com.hongghe.basicjava;

/**
 * @author: hongghe
 * @date: 2019-04-08 13:59
 */
public class TestInteger {


    public void change(Integer i) {
        i = 2;
        System.out.println(i);
    }

    public static void main(String[] args) {

        Integer num = 12123123;
        System.out.println(num.hashCode());
    }
}
