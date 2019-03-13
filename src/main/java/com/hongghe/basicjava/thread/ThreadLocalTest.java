package com.hongghe.basicjava.thread;

import com.hongghe.basicjava.compare.domain.Person;

import java.util.Random;

/**
 * @author: hongghe @date: 2019-03-12 10:22
 */
public class ThreadLocalTest implements Runnable {

    private final static ThreadLocal<Person> threadLocal = new ThreadLocal<>();

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
        personInfo();
    }

    public void personInfo() {
        // 获取当前线程的名字
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " is running!");
        // 产生一个随机数并打印
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + " set age to:" + age);
        Person people = getPerson();
        people.setAge(age);
        System.out.println("thread " + currentThreadName + " first read age is:" + people.getAge());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("thread " + currentThreadName + " second read age is:" + people.getAge());
    }

    protected Person getPerson() {
        Person person = threadLocal.get();
        // 线程首次执行此方法的时候，threadLocal.get()肯定为null
        if (person == null) {
            // 创建一个对象，并保存到本地线程变量threadLocal中
            person = new Person();
            threadLocal.set(person);
        }
        return person;
    }

    public static void main(String[] args) {
        ThreadLocalTest td = new ThreadLocalTest();
        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);
        t1.start();
        t2.start();
    }
}

