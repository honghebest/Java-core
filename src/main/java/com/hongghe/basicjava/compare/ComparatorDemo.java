package com.hongghe.basicjava.compare;

import com.google.gson.Gson;
import com.hongghe.basicjava.domain.Person;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author hongghe 2018/9/30
 */
@Slf4j
public class ComparatorDemo {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("a", 1),
                new Person("b", 2),
                new Person("c", 3)
        );

        Collections.sort(people, new LexicographicComparator());
        Gson gson = new Gson();
        log.info("The people = {}", gson.toJson(people));
    }
}
