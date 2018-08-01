package com.hongghe.basicjava.lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Reentrant lock 的使用
 *
 * @author hongghe 31/07/2018
 */
public class ReentrantLockDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReentrantLockDemo.class);

    private ReentrantLock reentrantLock = new ReentrantLock();
    private Condition condition = reentrantLock.newCondition();
    private List<Integer> listBuffer = new ArrayList<>();
    private volatile boolean runFlag = true;


    /**
     * 生产者的实现
     */
    public void producer() {
        int i = 0;
        while(runFlag) {
            reentrantLock.lock();
            try {
                if (listBuffer.size() > 0) {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        LOGGER.info("The interrupted exception = {}", e);
                    }
                } else {
                    LOGGER.info("The name of thread is " + Thread.currentThread().getName() + "add Integer");
                    listBuffer.add(i++);
                    condition.signalAll();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /**
     * 消费者的实现
     */
    public void consumer() {
        while (runFlag) {
            reentrantLock.lock();
            try {
                if (listBuffer.size() > 0) {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        LOGGER.info("The interrupted exception = {}", e);
                    }
                } else {
                    LOGGER.info("The name of thread is " + Thread.currentThread().getName() + "get Integer");
                    long beginTime = 0;
                    LOGGER.info("The listBuffer" + listBuffer);
                    beginTime = System.currentTimeMillis();
                    while (System.currentTimeMillis() - beginTime < 100) {

                    }
                    condition.signalAll();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public boolean isRunFlag() {
        return runFlag;
    }

    public void setRunFlag(boolean runFlag) {
        this.runFlag = runFlag;
    }

    public static void main(String[] args) {
        final ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockDemo.producer();
            }
        }, "A");

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockDemo.consumer();
            }
        }, "B");

        producer.start();
        consumer.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            LOGGER.info("The interrupted exception = {}", e);
        }
    }
}
