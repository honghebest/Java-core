package com.hongghe.basicjava.generic;

/**
 * 数据的设置和获取
 *
 * @author hongghe 02/08/2018
 */
public class DataDemo<T> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
