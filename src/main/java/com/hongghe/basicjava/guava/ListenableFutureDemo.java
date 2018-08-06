package com.hongghe.basicjava.guava;

import afu.org.checkerframework.checker.nullness.qual.Nullable;
import com.google.common.util.concurrent.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * listenable future的使用
 * ListenableFuture可以允许你注册回调方法(callbacks)，在运算（多线程执行）完成的时候进行调用,
 * 或者在运算（多线程执行）完成后立即执行。这样简单的改进，使得可以明显的支持更多的操作，
 * 这样的功能在JDK concurrent中的Future是不支持的。
 *
 * @author hongghe 06/08/2018
 */
public class ListenableFutureDemo {

    private Executors executors;

    public static void main(String[] args) {


        //将ExecutorService装饰成ListeningExecutorService
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

        //通过异步的方式计算返回结果
        ListenableFuture<String> future = service.submit(() -> {
            System.out.println("call execute..");
            return "task success!";
        });

        //有两种方法可以执行此Future并执行Future完成之后的回调函数
        future.addListener(() -> {
            //该方法会在多线程运算完的时候,指定的Runnable参数传入的对象会被指定的Executor执行
            try {
                System.out.println("result: " + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }, service);

        Futures.addCallback(future, new FutureCallback<String>() {
            @Override
            public void onSuccess(@Nullable String result) {
                System.out.println("callback result: " + result);
            }

            @Override
            public void onFailure(Throwable t) {
                System.out.println(t.getMessage());
            }
        }, service);
    }
}
