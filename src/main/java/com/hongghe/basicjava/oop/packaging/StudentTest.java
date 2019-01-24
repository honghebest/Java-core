package com.hongghe.basicjava.oop.packaging;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author: hongghe @date: 2019-01-24 11:04
 */
@Data
@ToString
public class StudentTest {

    @Builder.Default
    private String name = "23";

    @NonNull
    private String idNum;
    private int age;
}
