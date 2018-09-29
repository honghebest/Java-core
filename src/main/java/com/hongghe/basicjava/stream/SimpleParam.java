package com.hongghe.basicjava.stream;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author hongghe 2018/9/29
 */
@Slf4j
public class SimpleParam {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, new Comparator<String>(){
            // 接口名
            @Override
            public int compare(String s1, String s2){
                // 方法名
                if(s1 == null) {
                    return -1;
                }

                if(s2 == null) {
                    return 1;
                }

                return s1.length()-s2.length();
            }
        });

        List<String> stringList = Arrays.asList("I", "love", "you", "too");
        Collections.sort(stringList, (s1, s2) ->{
            // 省略参数表的类型
            if(s1 == null) {
                return -1;
            }

            if(s2 == null) {
                return 1;
            }

            return s1.length()-s2.length();
        });
    }
}
