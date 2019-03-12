package com.hongghe.basicjava.thread.futures;

import java.util.concurrent.Callable;

/**
 * @author: hongghe @date: 2019-03-12 14:16
 */
public class MyCallable implements Callable<String> {

    private long waitTime;

    public MyCallable(int waitTime) {
        this.waitTime = waitTime;
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        return Thread.currentThread().getName();
    }
}
