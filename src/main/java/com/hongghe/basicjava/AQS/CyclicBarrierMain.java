package com.hongghe.basicjava.AQS;

import java.util.concurrent.CyclicBarrier;

/**
 * 一个同步辅助类，用于协调多个子线程，让多个子线程在这个屏障前等待，直到所有子线程都到达了这个屏障时，再一起继续执行后面的动作。
 * @author: hongghe @date: 2019-02-18 11:32
 */
public class CyclicBarrierMain {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
    }
}
