package com.hongghe.basicjava.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hongghe 2018/9/11
 */
public class AsyTaskDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyTaskDemo.class);

    private ExecutorService executorService = Executors.newCachedThreadPool();

    public void asyTask() throws InterruptedException {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int sum = 0;
                for (int i=0; i< 1000; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        AsyTaskDemo asyTaskDemo = new AsyTaskDemo();
        asyTaskDemo.asyTask();
    }
}
