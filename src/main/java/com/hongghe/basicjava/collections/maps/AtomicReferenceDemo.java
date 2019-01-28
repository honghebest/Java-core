package com.hongghe.basicjava.collections.maps;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author hongghe 2018/8/25
 */
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        immutableMap();
        immutableReference();
        builderImmutable();
    }

    public static void immutableMap() {
        AtomicReference<ImmutableMap<String, String>> atomicReference = new AtomicReference<>(ImmutableMap.of());
        Map<String, String> map = new HashMap<>();
        map.put("key0", "value0");
        map.put("key1", "value1");
        atomicReference.set(ImmutableMap.copyOf(map));
        System.out.println(new Gson().toJson(atomicReference));
    }

    public static void immutableReference() {
        AtomicReference<ImmutableMap<String, String>> atomicReference =
                new AtomicReference<>();
        Map<String, String> map = new HashMap<>();
        map.put("key0", "value0");
        map.put("key1", "value1");
        atomicReference.set(ImmutableMap.copyOf(map));
        System.out.println(new Gson().toJson(atomicReference));
    }

    public static void builderImmutable() {
        final ImmutableMap<String, String> immutableMap ;
        immutableMap = new ImmutableMap.Builder<String, String>()
                .put("key0", "value0")
                .put("key1", "value1")
                .put("key2", "value2")
                .build();
       System.out.println(new Gson().toJson(immutableMap));
    }
}
