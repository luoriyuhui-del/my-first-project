package com.itheima.text;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个五位数");
        int number = sc.nextInt();
        System.out.println( number % 10 );
        System.out.println( number / 10 % 10  );
        System.out.println( number / 100 % 10  );
        System.out.println( number / 1000 % 10);
        System.out.println( number / 10000 % 10);
    }
}
