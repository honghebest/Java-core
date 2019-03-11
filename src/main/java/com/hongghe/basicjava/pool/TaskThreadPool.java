package com.hongghe.basicjava.pool;

/**
 * @author: hongghe @date: 2019-03-11 19:54
 */
public class TaskThreadPool implements Runnable {
    private int index;

    public TaskThreadPool(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " index:" + index);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}