package com.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //日期转化为字符串
    public static String dateString1(Date date, String time) {
        SimpleDateFormat sdf = new SimpleDateFormat(time);
        String format = sdf.format(date);
        return format;
    }

    //字符串转化为日期
    public static Date stringDate(String str, String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(time);
        Date parse = sdf.parse(str);
        return parse;
    }
}
