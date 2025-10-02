package com.itheima.text;

import java.util.Scanner;

public class text08 {
    public static void main(String[] args) {
        //--------------------短路逻辑运算符 && 与  --------  || 或
        System.out.println(true && true);// true
        System.out.println(true && false);// false
        System.out.println(false && true);// false
        System.out.println(false && false);// false
        //结果是与 & 一样的

        System.out.println(true || true);// true
        System.out.println(true || false);// true
        System.out.println(false || true);// true
        System.out.println(false || false);// false
        //结果是或 | 一样的

        int a = 10;
        int b = 10;
        System.out.println(++a < 5 && ++b < 5);
        //短路逻辑运算符&&一旦前面为false 就停止运算 所以a的值为11 , b的值为10 不变
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //-----------------&&和&的区别(|| 和 | 一样)--------------------
        int c = 10;
        int d = 10;
        System.out.println(++c < 5 & ++d < 5);
        //单个&则不会短路 , a 和 b都会进行运算
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        if (num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0) {
            System.out.println("6是一个伟大的数字");
        } else {
            System.out.println("这个不是伟大的数字");
        }
    }
}
