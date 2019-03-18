package com.hongghe.basicjava.thread.cusumer.pruduct;

/**
 * @author: hongghe @date: 2019-03-18 14:31
 */
public class ConsumerTest extends Thread {

    ProductTest productTest;

    ConsumerTest(ProductTest productTest) {
        this.productTest = productTest;
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " start.");
            try {
                productTest.join();
                System.out.println(threadName + " end.");
            } catch (Exception e) {
                System.out.println("exception from " + threadName + ".run");
            }
    }


    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest(new ProductTest());
        consumerTest.run();
    }
}
