package com.hongghe.basicjava.doubles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/24
 */
public class DoublesTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DoublesTest.class);

    public static void main(String[] args) {
        Double o1 = 1.1;
        Double o2 = 1.1;
        LOGGER.info("比较两个Double类型的变量");
        System.out.println(o1 == o2);
    }
}
