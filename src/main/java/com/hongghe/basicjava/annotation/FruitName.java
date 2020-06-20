package com.hongghe.basicjava.annotation;

import java.lang.annotation.*;

/**
 * @author henry
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    /**
     * default value for fruit name.
     *
     * @return name of fruit
     */
    String value() default "";
}