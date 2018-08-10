package com.hongghe.basicjava.json.domain;

import lombok.Data;

import java.util.List;

/**
 * 教师
 *
 * @author hongghe 10/08/2018
 */
@Data
public class Teacher {
    private String name;
    private Integer age;
    private String homeAddress;
    private String houseAddress;
    private List<String> clazz;
    private String school;
}
