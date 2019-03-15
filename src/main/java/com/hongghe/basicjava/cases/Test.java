package com.hongghe.basicjava.cases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    private static String FORMATDATE(String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(time);
        } catch (ParseException e) {
            return simpleDateFormat.format(new Date(Long.valueOf(time) * 1000));
        }
        return time;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(FORMATDATE("2016-08-04 10:34:42"));
    }
}
