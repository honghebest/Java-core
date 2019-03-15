package com.hongghe.basicjava.cases;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author: hongghe @date: 2019-03-15 10:10
 */
public class Test {

    private static long isValidDate(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(time);
        } catch (ParseException e) {
            return Long.valueOf(time);
        }
        return simpleDateFormat.parse(time).getTime()/1000;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(isValidDate("1234567899"));
    }
}
