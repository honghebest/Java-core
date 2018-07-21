package com.hongghe.basicjava.io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioWrite {

    private static final byte message[] = { 83, 111, 109, 101, 32,
            98, 121, 116, 101, 115, 46 };

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("\\test.txg");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        for (int i=0; i<message.length; i++) {
            byteBuffer.put(message[i]);
        }

        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        fileOutputStream.close();
    }
}
