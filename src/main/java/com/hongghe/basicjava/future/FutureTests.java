package com.hongghe.basicjava.future;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author: hongghe @date: 2019-01-22 11:40
 */
@Slf4j
public class FutureTests {

    public static class Task implements Callable<String> {

        @Override
        public String call() throws Exception {
            String threadId = String.valueOf(Thread.currentThread().getId());
            log.info("Thread id = {}", Thread.currentThread().getName());
            return threadId;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Future<String>>  futures = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0; i<10; i++) {
            futures.add(executorService.submit(new Task()));
        }

        for (Future<String> stringFuture : futures) {
            log.info("Thread threadId = {}", stringFuture.get());
        }
    }
}
