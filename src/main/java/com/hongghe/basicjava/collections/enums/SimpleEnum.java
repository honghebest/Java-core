package com.hongghe.basicjava.collections.enums;

/**
 * @author hongghe 2019/1/2
 */
public class SimpleEnum {

    public static void main(String[] args) {
        if (FruitEnum.APPLE.equals(FruitEnum.APPLE)) {
            System.out.println("The is equal.");
        }
    }
}
