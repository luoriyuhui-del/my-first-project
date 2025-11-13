package com.itheima.a01jdk7datedem0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        // --------------------------------- 时间类 : SimpleDateFormat 练习 ----------------------------------

        //定义活动开始时间与结束时间
        String startTime = "2023年11月11日 0:0:0";
        String endTime =   "2023年11月11日 0:10:0";
        //创建SimpleDateFormat对象 -- 将时间字符串转换成Date对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //创建Date对象
        Date d1 = sdf1.parse(startTime);
        Date d2 = sdf1.parse(endTime);
        //获取时间毫秒值
        long startTimeMillis = d1.getTime();
        long endTimeMillis = d2.getTime();

        //创建用户下单时间
        String orderTime1 = "2023年11月11日 0:01:0";
        String orderTime2 = "2023年11月11日 0:11:0";
        //将用户下单时间转换成Date对象
        Date d3 = sdf1.parse(orderTime1);
        Date d4 = sdf1.parse(orderTime2);
        //获取时间毫秒值
        long orderTimeMillis1 = d3.getTime();
        long orderTimeMillis2 = d4.getTime();

        //创建判断方法 --- 判断下单时间是否在活动时间段内
        boolean flag1 = orderTimeMillis1 >= startTimeMillis && orderTimeMillis1 <= endTimeMillis;
        boolean flag2 = orderTimeMillis2 >= startTimeMillis && orderTimeMillis2 <= endTimeMillis;

        extracted(flag1);
        extracted(flag2);
    }

    private static void extracted(boolean flag1) {
        //输出
        if(flag1){
            System.out.println("用户下单时间在活动时间段内");
        }else{
            System.out.println("用户下单时间不在活动时间段内");
        }
    }
}
