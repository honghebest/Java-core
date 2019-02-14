package com.hongghe.basicjava.AQS;

import javafx.concurrent.Task;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: hongghe @date: 2019-02-14 15:07
 */
public class InterceptionExceptionDemo {

    private BlockingQueue<Task> queue = new ArrayBlockingQueue<>(10);


    public Task getNextTask() throws InterruptedException {
        if (!queue.take().isRunning()) {
            return new Task() {
                @Override
                protected Object call() throws Exception {
                    return null;
                }
            };
        }
        return queue.take();
    }

    public static void main(String[] args) {
        InterceptionExceptionDemo interceptionExceptionDemo = new InterceptionExceptionDemo();
        try {
            interceptionExceptionDemo.getNextTask();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
