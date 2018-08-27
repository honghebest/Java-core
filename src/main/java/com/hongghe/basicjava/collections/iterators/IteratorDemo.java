package com.hongghe.basicjava.collections.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hongghe 2018/8/26
 */
public class IteratorDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Iterator<String> iterator = map.keySet().iterator();
    }

}
