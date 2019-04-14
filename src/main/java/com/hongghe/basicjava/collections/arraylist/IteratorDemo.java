package com.hongghe.basicjava.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
