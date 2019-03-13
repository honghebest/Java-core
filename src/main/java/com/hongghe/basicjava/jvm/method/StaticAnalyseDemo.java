package com.hongghe.basicjava.jvm.method;

/**
 * 静态指派
 *
 * @author hongghe 01/08/2018
 */
public class StaticAnalyseDemo {

    static class Parent {}

    static class ChildOne extends Parent {}

    static class ChildTwo extends Parent {}

    public void sayHello(ChildOne childOne) {
        System.out.println("child one is call");
    }

    public void sayHello(ChildTwo childTwo) {
        System.out.println("the child two is call.");
    }

    public void sayHello(Parent parent) {
        System.out.println("the parent is call.");
    }

    public static void main(String[] args) {
        StaticAnalyseDemo staticAnalyseDemo = new StaticAnalyseDemo();
        Parent parentChildOne = new ChildOne();
        Parent parentChildTwo = new ChildTwo();
        staticAnalyseDemo.sayHello(parentChildOne);
        staticAnalyseDemo.sayHello(parentChildTwo);
    }
}
