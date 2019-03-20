package com.hongghe.basicjava.reflect.clazz;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectClass {

    private static Object TestUser;

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName(UserInformation.class.getName());
        Method method = clazz.getMethod("add", clazz);
        Annotation annotation = method.getAnnotation(clazz);
        if (annotation.equals(TestUser)) {
            System.out.println("test");
        }
    }
}
