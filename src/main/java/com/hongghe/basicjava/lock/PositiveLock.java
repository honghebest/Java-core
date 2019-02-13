package com.hongghe.basicjava.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: hongghe @date: 2019-02-13 17:12
 */
public class PositiveLock {

    private AtomicInteger atomicInteger = new AtomicInteger();

    public void adder() {
        atomicInteger.incrementAndGet();
    }

    public static void main(String[] args) {
        // code
    }
}
