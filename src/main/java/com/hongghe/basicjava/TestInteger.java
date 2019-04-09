package com.hongghe.basicjava;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hongghe @date: 2019-04-08 13:59
 */
public class TestInteger {


    public void change(Integer i) {
        i = 2;
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestInteger testInteger = new TestInteger();
        Integer i = 1;
        System.out.println(i.hashCode());
        testInteger.change(i);
        System.out.println(i.hashCode());

        List<Bird> list = new ArrayList<>();
        Bird bird = new Bird("name", 1);
        list.add(bird);
        bird.setAge(2);
        System.out.println(new Gson().toJson(list));
    }
}
