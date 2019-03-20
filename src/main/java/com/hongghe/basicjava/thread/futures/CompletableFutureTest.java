package com.hongghe.basicjava.thread.futures;

import java.util.concurrent.CompletableFuture;

/**
 * @author: hongghe @date: 2019-03-20 15:43
 */
public class CompletableFutureTest {

    public CompletableFuture<String> ask() {
        final CompletableFuture<String> future = new CompletableFuture<>();
        //...
        return future;
    }

    public CompletableFuture<Integer> printName() throws Exception {
        final CompletableFuture<Integer> future = new CompletableFuture<>();
        int states = future.get();
        if (states == 1) {
            return future.toCompletableFuture();
        }
        return future;
    }
}
