package com.hongghe.basicjava.generic;

/**
 * 单个的泛型
 *
 * @author hongghe 07/2018
 */
public class SingletonGeneric<T> {

    public String getGeneric(T object) {
        if (object.equals(null)) {
            object = null;
            return null;
        } else {
            return object.toString();
        }
    }
}
