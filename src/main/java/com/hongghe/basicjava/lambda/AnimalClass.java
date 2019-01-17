package com.hongghe.basicjava.lambda;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-17 15:25
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class AnimalClass {
    private final String name;
    private final String animalClazz;
    private final Integer age;
}
