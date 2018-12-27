package com.hongghe.basicjava.stack;

import java.util.Stack;

/**
 * @author hongghe 2018/12/27
 */
public class PreSearchStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<100; i++) {
            stack.push(i);
        }

        // 正序遍历
        for (Integer j : stack) {
            System.out.println(j);
        }

        // 出栈
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
