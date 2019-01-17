package com.hongghe.basicjava.lambda;

/**
 * @author: hongghe @date: 2019-01-17 11:07
 */
public class CoreLambda {

    private static final int num = 10;

    volatile int switchNum = 1;

    public static void execute(DemoLambda demoLambda) {
        demoLambda.run();
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            new Thread(() -> System.out.println(num)).start();
        }

        //invoke doSomeWork using Annonymous class
        execute(new DemoLambda() {
            @Override
            public void run() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });

        // invoke doSomeWork using Lambda expression
        execute(() -> System.out.println("Worker invoked using Lambda expression"));
    }
}
