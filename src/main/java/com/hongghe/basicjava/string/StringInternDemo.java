package com.hongghe.basicjava.string;

public class StringInternDemo {

    public void main(String[]args) {
        String a, b;
        a = "123";
        b = new String(a).intern();
        System.out.println(a == b);//true
        a = "12" + "3";
        b = "123";
        System.out.println(a == b);//true
        a = "12" + "3";
        b = new String("123");
        System.out.println(a == b);//false
        a = "12" + "3";
        b = new String("123").intern();
        System.out.println(a == b);//true
        a = new String("123");
        b = a.intern();
        System.out.println(a == b);//false
    }
}
