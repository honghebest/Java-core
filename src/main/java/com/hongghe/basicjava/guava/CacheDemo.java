package com.hongghe.basicjava.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * The cache 的使用
 * Guava Cache与ConcurrentMap很相似，但也不完全一样。最基本的区别是ConcurrentMap会一直保存所有添加的元素，
 * 直到显式地移除。相对地，Guava Cache为了限制内存占用，通常都设定为自动回收元素。在某些场景下，尽管LoadingCache
 * 不回收元素，它也是很有用的，因为它会自动加载缓存。
 * Guava Cache是一个全内存的本地缓存实现，它提供了线程安全的实现机制。
 * 通常来说，Guava Cache适用于：
 * 你愿意消耗一些内存空间来提升速度。
 * 你预料到某些键会被查询一次以上。
 * 缓存中存放的数据总量不会超出内存容量。（Guava Cache是单个应用运行时的本地缓存。它不把数据存放到文件或外部服务器。
 * 如果这不符合你的需求，请尝试Memcached这类工具）
 * Guava Cache有两种创建方式：
 * cacheLoader
 * callable callback
 *
 * @author hongghe 06/08/2018
 */
public class CacheDemo {

    public static void LoadingCacheDemo() {
        LoadingCache<String,String> cache= CacheBuilder.newBuilder()
                //最大缓存数目
                .maximumSize(100)
                //缓存1秒后过期
                .expireAfterAccess(1, TimeUnit.SECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        return key;
                    }
                });
        cache.put("j","java");
        cache.put("c","cpp");
        cache.put("s","scala");
        cache.put("g","go");
        try {
            System.out.println(cache.get("j"));
            TimeUnit.SECONDS.sleep(2);
            //输出s
            System.out.println(cache.get("s"));
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void callbackDemo() {
        Cache<String,String> cache= CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterAccess(1, TimeUnit.SECONDS)
                .build();
        try {
            String result=cache.get("java", () -> "hello java");
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
