package com.hongghe.basicjava.stream;

/**
 * @author hongghe 2018/9/29
 */
// 自定义函数接口
@FunctionalInterface
public interface ConsumerInterface<T>{
    void accept(T t);
}