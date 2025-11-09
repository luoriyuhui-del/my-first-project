package com.itheima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        // 获取绝对值
        int a = -10;
        System.out.println(Math.abs(a));

        // 获取最大值
        int b = 10;
        int c = 20;
        System.out.println(Math.max(b, c));

        // 获取最小值
        int d = 10;
        int e = 20;
        System.out.println(Math.min(d, e));

        // 获取随机数
        int f = (int)(Math.random() * 10);
        System.out.println(f);

        // 获取平方根
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(25));

        // 获取幂次方
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));

        //四舍五入
        System.out.println(Math.round(3.14));

        //向上取整
        System.out.println(Math.ceil(3.14));

        //向下取整
        System.out.println(Math.floor(3.14));
    }
}
