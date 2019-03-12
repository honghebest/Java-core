package com.hongghe.basicjava.thread.parameters;

import java.util.Random;

/**
 * <p>通过回调函数传递数据</p>
 * @author: hongghe @date: 2019-03-11 20:28
 */
public class ThreadThree extends Thread {

    private Work work;

    ThreadThree(Work work) {
        this.work = work;
    }

    @Override
    public void run() {
       Random random = new java.util.Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        work.process(data, n1, n2, n3);   // 使用回调函数
        System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + data.value);
    }

    public void runOne() {
        System.out.println("The run two");
    }

    public static void main(String[] args) {
        Thread thread = new ThreadThree(new Work());
        thread.start();
    }
}
