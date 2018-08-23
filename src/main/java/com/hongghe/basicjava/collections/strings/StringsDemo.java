package com.hongghe.basicjava.collections.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class StringsDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringsDemo.class);

    public String stringsBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        LOGGER.info("The string builder operation is = {}", stringBuilder);
        return stringBuilder.toString();
    }
}
