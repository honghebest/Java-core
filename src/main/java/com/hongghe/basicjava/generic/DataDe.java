package com.hongghe.basicjava.generic;

/**
 * 双参数的设置
 *
 * @author hongghe 02/08/2018
 */
public class DataDe <T, V> {

    private T t;
    private V v;

    DataDe(T t, V v) {
        this.t = t;
        this.v = v;
    }
}
