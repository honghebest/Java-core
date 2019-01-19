package com.hongghe.basicjava.guava.eventbus;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 处理
 *
 * @author hongghe 06/08/2018
 */
@Slf4j
public class EventBusCase {

    public void registerEvent() {
        EventBus eventBus = new EventBus("hello_world");

        /**
         *如果多个subscriber订阅了同一个事件,那么每个subscriber都将收到事件通知
         *并且收到事件通知的顺序跟注册的顺序保持一致
        */
        eventBus.register(new SingleEventListener());
        eventBus.register(new MultiEventListener());
        eventBus.post(new OrderEvent("hello message"));
        eventBus.post(new OrderEvent("hello, hello"));
        eventBus.post("!!!");
    }

    /**
     * 如果EventBus发送的消息都不是订阅者关心的称之为Dead Event
     */
    public class deadEventListener{
        boolean isDelivered = true;

        @Subscribe
        public void listen(DeadEvent event) {
            isDelivered = false;
            log.info("The info = {}", event.getSource().getClass(), event.getEvent());
        }

        public boolean isDelivered() {
            return isDelivered;
        }
    }

    public static void main(String[] args) {
        EventBusCase eventBusCase = new EventBusCase();
        eventBusCase.registerEvent();
    }
}
