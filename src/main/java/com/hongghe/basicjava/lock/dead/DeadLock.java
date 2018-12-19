package com.hongghe.basicjava.lock.dead;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 死锁的例子和实现
 *
 * @author hongghe 2018/8/27
 */
public class DeadLock {

    public static class DeadLockBean {
        private Lock lock = new ReentrantLock();
        public void productDeadLock() throws Throwable {
            lock.lock();
            try {
                throw new Throwable("The exception");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }


    public static void deadLockDemo() {
        Lock lock = new ReentrantLock();
    }
}
