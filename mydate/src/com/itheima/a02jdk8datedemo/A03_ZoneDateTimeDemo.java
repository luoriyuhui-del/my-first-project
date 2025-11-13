package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZoneDateTimeDemo {
    public static void main(String[] args) {
        // --------------------------- JDK8 时间类 : ZoneDateTime ------------------------------
        //  细节 : 在JDK8中 , 时间对象是不可变的 --- 如果改变时间对象 , 时间对象本身不会改变 , 只会创建一个新的时间对象

        /*
            可通过两种静态方法创建ZonedDateTime对象
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象

            非静态方法 : 得创建了ZonedDateTime对象 , 再通过ZonedDateTime对象调用  ,  返回值为新的时间对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */

        //1.获取当前时间对象(带时区)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);// 2025-11-10T12:01:25.074496+08:00[Asia/Shanghai]

        //2.获取指定的时间对象(带时区)1/年月日时分秒纳秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);// 2023-10-01T11:12:12+08:00[Asia/Shanghai]

        //通过 "Instant + 时区" 的方式指定获取时间对象  --  ZonedDateTime.ofInstant(instant, zoneId)
        Instant instant = Instant.ofEpochMilli(0L);// 时间原点: 1970-01-01T00:00:00Z
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");// 时区
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);// 创建一个带时区的时间对象
        System.out.println(time2);// 1970-01-01T08:00+08:00[Asia/Shanghai]


        //3.withXxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2000);// withYear(int year) 修改年    -    withMonth(int month) 修改月份
        // withDayOfMonth(int dayOfMonth) 修改日   -    withHour(int hour) 修改小时
        System.out.println(time3);

        //4. 减少时间 minusXxx(时间)
        ZonedDateTime time4 = time3.minusYears(1);// minusYears(long yearsToSubtract) 减少年  -  minusMonths(long monthsToSubtract) 减少月
        // minusDays(long daysToSubtract) 减少日  -  minusHours(long hoursToSubtract) 减少小时
        System.out.println(time4);

        //5.增加时间  plusXxx(时间)
        ZonedDateTime time5 = time4.plusYears(1);
        System.out.println(time5);

    }
}
