package com.hongghe.basicjava.compare;

import com.google.gson.Gson;
import com.hongghe.basicjava.compare.domain.Person;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @author hongghe 2018/9/30
 */
@Slf4j
public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("a", 1),
                new Person("b", 22),
                new Person("c", 1));

        Collections.sort(personList, new LexicographicComparator());
        Gson gson = new Gson();
        log.info("The people = {}", gson.toJson(personList));

        TreeSet tree = new TreeSet();
        tree.add(new Person("ab", 1));
        tree.add(new Person("aa", 21));
        tree.add(new Person("ac", 12233));
        tree.add(new Person("d", 123));
        log.info("The people = {}", gson.toJson(tree));

        System.out.println(Math.min(12, 3));
    }
}
