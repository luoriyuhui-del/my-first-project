package com.itheima.a04Text;

import java.util.Scanner;

public class A02_Text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字字符串 (只能是数字最少一位最多10位0不能开头):");
        String number = sc.nextLine();
        int num = 0;
        //int num = parseInt(number);
        int sum = 0;
        /*-if( num != -1 ){
            System.out.println(num);
        }*/
        //正则表达式
        String regex = "[1-9]\\d{0,9}";
        if( !number.matches(regex) ){
            System.out.println("输入格式有误");
        }else{
            for (int i = 0; i < number.length(); i++) {
                char c = number.charAt(i);
                num = c - '0';
                sum = sum * 10  + num;
            }
        }
    }

    private static int parseInt(String s ) {
        int result = s.length();
        int sum = 0;
        if( result > 10 || result < 1 ){
            System.out.println("请输入的数字长度在1~10之间");
            return -1;
        }
        if( s.charAt(0) == '0' ){
            System.out.println("数字不能以0开头");
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( c < '0' || c > '9' ){
                System.out.println("请输入的请是数字");
                return -1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c - '0';
            sum = sum * 10  + num;
        }
        return sum;
    }
}
