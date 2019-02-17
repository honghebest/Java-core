package com.hongghe.basicjava.thread;

/**
 * @author: hongghe @date: 2019-02-16 16:24
 */
public class JoinTestDemo {

    public static void main(String[] args) {

        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " start.");

        ThreadJoin t1 = new ThreadJoin();
        CustomThread t = new CustomThread(t1);
        try {
            t1.start();
            Thread.sleep(2000);
            t.start();
            t.join();
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }
}

