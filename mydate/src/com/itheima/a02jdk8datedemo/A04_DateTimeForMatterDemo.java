package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeForMatterDemo {
    public static void main(String[] args) {
        // --------------------------- JDK8 时间类 : DateTimeFormatter ------------------------------

        /*
            可通过静态方法创建DateTimeFormatter对象
            static DateTimeFormatter ofPattern(格式) 获取格式对象

            非静态方法 : 通过DateTimeFormatter对象调用
            String format(时间对象) 按照指定方式格式化
        */

        //1. 创建时间对象
        ZonedDateTime time = ZonedDateTime.now();
        //2. 获取格式对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E F");
        //3. 按照指定格式格式化时间对象
        String timeStr = dtf.format(time);
        System.out.println(timeStr);
    }
}
