package com.hongghe.basicjava.floats;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/24
 */
public class FloatsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(FloatsTest.class);

    public static void main(String[] args) {
        Float o1 = 1.1f;
        Float o2 = 1.1f;
        LOGGER.info("比较两个Double类型的变量");
        System.out.println("o1 == o2 " + (o1 == o2));
        System.out.println("o1 == o2 " + (o1.equals(o2)));
    }
}
