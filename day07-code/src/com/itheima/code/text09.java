package com.itheima.code;

import java.util.Random;
import java.util.Scanner;

public class text09 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //定义蓝和红球
        int[] red = new int[6];
        int blue = 0 ;
        //定义承载随机的红蓝球
        int[] red2 = new int[6];
        int blue1 = 0 ;

        //输入你的红球和蓝球
        for (int i = 0; i < red.length; ) {
            System.out.println("请输入第" + (i+1) + "个红球号码：");
            int x = sc.nextInt();
            boolean flag = printArray(red,x);
            if( x > 0 && x <= 33 && !printArray(red,x)){
                red[i] = x;
                i++;
            }else{
                System.out.println("输入的号码有误，请重新输入：");
                continue;
            }
        }
        System.out.println("请输入蓝球号码：");
        int k  = sc.nextInt();
        if( k > 0 && k <= 16){
            blue = k;
        }


        //生成6个随机数 表示红球
        for (int i = 0; i < red2.length; ) {
            int rednum = (int)(Math.random()*33+1);
            boolean flag = printArray(red2,rednum);
            if( !flag ){
                red2[i] = rednum;
                i++;
            }
        }
        blue1 = (int)(Math.random()*16+1);

        int sum = mash(blue,blue1);
        switch( math(red,red2) ){
            case 0:
            case 1:
            case 2:
                if( sum == 1 ){
                    System.out.println("恭喜你，中奖5元！");
                }else{
                    System.out.println("谢谢惠顾");
                }
                break;
            case 3:
                if( sum == 1 ){
                    System.out.println("恭喜你，中奖10元！");
                }else{
                    System.out.println("谢谢惠顾");
                }
                break;
            case 4:
                if( sum == 1 ){
                    System.out.println("恭喜你，中奖200元！");
                }else{
                    System.out.println("恭喜你，中奖10元！");
                }
                break;
            case 5:
                if( sum == 1 ){
                    System.out.println("恭喜你，中奖3000元！");
                }else{
                    System.out.println("恭喜你，中奖200元！");
                }
                break;
            case 6:
                if( sum == 1 ){
                    System.out.println("恭喜你，中奖10000000元！");
                }else{
                    System.out.println("恭喜你，中奖1000000元！");
                }
                break;
        }
        for (int i = 0; i < red2.length; i++) {
            System.out.print("中奖的号码是：" + red2[i] );
        }
        System.out.println("中奖的蓝球是：" + blue1);
    }

    public static int math(int[] arr1, int[] arr2) {
        int count = 0 ;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if( arr1[i] == arr2[j] ){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int mash(int num1 ,int num2) {
        if( num1 == num2){
            return 1;
        }
        return 0;
    }

    public static boolean printArray(int[] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == num ){
                return true;
            }
        }
        return false;
    }
}
