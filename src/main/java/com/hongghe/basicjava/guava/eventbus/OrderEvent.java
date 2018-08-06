package com.hongghe.basicjava.guava.eventbus;

/**
 * 订阅事件
 * 发布-订阅模式中传递的事件,是一个普通的POJO类
 *
 * @author hongghe -6/08/2018
 */
public class OrderEvent {

    private String message;

    public OrderEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
