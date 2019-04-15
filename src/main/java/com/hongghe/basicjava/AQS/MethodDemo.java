package com.hongghe.basicjava.AQS;

import java.util.concurrent.CyclicBarrier;

public class MethodDemo implements Runnable {

    private PersonInfoService personInfoService;

    private CyclicBarrier cyclicBarrier;

    private String name;

    public MethodDemo(PersonInfoService personInfoService) {
        this.personInfoService = personInfoService;
    }

    public MethodDemo(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        personInfoService.count();
        System.out.println("The run method name " +  name);
    }
}
