package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIDDemo1 {
    public static void main(String[] args) {
        // --------------------------- JDK8 时间类 : ZoneId ------------------------------
        
        /*
            以下方法都是静态方法 , 都可以通过 "ZoneId.方法名" 来调用
            static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
            static ZoneId systemDefault() 获取系统默认时区
            static ZoneId of(string zoneId) 获取一个指定时区
        */

        //1.  获取所有时区的 id
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);//打印jdk支持的所有时区
        System.out.println(zoneIds.size());//打印jdk支持的所有时区的数量 : 603

        //2.  获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //3.  获取一个指定时区
        ZoneId zoneId1 = ZoneId.of("Africa/Nairobi");//注意 : 形参不能为空
        System.out.println(zoneId1);

        //获取到时区以后就可以通过时区对象获取时区对应的时间
    }
}
