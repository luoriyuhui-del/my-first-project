package com.itherma.code;

import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的密码:");
        int number = sc.nextInt();
        if( number == 0 ){
            System.out.println("密码错误");
        }else{
            //得到密码位数
            int count =  check( number);
            System.out.println("密码位数为:" + count + "位");
        }
        //此时已获得每位密码数并反向存储在数组中
        int[] arr = mash(number,check(number));
        arr = sum(arr);
        print( arr);
    }

    public static int check(int number){
        //-------------------判断密码是几位数--------------------
        int count = 0 ;
        while( number != 0 ){
            number = number / 10;
            count++;
        }
        return count;
    }
    public static int[] mash(int number , int  i ){
        //---------生成一个数组来存储密码的每一位 , 并返回数组---------
        int [] arr = new int[i];
        for (int j = 0; j < arr.length ; j++) {
            arr[j] = number % 10;
            number = number / 10;
        }
        return arr;
    }

    public static int[] sum(int[] arr){
        //----------------------对每位密码加密-----------------------
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10 ;
        }
        return arr;
    }

    public static void print(int[] arr){
        //-------------------打印密码------------------------

        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum =sum * 10 + arr[i];
        }
        System.out.println("密码加密后为:" + sum );
    }
}
