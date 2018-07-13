package com.hongghe.basicjava.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * The string of java.
 *
 * @author hongghe 07/2018
 */
@Service
public class StringDemo {

    private static final Logger logger = LoggerFactory.getLogger(StringDemo.class);

    public void compareString(String stringDemoA, String stringDemoB) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringDemoA)
                .append(stringDemoB);
    }
}
