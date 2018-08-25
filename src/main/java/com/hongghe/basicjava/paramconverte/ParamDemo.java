package com.hongghe.basicjava.paramconverte;

/**
 * @author hongghe 2018/8/25
 */
public class ParamDemo {

    public static void foo(int value) {
        value = 100;
    }

    public static void fooString(String text) {
        text = "windows";
    }

    public static void fooStringBuilder(StringBuilder stringBuilder) {
        stringBuilder.append("name");
    }

    public static void stringBuilder(StringBuilder stringBuilder) {
        stringBuilder = new StringBuilder("name");
    }

    public static void main(String[] args) {
        int o1 = 1;
        foo(o1);
        System.out.println(o1);
        String o2 = "zhang";
        System.out.println(o2);
        fooString(o2);
        StringBuilder builder = new StringBuilder("zhang");
        fooStringBuilder(builder);
        System.out.println(builder.toString());
        StringBuilder stringBuilder = new StringBuilder("hongghe");
        stringBuilder(stringBuilder);
        System.out.println(stringBuilder.toString());
    }
}
