package com.hongghe.basicjava.AQS;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: hongghe @date: 2019-02-14 15:13
 */
public class BlockQueueMain {

    private BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

    public static void main(String[] args) {
        BlockQueueMain blockQueueMain = new BlockQueueMain();
    }

    public class Product implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                blockingQueue.add(i);
            }
        }
    }

    public class Consume implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                blockingQueue.add(i);
            }
        }
    }
}
