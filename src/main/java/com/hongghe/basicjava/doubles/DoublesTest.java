package com.hongghe.basicjava.doubles;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/24
 */
@Slf4j
public class DoublesTest {

    public static void main(String[] args) {
        Double o1 = 1.1;
        Double o2 = 1.1;
        log.info("比较两个Double类型的变量");
        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        Integer num = 123;
        System.out.println(num%=num/2);

    }
}
