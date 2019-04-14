package com.hongghe.basicjava.AQS;

import com.google.common.base.Strings;

public class PersonInfoImp implements PersonInfoService {

    @Override
    public String getName(String name) {
        if (Strings.isNullOrEmpty(name)) {
            return name + "name";
        }
        return "null";
    }

    @Override
    public int count() {
        return 0;
    }
}
