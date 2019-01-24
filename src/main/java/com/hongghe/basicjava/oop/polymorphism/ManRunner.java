package com.hongghe.basicjava.oop.polymorphism;

/**
 * @author: hongghe @date: 2019-01-24 10:58
 */
public class ManRunner {

    public void run(String type) {
        System.out.println("The single param method.");
    }

    public void run(String type, String clazz) {
        System.out.println("The double param method");
    }

    public void run(String type, String clazz, String grade) {
        System.out.println("The tree param method");
    }

    public static void main(String[] args) {
        ManRunner manRunner = new ManRunner();
        manRunner.run("1");
        manRunner.run("1,", "a");
        manRunner.run("1", "2", "3");
    }
}
