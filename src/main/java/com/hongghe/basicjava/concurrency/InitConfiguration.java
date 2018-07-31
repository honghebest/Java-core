package com.hongghe.basicjava.concurrency;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ConcurrentReferenceHashMap;

import javax.annotation.PostConstruct;

/**
 * 加载初始化配置信息
 *
 * @author hongghe 31/07/2018
 */
@Component
public class InitConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitConfiguration.class);

    Gson gson = new Gson();

    @PostConstruct
    public void init() {
        ConcurrentReferenceHashMap concurrentReferenceHashMap = new ConcurrentReferenceHashMap();
        concurrentReferenceHashMap.putIfAbsent("header", "header");
        LOGGER.info("Header initializer is ", gson.toJson(concurrentReferenceHashMap));
    }
}
