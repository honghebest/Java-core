package com.hongghe.basicjava.lock;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/12/19
 */
@Slf4j
public class ReentrantTockDemo {

    public static void main(String[] args) throws Exception {
        String name = Hashing.md5().hashString("name", Charsets.UTF_8).toString();
        System.out.println(name);
    }

    public static synchronized void setA() throws Exception {
        Thread.sleep(1000);
        setB();
    }

    public static synchronized void setB() throws Exception {
        Thread.sleep(1000);
    }
}
