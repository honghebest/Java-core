package com.hongghe.basicjava.serialize;

import java.io.*;

/**
 * @author hongghe 2018/9/3
 */

public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    public static int staticInteger = 5;

    public static void main(String[] args) {
        try {
            //初始时staticVar为5
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
            out.writeObject(new Test());
            out.close();

            //序列化后修改为10
            Test.staticInteger = 10;

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));
            Test t = (Test) oin.readObject();
            oin.close();

            //再读取，通过t.staticVar打印新的值
            System.out.println(t.staticInteger);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}