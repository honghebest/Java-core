package com.hongghe.basicjava.oop.inherit;

/**
 * @author: hongghe @date: 2019-01-24 10:45
 */
public class Second extends First {

    Second() {
        System.out.println("The second");
    }

    public static void firstMethod() {
        System.out.println("The second  first method");
    }

    public void secondMethod() {
        System.out.println("The second second method");
    }
}
