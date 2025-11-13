package com.itheima.a01jdk7datedem0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // ------------------------ 时间类 : SimpleDateFormat --------------------------

        /*
            //创建 : SimpleDateFormat 对象的两种构造方法
            1.  public simpleDateFormat()                        默认格式
            2.  public simpleDateFormat(String pattern)          指定格式
            //格式 : yyyy-MM-dd HH:mm:ss             yyyy年MM月dd日
            // y : 年  -   M : 月  -   d : 日  -   H : 时  -  m : 分  -  s : 秒

            //使用 : SimpleDateFormat对象所提供的方法
            1.  public final string format(Date date)            格式化(日期对象 ->字符串)
            2.  public Date parse(string source)                 解析(字符串 ->日期对象)
        */

        // --------------------------- 2. parse()方法的使用 ---------------------------
        //1. 创建一个日期
        String s1 = "2025-11-10 16:10:21";
        //2. 创建SimpleDateFormat对象
        //注意 : ---  如果要使用parse()方法 , SimpleDateFormat对象中的有参格式的参数格式必须和字符串的格式一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //3. 使用SimpleDateFormat对象中的方法parse()将字符串解析成日期对象并返回Date类型的 , 将返回值赋给Date对象
        Date d1 = sdf1.parse(s1);
        //4. 输出
        System.out.println(d1);
        //5. 获取时间毫秒值
        long time = d1.getTime();
        System.out.println(time);
        System.out.println("============================================");


        // --------------------------- 1. format()方法的使用 ---------------------------
        //method();
    }

    private static void method() {
        // ------------------------------ 无参构造方法 ----------------------------------
        //1. 创建SimpleDateFormat对象
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //2. 创建Date对象
        Date d1 = new Date();
        //3. 使用SimpleDateFormat对象中的方法format
        String s1 = sdf1.format(d1);
        //4. 输出
        System.out.println(s1);// 默认格式 :  2025/11/10 16:00
        System.out.println("============================================");

        //------------------------------ 有参构造方法 ----------------------------------
        //1. 创建SimpleDateFormat对象 -- 指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s2 = sdf2.format(d1);
        System.out.println(s2);// 指定格式 : 2025年11月10日 16:02:53
        System.out.println("============================================");

        //课堂小练习 : yyyy年MM月dd日 HH:mm:ss E星期 F 星期几
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss 第F周 EE");
        String s3 = sdf3.format(d1);
        System.out.println(s3);//  2025年11月10日 16:10:21 第2周 周一
    }
}
