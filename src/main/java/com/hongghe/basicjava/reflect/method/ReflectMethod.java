package com.hongghe.basicjava.reflect.method;

import com.google.gson.Gson;
import com.hongghe.basicjava.reflect.SuperMethodDemo;

import java.lang.reflect.Method;

/**
 * The class method of reflect.
 *
 * @author hongghe 28/07/2018
 */
public class ReflectMethod {

    public static void main(String[] args) {
        Class<?> classObject = SuperMethodDemo.class;
        try {
            Method method = classObject.getMethod("SuperMethodDemo()", SuperMethodDemo.class);
            System.out.println(new Gson().toJson(method));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
