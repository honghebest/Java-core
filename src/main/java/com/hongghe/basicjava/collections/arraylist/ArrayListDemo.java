package com.hongghe.basicjava.collections.arraylist;

import com.google.gson.Gson;
import com.hongghe.basicjava.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongghe 2018/9/3
 */
public class ArrayListDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayListDemo.class);

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Henry");
        list.add("name");
        Gson gson = new Gson();
        Person person = new Person();
        person.setAge(12321);
        person.setName("hongghe");
        list.add(person);
        LOGGER.info("The arrayList is = {}", gson.toJson(list));
    }
}
