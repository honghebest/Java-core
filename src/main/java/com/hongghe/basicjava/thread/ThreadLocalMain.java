package com.hongghe.basicjava.thread;

/**
 * @author: hongghe @date: 2019-03-14 00:37
 */
public class ThreadLocalMain {

    ThreadLocal<Long> longLocal = new ThreadLocal<Long>();
    ThreadLocal<String> stringLocal = new ThreadLocal<String>();

    public void set() {
        longLocal.set(Thread.currentThread().getId());
        stringLocal.set(Thread.currentThread().getName());
    }

    public long getLong() {
        return longLocal.get();
    }

    public String getString() {
        return stringLocal.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalMain test = new ThreadLocalMain();
        test.set();
        System.out.println(test.getLong());
        System.out.println(test.getString());
        Thread thread1 = new Thread(() -> {
            test.set();
            System.out.println(test.getLong());
            System.out.println(test.getString());
        });
        thread1.start();
        thread1.join();
        System.out.println(test.getLong());
        System.out.println(test.getString());
    }
}
