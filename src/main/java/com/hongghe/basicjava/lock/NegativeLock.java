package com.hongghe.basicjava.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: hongghe @date: 2019-02-13 17:12
 */
public class NegativeLock {

    public synchronized void testMethod() {
        // 同步资源
    }

    // Reentrant lock
    private ReentrantLock lock = new ReentrantLock();

    public void modifyPublicresource() {
        lock.lock();
        // 同步资源
        lock.unlock();
    }
}
