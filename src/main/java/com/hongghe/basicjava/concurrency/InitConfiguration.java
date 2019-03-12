package com.hongghe.basicjava.concurrency;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ConcurrentReferenceHashMap;

import javax.annotation.PostConstruct;

/**
 * 加载初始化配置信息
 *
 * @author hongghe 31/07/2018
 */
@Slf4j
@Component
public class InitConfiguration {

    @PostConstruct
    public void init() {
        ConcurrentReferenceHashMap concurrentReferenceHashMap = new ConcurrentReferenceHashMap();
        concurrentReferenceHashMap.putIfAbsent("header", "header");
        log.info("Header initializer is ", new Gson().toJson(concurrentReferenceHashMap));
    }
}
