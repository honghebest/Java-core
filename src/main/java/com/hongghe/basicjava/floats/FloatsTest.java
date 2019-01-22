package com.hongghe.basicjava.floats;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/24
 */
@Slf4j
public class FloatsTest {

    public static void main(String[] args) {
        Float o1 = 1.1f;
        Float o2 = 1.1f;
        log.info("比较两个Double类型的变量");
        System.out.println("o1 == o2 " + (o1 == o2));
        System.out.println("o1 equal o2 " + (o1.equals(o2)));
    }
}
