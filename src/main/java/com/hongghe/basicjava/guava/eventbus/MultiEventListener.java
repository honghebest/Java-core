package com.hongghe.basicjava.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 多个订阅者
 *
 * @author hongghe 06/08/2018
 */
public class MultiEventListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MultiEventListener.class);
    @Subscribe
    public void listen(OrderEvent event){
       LOGGER.info("receive msg: "+event.getMessage());
    }

    @Subscribe
    public void listen(String message){
        LOGGER.info("receive msg: "+message);
    }
}
