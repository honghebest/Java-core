package com.hongghe.basicjava.http;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongghe 2018/9/30
 */
public class Demo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(4);
        Gson gson = new Gson();
        System.out.println(gson.toJson(map));
    }
}
