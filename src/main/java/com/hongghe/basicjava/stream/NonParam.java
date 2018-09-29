package com.hongghe.basicjava.stream;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/9/29
 */
@Slf4j
public class NonParam {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("The runnable thread.");
            }
        }).start();


        new Thread(() -> log.info("The new Thread.")).start();
    }
}
