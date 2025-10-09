package com.itherma.code;

import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        double[] arr = getDoubles();
        //定义一个总和存放六位分数的和
        double count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        //定义一个变量存放去掉最大值和最小值后的总和
        double sum = count - getmax(arr) - getmix(arr);
        System.out.println("去掉最大值和最小值后的平均分是:" + sum / (arr.length - 2) );

    }

    private static double[] getDoubles() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入六位评委所打的分数: 分数取值在0 ~ 100");
        //定义一个浮点类型的数组来存放六位评委所给的分数
        double [] arr = new double[6];
        //循环输入 并在if中判断输入的分数是否在0 ~ 100之间 如果在则保存到数组中
        for (int i = 0; i < arr.length; ) {
            double number = sc.nextDouble();
            if( number >= 0 && number <= 100 ){
                arr[i] = number;
                //将输入分数的累加放入到正确的索引中 , 如果所输入的分数不符合循环将不累加
                i++;
            }else{
                System.out.println("输入的分数有误 当前输入了 " + i + " 位分数 "+ "请重新输入:");
            }
        }
        return arr;
    }

    public static double getmax( double [] arr ){
        //定义方法取得最大值并返回
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
    public static double getmix( double [] arr ){
        //定义方法取得最小值并返回
        //------------------选中一个变量 shift + F6 快速修改变量名----------------------
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( min > arr[i] ){
                min = arr[i];
            }
        }
        return min;
    }
}
