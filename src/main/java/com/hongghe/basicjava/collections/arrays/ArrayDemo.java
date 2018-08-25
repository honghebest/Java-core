package com.hongghe.basicjava.collections.arrays;

/**
 * @author hongghe 2018/8/25
 */
public class ArrayDemo {

    public static void main(String[] args) {
        Integer[] param = new Integer[10];
        for (int i=0; i<param.length; i++) {
            param[i] = i;
        }

        for (Integer o1 : param) {
            System.out.println(o1);
        }
    }
}
