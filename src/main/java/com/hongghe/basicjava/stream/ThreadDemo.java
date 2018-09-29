package com.hongghe.basicjava.stream;

/**
 * @author hongghe 2018/9/29
 */
public class ThreadDemo {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The new thread.");
            }
        }).start();


        new Thread(() ->System.out.println("The Thread.")).start();
    }
}
