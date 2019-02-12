package com.hongghe.basicjava.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: hongghe @date: 2019-02-11 15:48
 */
public class AtomicIntegerMain {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();
    }
}
