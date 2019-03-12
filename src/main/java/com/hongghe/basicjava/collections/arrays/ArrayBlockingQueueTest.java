package com.hongghe.basicjava.collections.arrays;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: hongghe @date: 2019-03-12 10:33
 */
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(12);
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.offer(1);
    }
}
