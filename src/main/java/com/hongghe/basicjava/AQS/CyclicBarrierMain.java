package com.hongghe.basicjava.AQS;

import java.util.concurrent.CyclicBarrier;

/**
 * 一个同步辅助类，用于协调多个子线程，让多个子线程在这个屏障前等待，直到所有子线程都到达了这个屏障时，再一起继续执行后面的动作。
 * @author: hongghe @date: 2019-02-18 11:32
 */
public class CyclicBarrierMain {

    private Bill bill;

    public static void main(String[] args) {
        PersonInfoService personInfoService = new PersonInfoImp();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new MethodDemo(personInfoService));
    }

    class CheckBill implements Runnable {

        private Bill bill;

        CheckBill(Bill bill) {
            this.bill = bill;
        }

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
            if (bill.getBillId() != null) {
                System.out.println(bill.getAmount());
            }
        }
    }
}
