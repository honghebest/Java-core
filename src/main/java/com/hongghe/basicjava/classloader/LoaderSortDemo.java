package com.hongghe.basicjava.classloader;

/**
 * 加载顺序
 * 1、如果还有父类没有初始化则初始化父类
 * 2、如果还有初始化代码块，则执行初始化代码块代码执行顺序的总结：
 * 父类静态代码块->子类静态代码块->父类普通代码块->父类构造器->子类普通代码块->子类构造函数
 *
 * @author hongghe 02/08/2018
 */
public class LoaderSortDemo {


    public static final Integer num = 12;

    private static final Integer nu = 1231;

    public static Integer n = 15;

    private static Integer nn = 16;

    public Integer nnn = 17;

    static {
        System.out.println("父类的静态代码块");
    }

    {
        System.out.println("父类的普通代码块");
    }

    {
        System.out.println("public " + nnn);
    }

    static {
        System.out.println("public static final " + nu);
    }

    static {
        System.out.println("public static " + n);
    }

    static {
        System.out.println("private " + nn);
    }

    static {
        System.out.println("public static final " + num);
    }

    public LoaderSortDemo(){
        System.out.println("父类的构造器");
    }

    public static void main(String[] args) {
        LoaderDemo loaderDemo = new LoaderDemo();
    }
}
