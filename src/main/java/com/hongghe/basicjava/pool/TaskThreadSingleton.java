package com.hongghe.basicjava.pool;

/**
 * @author: hongghe @date: 2019-03-11 20:06
 */
public class TaskThreadSingleton implements Runnable {

    private Object task;

    TaskThreadSingleton(Object task) {
        this.task = task;
    }
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
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        task = null;
    }
}
