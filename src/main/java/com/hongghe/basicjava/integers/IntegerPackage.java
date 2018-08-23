package com.hongghe.basicjava.integers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * java 基本类型的包装类的大部分都实现了常量池技术，即Byte,Short,Integer,Long,Character,Boolean；
 * 这5种包装类默认创建了数值[-128，127]的相应类型的缓存数据，但是超出此范围仍然会去创建新的对象。
 * 两种浮点数类型的包装类 Float,Double 并没有实现常量池技术。
 *
 * @author hongghe 2018/8/23
 */
public class IntegerPackage {

    private static final Logger LOGGER = LoggerFactory.getLogger(IntegerPackage.class);

    public void compareTwoInteger() {
        Integer o1 = 11;
        Integer o2 = 11;
        // true
        LOGGER.info("o1 == o2 = {}",o1 == o2);
        Float o3 = 1.0f;
        Float o4 = 1.0f;
        // false
        LOGGER.info("o3 == o4 = {}", o3 == o4);
        Double o5 = 11.1;
        Double o6 = 11.1;
        // false
        LOGGER.info("o5 == o6 = {}", o5 == o6);
    }

    public void compare() {
        Integer o1 = 40;
        Integer o2 = 40;
        Integer o3 = 0;
        Integer o4 = new Integer(40);
        Integer o5 = new Integer(40);
        Integer o6 = new Integer(0);

        LOGGER.info("o1 = o2   = {}" , (o1 == o2));
        LOGGER.info("o1 = o2+o3   = {}",   (o1 == o2 + o3));
        LOGGER.info("o1 = o4   = {}" , (o1 == o4));
        LOGGER.info("o4 = o5   = {}" , (o4 == o5));
        LOGGER.info("o4 = o5+o6   = {}" ,  (o4 == o5 + o6));
        LOGGER.info("40 = o5+o6   = {}" ,  (40 == o5 + o6));
    }

    public static void main(String[] args) {
        IntegerPackage integerPackage = new IntegerPackage();
        integerPackage.compareTwoInteger();
        integerPackage.compare();
    }
}
