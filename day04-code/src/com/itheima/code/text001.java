package com.itheima.code;

import java.util.Random;
import java.util.Scanner;

public class text001 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number1 = r.nextInt(100) + 1;//1 ~ 100
        //随机生成0~100的数字
        int count = 0 ;
        while( count < 5 ){
            System.out.println("请输入一个数字：");
            int number2 = sc.nextInt();
            if( number1 == number2 ){
                System.out.println("恭喜你猜对了");

                break;
            }else if( number1 > number2 ){
                System.out.println("你猜的数字太小了");
                System.out.println("你还有" + (4 - count) + "次机会");
                count++;
            }else{
                System.out.println("你猜的数字太大了");
                System.out.println("你还有" + (4 - count) + "次机会");
                count++;
            }
        }
        if( count == 5 ){
            System.out.println("你没有机会了 随机数是" + number1);
        }
    }
}
