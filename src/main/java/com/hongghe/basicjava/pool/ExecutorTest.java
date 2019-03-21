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

    class RunName implements Callable {

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Object call() throws Exception {
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }


    public void runThread(){
        executorService.execute(() -> runThread());
    }

    public void name() {
        System.out.println("name of thread.");
    }

    public static void main(String[] args) {
        ExecutorTest executorTest = new ExecutorTest();
        executorTest.runThread();
    }
}
