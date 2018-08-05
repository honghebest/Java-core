package com.hongghe.basicjava.string;

public class StringContactDemo {

    public static void main(String[]args) {
        String a, b;
        a = "123";
        b = "123";
        a.concat(b);
        System.out.println(a);//123
        System.out.println(a.concat(b));//123123
        a = a.concat(b);
        System.out.println(a);//123123
    }
}
