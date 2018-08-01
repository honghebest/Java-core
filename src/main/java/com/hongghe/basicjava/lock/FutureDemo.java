package com.hongghe.basicjava.lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

/**
 * The future using
 *
 * @author hongghe 01/08/2018
 */
public class FutureDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(FutureDemo.class);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executorService.submit(task);
        executorService.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            LOGGER.info("The interrupted exception = {}", e);
        }

        LOGGER.info("The main process is running.");

        try {
            LOGGER.info("The task result is = {}", result.get());
        } catch (InterruptedException e) {
            LOGGER.info("The name of thread interrupted exception = {} ", e);
        } catch (ExecutionException e) {
            LOGGER.info("The execution exception = {}", e);
        }

        LOGGER.info("All process is over.");
    }
}
