package com.hongghe.basicjava.domain;

import lombok.Data;

@Data
public class Person
{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "I am a person, my name is " + name;
    }
}
