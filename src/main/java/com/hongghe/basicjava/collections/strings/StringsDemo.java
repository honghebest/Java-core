package com.hongghe.basicjava.collections.strings;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/23
 */
@Slf4j
public class StringsDemo {

    public static String stringsBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        log.info("The string builder operation is = {}", stringBuilder);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        stringsBuilder();
    }
}
