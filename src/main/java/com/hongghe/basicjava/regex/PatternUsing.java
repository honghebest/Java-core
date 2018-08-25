package com.hongghe.basicjava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hongghe 2018/8/25
 */
public class PatternUsing {

    private static final String MATCHER_REGEX = "\\w+";

    private static final String NUMBER_REGEX = "\\d+";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(MATCHER_REGEX);
        pattern.pattern();
        Pattern pattern1 = Pattern.compile(NUMBER_REGEX);
        String[] stringArray = pattern1.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");
        for (int i=0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

    }

    public static void patternMacher() {
        Pattern.matches("\\d+", "213123");
        Pattern.matches("\\d+", "2131212312asda3");
        Pattern.matches("\\d+", "asdasd");
    }

    public static void compileMatch() {
        Pattern p=Pattern.compile(NUMBER_REGEX);
        Matcher m=p.matcher("22bb23");
        m.lookingAt();
        //返回true,因为\d+匹配到了前面的22
        Matcher m2=p.matcher("aa2223");
        m2.lookingAt();
        //返回false,因为\d+不能匹配前面的aa
    }

    public static void findMatch() {
        Pattern p=Pattern.compile(NUMBER_REGEX);
        Matcher m=p.matcher("22bb23");
        m.find();//返回true
        Matcher m2=p.matcher("aa2223");
        m2.find();//返回true
        Matcher m3=p.matcher("aa2223bb");
        m3.find();//返回true
        Matcher m4=p.matcher("aabb");
        m4.find();//返回false
    }

    public static void startEndGroup() {
        Pattern p=Pattern.compile(NUMBER_REGEX);
        Matcher m=p.matcher("aaa2223bb");
        m.find();//匹配2223
        m.start();//返回3
        m.end();//返回7,返回的是2223后的索引号
        m.group();//返回2223

        Matcher m2 = p.matcher("2223bb");
        m.lookingAt();   //匹配2223
        m.start();   //返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0
        m.end();   //返回4
        m.group();   //返回2223

        Matcher m3 = p.matcher("2223bb");
        m.matches();   //匹配整个字符串
        m.start();   //返回0,原因相信大家也清楚了
        m.end();   //返回6,原因相信大家也清楚了,因为matches()需要匹配所有字符串
        m.group();   //返回2223bb
    }

    private static final String DATA_REGEX = "([a-z]+)(\\d+)";
    public static void compileString() {
        Pattern p=Pattern.compile(DATA_REGEX);
        Matcher m=p.matcher("aaa2223bb");
        m.find();
        //匹配aaa2223
        m.groupCount();
        //返回2,因为有2组
        m.start(1);
        //返回0 返回第一组匹配到的子字符串在字符串中的索引号
        m.start(2);
        //返回3
        m.end(1);
        // 返回3 返回第一组匹配到的子字符串的最后一个字符在字符串中的索引位置.
        m.end(2);
        //返回7
        m.group(1);
        //返回aaa,返回第一组匹配到的子字符串
        m.group(2);
        //返回2223,返回第二组匹配到的子字符串
    }

    public static void findString() {
        Pattern p=Pattern.compile(NUMBER_REGEX);
        Matcher m=p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
