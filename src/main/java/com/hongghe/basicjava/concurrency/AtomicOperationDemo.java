package com.hongghe.basicjava.concurrency;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作
 *
 * @author hongghe 04/08/2018
 */
@Slf4j
public class AtomicOperationDemo {

static AtomicInteger count=new AtomicInteger(0);

public static class AddThread implements Runnable {

    @Override
    public void run() {
        for(int k=0;k<1000;k++){
            count.incrementAndGet();
        }
    }
}
    public static void AtomicIntShow() {
        System.out.println("AtomicIntShow() enter");
        ExecutorService threadPool =   Executors.newFixedThreadPool(10);

        for(int k=0; k<100; k++) {
            threadPool.submit(new AddThread());
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread();
            e.printStackTrace();
        }

        System.out.println("result of acumulated sum="+count);
        threadPool.shutdown();
        System.out.println("AtomicIntShow() exit");
        return ;
    }
}

