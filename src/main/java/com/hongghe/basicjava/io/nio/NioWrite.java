package com.hongghe.basicjava.io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * NIO write.
 *
 * @author hongghe 2018/08/27
 */
public class NioWrite {

    private static final byte[] MESSAGE = { 83, 111, 109, 101, 32, 98, 121, 116, 101, 115, 46 };

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/hongghe/work/JavaCore/src/main/java/com/hongghe/basicjava/io/nio/test.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        for (int i=0; i<MESSAGE.length; i++) {
            byteBuffer.put(MESSAGE[i]);
        }

        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        fileOutputStream.close();
    }
}
