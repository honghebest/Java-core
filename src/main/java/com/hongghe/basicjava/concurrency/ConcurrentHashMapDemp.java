package com.hongghe.basicjava.concurrency;

import com.google.common.collect.ImmutableMap;
import com.google.gson.internal.LinkedHashTreeMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 线程安全的设置
 *
 * @author hongghe 04/08/2018
 */
public class ConcurrentHashMapDemp {

    public final AtomicReference<ImmutableMap<String, String>> atomicReferenceRef =
            new AtomicReference<>(ImmutableMap.of());

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> map = new ConcurrentHashMap<>();
        Map<String, String> mapTable = new Hashtable<>();
        Map<String, String> mapTree = new LinkedHashTreeMap<>();
        Map<String, String> mapTreeString = new TreeMap();
        List<String> mapVector = new Vector<String>();
    }
}
