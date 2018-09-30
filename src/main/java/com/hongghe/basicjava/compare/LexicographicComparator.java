package com.hongghe.basicjava.compare;

import com.hongghe.basicjava.domain.Person;

import java.util.Comparator;

/**
 * @author hongghe 2018/9/30
 */
public class LexicographicComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}