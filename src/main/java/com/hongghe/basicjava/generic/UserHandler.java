package com.hongghe.basicjava.generic;

/**
 * 对象判断
 *
 * @param <T>
 * @param <V>
 */
public interface UserHandler<T, V> {

    public void init(T t, V v);
}
