package com.hongghe.basicjava.io.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioChannel {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("\\test.txt");
        // 获取通道
        FileChannel fileChannel = inputStream.getChannel();
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 读取数据到缓冲区
        fileChannel.read(byteBuffer);

        while (byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            System.out.println((char)b);
        }

        fileChannel.close();
    }
}
