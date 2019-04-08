package com.hongghe.basicjava;

/**
 * @author: hongghe @date: 2019-03-26 15:02
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(-1 >>> 2);
        int n;
        n = 1;
        System.out.println( n |= n >>> 1);
        System.out.println(n);
    }
}
