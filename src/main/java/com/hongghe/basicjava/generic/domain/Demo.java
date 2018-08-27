package com.hongghe.basicjava.generic.domain;

import com.google.gson.Gson;

/**
 * @author hongghe 2018/8/27
 */
public class Demo {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Student person = new Student();
        person.setName("zha");
        person.setAge(123);
        person.setSchool("HUST");
        System.out.println(gson.toJson(person));
    }
}
