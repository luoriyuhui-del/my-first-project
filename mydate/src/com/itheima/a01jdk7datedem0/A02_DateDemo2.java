package com.itheima.a01jdk7datedem0;

import java.util.Date;
import java.util.Random;

public class A02_DateDemo2 {
    public static void main(String[] args) {
        //  -------------------------- 时间类 : date --------------------------

        /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        */

        //   需求一 :
        //1. 创建时间对象
        Date d1 = new Date(0);//表示时间原点过0毫秒的时间点
        //2. 将时间毫秒值获取出来
        long time = d1.getTime();
        //3. 将时间毫秒值进行运算
        time = time + 1000L * 60 * 60 * 24 * 365;//要以long类型进行运算
        //4. 将时间毫秒值重新设置给Date对象
        d1.setTime(time);
        //5. 输出时间对象
        System.out.println(d1);
        //也可以简洁一点
        //System.out.println(new Date(new Date().getTime() + 1000L * 60 * 60 * 24 * 365));
        System.out.println("------------------------------------------------");

        // 需求二:
        //1. 随机生成两个时间毫秒值
        Random r = new Random();
        long time1 = r.nextInt(10) * 1000L;
        long time2 = r.nextInt(10) * 1000L;
        //2. 创建时间对象并设置时间毫秒值
        //Date d2 = new Date(time1);
        //Date d3 = new Date(time2);
        //也可以将第一步与第二步合并
        Date d2 = new Date(Math.abs(r.nextInt()) );//随机生成一个int范围的值 , 再通过abs()方法转成正整数
        Date d3 = new Date(Math.abs(r.nextInt()) );
        //3. 获取出时间毫秒值
        long time4 = d2.getTime();
        long time5 = d3.getTime();
        //4. 比较时间毫秒值
        if (time4 > time5) {
            System.out.println("d2时间在d3时间之前");
        }else if(time4 < time5){
            System.out.println("d2时间在d3时间之后");
        }else{
            System.out.println("d2与d3时间一致");
        }
        //5. 输出时间对象
        System.out.println(d2);
        System.out.println(d3);
    }
}
