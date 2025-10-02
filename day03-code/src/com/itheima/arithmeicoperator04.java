package com.itheima;

import java.util.Scanner;

public class arithmeicoperator04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        System.out.println("个位数是:" +  number % 10 );
        System.out.println("十位数是:" +  number / 10 % 10  );
        System.out.println("百位数是:" +  number / 100 % 10  );
    }
}
