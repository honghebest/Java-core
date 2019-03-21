package com.hongghe.basicjava.pool;

import javax.annotation.PostConstruct;
import java.util.concurrent.*;

/**
 * @author: hongghe @date: 2019-03-21 15:46
 */
public class ExecutorTest {

    private ExecutorService executorService;

    @PostConstruct
    public void init() {
        this.executorService = new ThreadPoolExecutor(10, 20, 30, TimeUnit.SECONDS,
                new SynchronousQueue<>(), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }

    class RunName implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            System.out.println("name");
        }
    }


    public void runThread(){
        executorService.execute(new RunName());
    }

    public void name() {
        System.out.println("name of thread.");
    }

    public static void main(String[] args) {
        ExecutorTest executorTest = new ExecutorTest();
        executorTest.runThread();
    }
}
