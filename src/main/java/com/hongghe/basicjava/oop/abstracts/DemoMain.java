package com.hongghe.basicjava.oop.abstracts;

import com.google.gson.Gson;
import com.hongghe.basicjava.oop.abstracts.domain.WindowsOS;

import java.util.Date;

/**
 * @author hongghe 2018/12/27
 */
public class DemoMain {

    public static void main(String[] args) {
        System.out.println(new Gson().toJson(new WindowsOS("1")));
    }
}
