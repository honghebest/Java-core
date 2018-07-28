package com.hongghe.basicjava.reflect;

/**
 * The super method os method demo.
 *
 * @author hongghe 28/07/2018
 */
public class SuperMethodDemo extends MethodDemo {

    SuperMethodDemo() {
        System.out.println("The super method is");
    }

    @Override
    public int add(int a, int b) {
        return a*b;
    }

    public int multiply(int a, int b) {
        System.out.println("The super multiply");
        return a*b;
    }

}
