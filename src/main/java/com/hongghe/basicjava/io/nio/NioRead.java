package com.hongghe.basicjava.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * nio的读取
 *
 * @author hongghe 21/07/2018
 */
public class NioRead {

    public static void copyFile(String src, String dst) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(src));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(dst));
        // Get the channel
        FileChannel inChannel = fileInputStream.getChannel();
        FileChannel outChannel = fileOutputStream.getChannel();
        // Get the container
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
            // 判断是否读完文件
            int eof = inChannel.read(byteBuffer);
            if (eof == -1) {
                break;
            }
            // 重新设置buffer的position=0,limit=position
            byteBuffer.flip();
            outChannel.write(byteBuffer);
            // 写完重新设置buffer,position=0,limit=capacity
            byteBuffer.clear();
        }
        inChannel.close();
        outChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
