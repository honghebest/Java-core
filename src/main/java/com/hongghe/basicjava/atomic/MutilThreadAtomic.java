package com.hongghe.basicjava.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: hongghe @date: 2019-02-11 15:51
 */
public class MutilThreadAtomic {

    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet();
    }
    //使用AtomicInteger之后，不需要加锁，也可以实现线程安全。
    public int getCount() {
        return count.get();
    }
}
