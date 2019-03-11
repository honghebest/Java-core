package com.hongghe.basicjava.thread.parameters;

/**
 * @author: hongghe @date: 2019-03-11 20:29
 */
public class Work {
    public void process(Data data, Integer... numbers) {
        for (int n : numbers) {
            data.value += n;
        }
    }
}
