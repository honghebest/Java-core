package com.hongghe.basicjava.reflect.clazz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 获取类的信息
 *
 * @author hongghe 23/07/2018
 */
public class ClassInfo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassInfo.class);

    public String getClassName(String clazz) throws Exception {
        Class className = Class.forName(clazz);
        return className.getName();
    }

    public String getPackageName(String className) throws Exception {
        Class clazz = Class.forName(className);
        return clazz.getPackage().getName();
    }
}
