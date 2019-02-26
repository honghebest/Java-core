package com.hongghe.basicjava.json;

import com.google.gson.Gson;
import com.hongghe.basicjava.json.domain.Bird;

/**
 * @author: hongghe @date: 2019-01-22 11:11
 */
public class ArrayListParser {

    public static void main(String[] args) {
        Bird bird = new Bird(null,null,null,null);
        System.out.println(new Gson().toJson(bird));
    }
}
