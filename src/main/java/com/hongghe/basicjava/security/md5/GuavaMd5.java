package com.hongghe.basicjava.security.md5;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;

import java.io.File;
import java.io.IOException;

/**
 * @author: hongghe @date: 2019-02-28 11:46
 */
public class GuavaMd5 {

    public static void main(String[] args) throws IOException {
        String filename = "src/test/resources/text.txt";
        String checksum = "5EB63BBBE01EEED093CB22BB8F5ACDC3";
        HashCode hash = com.google.common.io.Files
                .hash(new File(filename), Hashing.md5());
        String myChecksum = hash.toString()
                .toUpperCase();
        if (myChecksum.equalsIgnoreCase(checksum)) {
            System.out.println("The equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
