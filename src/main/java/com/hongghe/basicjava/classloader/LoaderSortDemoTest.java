package com.hongghe.basicjava.classloader;

/**
 * 加载顺序
 *
 * @author hongghe 02/08/2018
 */
public class LoaderSortDemoTest extends LoaderSortDemo {

    private static final Integer sonNum = 122;

    static {
        System.out.println("子类的静态代码块");
    }

    {
        System.out.println("子类的代码块");
    }

    {
        System.out.println("son block " + sonNum);
    }

    public LoaderSortDemoTest() {
        System.out.println("子类的构造器");
    }

    public static void main(String[] args) {
        LoaderSortDemoTest test = new LoaderSortDemoTest();
    }
}
