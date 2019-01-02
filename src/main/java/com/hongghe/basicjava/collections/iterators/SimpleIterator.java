package com.hongghe.basicjava.collections.iterators;

import java.util.Iterator;

/**
 * @author hongghe 2019/1/2
 */
public class SimpleIterator {

    public static void main(String[] args) {

        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}
