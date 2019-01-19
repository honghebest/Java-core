package com.hongghe.basicjava.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取类对象的方法
 *
 * @author hongghe 28/07/2018
 */
@Slf4j
public class GetClassObject {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> classMethod = MethodDemo.class;
        Object methodObject = classMethod.newInstance();
        Method[] methods = classMethod.getMethods();
        Method [] declaredMethods = classMethod.getDeclaredMethods();
        Method addMethod = classMethod.getMethod("add", int.class, int.class);
        log.info("getMethod method");
        for (Method method : methods) {
            log.info("The method is " + method);
            if (method.getName().equalsIgnoreCase("addd")) {
                log.info("The method name is add is ");
            }
        }

        log.info("The declared methods");
        for (Method method : declaredMethods) {
            log.info("The methods is " + method);
        }

        Object result = addMethod.invoke(methodObject, 1, 4);
        log.info("The result is " + result);
    }
}
