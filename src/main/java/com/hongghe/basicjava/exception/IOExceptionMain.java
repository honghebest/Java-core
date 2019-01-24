package com.hongghe.basicjava.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: hongghe @date: 2019-01-24 11:23
 */
public class IOExceptionMain {

    static int num = 1;

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            while (num ++ == 1) {
                //找到目标文件
                File inFile = new File("F:\\123\\1.jpg");
                File outFile = new File("F:\\123.jpg");
                //建立数据的输入输出通道
                fileInputStream = new FileInputStream(inFile);
                fileOutputStream = new FileOutputStream(outFile);
                //建立缓冲字节数组，边读边写
                byte[] buf = new byte[1024];
                int length = 0;
                while ((length = fileInputStream.read(buf)) != -1) {
                    fileOutputStream.write(buf, 0, length);
                }
            }
        } catch (IOException e) {
            System.out.println("The IOException.");
        } finally {
            System.out.println("The finally operation.");
          num ++;
        }
    }
}
