package com.itheima.a01jdk7datedem0;

import java.util.Date;

public class A01_DateDemo1 {
    public static void main(String[] args) {
        // --------------------------- 时间类 : date --------------------------

         /*
            public Date() 创建Date对象，表示当前时间
            public Date(long date) 创建Date对象，表示指定时间
            public void setTime(long time) 设置/修改毫秒值
            public long getTime() 获取时间对象的毫秒值
        */

        // 注意 : 导入date对象时是导入java.util.Date的包下的 Date
        //创建Date对象，当使用空参构造时 , 创建的是当前系统的时间
        Date  d1 = new Date();
        System.out.println(d1);

        //创建Date对象，使用有参构造时 , 创建的是从时间原点(1970年1月1日0时0分0秒)开始，到指定时间点的毫秒数
        //Date d2 = new Date(0);
        //System.out.println(d2);

        //通过setTime()方法修改时间 : 给时间对象设置一个毫秒值 ( 注意 : 单位是毫秒值 )
        // 注意 :  setTime()方法修改时间后，会重新计算时间对象表示的时间 --- 即从时间原点(1970年1月1日0时0分0秒)开始
        //d1.setTime(1000);
        //System.out.println(d1);

        //通过getTime()方法获取时间 : 获取时间对象表示的时间的毫秒值
        long time = d1.getTime();//时间是long类型的
        System.out.println(time);//1762758699031  -- 表示从时间原点到当前时间点的毫秒数
    }
}
