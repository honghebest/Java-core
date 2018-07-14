package com.hongghe.basicjava.generic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 单个的泛型
 *
 * @author hongghe 07/2018
 */
public class SigleGeneric <T> {

    private static final Logger logger = LoggerFactory.getLogger(SigleGeneric.class);

    public String getGeneric(T object) {
        if (object.equals(null)) {
            object = null;
            return null;
        } else {
            return object.toString();
        }
    }
}
