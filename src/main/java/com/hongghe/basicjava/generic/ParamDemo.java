package com.hongghe.basicjava.generic;

/**
 * 泛型参数的设置
 *
 * @author hongghe 02/08/2018
 */
public class ParamDemo {


    public <T extends Comparable<T>> T MaxNumber(T[] t) {
        T max = t[0];
        for (T t1 : t) {
            if (t1.compareTo(max) > 0) {
                max = t1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ParamDemo paramDemo = new ParamDemo();
    }
}
