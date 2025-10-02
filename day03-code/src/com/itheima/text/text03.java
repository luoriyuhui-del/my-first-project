package com.itheima.text;

import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位数整数:");
        int num = sc.nextInt();
        boolean count = (num /10 == 6 ) || (num % 10 == 6 ) || (((num / 10)  +  (num % 10)) % 6 == 0);
        System.out.println( count);
    }
}
