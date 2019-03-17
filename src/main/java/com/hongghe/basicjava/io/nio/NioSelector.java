package com.hongghe.basicjava.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * 选择器
 *
 * @author hongghe 21/07/2018
 */
public class NioSelector {

    private static final int PORT = 8082;
    private ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

    public static void main(String[] args) throws IOException {
        NioSelector nioSelector = new NioSelector();
        nioSelector.go();
    }

    public void register(Selector selector, SelectableChannel selectableChannel, int ops) throws IOException {
        if (selectableChannel == null) {
            return;
        }
        selectableChannel.configureBlocking(false);
        selectableChannel.register(selector, ops);
    }

    protected void readData(SelectionKey selectionKey) throws IOException {
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        int count;
        while ((count = socketChannel.read(byteBuffer)) > 0) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                socketChannel.write(byteBuffer);
            }
            byteBuffer.clear();
            if (count < 0) {
                socketChannel.close();
            }
        }
    }

    private void acceptClient(SocketChannel socketChannel) throws IOException {
        byteBuffer.clear();
        byteBuffer.put("you have already connected server".getBytes());
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
    }

    public void go() throws IOException {
        System.out.println("the listener on port :" + PORT);
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket= serverSocketChannel.socket();
        Selector selector = Selector.open();
        serverSocket.bind(new InetSocketAddress(PORT));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true) {
            int n = selector.select();
            if (n == 0) {
                continue;
            }
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel client = server.accept();
                    register(selector, client, SelectionKey.OP_ACCEPT);
                    acceptClient(client);
                }
                if (selectionKey.isReadable()) {
                    readData(selectionKey);
                }
                iterator.remove();
            }
        }
    }
}
