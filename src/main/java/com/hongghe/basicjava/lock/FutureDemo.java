package com.hongghe.basicjava.lock;

/**
 * @author hongghe 2018/08/19
 */

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * The future using
 *
 * @author hongghe 01/08/2018
 */
@Slf4j
public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer> result = executorService.submit(task);
        executorService.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.info("The interrupted exception = {}", e);
        }

        log.info("The main process is running.");

        try {
            log.info("The task result is = {}", result.get());
        } catch (InterruptedException e) {
            log.info("The name of thread interrupted exception = {} ", e);
        } catch (ExecutionException e) {
            log.info("The execution exception = {}", e);
        }

        log.info("All process is over.");
    }
}
