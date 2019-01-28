package com.hongghe.basicjava.collections.strings;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/23
 */
@Slf4j
public class StringTest {

    /**
     * 比较两个初始化方式不同的字符串
     *
     */
    public void compareTwoStrings() {
        String o1 = "string";
        String o2 = new String("string");
        log.info("比较两个字符串");
        log.info("o1 == o2", (o1 == o2));
        log.info("o1.equal(o2)", o1.equalsIgnoreCase(o2));
    }

    /**
     * 比较使用intern方式的字符串
     */
    public void compareInternString() {
        String o1 = new String("string");
        String o2 = o1.intern();
        String o3 = "string";
        log.info("The o2 = {}", o2);
        log.info("o1 == o2 = {}", o1 == o2);
        log.info("o1 == o3 = {}", o1 == o3);
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
        log.info("o3 == o4 = {}", o3 == o4);
        log.info("o3 == o5 = {}", o3 == o5);
        log.info("o4 == o5 = {}", o4 == o5);
    }

    /**
     * new创建对象的时候的创建对象的个数
     */
    public void compareTwoString() {
        String o1 = new String("string");
        String o2 = "string";
        log.info("o1 == o2 = {}", o1 == o2);
        log.info("o1.equal(o2) = {}", o1.equals(o2));
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.compareTwoStrings();
        stringTest.compareTwoString();
        stringTest.compareInternString();
        stringTest.linkString();
    }
}
