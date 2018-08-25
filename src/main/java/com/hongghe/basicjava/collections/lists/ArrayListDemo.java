package com.hongghe.basicjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hongghe 2018/8/25
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        iteratorPattern();
        adapterPattern();
    }

    public static void iteratorPattern() {
        List<String> arrayList = new ArrayList<>();
        arrayList.size();
        arrayList.add("name");
        arrayList.add("hello");
        arrayList.add("world");
        for (String list : arrayList) {
            System.out.println(list);
        }
    }

    public static void adapterPattern() {
        Integer[] o1 = {1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(o1);
        for (Integer o2 : list) {
            System.out.println(o2);
        }
    }
}
