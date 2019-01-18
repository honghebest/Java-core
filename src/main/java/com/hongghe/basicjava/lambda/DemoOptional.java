package com.hongghe.basicjava.lambda;

import java.util.Optional;

/**
 * @author: hongghe @date: 2019-01-18 21:01
 */
public class DemoOptional {

    public static void main(String[] args) {
       Optional num = Optional.empty();
       if (num.isPresent()) {
           System.out.println("This is null");
       } else {
           System.out.println(num);
       }
    }
}
