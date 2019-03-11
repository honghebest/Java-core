package com.hongghe.basicjava.thread.parameters;

/**
 * <p>通过变量和方法传递数据</p>
 * @author: hongghe @date: 2019-03-11 20:26
 */
public class ThreadTwo implements Runnable {

    private String name;

    private void setName(String name) {
        this.name = name;
    }

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
        System.out.println("The name = " +  name);
    }

    public static void main(String[] args) {
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.setName("name of thread.");
        threadTwo.run();
    }
}
