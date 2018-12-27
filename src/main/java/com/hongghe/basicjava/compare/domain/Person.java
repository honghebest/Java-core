package com.hongghe.basicjava.compare.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongghe 2018/12/27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "I am a person, my name is " + name;
    }
}
