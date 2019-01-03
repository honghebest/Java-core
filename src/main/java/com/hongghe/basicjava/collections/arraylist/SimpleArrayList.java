package com.hongghe.basicjava.collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author hongghe 2019/1/2
 */
public class SimpleArrayList {

    public static void main(String[] args) {
        // 继承顺序进出
        List<String> demoList = new LinkedList<>();
        demoList.size();
        demoList.add("1");
        demoList.addAll(new LinkedList<>());
        demoList.contains("1");
        demoList.isEmpty();
        demoList.get(1);
        // 随机进出
        List<String> stringList = new ArrayList<>();
    }
}
