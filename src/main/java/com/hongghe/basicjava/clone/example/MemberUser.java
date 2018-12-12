package com.hongghe.basicjava.clone.example;

import lombok.Data;

import java.io.IOException;

/**
 * @author hongghe 2018/12/12
 */
@Data
public class MemberUser implements Cloneable {

    /**
     * User name
     */
    public String name;

    /**
     * User UID
     */
    private Long uid;


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
