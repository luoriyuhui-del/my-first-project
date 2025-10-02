package com.itheima.text;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的衣服时髦度:");
        int number = sc.nextInt();
        System.out.println("请输入女方的衣服时髦度:");
        int count = sc.nextInt();
        System.out.println( number > count);
    }
}
