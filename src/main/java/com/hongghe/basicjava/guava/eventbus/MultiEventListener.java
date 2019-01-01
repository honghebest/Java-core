package com.hongghe.basicjava.guava.eventbus;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * 多个订阅者
 *
 * @author hongghe 06/08/2018
 */
@Slf4j
public class MultiEventListener {

    @Subscribe
    public void listen(OrderEvent event){
       log.info("receive msg: "+event.getMessage());
    }

    @Subscribe
    public void listen(String message){
        log.info("receive msg: "+message);
    }
}
