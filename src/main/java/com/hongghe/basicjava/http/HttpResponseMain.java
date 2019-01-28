package com.hongghe.basicjava.http;

import okhttp3.Dns;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

/**
 * @author: hongghe @date: 2019-01-28 11:19
 */
public class HttpResponseMain {

    public OkHttpClient okHttpClient = new OkHttpClient()
            .newBuilder()
            .connectTimeout(100000, TimeUnit.MILLISECONDS)
            .dns(Dns.SYSTEM)
            .build();

    public static void responseContent() {

    }
}
