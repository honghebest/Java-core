package com.hongghe.basicjava.CAS;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: hongghe @date: 2019-02-18 11:28
 */
public class AtomicThreadMain {

    private static volatile int lock = 1;

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.incrementAndGet();
    }
}