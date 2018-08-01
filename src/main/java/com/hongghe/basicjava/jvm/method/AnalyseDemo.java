package com.hongghe.basicjava.jvm.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 方法调用的使用
 *
 * @author hongghe 01/08/2018
 */
public class AnalyseDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnalyseDemo.class);

    public static void method() {
        LOGGER.info("The analyse method");
    }

    public static void main(String[] args) {
        method();
    }
}
