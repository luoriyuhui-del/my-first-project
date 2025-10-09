package com.itherma.code;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        //------------------ctrl + alt + m 自动提取方法-------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前月份 ");
        int month = sc.nextInt();
        System.out.println("请输入所购买的机舱类型 1.头等舱  2.经济舱 ");
        int type = sc.nextInt();
        System.out.println("请输入机票原价格 ");
        double  price = sc.nextDouble();
        if( month >= 5 && month <= 10 ){
            price = end(price,type,0.9,0.85);
        }else if( (month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            price = end(price,type,0.7,0.65);
        }else
        {
            System.out.println("输入的机票月份有误");
        }
        System.out.println("机票价格:" + price);
    }

    public static double end( double price , int type , double i , double j ){
        if( type == 1){
            price = price * i;
        }else if( type == 2 ){
            price = price * j;
        }else{
            System.out.println("输入的机票类型有误");
        }
        return price;
    }
}
