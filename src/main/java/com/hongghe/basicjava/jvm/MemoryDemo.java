package com.hongghe.basicjava.jvm;

import com.hongghe.basicjava.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class MemoryDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemoryDemo.class);

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<Person>();
        Person person = new Person("hong", 123);
        Person person1 = new Person("hongghe", 1233);
        Person person2 = new Person("zhang", 423);
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);

        LOGGER.info("The size of = {}", personSet.size());

        person.setAge(413121);

        personSet.remove(person);
        personSet.add(person);
        LOGGER.info("The size of = {}" , personSet.size());
        for (Person person3 : personSet) {
            System.out.println(person3.getName());
        }
    }
}
