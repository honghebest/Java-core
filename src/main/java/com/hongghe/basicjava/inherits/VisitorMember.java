package com.hongghe.basicjava.inherits;

/**
 * @author hongghe 2018/12/12
 */
public class VisitorMember extends DefaultUser {

    @Override
    public String userType(Class<?> clazz) {
        if (clazz.getClass().getName().equalsIgnoreCase(this.getClass().getName())) {
            return "NO";
        }
        return "Yes";
    }
}
