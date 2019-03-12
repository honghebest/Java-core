package com.hongghe.basicjava.thread.futures;

import java.util.concurrent.*;

/**
 * @author: hongghe @date: 2019-03-12 14:17
 */
public class FutureTaskTest {

    public static void main(String[] args) {
        MyCallable myCallable1 = new MyCallable(1000);
        MyCallable myCallable2 = new MyCallable(2000);

        FutureTask<String> futureTask1 = new FutureTask<>(myCallable1);
        FutureTask<String> futureTask2 = new FutureTask<>(myCallable2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);

        while (true) {
            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    executorService.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {
                    System.out.println("Task one is not done and " + futureTask1.get());
                }

                String string = futureTask2.get(2000L, TimeUnit.MILLISECONDS);
                if (string != null) {
                    System.out.println("task two " + string);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
    }
}
