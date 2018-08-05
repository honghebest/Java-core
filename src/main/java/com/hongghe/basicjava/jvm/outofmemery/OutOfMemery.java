package com.hongghe.basicjava.jvm.outofmemery;

public class OutOfMemery {

    public static void main(String[] args) {
        int number = 12312;
        int[] nu = new int[1000000000];
        while (true) {
            nu = new int[1000000000];
            System.out.println("wqeqw");
        }
    }
}
