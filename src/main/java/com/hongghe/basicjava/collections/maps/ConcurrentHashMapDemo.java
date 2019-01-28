package com.hongghe.basicjava.collections.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hongghe 2018/8/25
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("name", 1);
        map.size();
        map.remove("name");
    }
}
