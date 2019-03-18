package com.hongghe.basicjava.io.io;

import java.io.*;

/**
 * @author: hongghe @date: 2019-03-17 18:46
 */
public class BufferTest {

    public static void readByBufferedInputStream() throws IOException {
        File file = new File( "/test.txt");
        byte[] byteArray = new byte[( int) file.length()];
        //可以在构造参数中传入buffer大小
        InputStream is = new BufferedInputStream( new FileInputStream(file),2*1024);
        int size = is.read( byteArray);
        System. out.println( "大小:" + size + ";内容:" + new String(byteArray));
        is.close();
    }

    public static void readByBufferedReader() throws IOException {
        File file = new File( "/test.txt");
        // 在字符流基础上用buffer流包装，也可以指定buffer的大小
        Reader reader = new BufferedReader( new FileReader(file),2*1024);
        char[] byteArray = new char[( int) file.length()];
        int size = reader.read( byteArray);
        System. out.println( "大小:" + size + ";内容:" + new String(byteArray));
        reader.close();
    }
}
