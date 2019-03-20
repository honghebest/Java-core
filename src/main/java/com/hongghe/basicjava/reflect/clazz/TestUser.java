package com.hongghe.basicjava.reflect.clazz;

import java.lang.annotation.*;

/**
 * @author: hongghe @date: 2019-03-20 23:43
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestUser {
}
