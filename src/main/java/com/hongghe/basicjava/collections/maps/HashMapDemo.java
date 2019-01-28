package com.hongghe.basicjava.collections.maps;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongghe 2018/8/25
 */
@Slf4j
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hello", 1);
        map.size();
        map.containsKey("hello");
        map.remove("hello");
        System.out.println(16 >>> 1);
    }
}
