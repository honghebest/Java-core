package com.hongghe.basicjava.jvm.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态指派
 *
 * @author hongghe 01/08/2018
 */
public class StaticAnalyseDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StaticAnalyseDemo.class);

    static class Parent {}

    static class ChildOne extends Parent {}

    static class ChildTwo extends Parent {}

    public void sayHello(ChildOne childOne) {
        LOGGER.info("child one is call");
    }

    public void sayHello(ChildTwo childTwo) {
        LOGGER.info("The child two is call");
    }

    public void sayHello(Parent parent) {
        LOGGER.info("The parent is call.");
    }

    public static void main(String[] args) {
        StaticAnalyseDemo staticAnalyseDemo = new StaticAnalyseDemo();
        Parent parentChildOne = new ChildOne();
        Parent parentChildTwo = new ChildTwo();
        staticAnalyseDemo.sayHello(parentChildOne);
        staticAnalyseDemo.sayHello(parentChildTwo);
    }
}
