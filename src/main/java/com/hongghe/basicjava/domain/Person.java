package com.hongghe.basicjava.domain;

import lombok.Data;

/**
 * 个人信息
 *
 * @author hongghe 09/08/2018
 */
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
