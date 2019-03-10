package com.hongghe.basicjava.cases;

/**
 * @author: hongghe @date: 2019-03-07 10:26
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}
