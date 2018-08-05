package com.hongghe.basicjava.generic;

/**
 * 泛型方法的实现
 *
 * @author hongghe 02/08/2018
 */
public class MethodDemo {

    /**
     * 获取数组的中位数
     *
     * @param t
     * @param <T>
     * @return
     */
    public <T> T getMiddleNumber(T[] t) {
        return t[t.length/2];
    }
}
