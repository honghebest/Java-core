package com.hongghe.basicjava.generic;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The get information of generic.
 *
 * @author hongghe 28/07/2018
 */
public class UerGeneric<T> {

    private T user;

    private static final Logger LOGGER = LoggerFactory.getLogger(UerGeneric.class);

    public void UserGeneric(T user) {
        this.user = user;
    }

    public T getUser() {
        return user;
    }

    public void userInformation(T user) throws Exception {
        Gson gson = new Gson();
        LOGGER.info("The user information is " + gson.toJson(user));
    }

    public void shwoUser(UerGeneric<?> uerGeneric) {
        Gson gson = new Gson();
        LOGGER.info("The user name if " + gson.toJson(uerGeneric.getUser()));
    }
}
