package com.itheima.a01mathdemo1;

public class MathDemo2 {
    public static void main(String[] args) {
        //任务一 : 求水仙花 数
        int count = 0 ;
        for( int i = 100 ; i < 1000 ; i++ ){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if( Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i ){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数有" + count + "个");

        //任务二 : 证明两位数为什么没有质数因子
        int count1 = 0 ;
        for( int i = 10 ; i < 100 ; i++ ){
            int ge = i % 10;
            int shi = i / 10;
            if( Math.pow(ge,2) + Math.pow(shi,2) == i ){
                System.out.println(i);
                count1++;
            }
        }
        System.out.println("两位数没有质数因子的数有" + count1 + "个");

        //任务三 : 判断四位数有哪些是水仙花数
        int count2 = 0 ;
        for( int i = 1000 ; i < 10000 ; i++ ){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            if( Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4) == i ){
                System.out.println(i);
                count2++;
            }
        }
        System.out.println("四位数水仙花数有" + count2 + "个");
    }
}
