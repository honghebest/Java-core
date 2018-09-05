package com.hongghe.basicjava.serialize;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/24
 */
public class SerializeTest  {

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializeTest.class);

    public static void main(String[] args) {
        LOGGER.info("序列化的实现。");
        ApiDemo apiDemo = new ApiDemo();
        LOGGER.info("序列化是实现的结果");
        System.out.println(apiDemo.getMsg());
    }
}
