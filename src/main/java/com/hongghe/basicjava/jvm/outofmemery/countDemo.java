package com.hongghe.basicjava.jvm.outofmemery;

/**
 * 引用计数器算法导致内存泄漏示例
 */
public class countDemo{

    public static void main(String [] args){
        DemoObject object1 = new DemoObject();//(1) object1引用计数器 = 1
        DemoObject object2 = new DemoObject();//(2) obejct2 引用计数器 = 1
        object1.instance = object2;//(3) object2引用计数器 = 2
        object2.instance = object1;//(4) object1引用计数 = 2
        object1 = null;//(5) object1引用计数器 = 1
        object2 = null ;// (6) obejct2引用计数器 = 1
        //到程序结束obejct1,object2的引用计数器都没有被置为0
    }
}