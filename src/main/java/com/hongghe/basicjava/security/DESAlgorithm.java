package com.hongghe.basicjava.security;

import sun.rmi.runtime.Log;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @author hongghe 2018/8/23
 */
public class DESAlgorithm {
    public static void main(String[] args) {
        //*****************************AES或DES加密 解密字符串*****************************
        //待加密内容
        String str = "test";
        //密码，长度要是8的倍数
        String password = "12345678aa";

        byte[] desEncryptResult = DESEncrypt(str.getBytes(), password);
        System.out.println("DES加密‘测试内容’的结果是：" + new String(desEncryptResult));

        byte[] desDecrypt = DESDecrypt(desEncryptResult, password);
        System.out.println("DES解密的结果是：" + new String(desDecrypt));


        byte[] aesEncrypt = AESEncrypt(str, password);
        System.out.println("AES加密‘测试内容’的结果是：" + new String(aesEncrypt));

        byte[] aesDecrypt = AESDecrypt(aesEncrypt, password);
        System.out.println("AES解密的结果是：" + new String(aesDecrypt));

        //String srcFilePath = "D:\\11.txt";//原文件
        String srcFilePath = "assets/11.txt";//原文件

        //***************************** DES加密 解密文件*****************************
        String encryptedFilePath = "assets/DES加密.txt";//加密后的文件
        String decryptedFilePath = "assets/DES解密.txt";//解密后的文件
        DESEncryptFile(srcFilePath, encryptedFilePath, password);
        DESDecryptFile(encryptedFilePath, decryptedFilePath, password);

        //***************************** AES加密 解密文件  *****************************
        String AESencryptedFilePath = "assets/AES加密.txt";//加密后的文件
        String AESdecryptedFilePath = "assets/AES解密.txt";//解密后的文件
        AESEncryptFile(srcFilePath, AESencryptedFilePath, password);
        AESDecryptFile(AESencryptedFilePath, AESdecryptedFilePath, password);
    }

    //  注意：DES加密和解密过程中，密钥password长度都必须是8的倍数
    public static byte[] DESEncrypt(byte[] datasource, String password){

        try {
            // DES算法要求有一个可信任的随机数源
            SecureRandom secureRandom = new SecureRandom();
            // 从原始密匙数据创建DESKeySpec对象
            DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂，
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //把DESKeySpec转换成一个SecretKey对象
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, secureRandom);

            // 执行加密操作
            return cipher.doFinal(datasource);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    //  注意：DES加密和解密过程中，密钥password长度都必须是8的倍数
    public static byte[] DESDecrypt(byte[] encrypted, String password){
        try {
            // DES算法要求有一个可信任的随机数源
            SecureRandom secureRandom = new SecureRandom();
            // 创建一个DESKeySpec对象
            DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            // 将DESKeySpec对象转换成SecretKey对象
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            // Cipher对象实际完成解密操作
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, secretKey, secureRandom);
            // 真正开始解密操作
            return cipher.doFinal(encrypted);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return null;
    }

    //DES解密文件
    public static void DESDecryptFile(String encryptedFilePath, String decryptedFilePath, String password) {
        try {

            // DES算法要求有一个可信任的随机数源
            SecureRandom secureRandom = new SecureRandom();
            // 从原始密匙数据创建DESKeySpec对象
            DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂，
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //把DESKeySpec转换成一个SecretKey对象
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, secretKey, secureRandom);

            //将文件中的数据读入
            FileInputStream fis = new FileInputStream(encryptedFilePath);
            //输出解密数据到文件
            FileOutputStream fos = new FileOutputStream(decryptedFilePath);


            //方法一：
            /*CipherInputStream cis = new CipherInputStream(fis, cipher);
            byte[] b = new byte[1024];
            int i = 0;
            while( (i = cis.read(b)) != -1 ){
                fos.write(b, 0, i);
            }

            cis.close();
            */


            //方法二：
            byte[] bb = new byte[1024];
            int l = 0;
            while((l = fis.read(bb)) != -1){
                byte[] doFinal = cipher.doFinal(Arrays.copyOfRange(bb, 0, l));
                fos.write(doFinal, 0, doFinal.length);
            }

            fos.close();
            fis.close();

            System.out.println("DES解密文件结束");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //DES加密文件
    public static void DESEncryptFile(String srcFilePath, String desFilePath, String password) {
        try {

            // DES算法要求有一个可信任的随机数源
            SecureRandom secureRandom = new SecureRandom();
            // 从原始密匙数据创建DESKeySpec对象
            DESKeySpec desKeySpec = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂，
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //把DESKeySpec转换成一个SecretKey对象
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            // Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, secureRandom);


            //将文件中的数据读入
            FileInputStream fis = new FileInputStream(srcFilePath);
            //输出加密数据到文件
            FileOutputStream fos = new FileOutputStream(desFilePath);

            //方法一：
            /*CipherInputStream cis = new CipherInputStream(fis, cipher);
            byte[] b = new byte[1024];
            int i = 0;
            while( (i = cis.read(b)) != -1 ){
                fos.write(b, 0, i);
            }
            cis.close();*/

            //方法二：
            byte[] bb = new byte[1024];
            int l = 0;
            while((l = fis.read(bb)) != -1){
                byte[] doFinal = cipher.doFinal(Arrays.copyOfRange(bb, 0, l));
                fos.write(doFinal, 0, doFinal.length);
            }

            fos.close();
            fis.close();

            System.out.println("DES加密文件结束");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static byte[] AESEncrypt(String content, String password){
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encoded = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
            //创建密码器
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);


            //真正的加密
            byte[] result = cipher.doFinal(content.getBytes("utf-8"));
            return result;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public static byte[] AESDecrypt(byte[] content, String password){
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom(password.getBytes()));
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encoded = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
            //创建解密器
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);


            //真正的解密
            byte[] result = cipher.doFinal(content);

            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }


    //AES加密文件
    public static void AESEncryptFile(String srcFilePath, String AESencryptedFilePath, String password) {

        try { SecureRandom secureRandom = new SecureRandom(password.getBytes());
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encoded = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);


            //将文件中的数据读入
            FileInputStream fis = new FileInputStream(srcFilePath);
            //输出加密数据到文件
            FileOutputStream fos = new FileOutputStream(AESencryptedFilePath);
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            byte[] b = new byte[1024];
            int i = 0;
            while( (i = cis.read(b)) != -1 ){
                fos.write(b, 0, i);
            }

            fos.close();
            cis.close();
            fis.close();

            System.out.println("AES加密文件结束");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    //AES解密文件
    public static void AESDecryptFile(String AESencryptedFilePath, String AESdecryptedFilePath, String password) {
        try { SecureRandom secureRandom = new SecureRandom(password.getBytes());
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encoded = secretKey.getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);


            //将文件中的数据读入
            FileInputStream fis = new FileInputStream(AESencryptedFilePath);
            //输出解密数据到文件
            FileOutputStream fos = new FileOutputStream(AESdecryptedFilePath);
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            byte[] b = new byte[1024];
            int i = 0;
            while( (i = cis.read(b)) != -1 ){
                fos.write(b, 0, i);
            }

            fos.close();
            cis.close();
            fis.close();

            System.out.println("AES解密文件结束");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



//AES加密文件
public static void AESEncryptFile(InputStream is, String AESencryptedFilePath, String password) {

        try {
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(password.getBytes());
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, secureRandom);
        SecretKey secretKey = keyGenerator.generateKey();
        byte[] encoded = secretKey.getEncoded();
        SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);


        //输出加密数据到文件
        FileOutputStream fos = new FileOutputStream(AESencryptedFilePath);
        CipherInputStream cis = new CipherInputStream(is, cipher);
        byte[] b = new byte[1024];
        int i = 0;
        while( (i = cis.read(b)) != -1 ){
        fos.write(b, 0, i);
        }

        fos.close();
        cis.close();

        } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        }


//AES解密文件
public static void AESDecryptFile(InputStream is, String AESdecryptedFilePath, String password) {
    try {
        //在Android中需要将秘钥固定SHA1PRNG，否则会因为秘钥不同而解密失败（BadPaddingException: pad block corrupted in class SimpleCrypto in android）
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(password.getBytes());
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, secureRandom);
        SecretKey secretKey = keyGenerator.generateKey();
        byte[] encoded = secretKey.getEncoded();
        SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

        //输出解密数据到文件
        FileOutputStream fos = new FileOutputStream(AESdecryptedFilePath);
        CipherInputStream cis = new CipherInputStream(is, cipher);
        byte[] b = new byte[1024];
        int i = 0;
        while ((i = cis.read(b)) != -1) {
            fos.write(b, 0, i);
        }

        //方法二：
            /*byte[] bb = new byte[1024];
            int l = 0;
            while((l = is.read(bb)) != -1){
                byte[] doFinal = cipher.doFinal(Arrays.copyOfRange(bb, 0, l));
                fos.write(doFinal, 0, doFinal.length);
            }
            */
        fos.close();
        cis.close();

        System.out.println("AES解密文件结束");
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}

