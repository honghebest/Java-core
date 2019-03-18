package com.hongghe.basicjava.io.io;

import java.io.*;

/**
 * @author: hongghe @date: 2019-03-17 17:58
 */
public class ByteStreamTest {

    public static void main(String[] args) {

    }

    /**
     * 文件的写操作的实现</p>
     * @throws IOException 读写的IO异常
     */
    public static void writeByteToFile() throws IOException {
        byte[] bytes = "hello,world".getBytes();
        File file = new File("/test.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(bytes);
        outputStream.close();
    }

    /**
     * 写操作的实现
     * @throws IOException
     */
    public static void readByteFrromFile() throws IOException {
        File file = new File("/test.txt");
        byte[]  bytes = new byte[(int)file.length()];
        InputStream inputStream = new FileInputStream(file);
        int size = inputStream.read(bytes);
        inputStream.close();
    }
}
