package com.itheima;

import java.util.Scanner;

public class arithmeicoperator02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        math(num1,num2);
    }
    public  static void math( int num1 , int num2 ){
        int count = num1 *2 + num2 *2;
        System.out.println(count);
    }

}
