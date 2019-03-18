package com.hongghe.basicjava.io.io;

import java.io.*;

/**
 * @author: hongghe @date: 2019-03-17 18:03
 */
public class CharStreamTest {

    public static void main(String[] args) {

    }

    /**
     * 字符流的写操作
     * @throws IOException
     */
    public static void writeCharToFile() throws IOException {
        String hello = "hello, world";
        File file = new File("/test.txt");
        Writer writer = new FileWriter(file);
        writer.write(hello);
        writer.close();
    }

    /**
     * 字符流的读操作哦
     * @throws IOException
     */
    public static void readCharFromFile() throws IOException {
        File file = new File("/test.txt");
        Reader reader = new FileReader(file);
        char[] chars = new char[(int)file.length()];
        int size = reader.read(chars);
        reader.close();
    }

    /**
     * 字符字节流的转化
     * @throws IOException
     */
    public static void convertByteToChar() throws IOException {
        File file= new File( "/test.txt");
        //获得一个字节流
        InputStream inputStream= new FileInputStream( file);
        //把字节流转换为字符流，其实就是把字符流和字节流组合的结果。
        Reader reader= new InputStreamReader(inputStream);
        char [] byteArray= new char[( int) file.length()];
        int size= reader.read( byteArray);
        inputStream.close();
        reader.close();
    }
}
