package com.itheima.code;

import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串密码:");
        int pwd = sc.nextInt();
        int sum = math(pwd);
        System.out.println("密码长度是:" + sum);

        int[] arr = decryptPassword(sum,pwd);
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] );
        }
    }

    public static int math(int pwd) {
    // 处理输入为0的情况
    if (pwd == 0) {
        return 1;
    }

    int num = 0;
    // 使用绝对值处理负数输入
    pwd = Math.abs(pwd);

    while (pwd != 0) {
        pwd /= 10;
        num++;
    }
    return num;
}


    public static int[] decryptPassword(int sum, int pwd) {
        if (sum < 0) {
            throw new IllegalArgumentException("sum不能为负数");
        }
        if (pwd < 0) {
            throw new IllegalArgumentException("pwd不能为负数");
        }
        
        int[] arr = new int[sum];
        for (int i = 0; i < arr.length; i++) {
            // 使用更清晰的中间变量提高可读性
            int lastDigit = pwd % 10;
            int encryptedDigit = (lastDigit + 5) % 10;
            arr[i] = encryptedDigit;
            pwd /= 10;
        }
        return arr;
    }
}
