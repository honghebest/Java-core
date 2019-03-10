package com.hongghe.basicjava.classloader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ParentsDemo {

    public static void main(String[] args) {
        //输出ClassLoaderText的类加载器名称
        System.out.println("ClassLoaderText类的加载器的名称:" + ParentsDemo.class.getClassLoader().getClass().getName());
        System.out.println("System类的加载器的名称:" + System.class.getClassLoader());
        System.out.println("List类的加载器的名称:" + List.class.getClassLoader());
        ClassLoader clazz = ParentsDemo.class.getClassLoader();
//        while (clazz != null) {
//            System.out.print(clazz.getClass().getName() + " -> ");
//            clazz = clazz.getParent();
//            System.out.println(clazz.getClass());
//        }
//        System.out.println(clazz);
//

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date oldTime = formatter.parse("1551693802");
            Date newTime = formatter.parse("1234567891");
            System.out.println(new Date(1551693802000L));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
