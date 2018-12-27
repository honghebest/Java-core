package com.hongghe.basicjava.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author hongghe 2018/12/27
 */
public class SearchQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i=0; i<100; i++) {
            queue.add(i);
        }

        for (Integer j : queue) {
            System.out.println(j);
        }

        if (!queue.isEmpty()) {
            System.out.println(queue.element());
        }
    }
}
