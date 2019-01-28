package com.hongghe.basicjava.generic;

import com.google.gson.Gson;
import lombok.ToString;

/**
 * @author hongghe 2019/1/1
 */
@ToString
public class UserHandlerMethod implements UserHandler {

    private String name;
    private Integer age;

    UserHandlerMethod() {}

    UserHandlerMethod(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void init(Object o, Object o2) {
        this.name = (String)o;
        this.age = (Integer)o2;
    }

    public void outPutInfo() {
        System.out.println(new Gson().toJson(new UserHandlerMethod(name, age)));
    }
}
