package com.hongghe.basicjava.generic;

import java.util.Collection;

/**
 * @author: hongghe @date: 2019-03-05 10:09
 */
public class ArrayListDemo<K, E> {

    public String get(Collection<? extends E> param) {
        System.out.println(param);
        return null;
    }

    public <K> String returnName(K k) {
        System.out.println(k);
        return "name";
    }

    public static void main(String[] args) {
        ArrayListDemo<String,String> arrayListDemo = new ArrayListDemo<>();
        String name = arrayListDemo.returnName("ma,e");
        System.out.println(name);
    }
}
