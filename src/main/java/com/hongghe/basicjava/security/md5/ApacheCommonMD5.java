package com.hongghe.basicjava.security.md5;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author: hongghe @date: 2019-02-28 11:40
 */
public class ApacheCommonMD5 {

    public static void main(String[] args)  {
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "ILoveJava";
        String md5Hex = DigestUtils.md5Hex(password).toUpperCase();
        if (md5Hex.equalsIgnoreCase(hash)) {
            System.out.println("The equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
