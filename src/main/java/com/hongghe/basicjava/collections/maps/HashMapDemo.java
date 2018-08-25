package com.hongghe.basicjava.collections.maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongghe 2018/8/25
 */
public class HashMapDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(HashMapDemo.class);

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("hello", 1);
        map.size();
        map.containsKey("hello");
        map.remove("hello");
        System.out.println(16 >>> 1);
    }
}
