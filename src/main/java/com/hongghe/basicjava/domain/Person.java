package com.hongghe.basicjava.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 个人信息
 *
 * @author hongghe 09/08/2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person
{
    private String name;
    private Integer age;

    @Override
    public String toString()
    {
        return "I am a person, my name is " + name;
    }
}
