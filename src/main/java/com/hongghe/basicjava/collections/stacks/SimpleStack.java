package com.hongghe.basicjava.collections.stacks;

import java.util.Stack;

/**
 * @author hongghe 2018/8/26
 */
public class SimpleStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }

        Integer searchValue = stack.search(2);
        System.out.println(searchValue);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
