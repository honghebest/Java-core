package com.hongghe.basicjava;

public class Bird {
    private String name;
    private int age;

    Bird() {

    }

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
