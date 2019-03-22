package com.hongghe.basicjava.generic.inter;

import com.hongghe.basicjava.domain.User;

/**
 * @author: hongghe @date: 2019-03-22 11:41
 */
public class StudentInformation implements BasicInformation {
    @Override
    public User getUser() {
        User user = User.builder().address("address").build();
        return user;
    }
}
