package com.hongghe.basicjava.inherits;

import com.hongghe.basicjava.inherits.domain.User;

import java.lang.reflect.Field;

/**
 * @author: hongghe @date: 2019-01-28 16:18
 */
public class FiledMethodMain {

    public boolean isFiled(Field field)  {
        System.out.println("filed is ");
        System.out.println(field.getName());
        return true;
    }

    public static void main(String[] args) {
        User user = new User("name", 12);
        try {
            Field field = user.getClass().getField("name");
            FiledMethodMain filedMethodMain = new FiledMethodMain();
            filedMethodMain.isFiled(field);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
