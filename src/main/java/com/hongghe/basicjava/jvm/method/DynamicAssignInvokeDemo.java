package com.hongghe.basicjava.jvm.method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 动态分配
 *
 * @author hongghe 01/08/2018
 */
public class DynamicAssignInvokeDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(DynamicAssignInvokeDemo.class);

    static class Parent {
        public void sayHello() {
            LOGGER.info("The parent is call.");
        }
    }

    static class ChildOne extends DynamicAssignInvokeDemo.Parent {
        @Override
        public void sayHello() {
            LOGGER.info("The child one is call.");
        }
    }

    static class ChildTwo extends DynamicAssignInvokeDemo.Parent {
        @Override
        public void sayHello() {
            LOGGER.info("The child two is call.");
        }
    }

    public static void main(String[] args) {
        DynamicAssignInvokeDemo.Parent parentChildOne = new DynamicAssignInvokeDemo.ChildOne();
        DynamicAssignInvokeDemo.Parent parentChildTwo = new DynamicAssignInvokeDemo.ChildTwo();
        parentChildOne.sayHello();
        parentChildTwo.sayHello();
    }
}
