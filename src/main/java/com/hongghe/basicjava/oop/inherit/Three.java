package com.hongghe.basicjava.oop.inherit;

/**
 * @author: hongghe @date: 2019-01-24 10:45
 */
public class Three extends Second {

    Three() {
        System.out.println("The three");
    }

    public static void firstMethod() {
        System.out.println("The three  first method");
    }

    public void secondMethod() {
        System.out.println("The three second method");
    }

    public static void main(String[] args) {
        Three three = new Three();
        firstMethod();
        three.secondMethod();
    }
}
