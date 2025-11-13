package com.itheima.a01jdk7datedem0;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        // ------------------------ 时间类 : Calendar --------------------------

        /*
            1.  获取Calender对象的静态方法  --  获取的是子类的对象
            public static Calendar getInstance()               获取当前时间的日历对象

            2.  通过Calendar对象获取时间信息
            public final Date getTime()                         获取日期对象
            public final setTime(Date date)                     给日历设置日期对象

            3.  修改时间毫秒值
            public long getTimeInMillis()                       拿到时间毫秒值
            public void setTimeInMillis(long millis)            给日历设置时间毫秒值

            4.  比较常用的方法
            public int get(int field)                           获取日期中的某个字段信息
            public void set(int field,int value)                修改日历的某个字段信息
            public void add(int field,int amount)               为某个字段增加/减少指定的值
        */

        //1.获取日历对象
        //细节1:Calendar是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
        //底层原理:
        //会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。
        //把会把时间中的纪元,年,月,日,时,分,秒,星期,等等的都放到一个数组当中
        //日 :纪元
        // 1 :年
        // 2 :月
        // 3 : 一年中的第几周
        // 4:一个月中的第几周
        // 5: 一个月中的第几天(日期)
        // ....

        //细节2:
        //月份:范围0~11 如果获取出来的是.那么实际上是1月。
        //星期:在老外的眼里,星期日是一周中的第一天
        //      1(星期日) 2(星期一) 3(星期二) 4(星期三) 5(星期四) 6(星期五) 7(星期六)
        //获取一个日历对象 Calender : 它表示日历信息
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Date d3 = c.getTime();
        Date d2 = c2.getTime();
        System.out.println(d3);
        System.out.println(c2);
        System.out.println("-------------------------------------------");

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);//获取时间原点的日历信息数组
        System.out.println(c);

        //public int get(int field) 取日期中的某个字段信息
        //public void set(int field,int value) 修改日历的某个字段信息
        //public void add(int field,int amount) 为某个字段增加/减少指定的值


        //在Calender类中,把索引对应的数字都定义成常量 --
        // 1 : YEAR  年
        // 2 : MONTH  月
        // 3 : DAY_OF_MONTH
        // 4 : HOUR
        // 5 : MINUTE
        // 6 : SECOND
        // 7 : DAY_OF_WEEK
        // 8 : DAY_OF_WEEK_IN_MONTH
        // 9 : DAY_OF_YEAR
        //获取 年的信息
        System.out.println(c.get(Calendar.YEAR));//1970 表示1970年
        //修改 年
        c.set(Calendar.YEAR, 2023);
        //修改 月
        c.set(Calendar.MONTH, 8);//8 表示 9月
        //修改 日
        c.set(Calendar.DAY_OF_MONTH, 10);


        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH, -1);//减一个月
        c.add(Calendar.DAY_OF_MONTH, 1);//表示在这个月基础上的第几天加1天
        System.out.println(c);


        //java在Calendar类中,把索引对应的数字都定义成常量
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月份:范围0~11 如果获取出来是.那么实际上是1月。
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + date + "," + getWeek(week));
    }

    //查表法://表:容器
    //让数据跟索引产生对应的关系
    //传入对应的数字: 1 ~7//返回对应的星期
    public static String getWeek(int index) {
        //定义一个数组,让汉字星期几 跟1~7产生对应关系
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的星期
        return arr[index];

    }
}
