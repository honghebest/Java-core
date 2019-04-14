package com.hongghe.basicjava.AQS;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 一个同步辅助类，用于协调多个子线程，让多个子线程在这个屏障前等待，直到所有子线程都到达了这个屏障时，再一起继续执行后面的动作。
 * @author: hongghe @date: 2019-02-18 11:32
 */
public class CyclicBarrierMain {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
        MethodDemo methodDemo = new MethodDemo(cyclicBarrier, "name");
        methodDemo.run();
    }

    public static class MethodDemo implements Runnable {

        private CyclicBarrier cyclicBarrier;

        private String name;

        public MethodDemo(CyclicBarrier cyclicBarrier, String name) {
            this.cyclicBarrier = cyclicBarrier;
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("The run method name " +  name);
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
