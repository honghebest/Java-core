package com.hongghe.basicjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hongghe 2018/8/25
 */
public class NumberMatcher {

    public static final String MATCH_STRING = "[0-9]{6}";

    public static void main(String[] args) {
        String o1 = "asdasd123456rqwqw123";
        Pattern pattern = Pattern.compile(MATCH_STRING);
        Matcher matcher = pattern.matcher(o1);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        } else {
            System.out.println("There is none.");
        }
    }
}
