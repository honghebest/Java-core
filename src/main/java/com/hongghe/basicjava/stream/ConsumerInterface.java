package com.hongghe.basicjava.stream;

/**
 * @author hongghe 2018/9/29
 */
@FunctionalInterface
public interface ConsumerInterface<T>{
    void accept(T t);
}