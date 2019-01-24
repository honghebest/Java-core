package com.hongghe.basicjava.oop.packaging;

/**
 * @author: hongghe @date: 2019-01-24 11:04
 */
public class PackageMain {

    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest("123");
        studentTest.setAge(12);
        studentTest.setName("hongghe");
        System.out.println(studentTest.toString());
    }
}
