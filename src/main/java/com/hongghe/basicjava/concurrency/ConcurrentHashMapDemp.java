package com.hongghe.basicjava.concurrency;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 线程安全的设置
 *
 * @author hongghe 04/08/2018
 */
public class ConcurrentHashMapDemp {

    private final AtomicReference<ImmutableMap<String, String>> atomicReferenceRef =
            new AtomicReference<>(ImmutableMap.of());



    public static void main(String[] args) {
        Map<String, String> map = new ConcurrentHashMap<>();
    }
}
