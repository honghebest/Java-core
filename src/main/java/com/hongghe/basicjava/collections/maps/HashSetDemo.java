package com.hongghe.basicjava.collections.maps;

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hongghe 2018/8/25
 */
public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("name");
        set.add("hello");
        set.add("name");
        System.out.println(new Gson().toJson(set));
        System.out.println(set.size());
    }
}
