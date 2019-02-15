package com.hongghe.basicjava.jvm;

/**
 * 测试内存的方法
 *
 * @author hongghe 24/07/2018
 */
public class MemoryMethod {

    public static void memerySpace() {
        int [] memorySpaceOne, memorySpaceTwo;
        memorySpaceOne = new int[(int) (Runtime.getRuntime().maxMemory()*0.25*0.6)];
        memorySpaceTwo = new int[(int) (Runtime.getRuntime().maxMemory()*0.25*0.6)];
        System.out.println(memorySpaceOne);
        System.out.println(memorySpaceTwo);
    }
}
