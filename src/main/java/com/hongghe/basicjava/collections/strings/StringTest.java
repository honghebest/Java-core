package com.hongghe.basicjava.collections.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class StringTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringTest.class);

    /**
     * 比较两个初始化方式不同的字符串
     *
     */
    public void compareTwoStrings() {
        String o1 = "string";
        String o2 = new String("string");
        LOGGER.info("比较两个字符串");
        LOGGER.info("o1 == o2", (o1 == o2));
        LOGGER.info("o1.equal(o2)", o1.equalsIgnoreCase(o2));
    }

    /**
     * 比较使用intern方式的字符串
     */
    public void compareInternString() {
        String o1 = new String("string");
        String o2 = o1.intern();
        String o3 = "string";
        LOGGER.info("The o2 = {}", o2);
        LOGGER.info("o1 == o2 = {}", o1 == o2);
        LOGGER.info("o1 == o3 = {}", o1 == o3);
    }

    /**
     * 拼接字符串
     */
    public void linkString() {
        String o1 = "str";
        String o2 = "ing";
        String o3 = o1 + o2;
        String o4 = "str" + "ing";
        String o5 = "string";
        LOGGER.info("o3 == o4 = {}", o3 == o4);
        LOGGER.info("o3 == o5 = {}", o3 == o5);
        LOGGER.info("o4 == o5 = {}", o4 == o5);
    }

    /**
     * new创建对象的时候的创建对象的个数
     */
    public void compareTwoString() {
        String o1 = new String("string");
        String o2 = "string";
        LOGGER.info("o1 == o2 = {}", o1 == o2);
        LOGGER.info("o1.equal(o2) = {}", o1.equals(o2));
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.compareTwoStrings();
        stringTest.compareTwoString();
        stringTest.compareInternString();
        stringTest.linkString();
    }
}
