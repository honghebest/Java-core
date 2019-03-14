package com.hongghe.basicjava.AQS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author: hongghe @date: 2019-03-12 10:53
 */
public class SemaphoreTest2 {
    private static int data = 0;

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(3);
        System.out.println("初始化：当前有" + (3 - semaphore.availablePermits() + "个并发"));
        // 10个任务
        for (int index = 0; index < 10; index++) {
            final int NO = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        // 获取许可
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + "获取许可" + "(" + NO + ")，" + "剩余：" + semaphore.availablePermits());
                        //实现同步
                        synchronized(SemaphoreTest2.class) {
                            System.out.println(Thread.currentThread().getName() + "执行data自增前：data=" + data);
                            data ++;
                            System.out.println(Thread.currentThread().getName() + "执行data自增后：data=" + data);
                        }
                        semaphore.release();
                        System.out.println(Thread.currentThread().getName() + "释放许可" + "(" + NO + ")，" + "剩余：" + semaphore.availablePermits());
                    } catch (InterruptedException e) {
                    }
                }
            };
            service.execute(run);
        }
        service.shutdown();
    }
}
