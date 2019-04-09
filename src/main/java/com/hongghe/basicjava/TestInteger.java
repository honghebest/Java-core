package com.hongghe.basicjava;

/**
 * @author: hongghe @date: 2019-04-08 13:59
 */
public class TestInteger {


    private static int i;

    public void change(int i) {
        i = 12;
    }

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger();
        i = 1;
        System.out.println(i);
        testInteger.change(i);
        System.out.println(i);
        Integer a = 122222;
        Integer b = 122222;
        System.out.println(a == b);
    }
}
