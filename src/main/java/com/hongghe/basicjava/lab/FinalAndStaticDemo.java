package com.hongghe.basicjava.lab;

/**
 * @author hongghe 2018/8/25
 */
public class FinalAndStaticDemo {

    final String age;
    public static String name = "name";
    public static int o1 = 123;
    String address = "address";

    public FinalAndStaticDemo(String age) {
        this.age = address;
    }

    public String getAge() {
        return age;
    }

    public static void setName(String name) {
        FinalAndStaticDemo.name = name;
    }

    public static void main(String[] args) {
        name = "123123123";
        System.out.println(name);
        finalKeyWord();
        System.out.println(name);
        FinalAndStaticDemo finalAndStaticDemo = new FinalAndStaticDemo("sda");
        System.out.println(finalAndStaticDemo.getAge());
        o1 = 123123;
        System.out.println(o1);
    }

    public static void finalKeyWord() {
        name = "namasdasde";
        System.out.println(name);
    }
}
