package com.hongghe.basicjava.guava;

import com.google.common.base.Strings;

/**
 * 与字符串相关的
 *
 * @author hongghe 05/08/2018
 */
public class StringTool {

    public static boolean isNull(String string) {
        if (Strings.isNullOrEmpty(string)) {
            return true;
        }
        return false;
    }

    public static boolean isNotNull(String string) {
        if (Strings.isNullOrEmpty(string)) {
            return false;
        }
        return true;
    }

    public static boolean isNull(Object obj) {
        if (obj == null) {
            return true;
        }

        String string = (String)obj;
        if (Strings.isNullOrEmpty(string)) {
            return true;
        } else {
            Integer num = (Integer)obj;
            if (num.equals(0)) {
                return true;
            }
        }

        return false;
    }

}
