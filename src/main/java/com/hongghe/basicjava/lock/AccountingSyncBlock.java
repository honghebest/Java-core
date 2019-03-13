package com.hongghe.basicjava.lock;

/**
 * @author hongghe 2018/08/19
 */
public class AccountingSyncBlock implements Runnable{

    private static AccountingSync instance= new AccountingSync();

    private static Integer i = 0;

    @Override
    public void run() {
        //使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized(instance) {
            for(int j=0; j<1000000; j++) {
                i ++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne=new Thread(instance);
        Thread threadTwo=new Thread(instance);
        threadOne.start();
        System.out.println(i);
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println(i);
    }
}