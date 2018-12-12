package com.hongghe.basicjava.polymorphisms;

/**
 * @author hongghe 2018/12/12
 */
public class UserInformation {

    public String userName(Long uid) {
        if (uid == null || uid <= 0) {
            return null;
        }

        if (uid > 10) {
            return "Yes";
        }

        return "No";
    }

    public String userName(Long uid, String name) {
        if (uid == null || uid <= 0) {
            return null;
        }

        if (uid.toString().equalsIgnoreCase(name)) {
            return "Success";
        }
        return "No";
    }
}
