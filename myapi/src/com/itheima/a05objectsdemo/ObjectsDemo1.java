package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        //  ----------------------------   Objects工具类  ----------------------------

        /*
            public static boolean equals(Object a, Object b) 先做非空判断，比较两个对象
            public static boolean isNull(Object obj) 判断对象是否为null，为nul1返回true ，反之
            public static boolean nonNull(Object obj) 判断对象是否为null，跟isNull的结果相反
        */

        //Objects.equals(s1,s2); -- 优判断s1于s2是否为同一个对象 , 然后判断调用者是否为null ,
        // ----  如果为null则返回false / 不为null再去调用类中重写的equals()方法
        // 如果没有重写，比较地址值，如果重写了，就比较属性值。

        //Students s1 = new Students("张三" , 18);
        Students s1 = null;
        Students s2 = new Students("张三" , 18);

        //System.out.println(s1.equals(s2));     ---   NullPointerException: 对象为null , null不能调用方法  空指针异常
        System.out.println(Objects.equals(s1, s2));
    }
}
