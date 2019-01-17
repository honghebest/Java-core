package com.hongghe.basicjava.lambda;

/**
 * @author: hongghe @date: 2019-01-17 11:06
 */
public class BasicLambda {

    public static void main(String[] args) {
        final int x = 1;
        getA<Integer> a = (y) -> System.out.println(String.valueOf(x + y));
        a.a(1);
        System.out.println(a);
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    public interface getA<T> {
        void a(int a);
    }
}
