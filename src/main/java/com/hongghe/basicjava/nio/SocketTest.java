package com.hongghe.basicjava.nio;

import java.net.ServerSocket;

/**
 * @author: hongghe @date: 2019-03-17 16:58
 */
public class SocketTest {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("the bocked begin:" + System.currentTimeMillis());
            serverSocket.accept();
            System.out.println("the bocked end:" + System.currentTimeMillis());
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
