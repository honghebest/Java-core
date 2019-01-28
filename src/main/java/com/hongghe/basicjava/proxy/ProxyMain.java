package com.hongghe.basicjava.proxy;

/**
 * @author: hongghe @date: 2019-01-28 17:59
 */
public class ProxyMain {
    public static void main(String[] args) {
        People instance = (People)new TicketBull().getInstance(new Me("danad", "演唱会门票"));
        instance.speak();
        System.out.println("生成代理对象后对象变成:"+instance.getClass());
    }
}
