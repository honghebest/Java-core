package com.hongghe.basicjava.properties;

import java.util.ResourceBundle;

/**
 * 使用ResourceBundle
 *
 * @author hongghe 06/08/2018
 */
public class getProperties {

    /** 参数文件名字*/
    private static String SYSTEM_FILE = "application";
    private static ResourceBundle BUNDLE = ResourceBundle.getBundle(SYSTEM_FILE);

    /** 读取配置*/
    public static String getParam(String key) {
        return BUNDLE.getString(key);
    }
}
