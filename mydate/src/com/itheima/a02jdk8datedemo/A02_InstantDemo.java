package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        // --------------------------------- JDK8 时间类 : Instant ----------------------------------
        //注意 : 在JDK8中 , 时间对象是不可变的 --- 如果改变时间对象 , 时间对象本身不会改变 , 只会创建一个新的时间对象

        /*
            Instant类 : 时间类  --  可通过 Instant.方法名来调用
            怎么创建Instant对象 : 通过静态方法创建  now / ofXxxx

            静态方法 : 可以通过 Instant.方法名 来创建
            static Instant now()                                        获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli)                      根据(秒/毫秒/纳秒)获取Instant对象

            非静态方法 : 通过 Instant对象调用
            ZonedDateTime atZone(ZoneId zone)                           指定时区
            boolean isXxx(Instant otherInstant)                         判断系列的方法

            以下两方法会创建新的时间对象 : Instant对象
            Instant minusXxx(long millisToSubtract)                     减少时间系列的方法
            Instant plusXxx(long millisToSubtract)                      增加时间系列的方法
        */

        //1.  获取当前时间的Instant对象   --   (世界标准时间)
        Instant now = Instant.now();
        System.out.println(now);//  2025-11-10T12:01:25.074496Z

        //2.  根据(秒/毫秒/纳秒)获取Instant对象    --  表示时间原点过了多少毫秒数
        Instant instant1 = Instant.ofEpochSecond(1L);//当前方法的形参为 秒 级
        System.out.println(instant1);//   1970-01-01T00:00:01Z
        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);//当前方法的形参为 秒 级和纳秒 级 ,
        // 纳秒级会自动转换成秒级  ,  两者相加后的毫秒数就是Instant对象表示的时间
        System.out.println(instant2);//   1970-01-01T00:00:02Z
        Instant instant3 = Instant.ofEpochMilli(3000L);//毫秒级
        System.out.println(instant3);//   1970-01-01T00:00:03Z

        //3.  获取指定时区的时间  --  zonedDateTime类型的对象
        // 通过ZoneId.of()方法获取指定时区 , 再通过Instant对象调用atZone()方法获取指定时区的时间 , 然后赋值给ZonedDateTime对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //ZonedDateTime time = Instant.ofEpochMilli(0L).atZone(ZoneId.of("Asia/Shanghai")); -- 时间原点: 1970-01-01T08:00+08:00[Asia/Shanghai]
        System.out.println(time);//   2025-11-10T20:13:25.151685300+08:00[Asia/Shanghai]

        //4.  判断系列方法  ---  比较 时间
        Instant instant4 = Instant.ofEpochMilli(3000L);
        Instant instant5 = Instant.ofEpochMilli(4000L);
        // 判断instant4是否在instant5之前 , 通过instant4调用isBefore()方法 , 形参为instant5 , 返回值为boolean
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面
        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);//false

        //5.  Instant minusXxx(long millisToSubtract)                     减少时间系列的方法
        Instant instant6 = Instant.ofEpochMilli(3000L);// 创建一个距离时间原地3秒的Instant对象
        Instant instant7 = instant6.minusMillis(1000);// 表示减少1秒 , 并创建新的Instant对象
        System.out.println(instant7);

        //6.  Instant plusXxx(long millisToSubtract)                      增加时间系列的方法
        Instant instant8 = instant6.plusMillis(1000);// 表示增加1秒 , 并创建新的Instant对象
        System.out.println(instant8);

    }
}
