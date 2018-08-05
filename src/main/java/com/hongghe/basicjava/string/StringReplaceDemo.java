package com.hongghe.basicjava.string;

public class StringReplaceDemo {

    public static void main(String[] args) {
        String a;
        a = "12131";
        a.replace("1", "a");
        System.out.println(a);//12131
        a = a.replace("1", "a");
        System.out.println(a);//a2a3a
    }
}
