package com.itheima.a05interfacedemo5;

import com.itheima.PingPangSporter;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //创建乒乓球教练对象
        PingPangCoach pc = new PingPangCoach();
        System.out.println("请输入乒乓球教练的姓名与年龄:");
        String name1 = sc.next();
        int age1 = sc.nextInt();
        pc.setName(name1);
        pc.setAge(age1);
        pc.teach();
        pc.speakEnglish();
        System.out.println("------------------------------------------");

        //创建篮球教练对象
        BasketballCoach bc = new BasketballCoach();
        System.out.println("请输入篮球教练的姓名与年龄:");
        String name2 = sc.next();
        int age2 = sc.nextInt();
        bc.setName(name2);
        bc.setAge(age2);
        bc.teach();
        System.out.println("------------------------------------------");

        //创建乒乓球运动员
        PingPangSporter ps = new PingPangSporter();
        System.out.println("请输入乒乓球运动员的姓名与年龄:");
        String name3 = sc.next();
        int age3 = sc.nextInt();
        ps.setName(name3);
        ps.setAge(age3);
        ps.Sport();
        ps.speakEnglish();
        System.out.println("------------------------------------------");

        //创建篮球运动员
        BasketballSporter bs = new BasketballSporter();
        System.out.println("请输入篮球运动员的姓名与年龄:");
        String name4 = sc.next();
        int age4 = sc.nextInt();
        bs.setName(name4);
        bs.setAge(age4);
        bs.Sport();
        System.out.println("------------------------------------------");

    }
}
