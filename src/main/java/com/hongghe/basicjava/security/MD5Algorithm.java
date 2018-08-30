package com.hongghe.basicjava.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author hongghe 2018/8/23
 */
public class MD5Algorithm {

    public MD5Algorithm() {}

    public static void main(String[] args) {
        String exampleString= "name";
        String md5 = md5Decode(exampleString);
        System.out.println(md5);
    }

    public static String md5Decode(String message) {
        String md5String = "";
        try {
            // Build md5 digest.
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] md5Byte = messageDigest.digest(message.getBytes());
            md5String = binaryToHex(md5Byte);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5String;
    }

    /**
     * 二进制转成十六进制
     * @param bytes
     * @return
     */
    public static String binaryToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        int temp;
        try {
            for (int i=0; i<bytes.length; i++) {
                temp = bytes[i];
                if (temp < 0) {
                    temp += 256;
                }

                if (temp < 16) {
                    result.append("0");
                }

                result.append(Integer.toHexString(temp));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
