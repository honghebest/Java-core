package com.hongghe.basicjava.process.cases;

/**
 * @author hongghe 2019/1/1
 */
public class CAndPMethodOne {

    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    class Producer implements Runnable {

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
            for (int i=0; i<10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class consumer implements Runnable {

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

        }
    }

    public static void main(String[] args) {
        CAndPMethodOne cAndPMethodOne = new CAndPMethodOne();
        new Thread(cAndPMethodOne.new Producer()).start();
    }
}
