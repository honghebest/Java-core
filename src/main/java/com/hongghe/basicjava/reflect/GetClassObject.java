package com.hongghe.basicjava.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取累对象的方法
 *
 * @author hongghe 28/07/2018
 */
public class GetClassObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetClassObject.class);

    public static void main(String[] args) throws IOException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> classMethod = MethodDemo.class;
        Object methodObject = classMethod.newInstance();
        Method[] methods = classMethod.getMethods();

        Method [] declaredMethods = classMethod.getDeclaredMethods();

        Method addMethod = classMethod.getMethod("add", int.class, int.class);
        LOGGER.info("getMethod method");
        for (Method method : methods) {
            LOGGER.info("The method is " + method);
            if (method.getName().equalsIgnoreCase("addd")) {
                LOGGER.info("The method name is add is ");
            }
        }

        LOGGER.info("The declared methods");
        for (Method method : declaredMethods) {
            LOGGER.info("The methods is " + method);
        }

        Object result = addMethod.invoke(methodObject, 1, 4);
        LOGGER.info("The result is " + result);
    }
}
