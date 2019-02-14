package com.hongghe.basicjava.thread;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: hongghe @date: 2019-02-14 15:18
 */
public class CallableFutureTest implements Callable<Integer> {

        public static void main(String[] args) {
            CallableFutureTest callableFutureTest = new CallableFutureTest();
            FutureTask<Integer> futureTask = new FutureTask<>(callableFutureTest);
            for (int i=0; i<100; i++) {
                System.out.println(Thread.currentThread().getName() + "的值" + i);
                if (i == 20) {
                    new Thread(futureTask, "The thread ").start();
                }
            }

            try {
                System.out.println("The sub thread " + futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Integer call() throws Exception {
            int i = 0;
            for (;i<100; i++) {
                System.out.println(Thread.currentThread().getName() + "" + i);
            }
            return i;
        }
}
