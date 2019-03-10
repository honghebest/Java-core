package com.hongghe.basicjava.cases;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author: hongghe @date: 2019-03-07 10:11
 */
public class InstantMain {

    public static void main(String[] args) {
        Object o = new ArrayList<>();
        displayObject(o);
    }

    public static void displayObject(Object o) {
        if (o instanceof Vector) {
            System.out.println("vector");
        } else if (o instanceof ArrayList) {
            System.out.println("Array list");
        }
    }
}
