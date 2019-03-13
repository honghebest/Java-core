package com.hongghe.basicjava.lock.dead;

/**
 * @author hongghe 2018/8/28
 */
public class SyncDeadLock {

    private static Object lockA = new Object();

    private static Object lockB = new Object();

    private static Object lockC = new Object();

    private static Object lockD = new Object();

    public static void main(String[] args){
        new SyncDeadLock().deadLock();
    }

    private void deadLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA){
                    try{
                        System.out.println(Thread.currentThread().getName()+" get lock A is running!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+" after sleep 500ms!");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" need lock B!Just waiting!");
                    synchronized (lockB){
                        System.out.println(Thread.currentThread().getName()+" get lock B running!");
                    }
                }
            }
        },"thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB){
                    try{
                        System.out.println(Thread.currentThread().getName()+" get lock B running!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+" after sleep 500ms!");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" need lock A! Just waiting!");
                    synchronized (lockA){
                        System.out.println(Thread.currentThread().getName()+" get lock A is running!");
                    }
                }
            }
        },"thread2");


        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockC) {
                    try {
                        System.out.println("lock c");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (lockD) {
                        System.out.println("lock d");
                    }
                }
            }
        }, "thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
