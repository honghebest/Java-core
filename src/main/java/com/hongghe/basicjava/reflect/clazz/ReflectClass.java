package com.hongghe.basicjava.reflect.clazz;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectClass {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName(UserInformation.class.getName());
        System.out.println(clazz);
        Method method = clazz.getMethod("add", null);
        System.out.println(method);
        Annotation annotation = method.getAnnotation(TestUser.class);
        System.out.println(annotation);
        if (annotation != null) {
            System.out.println(annotation);
            return;
        }
        System.out.println("test");
    }
}
