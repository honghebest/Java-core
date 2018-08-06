package com.hongghe.basicjava.guava;

import com.google.common.collect.*;

import java.util.Collection;
import java.util.Map;

/**
 * 各种Map的操作和使用
 *
 * @author hongghe 06/08/2018
 */
public class MapsDemo {

    public static void bitMapDmeo() {
        BiMap<String,String> biMap= HashBiMap.create();
        biMap.put("sina","sina.com");
        biMap.put("qq","qq.com");
        //会覆盖原来的value
        biMap.put("sina","sina.cn");
       /*
         在BiMap中,如果你想把键映射到已经存在的值，会抛出IllegalArgumentException异常
         如果对特定值,你想要强制替换它的键，请使用 BiMap.forcePut(key, value)
        */
        //抛出异常
        biMap.put("tecent","qq.com");
        //强制替换key
        biMap.forcePut("tecent","qq.com");
        System.out.println(biMap);
        //通过value找key
        System.out.println(biMap.inverse().get("sina.com"));
        //true
        System.out.println(biMap.inverse().inverse()==biMap);
    }

    public static void mutimapDemo() {
        //Multimap是把键映射到任意多个值的一般方式
        Multimap<String,Integer> map= HashMultimap.create();
        //key相同时不会覆盖原value
        map.put("a",1);
        map.put("a",2);
        map.put("a",3);
        //{a=[1, 2, 3]}
        System.out.println(map);
        //返回的是集合
        System.out.println(map.get("a"));
        //返回所有”键-单个值映射”的个数,而非不同键的个数
        System.out.println(map.size());
        //返回不同key的个数
        System.out.println(map.keySet().size());
        Map<String,Collection<Integer>> mapView=map.asMap();
    }

    public static void multiSetDemo() {
        Multiset<String> set= LinkedHashMultiset.create();
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");
        //添加或删除指定元素使其在集合中的数量是count
        set.setCount("a",5);
        //给定元素在Multiset中的计数
        System.out.println(set.count("a"));
        System.out.println(set);
        //所有元素计数的总和,包括重复元素
        System.out.println(set.size());
        //所有元素计数的总和,不包括重复元素
        System.out.println(set.elementSet().size());
        //清空集合
        set.clear();
        System.out.println(set);
    }
}
