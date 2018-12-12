package com.hongghe.basicjava.inherits;

/**
 * @author hongghe 2018/12/12
 */
public class DefaultUser {

    public  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String userType(Class<?> clazz) {
        if (clazz.getClass().getName().equalsIgnoreCase(this.getClass().getName())) {
            return "Yes";
        }
        return null;
    }

}
