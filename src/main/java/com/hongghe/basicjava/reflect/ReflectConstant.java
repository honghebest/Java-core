package com.hongghe.basicjava.reflect;

/**
 * 反射的常量
 *
 * @author hongghe 23/07/2018
 */
public enum  ReflectConstant {

    SUCCESS(1, "success"),
    ERROR(2, "error");

    private final Integer code;

    private final String message;

    ReflectConstant(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
