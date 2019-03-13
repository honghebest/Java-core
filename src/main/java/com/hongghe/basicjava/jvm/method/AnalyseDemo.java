package com.hongghe.basicjava.jvm.method;

/**
 * 方法调用的使用
 *
 * @author hongghe 01/08/2018
 */
public class AnalyseDemo {

    static {
        System.out.println("the static method.");
    }

    public static void method() {
        System.out.println("the analyse method");
    }

    public static void main(String[] args) {
        AnalyseDemo analyseDemo = new AnalyseDemo();
        method();
    }
}
