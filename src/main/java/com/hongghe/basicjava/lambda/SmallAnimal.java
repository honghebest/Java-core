package com.hongghe.basicjava.lambda;

import lombok.Builder;
import lombok.Data;

/**
 * @author: hongghe @date: 2019-01-17 15:26
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class SmallAnimal {
    private final String clazz;
    private final Integer age;
}
