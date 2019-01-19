package com.hongghe.basicjava.lambda;

import com.google.gson.Gson;

import java.util.Optional;

/**
 * @author: hongghe @date: 2019-01-19 17:09
 */
public class OptionalBasic {

    public static void main(String[] args) {
        String obj = null;
        Optional<String> num = Optional.ofNullable(obj);
        if (num.isPresent()) {
            String value = num.get();
            System.out.println(new Gson().toJson(value));
        } else {
            System.out.println(new Gson().toJson("The is null"));
        }
    }
}
