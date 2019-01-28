package com.hongghe.basicjava.generic;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * The get information of generic.
 *
 * @author hongghe 28/07/2018
 */
@Slf4j
public class UerGeneric<T> {

    private T user;

    public void UserGeneric(T user) {
        this.user = user;
    }

    public T getUser() {
        return user;
    }

    public void userInformation(T user) throws Exception {
        Gson gson = new Gson();
        log.info("The user information is " + gson.toJson(user));
    }

    public void shwoUser(UerGeneric<?> uerGeneric) {
        Gson gson = new Gson();
        log.info("The user name if " + gson.toJson(uerGeneric.getUser()));
    }
}
