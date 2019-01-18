package com.hongghe.basicjava.lambda;

/**
 * @author: hongghe @date: 2019-01-18 20:58
 */
public class DemoLambdaImp implements DemoLambda {

    private Integer demo;

    @Override
    public void run() {
        demo ++;
    }
}
