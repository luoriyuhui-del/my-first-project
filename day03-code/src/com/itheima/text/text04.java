package com.itheima.text;

import java.util.Scanner;

public class text04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一只老虎的体重:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int num2 = sc.nextInt();
        String count = num1 == num2 ? "相等" : "不相等";
        System.out.println(count);
    }
}
