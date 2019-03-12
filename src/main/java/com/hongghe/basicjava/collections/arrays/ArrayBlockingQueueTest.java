package com.hongghe.basicjava.collections.arrays;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * ArrayBlockingQueue ：一个由数组结构组成的有界阻塞队列。
 * LinkedBlockingQueue ：一个由链表结构组成的有界阻塞队列。
 * PriorityBlockingQueue ：一个支持优先级排序的无界阻塞队列。
 * DelayQueue：一个使用优先级队列实现的无界阻塞队列。
 * SynchronousQueue：一个不存储元素的阻塞队列。
 * LinkedTransferQueue：一个由链表结构组成的无界阻塞队列。
 * LinkedBlockingDeque：一个由链表结构组成的双向阻塞队列。
 *
 * 添加元素
 * Java中的阻塞队列接口BlockingQueue继承自Queue接口。BlockingQueue接口提供了3个添加元素方法。
 * add：添加元素到队列里，添加成功返回true，由于容量满了添加失败会抛出IllegalStateException异常
 * offer：添加元素到队列里，添加成功返回true，添加失败返回false
 * put：添加元素到队列里，如果容量满了会阻塞直到容量不满
 *
 * 删除方法
 * 3个删除方法
 * poll：删除队列头部元素，如果队列为空，返回null。否则返回元素。
 * remove：基于对象找到对应的元素，并删除。删除成功返回true，否则返回false
 * take：删除队列头部元素，如果队列为空，一直阻塞到队列有元素并删除
 * @author: hongghe @date: 2019-03-12 10:33
 */
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(12);
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.offer(1);
    }
}
