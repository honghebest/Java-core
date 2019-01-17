package com.hongghe.basicjava.lambda;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: hongghe @date: 2019-01-17 15:24
 */
public class ObjectLambda {

    public static void main(String[] args) {
        List<AnimalClass> animalClassList = Arrays.asList(
                new AnimalClass("1", "1", 1),
                new AnimalClass("2", "0", 1),
                new AnimalClass("3", "2", 2),
                new AnimalClass("4", "3", 3),
                new AnimalClass("5", "4", 4));

        List<SmallAnimal> smallAnimalList = animalClassList.stream()
                .filter(animalClass -> animalClass.getAge() > 1)
                .map(animalClass -> SmallAnimal.builder()
                        .age(animalClass.getAge())
                        .clazz(animalClass.getAnimalClazz())
                        .build())
                .collect(Collectors.toList());
        System.out.println(new Gson().toJson(smallAnimalList));

        List<String> stringList = animalClassList.stream()
                .filter(animalClass -> animalClass.getAge() > 2)
                .map(x -> x.getAnimalClazz())
                .collect(Collectors.toList());
        System.out.println(new Gson().toJson(stringList));

        Map<String,String> maps = animalClassList.stream()
                .collect(Collectors.toMap(x -> x.getAnimalClazz(), x-> x.getName()));
        System.out.println(new Gson().toJson(maps));
    }
}
