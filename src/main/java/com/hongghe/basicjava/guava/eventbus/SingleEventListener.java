package com.hongghe.basicjava.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 订阅者
 *
 * @author hongghe 06/08/2018
 */
public class SingleEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SingleEventListener.class);

    /**
     *  @Subscribe保证有且只有一个输入参数,如果你需要订阅某种类型的消息,只需要在指定的方法上加上@Subscribe注解即可
     * */
    @Subscribe
    public void listen(OrderEvent orderEvent) {
        LOGGER.info("The message is = {}", orderEvent.getMessage());
    }

    /** 一个subscriber也可以同时订阅多个事件Guava会通过事件类型来和订阅方法的形参来决定到底调用subscriber的哪个订阅方法
     * */
    @Subscribe
    public void listen(String message){
        LOGGER.info("receive message: "+message);
    }
}
