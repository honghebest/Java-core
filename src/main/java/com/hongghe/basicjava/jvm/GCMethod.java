package com.hongghe.basicjava.jvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 垃圾处理方法
 *
 * @author hongghe 24/07/2018
 */
public class GCMethod {

    private static final Logger LOGGER = LoggerFactory.getLogger(GCMethod.class);

    public static void main(String[] args) {
        LOGGER.info("The integer " + Integer.BYTES);
        System.out.println(Runtime.getRuntime().maxMemory());
    }
}
