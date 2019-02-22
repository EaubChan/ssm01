package com.itheima.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final SimpleDateFormat simpleDateFormatl = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String date2str(Date date) {
        return simpleDateFormatl.format(date);
    }

    public static void main(String[] args) {
        System.out.println(date2str(new Date()));
        System.out.println(new Date());
    }
}
