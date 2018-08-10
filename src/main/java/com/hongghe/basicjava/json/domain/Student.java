package com.hongghe.basicjava.json.domain;

import lombok.Data;

/**
 * 教师
 *
 * @author hongghe 10/08/2018
 */
@Data
public class Student {
    private String name;
    private Integer age;
    private String homeAddress;
    private String houseAddress;
    private String clazz;
    private String school;
}
