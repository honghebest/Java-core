package com.hongghe.basicjava.atomic;

/**
 * @author: hongghe @date: 2019-02-11 15:50
 */
public class MutilThreadVoliatile {

    private volatile int count = 0;

    //若要线程安全执行执行count++，需要加锁
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public synchronized void adderDouble() {
        count +=2;
    }
}
