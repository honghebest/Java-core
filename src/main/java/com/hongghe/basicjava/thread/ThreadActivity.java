package com.hongghe.basicjava.thread;

/**
 * @author hongghe 2019/1/1
 */
public class ThreadActivity {

    private static int count = 0;

    private static final int TOTAL = 10;

    private static final int TOP = 10;

    public class Output implements Runnable {

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
            if (TOP == TOTAL) {
                synchronized (this) {
                    count += 1;
                }
            }
        }
    }


    public class Input implements Runnable {

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
            for (int j=0; j< 10; j++) {
                System.out.println(j);
            }
        }
    }

    public static synchronized String getName() {
        return "";
    }

    public static void main(String[] args) {
        ThreadActivity threadActivity = new ThreadActivity();
       new Thread(threadActivity.new Output()).start();
    }
}
