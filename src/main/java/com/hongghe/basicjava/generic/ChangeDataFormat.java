package com.hongghe.basicjava.generic;

import com.google.gson.Gson;

/**
 * @author hongghe 2019/1/1
 */
public class ChangeDataFormat {

    public static void main(String[] args) {
        DataDe<String, String> dataDe = new DataDe<>("12", "234");
        System.out.println(new Gson().toJson(dataDe));
        UserHandlerMethod userHandlerMethod = new UserHandlerMethod("123", 123);
        userHandlerMethod.outPutInfo();
        MethodDemo methodDemo = new MethodDemo();
        Integer result = methodDemo.<Integer>getMiddleNumber(new Integer[]{1, 2});
        System.out.println(result);
    }
}
