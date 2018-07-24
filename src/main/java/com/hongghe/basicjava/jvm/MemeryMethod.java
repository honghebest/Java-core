package com.hongghe.basicjava.jvm;

/**
 * 测试内存的方法
 *
 * @author hongghe 24/07/2018
 */
public class MemeryMethod {

    public static void memerySpace() {
        int [] memerySpaceOne, memerySpaceTwo;
        memerySpaceOne = new int[(int) (Runtime.getRuntime().maxMemory()*0.25*0.6)];
        memerySpaceTwo = new int[(int) (Runtime.getRuntime().maxMemory()*0.25*0.6)];
    }
}
