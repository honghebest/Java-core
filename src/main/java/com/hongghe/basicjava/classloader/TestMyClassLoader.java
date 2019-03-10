package com.hongghe.basicjava.classloader;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

/**
 * 自定义的类测试
 *
 * @author hongghe 02/08/2018
 */
public class TestMyClassLoader {

    public static void main(String[] args) throws Exception {
        MyClassLoader mcl = new MyClassLoader();
        Class<?> c1 = Class.forName("com.hongghe.basicjava.domain.Person", true, mcl);
        Object obj = c1.newInstance();
        System.out.println(obj);
        System.out.println(obj.getClass().getClassLoader());


        Gson gson = new Gson();
        List<String> jsonMap = gson.fromJson("[\"name\": \"Tom\"]", new TypeToken<List<String>>() {}.getType());
        System.out.println(jsonMap);
    }
}