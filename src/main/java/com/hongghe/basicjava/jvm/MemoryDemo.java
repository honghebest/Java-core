package com.hongghe.basicjava.jvm;

import com.hongghe.basicjava.domain.Person;

import java.util.HashSet;
import java.util.Set;

public class MemoryDemo {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<Person>();
        Person person = new Person("hong", 123);
        Person person1 = new Person("hongghe", 1233);
        Person person2 = new Person("zhang", 423);
        personSet.add(person);
        personSet.add(person1);
        personSet.add(person2);
        System.out.println("the size of = {}" + personSet.size());
        person.setAge(413121);
        personSet.remove(person);
        personSet.add(person);
        System.out.println("the size of two = {}" + personSet.size());
        for (Person person3 : personSet) {
            System.out.println(person3.getName());
        }
    }
}
