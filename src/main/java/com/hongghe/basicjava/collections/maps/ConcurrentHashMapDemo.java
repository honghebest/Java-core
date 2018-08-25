package com.hongghe.basicjava.collections.maps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hongghe 2018/8/25
 */
public class ConcurrentHashMapDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcurrentHashMapDemo.class);

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("name", 1);
        map.size();
        map.remove("name");
    }
}
