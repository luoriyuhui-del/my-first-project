package com.itheima.a04Text;

import java.time.Instant;
import java.util.Date;

public class A04_Text4 {
    public static void main(String[] args) {
        /*
            需求: 用代码计算我在这个时间活了多少天
        */

        // JDK7 写法
        //获取出生日期
        Date d1 = new Date(1000L * 60 * 60 * 24 * 365 * 33 + 1000L * 60 * 60 * 24 * 30 * 3 + 1000L * 60 * 60 * 24 * 7 );
        //获取当前时间
        Date d2 = new Date();
        //获取时间差
        long time = d2.getTime() - d1.getTime();
        System.out.println("我快乐了" + time / (1000L * 60 * 60 * 24) + "天");

        // JDK8 写法
        //获取当前系统时间
        Instant i1 = Instant.now();
        //获取出生日期

    }
}
