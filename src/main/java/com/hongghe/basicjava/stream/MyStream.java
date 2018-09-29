package com.hongghe.basicjava.stream;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hongghe 2018/9/29
 */
public class MyStream<T>{

    private List<T> list;

    public void myForEach(ConsumerInterface<T> consumer){
        for(T t : list){
            consumer.accept(t);
        }
    }


    public static void main(String[] args) {
        List<String> demo = new LinkedList<String>();
        demo.add("adad");
        MyStream<String> stream = new MyStream<String>();
        stream.list = demo;
        stream.myForEach(str -> System.out.println(str));
        // 使用自定义函数接口书写Lambda表达式
    }
}