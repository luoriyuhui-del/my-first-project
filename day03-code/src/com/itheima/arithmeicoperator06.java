package com.itheima;

import java.util.Scanner;

public class arithmeicoperator06 {
    public static void main(String[] args) {
        //&的使用场景:两者都为true时结果才为true----------------------------------------
        //int i = 10 ;
        //int j = 20 ;
        //boolean count = (i < j) & (i > 1) ;
        //System.out.println( count );

        System.out.println("请输入你的账号:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入你的密码:");
        String password = sc.next();
        //name.equals("admin")：调用 String 类的 equals 方法，用于比较变量 name 的值是否等于字符串 "admin"。equals 方法会比较两个字符串的内容是否相同，如果相同则返回 true，否则返回 false。
        //password.equals("<PASSWORD>")：同样调用 equals 方法，比较变量 password 的值是否等于字符串 "123456"。
        String count = name.equals("man") & password.equals("13579") ? "登录成功" : "登录失败";
        System.out.println(count);


    }
}
