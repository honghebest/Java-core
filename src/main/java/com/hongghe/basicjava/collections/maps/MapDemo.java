package com.hongghe.basicjava.collections.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hongghe 2018/8/25
 */
public class MapDemo {

    public static void main(String[] args) {
       forEachSearch();
       iteratorSearch();
    }

    // for循环遍历
    public static void forEachSearch() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key0", "value0");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        // KeySet遍历
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        // entrySet()遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
    //迭代器遍历
    public static void iteratorSearch() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key0", "value0");
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        // 迭代器keySet遍历
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
        // 迭代器entrySet
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, String> entry = iterator1.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
