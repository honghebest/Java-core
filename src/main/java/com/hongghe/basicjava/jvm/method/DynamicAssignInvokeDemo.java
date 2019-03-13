package com.hongghe.basicjava.jvm.method;

/**
 * 动态分配
 *
 * @author hongghe 01/08/2018
 */
public class DynamicAssignInvokeDemo {

    static class Parent {
        public void sayHello() {
            System.out.println("The parent is call.");
        }
    }

    static class ChildOne extends DynamicAssignInvokeDemo.Parent {
        @Override
        public void sayHello() {
            System.out.println("The child one is call.");
        }
    }

    static class ChildTwo extends DynamicAssignInvokeDemo.Parent {
        @Override
        public void sayHello() {
            System.out.println("The child two is call.");
        }
    }

    public static void main(String[] args) {
        DynamicAssignInvokeDemo.Parent parentChildOne = new DynamicAssignInvokeDemo.ChildOne();
        DynamicAssignInvokeDemo.Parent parentChildTwo = new DynamicAssignInvokeDemo.ChildTwo();
        parentChildOne.sayHello();
        parentChildTwo.sayHello();
    }
}
