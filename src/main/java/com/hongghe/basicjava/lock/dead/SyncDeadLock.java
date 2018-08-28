package com.hongghe.basicjava.lock.dead;

/**
 * @author hongghe 2018/8/28
 */
public class SyncDeadLock {

    private static Object locka = new Object();
    private static Object lockb = new Object();

    public static void main(String[] args){
        new SyncDeadLock().deadLock();
    }

    private void deadLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (locka){
                    try{
                        System.out.println(Thread.currentThread().getName()+" get lock A is running!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+" after sleep 500ms!");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" need lock B!Just waiting!");
                    synchronized (lockb){
                        System.out.println(Thread.currentThread().getName()+" get lock B running!");
                    }
                }
            }
        },"thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockb){
                    try{
                        System.out.println(Thread.currentThread().getName()+" get lock B running!");
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName()+" after sleep 500ms!");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" need lock A! Just waiting!");
                    synchronized (locka){
                        System.out.println(Thread.currentThread().getName()+" get lock A is running!");
                    }
                }
            }
        },"thread2");

        thread1.start();
        thread2.start();
    }
}
