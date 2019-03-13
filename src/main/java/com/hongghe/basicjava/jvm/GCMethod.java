package com.hongghe.basicjava.jvm;

/**
 * 垃圾处理方法
 *
 * @author hongghe 24/07/2018
 */
public class GCMethod {

    public static void main(String[] args) {
        System.out.println("the integer + " + Integer.BYTES);
        System.out.println(Runtime.getRuntime().maxMemory());
    }
}
