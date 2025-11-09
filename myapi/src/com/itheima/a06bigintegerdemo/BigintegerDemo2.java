package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigintegerDemo2 {
    public static void main(String[] args) {
        // -------------------------  Biginteger中的方法  -------------------------

        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        //1.创建两个BigInteger对象  ---  因为创建的值比较小 , 所以用静态构造方法 类名.valueOf()
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3.除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);//商
        System.out.println(arr[1]);//余数

        //4.比较是否相同  ---  此时在BigInteger类中已经重写过equals方法 , 比较的是内容而不是地址值
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //5.次幂  --  参数必须是int类型的
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //6.max    --  比较值时是不会创建新的BigInteger对象 , 而是返回大的那个对象的地址值
        BigInteger bd5 = bd1.max(bd2);
        System.out.println(bd5 == bd1);//因为max()方法返回的是大的那个对象的地址值
        System.out.println(bd5 == bd2);


        //7.转为int类型整数，超出范围数据有误
        /* - BigInteger bd6 = BigInteger.valueOf(2147483647L);
         int i = bd6.intValue();
         System.out.println(i);
         */

        BigInteger bd6 = BigInteger.valueOf(200);
        //可以分别调用intValue() longValue() doubleValue() 将 Biginteger类型的  转化为int long double类型的
        int i = bd6.intValue();
        System.out.println(i);
        long l = bd6.longValue();
        System.out.println(l);
        double v = bd6.doubleValue();
        System.out.println(v);//200.0
    }
}
