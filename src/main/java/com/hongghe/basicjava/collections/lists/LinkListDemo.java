package com.hongghe.basicjava.collections.lists;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList 底层是基于双向链表实现的，
 *也是实现了 List 接口，所以也拥有 List 的一些特点(JDK1.7/8 之后取消了循环，修改为双向链表)
 *
 * @author hongghe 2018/8/25
 */
public class LinkListDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("name");
        list.add(1, "hello");
        list.size();
        list.get(1);
    }
}
