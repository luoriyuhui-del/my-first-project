package com.itheima.code;

import java.util.Random;
import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        Random r = new Random();
        int pwd = math();
        System.out.println(pwd);

        int count = mash(pwd);
        System.out.println("密码位数为:" + count + "位");

        int[] arr = decrypt(pwd,count);
        System.out.print("密码解密后为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    // 密码验证
    public static int math() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串密码:");
        int pwd = sc.nextInt();
        while( true ){
            if( pwd >= 0 ){
                break;
            }
            else{
                System.out.println("密码输入不符合,请重新输入:");
                pwd = sc.nextInt();
            }
        }
        return pwd;
    }

    //判断几位数
    public static int mash(int  num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
         while ( num != 0 ) {
             num /= 10 ;
             count++;
         }
         return count;
    }

    //开始解密 第一步 分开
    public static int[] decrypt(int num,int sum) {
        int[] arr = new int[sum];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num % 10;
            if( arr[i] < 5 ){
                arr[i] += 5 ;
            }else{
                arr[i] -= 5;
            }
            num /= 10;
        }
        return arr;
    }
}
