package com.hongghe.basicjava.io.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * NIO position.
 *
 * @author hongghe 2018/08/27
 */
public class NioPosition {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("\\test.txt");
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        fileChannel.read(byteBuffer);

        byteBuffer.flip();

        while (byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            System.out.println((char)b);
        }

        byteBuffer.clear();
        fileInputStream.close();
    }
}
