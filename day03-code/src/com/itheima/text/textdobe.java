package com.itheima.text;

import java.util.Scanner;

public class textdobe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        int count = (num / 100) + (num / 10 % 10) + (num % 10);
        System.out.println( count);
    }
}
