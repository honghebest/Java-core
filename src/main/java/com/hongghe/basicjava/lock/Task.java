package com.hongghe.basicjava.lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @author hongghe 2018/08/19
 */
public class Task implements Callable<Integer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);

    @Override
    public Integer call() throws Exception {
        LOGGER.info("The sub process is running.");
        Thread.sleep(3000);
        int sum = 0;
        for (int i = 0; i < 100; i ++) {
            sum += i;
        }
        return sum;
    }
}
