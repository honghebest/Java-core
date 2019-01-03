package com.hongghe.basicjava.collections.link;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hongghe 2018/8/25
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<String, String> paraMap = new LinkedHashMap<>();
        paraMap.put("hello", "name");

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("a",1) ;
        map.put("b",2) ;
        map.put("c",3) ;
        map.put("d",4) ;
        map.put("e",5) ;
        System.out.println(map.toString());
    }
}
