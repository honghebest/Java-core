package com.hongghe.basicjava.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: hongghe @date: 2019-03-21 16:19
 */
public class ThreadTest {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            strList.add("String" + i);
        }

        int threadNum = strList.size() < 5 ? strList.size() : 5;
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                3,
                300,
                TimeUnit.MILLISECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < threadNum; i++) {
            executor.execute(new PrintStringThread(i,strList,threadNum));
        }
        executor.shutdown();
    }
}

class PrintStringThread implements Runnable {
    private int num;
    private List<String> strList;
    private int threadNum;

    public PrintStringThread(int num, List<String> strList, int threadNum) {
        this.num = num;
        this.strList = strList;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {

        int length = 0;
        for (String str : strList) {
            if (length % threadNum == num) {
                System.out.println("线程编号：" + num + "，字符串：" + str);
            }
            length++;
        }
    }
}

