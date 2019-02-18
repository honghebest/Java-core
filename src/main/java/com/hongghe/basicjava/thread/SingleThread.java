package com.hongghe.basicjava.thread;

import org.springframework.stereotype.Service;

/**
 * The single thread of main.
 *
 * @author hongghe 07/2018
 */
@Service
public class SingleThread {

    public void singleThread() {}

    public static void outputString() {
        new Thread(System.out.toString()).start();
    }

    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        singleThread.singleThread();
    }
}
