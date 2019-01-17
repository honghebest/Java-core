package com.hongghe.basicjava.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author: hongghe @date: 2019-01-17 11:06
 */
public class BasicLambda {

    public static void main(String[] args) {
        final int x = 1;
        getA<Integer> a = (y) -> System.out.println(String.valueOf(x + y));
        a.a(1);
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);  // 输出结果为 3

        List<Integer> integerList = Arrays.asList(1,23,4,5,23,4534,234234,2342);
        System.out.println(integerList.stream().filter(aa -> aa > 1).mapToLong(bb -> bb).sum());
        integerList.forEach(z -> System.out.println(z));


        System.out.println(integerList.stream().allMatch(xxx -> xxx > 0));
        System.out.println(integerList.stream().anyMatch(xxx -> xxx > 0));
        System.out.println(integerList.stream().findAny().filter(xxxx -> xxxx < 0));
    }

    public interface Converter<T1, T2> {
        void convert(int i);
    }

    public interface getA<T> {
        void a(int a);
    }
}
