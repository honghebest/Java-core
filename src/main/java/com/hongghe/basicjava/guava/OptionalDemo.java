package com.hongghe.basicjava.guava;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * optional demo的使用
 *
 * @author hongghe 05/08/2018
 */
@Slf4j
public class OptionalDemo {

    private static Integer sum(Optional<Integer> integerA, Optional<Integer> integerB) {
        //isPresent():如果Optional包含非null的引用（引用存在），返回true
        log.info("First param is present: " + integerA.isPresent());
        log.info("Second param is present: "+integerB.isPresent());
        //返回Optional所包含的引用,若引用缺失,返回指定的值
        Integer integerC = integerA.orElse(0);
        //返回所包含的实例,它必须存在,通常在调用该方法时会调用isPresent()判断是否为null
        Integer integerD = integerB.get();
        return integerC + integerD;
    }

    public static String NotNullString(Optional<String> stri) {
        return stri.isPresent() ? stri.toString() : null;
    }


    public static void main(String[] args) {
        Integer integerA = null;
        Integer integerB = 1;
        //创建指定引用的Optional实例，若引用为null则快速失败返回absent(),absent()创建引用缺失的Optional实例
        Optional<Integer> integerC =Optional.ofNullable(integerA);
        //返回包含给定的非空引用Optional实例
        Optional<Integer> integerD = Optional.of(integerB);
        log.info("The sum of two number is = {}", sum(integerC, integerD));
    }

}
