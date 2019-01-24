package com.hongghe.basicjava.error;

/**
 * @author: hongghe @date: 2019-01-24 11:23
 */
public class RunningErrorMain extends Throwable {

    private static final long serialVersionUID = -8503081971171368531L;
    static Integer num = 10;

    public static void main(String[] args) throws RunningErrorMain {
        if (num == 10) {
            throw new RunningErrorMain();
        }
    }
}
