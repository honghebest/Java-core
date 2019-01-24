package com.hongghe.basicjava.integer;

/**
 * @author: hongghe @date: 2019-01-24 11:14
 */
public class IntegerMain {

    static Integer num = 23;

    public static void firstMethod() {
        System.out.println(num++);
        num ++;
        System.out.println(++num);
    }

    public void secondMethod() {
        int obj = 23;
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerMain integerMain = new IntegerMain();
        firstMethod();
    }
}
