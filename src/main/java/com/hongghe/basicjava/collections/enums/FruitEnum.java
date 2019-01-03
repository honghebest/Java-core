package com.hongghe.basicjava.collections.enums;

/**
 * @author hongghe 2019/1/3
 */
public enum  FruitEnum {

    APPLE(1, "apple"),
    ORANGE(2, "orange")
    ;

    private int value;

    private String name;

    FruitEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
