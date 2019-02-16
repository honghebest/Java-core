package com.hongghe.basicjava.thread;

/**
 * @author: hongghe @date: 2019-02-16 16:05
 */
public class ThreadJoin  extends Thread {

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " loop at " + i);
                Thread.sleep(1000);
            }
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}

class CustomThread extends Thread {
    ThreadJoin t1;
    public CustomThread(ThreadJoin t1) {
        this.t1 = t1;
    }
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        try {
            t1.join();
            System.out.println(threadName + " end.");
        } catch (Exception e) {
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}

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
            t.join(); //在代碼2里，將此處注釋掉
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }
}
