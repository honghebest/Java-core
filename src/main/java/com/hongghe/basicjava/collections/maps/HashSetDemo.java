package com.hongghe.basicjava.collections.maps;

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
        System.out.println(set.size());
    }
}
