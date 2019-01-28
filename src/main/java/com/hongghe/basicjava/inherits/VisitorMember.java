package com.hongghe.basicjava.inherits;

/**
 * @author hongghe 2018/12/12
 */
public class VisitorMember extends DefaultUser {

    @Override
    public String userType(Class<?> clazz) {
        if (clazz.getName().equals(this.getClass().getName())) {
            System.out.println("The user is member.");
            return "NO";
        }

        System.out.println("The user is not member.");
        return "Yes";
    }

    public static void main(String[] args) {
        VisitorMember visitorMember = new VisitorMember();
        visitorMember.userType(VisitorMember.class);
    }
}
