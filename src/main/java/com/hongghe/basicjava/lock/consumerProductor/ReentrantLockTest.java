package com.hongghe.basicjava.lock.consumerProductor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: hongghe @date: 2019-02-14 10:43
 */
public class ReentrantLockTest {

    private ReentrantLock reentrantLock = new ReentrantLock();

    private Condition condition = reentrantLock.newCondition();

    private List<Integer> list = new ArrayList<>();

    private volatile boolean FLAG = true;

    class Producer implements Runnable {
        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Consumer implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
        new Thread(reentrantLockTest.new Producer());
        new Thread(reentrantLockTest.new Consumer());
    }
}
