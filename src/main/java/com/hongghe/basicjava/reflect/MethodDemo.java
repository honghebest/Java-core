package com.hongghe.basicjava.reflect;

/**
 * 方法实例
 *
 * @author hongghe 28/07/2018
 */
public class MethodDemo {

    public final int counter = 3;

    MethodDemo() {
        System.out.println("The method demo ");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
