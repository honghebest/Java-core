package com.hongghe.basicjava.serialize;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/8/24
 */
@Slf4j
public class SerializeTest  {

    public static void main(String[] args) {
        log.info("序列化的实现。");
        ApiDemo apiDemo = new ApiDemo();
        log.info("序列化是实现的结果");
        System.out.println(apiDemo.getMsg());
    }
}
