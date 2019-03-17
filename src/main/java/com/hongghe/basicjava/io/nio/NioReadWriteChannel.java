package com.hongghe.basicjava.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * nio的从channel中的读写的操作
 *
 * @author hongghe 21/07/2018
 */
public class NioReadWriteChannel {

    public static void main(String[] args) throws IOException {
        byteChannelRead();
        String string = "the demo string";
        byte[] byteArray = string.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteChannelWrite(byteBuffer);
        fileChannelRead();
        fileChannelWrite(byteBuffer);
    }

    public static void byteChannelRead() throws IOException {
        Path filePath = FileSystems.getDefault().getPath(".", "/Users/hongghe/work/JavaCore/src/main/java/com/hongghe/basicjava/io/nio/test.txt");
        SeekableByteChannel byteChannel = Files.newByteChannel(filePath);
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        Charset charset = Charset.forName("US-ASCII");
        while (byteChannel.read(byteBuffer) > 0) {
            byteBuffer.rewind();
            byteBuffer.flip();
        }
    }

    public static void byteChannelWrite(ByteBuffer byteBuffer) throws IOException {
        Set options = new HashSet();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);
        Path file = Paths.get("./byByteChannel.txt");
        SeekableByteChannel byteChannel = Files.newByteChannel(file, options);
        byteChannel.write(byteBuffer);
    }

    public static void fileChannelRead() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("./temp.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        Charset charset = Charset.forName("US-ASCII");
        while (fileChannel.read(byteBuffer) > 0) {
            byteBuffer.rewind();
            System.out.print(charset.decode(byteBuffer));
            byteBuffer.flip();
        }
        fileChannel.close();
        randomAccessFile.close();
    }

    public static void fileChannelWrite(ByteBuffer byteBuffer) throws IOException {
        Set options = new HashSet();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);
        Path path = Paths.get("./byFileChannel.txt");
        FileChannel fileChannel = FileChannel.open(path, options);
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }
}
